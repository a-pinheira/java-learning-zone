package com.ladybug.endpointDojo.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//Vai configurar a aplicação baseado nas dependecias que foram adc
@EnableAutoConfiguration
public class ApplicationStart {
    //Irá startar o servlet container que estiver utilizando / e o tomcat
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
