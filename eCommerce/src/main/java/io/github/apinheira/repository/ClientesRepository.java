package io.github.apinheira.repository;

import io.github.apinheira.model.Cliente;
import org.springframework.stereotype.Repository;

//classe que vai acessa a base de dados
@Repository
public class ClientesRepository {
    public void persistir(Cliente cliente) {
        //acessa a base e salvar o cliente
    }
}
