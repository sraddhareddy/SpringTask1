package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        Movie m=ac.getBean("movie",Movie.class);
        m.printText();
        System.out.println("------------------------------");
        BeanFactory bn=new ClassPathXmlApplicationContext("beans.xml");
        Movie mn=bn.getBean("movie",Movie.class);
        mn.printText();
    }
}
