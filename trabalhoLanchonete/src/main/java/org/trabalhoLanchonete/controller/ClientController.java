package org.trabalhoLanchonete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.trabalhoLanchonete.model.Client;

@Controller
public class ClientController implements CrudController<String, Client>{
	
	//FAZER INJEÇÃO DE DEPENDENCIA AQUI
	
	@RequestMapping("clientForm")
	public String clientForm() {
		return "clientForm";
	}
	
	@Transactional
	@RequestMapping(value = "saveClient", method = RequestMethod.POST)
	@Override
	public String save(Client client) {
		return "clientForm";
	}

	@Transactional
	@RequestMapping(value = "updateClient", method = RequestMethod.POST)
	@Override
	public String update(Client client) {
		return "clientForm";
	}

	@Transactional
	@RequestMapping("removeClient")
	@Override
	public String delete(String clientKey) {
		return "clientForm";
	}
	
	

}
