package com.example.clientasmtoi1510.config;

import com.example.clientasmtoi1510.service.HelloWorld;
import com.example.clientasmtoi1510.service.HelloWorldServiceLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.rpc.ServiceException;

@Configuration
public class MyConfig {
    @Bean
    HelloWorld helloWorld() throws ServiceException {
        return new HelloWorldServiceLocator().getHelloWorldPort();
    }
}
