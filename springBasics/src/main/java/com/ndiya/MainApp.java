package com.ndiya;

import com.ndiya.xml.config.Car;
import com.ndiya.xml.config.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ndiyakholwa on 2016/01/24.
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        /*Engine eng = ctx.getBean("sportsEngine", Engine.class);
        eng.print();*/

        Car m3 = ctx.getBean("bmw-m6", Car.class);
        m3.drive();
    }

}
