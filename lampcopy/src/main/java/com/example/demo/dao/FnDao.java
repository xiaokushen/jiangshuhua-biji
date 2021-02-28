package com.example.demo.dao;

import com.example.demo.entity.FnList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FnDao extends JpaRepository<FnList,String> {
    FnList queryFnListByFunId(String funId);
}
