package com.ladybug.endpointDojo.controlEndpoint;

import com.ladybug.endpointDojo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import static java.util.Arrays.asList;

/*
@author Simone
 */
@RestController
//dando um nome para o endpoint
@RequestMapping("study")
//ponto de acesso final (pessoas/sistemas) de onde os users acessarão a API
//Endpoint
public class StudentEndpoint {
    //adc os metodos
    //a forma como se retornar o valores deste metodo
    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> listAll(){
        return asList(
                new Student("Simone"),
                new Student("Simonetti")
        );
    }
}
