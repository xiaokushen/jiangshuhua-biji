package com.example.demo.controller;

import com.example.demo.entity.FnList;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/add")
    @ResponseBody
    public void add(User user){
        userService.addUser(user);
    }

    @RequestMapping("/queryUser")
    public User queryById(String userId){
        User users = userService.queryUserByUserId(userId);
        return users;
    }

    @RequestMapping("/queryUserList")
    public List<User> queryUserList(String userId){
        List<User> users = userService.queryUserById(userId);
        return users;
    }

    @RequestMapping("/userLogin")
    public String login(String userId, String userPsd, HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = userService.queryUser(userId,userPsd);
        TreeMap<String,String> map = userService.queryUserFuns(user);
        if(null != user){
            session.setAttribute("user",user);
            session.setAttribute("map",map);
            System.out.println(session.getAttribute("user"));
            System.out.println(session.getAttribute("map"));
            return "登陆成功，欢迎" + user.getUserName();
        }else{
            return "用户名或密码错误";
        }
    }

    @RequestMapping("/logOut")
    public void logOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        response.sendRedirect("/login");
    }

    @RequestMapping("/getSession")
    public User getSession(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        return user;
    }

    @RequestMapping("/loadMenu")
    public List<FnList> queryFnList(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        return userService.queryFuns(user);
    }
}
