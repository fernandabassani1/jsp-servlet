package br.com.sisvenda.service;

import java.util.List;

import br.com.sisvenda.model.Cliente;
import br.com.sisvenda.repository.ClienteRepository;
import br.com.sisvenda.controller.ListaClienteServlet;

public class ClienteService {
	
	ClienteRepository repository = new ClienteRepository();
	
	/*ClienteRepository repository;*/
		
	/*public ClienteService(ClienteRepository repository) {
		this.repository = repository;
	}*/
	
	public ClienteService() {
	}

	public Cliente criarCliente(String nome, String documento){
		Cliente cliente = new Cliente();
		cliente.setNome(nome); 
		cliente.setDocumento(documento);
		repository.salvarCliente(cliente);	
		return cliente;		
	}
	public List<Cliente> listaDecliente() {
		return repository.listaDecliente();	
	}
}
