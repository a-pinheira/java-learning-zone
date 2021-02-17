package io.github.apinheira;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//esta anotation informa que essa classe vai inicializar uma api spring
// por padrão essa annotation já está escaneando todas
// as classes, objetos que precisarão ser scaneados
@SpringBootApplication
@RestController
public class EcommerceApplication {
    /*
    * // se não colocar a annotarion acima, pode fazer com esta outra:@ComponentScan
    * // Como é um array, posso colocar quantos pacotes eu quiser, só separar por vírgula
    * // só para exemplificar o uso de array de pacotes, para classes, pacotes (referencias internos ou externos)
    * // convém usar desta forma, caso pegue bibliotecas de terceiros (Pacotes externos)
    * @ComponentScan(
        basePackages = {
                "io.github.apinheira.io.github.apinheira.repository",
                "io.github.apinheira.service",
                "com.packageother.projetoTeste" }
        )
        *     @Autowired
        *     //Identifica o nome da aplicação
        *     @Qualifier("ApplicationName")*/

    @Value("${application.name}")
    private String applicationName;

    //Nome na api - endpoint
    @GetMapping("/ola")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        //Comando para chamar a classe
        SpringApplication.run(EcommerceApplication.class, args);
    }
}
