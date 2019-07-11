package com.stackroute.domain;

public class Actor {
private String actname;
private String actgender;
private int age;
public void setActname(String actname){
    this.actname=actname;
}
public void setActgender(String actgender){
    this.actgender=actgender;
}
public void setAge(int age){
    this.age=age;
}
public void print(){
    System.out.println("Actor details are:\n" + "actor-name:" + actname + "\n" + "actor-gender:" + actgender + "\n" + "age:" + age);
}
}
