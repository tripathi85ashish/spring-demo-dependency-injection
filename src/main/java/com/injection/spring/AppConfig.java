package com.injection.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages="com.boraji.tutorail.spring.di")
public class AppConfig {
   @Bean
   @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
   public Employee getEmployee() {
      return new EmployeeImp();
   }
   
   @Bean
   public Department getDepartment(){
      return new DepartmentImp();
   }
}
