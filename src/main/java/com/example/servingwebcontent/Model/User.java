package com.example.servingwebcontent.Model;

public class User {
    private String name;
    private String msg;
    private String id;

    private static Integer inctementId = 2;


    public User(){ }

    public User(String name, String msg, Integer id) {
        this.name = name;
        this.msg = msg;
        this.id = id + "";
    }

    public User(String name, String msg) {
        this.name = name;
        this.msg = msg;
        this.id = String.valueOf(++inctementId);
    }

    public Integer getId() {
        return Integer.parseInt(id);
    }

    public void setId(Integer id) {
        this.id = String.valueOf(++inctementId);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
