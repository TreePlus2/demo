package com.codetree.controller;

import com.codetree.pojo.Account;
import com.codetree.pojo.CollectionDemo;
import com.codetree.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "paramsBind")
public class ParamsBindController {
    @RequestMapping(path = "account")
    public String getParams(Account account) {
        System.out.println(account);
        return "getParams";
    }

    @RequestMapping(path = "listAndMap")
    public String getParamsFromCollection(CollectionDemo collection) {
        System.out.println(collection);
        return "getParams";
    }

    @RequestMapping(path = "user")
    public String getParamsUser(User user) {
        System.out.println(user);
        return "getParams";
    }
}
