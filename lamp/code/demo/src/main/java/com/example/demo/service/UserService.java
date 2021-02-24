package com.example.demo.service;

import com.example.demo.dao.*;
import com.example.demo.entity.FnList;
import com.example.demo.entity.PsdUserRole;
import com.example.demo.entity.RoleFunMap;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class UserService {

    @Autowired
    UserDao dao;
    @Autowired
    PsdUserRoleDao psdUserRoleDao;
    @Autowired
    PsdRoleDao psdRoleDao;
    @Autowired
    FnDao fnDao;
    @Autowired
    RoleFunMapDao rfmDao;


    /**
     * 描述:添加用户/修改用户
     * @param user
     */
    @Transactional
    public void addUser(User user){
        User u = queryUserByUserId(user.getUserId());
        if(null == u){
            user.setRowId(UUID.randomUUID().toString());
        }else {
            user.setRowId(u.getRowId());
        }
        PsdUserRole pur = queryUPM(user.getUserId());
        if(null != pur){
            pur.setRoleId(user.getUserRole());
        }else{
            pur = new PsdUserRole();
            pur.setRowId(UUID.randomUUID().toString());
            pur.setUserId(user.getUserId());
            pur.setRoleId(user.getUserRole());
        }
        psdUserRoleDao.save(pur);
        user.setUserRole(roleChange(user.getUserRole()));
        dao.save(user);
    }

    /**
     * 描述:通过Id查询用户
     * @param userId
     * @return
     */
    public User queryUserByUserId(String userId){
        User user = dao.queryUserByUserId(userId);
        System.out.println(user);
        if(user != null){
            user.setUserRole(changeRole(user.getUserRole()));
            return user;
        }else{
            return user;
        }
    }

    /**
     * 描述:通过Id查询用户列表
     * @param userId
     * @return
     */
    public List<User> queryUserById(String userId){
        return dao.queryUserById(userId);
    }

    /**
     * 描述:通过用户名密码查询用户
     * @param userId
     * @param userPsd
     * @return
     */
    public User queryUser(String userId,String userPsd) {
        return dao.queryUserByUserIdAndUserPsd(userId,userPsd);
    }

    /**
     * 描述:通过用户Id查询用户角色信息
     * @param userId
     * @return
     */
    public PsdUserRole queryUPM(String userId){
        return psdUserRoleDao.queryUserRoleByUserId(userId);
    }

    /**
     * 描述:将权限Id转化成权限名
     * @param userRole
     * @return
     */
    public String roleChange(String userRole){
        String[] roleArr = userRole.split("");
        String str = "";
        for(int i = 0;i < roleArr.length;i++){
            str += psdRoleDao.queryPsdRoleByRoleId(roleArr[i]).getRoleName() + " ";
            System.out.println(str);
        }
        return str;
    }


    /**
     * 描述:将权限名转化成权限Id
     * @param userRole
     * @return
     */
    public String changeRole(String userRole){
        String[] roleArr = userRole.split(" ");
        String str = "";
        for(int i = 0;i < roleArr.length;i++){
            str += psdRoleDao.queryPsdRoleByRoleName(roleArr[i]).getRoleId() + "";
            System.out.println(str);
        }
        return str;
    }

    /**
     * 描述:查询权限与功能点映射
     * @param user
     * @return
     */
    public TreeMap<String,String> queryUserFuns(User user){
        String str = changeRole(user.getUserRole());
        String[] roleArr = str.split("");
        String uId = user.getUserId();
        TreeMap<String,String> map = new TreeMap<String,String>();
        for(int i = 0;i < roleArr.length;i++){
            List<RoleFunMap> list = rfmDao.queryRoleFunMapByRoleId(roleArr[i]);
            for(int j = 0;j < list.size();j++){
                System.out.println(list.get(j).getFunId());
                String funId = list.get(j).getFunId();
                map.put(funId,uId);
            }
        }
        return map;
    }



    /*List<FnList>*/
    public List<FnList> queryFuns(User user){
        TreeMap<String,String> map = queryUserFuns(user);
        Iterator<String> iter =  map.keySet().iterator();
        List<FnList> list = new ArrayList<FnList>();
        while (iter.hasNext()) {
            String key = iter.next();
            FnList fn = fnDao.queryFnListByFunId(key);
            list.add(fn);
        }
        return list;
    }
}
