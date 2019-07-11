package com.stackroute.domain;

public class Movie {
    private Actor actor;
    private String mname;
    private String language;
    public void setActor(Actor actor){
        this.actor=actor;
    }
    public void setMname(String mname){
        this.mname=mname;
    }
    public void setLanguage(String language){
        this.language=language;
    }
    public void printText(){
        actor.print();
        System.out.println("Movie Details \n" + "movie-name:" + mname + "\n" + "language:" + language);
    }
}
