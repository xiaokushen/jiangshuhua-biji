package com.example.demo.dao;

import com.example.demo.entity.PsdUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PsdUserRoleDao extends JpaRepository<PsdUserRole,String> {
    PsdUserRole queryUserRoleByUserId(String userId);
}
