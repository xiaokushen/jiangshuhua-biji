package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {
    //User queryUserByUserId(String userId);

    User queryUserByUserId(String userId);

    @Query(value = "select * from PSD_USER_INFO p " +
                   " where p.USER_ID like  CONCAT('%',:userId,'%')" +
                   " and p.USER_ID != 1" +
                   " and p.DELET_STATE = 1",nativeQuery = true)
    List<User> queryUserById(@Param(value = "userId") String userId);

   /* @Query(value = "select * from PSD_USER_INFO p " +
            " where p.USER_ID = :userId" +
            " and p.USER_PSD = :userPsd" +
            " and p.DELET_STATE = 1",nativeQuery = true)
    User queryUser(@Param(value="userId") String userId,@Param(value="userPsd") String userPsd);*/

   User queryUserByUserIdAndUserPsd(String userId, String userPsd);
}

/*"select USER_ID,USER_PSD," +
                   " USER_NAME," +
                   " USER_ROLE," +
                   " DELET_STATE" +
                   " from PSD_USER_INFO p " +
                   " where p.USER_ID like  CONCAT('%',:userId,'%')",nativeQuery = true)*/
