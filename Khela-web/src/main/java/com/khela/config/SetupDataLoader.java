package com.khela.config;

import com.khela.entity.PrivilegeEntity;
import com.khela.entity.RoleEntity;
import com.khela.entity.UserEntity;
import com.khela.repository.PrivilegeRepository;
import com.khela.repository.RoleRepository;
import com.khela.repository.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class SetupDataLoader implements
        ApplicationListener<ContextRefreshedEvent> {

    boolean alreadySetup = false;

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PrivilegeRepository privilegeRepository;

    private final PasswordEncoder passwordEncoder;

    public SetupDataLoader(UserRepository userRepository, RoleRepository roleRepository, PrivilegeRepository privilegeRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.privilegeRepository = privilegeRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {

        if (alreadySetup)
            return;
        PrivilegeEntity readPrivilege
                = createPrivilegeIfNotFound("READ");
        PrivilegeEntity writePrivilege
                = createPrivilegeIfNotFound("WRITE");

        createRoleIfNotFound("ADMIN", Stream.of(readPrivilege,writePrivilege).collect(Collectors.toSet()));
        createRoleIfNotFound("USER", Stream.of(readPrivilege).collect(Collectors.toSet()));

        RoleEntity adminRole = roleRepository.findByRoleName("ADMIN");
        UserEntity user = new UserEntity();
        user.setFirstName("Test");
        user.setLastName("Test");
        user.setPassword(passwordEncoder.encode("test"));
        user.setEmail("test@test.com");
        user.setRoleEntities(Stream.of(adminRole).collect(Collectors.toSet()));
        user.setEnabled(true);
        if(userRepository.findByEmail("test@test.com")==null)
        userRepository.save(user);

        alreadySetup = true;
    }

    @Transactional
    PrivilegeEntity createPrivilegeIfNotFound(String name) {

        PrivilegeEntity privilege = privilegeRepository.findByName(name);
        if (privilege == null) {
            privilege = new PrivilegeEntity().setName(name);
            privilegeRepository.save(privilege);
        }
        return privilege;
    }

    @Transactional
    RoleEntity createRoleIfNotFound(
            String name, Set<PrivilegeEntity> privileges) {

        RoleEntity role = roleRepository.findByRoleName(name);
        if (role == null) {
            role = new RoleEntity().setRoleName(name);
            role.setPrivilegeEntities(privileges);
            roleRepository.save(role);
        }
        return role;
    }
}