package org.trabalhoLanchonete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.trabalhoLanchonete.model.Client;

@Controller
public class ClientController {
	
	@RequestMapping("clientForm")
	public String clientForm() {
		return "clientForm";
	}
	
	@RequestMapping("saveClient")
	public String saveClient(Client client) {
		return "teste";
	}

}
