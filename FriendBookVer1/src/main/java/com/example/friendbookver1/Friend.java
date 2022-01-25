package com.example.friendbookver1;

public class Friend {

    private String name;
    private int age;
    private String status;

    public Friend(String n, int a, String s){
        name = n;
        age = a;
        status = s;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return name;
    }
}
