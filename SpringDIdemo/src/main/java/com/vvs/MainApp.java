package com.vvs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vvs.config.appConfig;
import com.vvs.model.Order;

public class MainApp {

  public static void main(String[] args) {
    ApplicationContext cn=new AnnotationConfigApplicationContext(appConfig.class);
    Order or =cn.getBean(Order.class);
    or.display();
    ApplicationContext cn1=new ClassPathXmlApplicationContext("Bean.xml");
    Order or1=(Order) cn1.getBean("prorder");
    or1.display();
    
  }

}