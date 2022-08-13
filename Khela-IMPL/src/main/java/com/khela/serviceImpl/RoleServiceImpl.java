package com.khela.serviceImpl;

import com.khela.domain.Role;
import com.khela.mapper.RoleMapper;
import com.khela.repository.RoleRepository;
import com.khela.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public Long addRole(Role role) {
        return null;
    }

    @Override
    public Long editRole(Role role) {
        return null;
    }

    @Override
    public void deleteRole(Long roleId) {

    }

    @Override
    public Role getRoleDetails(Long roleId) {
        return roleMapper.entityToDomain().map(roleRepository.findById(roleId).get());
    }

    @Override
    public Role getRoleDetails(String roleName) {
        return roleMapper.entityToDomain().map(roleRepository.findByRoleName(roleName));
    }

    @Override
    public List<Role> getAllRoles() {
        return null;
    }
}
