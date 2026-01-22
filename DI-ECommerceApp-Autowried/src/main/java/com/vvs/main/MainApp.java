package com.vvs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.Context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vvs.config.AppConfig;
import com.vvs.model.Order;

public class MainApp {

  public static void main(String[] args) {
    ApplicationContext cn=new AnnotationConfigApplicationContext(AppConfig.class);
    Order or =cn.getBean(Order.class);
    or.display();
    
  }

}