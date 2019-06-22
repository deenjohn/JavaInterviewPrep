package com.springDemo.javaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//https://stackoverflow.com/questions/46362751/spring-framework-configurable-vs-configuration

@Configuration
public class HelloWorldConfig {
   @Bean()
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
