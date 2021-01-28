package io.github.apinheira.service;

import io.github.apinheira.model.Cliente;
import io.github.apinheira.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    //Instância - Varios teste de infeção de dependecia com set, com instancia ou com construtor
    //@Autowired
    private ClientesRepository repository;

    //Contrutor
    //@Autowired
    public ClientesService( ClientesRepository repository ){
        this.repository = repository;
    }
    //Ou através do método set
    /*@Autowired
    public void setRepository(ClienteRepository io.github.apinheira.repository) {
        this.io.github.apinheira.repository = io.github.apinheira.repository;
    }*/

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        //delega ao io.github.apinheira.repository
        this.repository.persistir(cliente);
        /* ou jeito mais antigo - mais lento e com mais código
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.salvar(cliente); */
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
