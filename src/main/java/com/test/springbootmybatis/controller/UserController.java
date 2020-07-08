package com.test.springbootmybatis.controller;

import com.test.springbootmybatis.pojo.User;
import com.test.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/userAdd")
    public String addUser(User user){
        System.out.println(user);
        try{
            if(0!=userService.userAdd(user)){
                return "redirect:/ok";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return "error";
    }

    @RequestMapping("/findUserAll")
    public String findUserAll(Model model){
        try{
            List<User> list = userService.findUserAll();
            model.addAttribute("list",list);
            return "findUser";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "error";
    }

    @RequestMapping("/preUser")
    public String findUser(String id,Model model){
        try{
            User user = userService.findUser(id);
            model.addAttribute("user",user);
            return "predealData";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "error";
    }

    @RequestMapping("/updateUser")
    public String findUser(User user){
        try{
            if(0!=userService.updateUser(user));
            return "redirect:/ok";
        }catch(Exception e){
            e.printStackTrace();
        }
        return "error";
    }


    @RequestMapping("/deleteUser")
    public String deleteUser(String id){
        try{
            if(0!=userService.deleteUser(id)) {
                return "redirect:/ok";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return "error";
    }
}
