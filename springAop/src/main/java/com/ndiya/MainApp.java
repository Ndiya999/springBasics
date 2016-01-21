package com.ndiya;

import com.ndiya.model.Car;
import com.ndiya.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ndiyakholwa on 2016/01/20.
 */
public class MainApp {

    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        Circle circle = ctx.getBean("circle", Circle.class);
        circle.print();

        Car vw = ctx.getBean("vw", Car.class);
        vw.setMake("toyota");
       // vw.multiArgs("Gesheshe", "280km/s", 12);
       String tmp = vw.getMaxSpead();

    }
}
