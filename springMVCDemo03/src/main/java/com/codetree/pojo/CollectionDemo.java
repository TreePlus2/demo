package com.codetree.pojo;

import java.util.List;
import java.util.Map;

public class CollectionDemo {
    private List<User> list;
    private Map<String,User> map;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "CollectionDemo{" +
                "list=" + list +
                ", map=" + map +
                '}';
    }
}
