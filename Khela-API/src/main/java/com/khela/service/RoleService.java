package com.khela.service;

import com.khela.domain.Role;

import java.util.List;

public interface RoleService {
    Long addRole(Role role);
    Long editRole(Role role);
    void deleteRole(Long roleId);
    Role getRoleDetails(Long roleId);
    Role getRoleDetails(String roleName);
    List<Role> getAllRoles();
}
