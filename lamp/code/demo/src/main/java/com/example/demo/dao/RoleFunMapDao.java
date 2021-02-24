package com.example.demo.dao;

import com.example.demo.entity.RoleFunMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleFunMapDao extends JpaRepository<RoleFunMap,String> {
    List<RoleFunMap> queryRoleFunMapByRoleId(String roleId);
}
