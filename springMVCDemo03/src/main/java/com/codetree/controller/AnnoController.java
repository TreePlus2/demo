package com.codetree.controller;

import com.codetree.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;

@Controller
@RequestMapping(path = "anno")
@SessionAttributes("msg")
public class AnnoController {

    @RequestMapping("/requestParam")
    public String getRequestParam(@RequestParam("name") String name){
        System.out.println(name);
        return "getParams";
    }

    @RequestMapping(path = "/requestBody", produces = "application/json; charset=utf-8")
    public String getRequestBody(@RequestBody String body){
        System.out.println(body);
        return "getParams";
    }

    @RequestMapping("/PathVariable/{name}")
    public String getPathVariable(@PathVariable("name") String name){
        System.out.println(name);
        return "getParams";
    }

    @RequestMapping("/modelAttribute")
    public String getModelAttribute(User user){
        System.out.println(user);
        return "getParams";
    }
    //@ModelAttribute
    public User testModelAttribute(User user){
        System.out.println("ModelAttribute方法先执行");
        user.setuName(user.getuName());
        user.setAge(user.getAge());
        user.setBirthday(new Date());
        return user;
    }

    @RequestMapping("/modelAttributeParam")
    public String getModelAttributeParam(@ModelAttribute User user){
        System.out.println(user);
        return "getParams";
    }

    @RequestMapping("/sessionAttributes")
    public String testSessionAttributes(Model model){
        model.addAttribute("msg","发士大夫");
        return "getParams";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "getParams";
    }

    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        status.setComplete();//会话完成
        return "getParams";
    }

}
