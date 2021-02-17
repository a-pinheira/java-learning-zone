package io.github.apinheira.config;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//Classe de configuração - Nome da classe de configuração: Bean ou outro método
@Configuration
//pode definir que esta configuração só estará disponível para terminado perfil do properties
@Profile("dev")
public class BeanConfiguration {

    @Bean
    //funciona: qnd a app subir, procurar os commandslineRunner e retorna o método run,
    // que recebe uma serie de arrays de strings
    public CommandLineRunner executar() {
        return arqs ->  {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");


        };
    }
    //classe que vai acessa a base de dados
    //neste caso com o tratamento do Bean é uma string, pode ser substituido por INJEÇÃO DE DEPENDENCIA
    //via arquivos de configuração properties
    //Beans de configuração e de validação
    /*
     @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }

    @Bean(name = "outraConfiguracao")
    public String outraConfiguracao(){
        return "Sistema de Vendas";
    }
     */


}
