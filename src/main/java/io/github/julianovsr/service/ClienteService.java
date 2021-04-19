package io.github.julianovsr.service;

import io.github.julianovsr.model.Cliente;
import io.github.julianovsr.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }


    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        repository.persistirCliente(cliente);
    }

    private void validarCliente(Cliente cliente) {

        //Valida o cliente

    }

}
