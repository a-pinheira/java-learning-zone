package com.ladybug.endpointDojo.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
//Vai configurar a aplicação baseado nas dependecias que foram adc e o pacote de controler
@ComponentScan(basePackages = "com.ladybug.endpointDojo.controlEndpoint")
public class ApplicationStart {
    //Irá startar o servlet container que estiver utilizando / e o tomcat
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
