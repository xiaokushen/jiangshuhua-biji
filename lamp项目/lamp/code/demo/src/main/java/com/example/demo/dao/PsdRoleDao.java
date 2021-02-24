package com.example.demo.dao;

import com.example.demo.entity.PsdRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PsdRoleDao extends JpaRepository <PsdRole,String> {
    PsdRole queryPsdRoleByRoleId(String roleId);
    PsdRole queryPsdRoleByRoleName(String roleName);
}
