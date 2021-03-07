package com.upgrad.technicalblogpost.model;

import java.util.Date;

public class Post {
    private String title;  //entitiy
    private String body;
    private Date date;

    //significance of getter and setter :-      you have control on particular entity so you  can read outside the class
    // you hae a controll over the entity you want nothing, read only, write only, both...


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
