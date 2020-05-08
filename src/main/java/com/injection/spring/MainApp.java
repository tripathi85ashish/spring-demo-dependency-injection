package com.injection.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

      Company company = context.getBean(Company.class);
      company.showDepartmentInfo();
      company.showDepartmentInfo();
      context.close();
   }
}
