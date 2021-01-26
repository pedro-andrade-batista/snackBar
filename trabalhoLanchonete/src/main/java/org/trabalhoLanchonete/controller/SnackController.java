package org.trabalhoLanchonete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.trabalhoLanchonete.model.Snack;

@Controller
public class SnackController implements CrudController <Integer, Snack>{

	
	@RequestMapping("allSnacks")
	public String clientForm() {
		return "snacks";
	}
	
	@Transactional
	@RequestMapping(value = "saveSnack", method = RequestMethod.POST)
	@Override
	public String save(Snack snack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@RequestMapping(value = "updateSnack", method = RequestMethod.POST)
	@Override
	public String update(Snack snack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@RequestMapping("deleteSnack")
	@Override
	public String delete(Integer snackKey) {
		// TODO Auto-generated method stub
		return null;
	}

}
