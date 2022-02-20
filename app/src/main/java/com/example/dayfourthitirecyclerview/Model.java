package com.example.dayfourthitirecyclerview;

public class Model {

    public String name;
    public String phone;
    public int photo;

    public Model(String name, String phone,int photo) {
        this.name = name;
        this.phone = phone;
        this.photo=photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
