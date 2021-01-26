package org.trabalhoLanchonete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.trabalhoLanchonete.model.Client;
import org.trabalhoLanchonete.repository.ClientRepository;

@Controller
public class ClientController implements CrudController<Integer, Client>{
	
	private ClientRepository clientRepository;
	
	@Autowired
	public ClientController(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	@RequestMapping("clientForm")
	public String clientForm() {
		return "clientForm";
	}
	
	@Override
	@Transactional 
	@RequestMapping(value = "saveClient", method = RequestMethod.POST)
	public String save(Client client) {
		boolean resp = clientRepository.insert(client);
		return "clientForm";
	}

	@Override
	@Transactional
	@RequestMapping(value = "updateClient", method = RequestMethod.POST)
	public String update(Client client) {
		boolean resp = clientRepository.update(client);
		return "clientForm";
	}

	@Override
	@Transactional
	@RequestMapping("removeClient")
	public String delete(Integer clientKey) {
		Client resp = clientRepository.getOne(clientKey);
		clientRepository.delete(resp);
		return "clientForm";
	}
	
	

}
