package com.khela.config;

import com.khela.domain.User;
import com.khela.entity.PrivilegeEntity;
import com.khela.entity.RoleEntity;
import com.khela.entity.UserEntity;
import com.khela.mapper.UserMapper;
import com.khela.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("userDetailsService")
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

        private final UserRepository userRepository;
        private final UserMapper userMapper;

    public CustomUserDetailsService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        UserEntity user=userRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(email) ;
        }
        UserDetails userDetails = userMapper.entityToDomain().map(user);

       return userDetails;
    }

    private Collection<? extends GrantedAuthority> getAuthorities(
                Collection<RoleEntity> roles) {

            return getGrantedAuthorities(getPrivileges(roles));
    }

    private List<String> getPrivileges(Collection<RoleEntity> roles) {

            List<String> privileges = new ArrayList<>();
            List<PrivilegeEntity> collection = new ArrayList<>();
            for (RoleEntity role : roles) {
                collection.addAll(role.getPrivilegeEntities());
            }
            for (PrivilegeEntity item : collection) {
                privileges.add(item.getName());
            }
            return privileges;
    }

    private List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
            List<GrantedAuthority> authorities = new ArrayList<>();
            for (String privilege : privileges) {
                authorities.add(new SimpleGrantedAuthority(privilege));
            }
            return authorities;
    }
}
