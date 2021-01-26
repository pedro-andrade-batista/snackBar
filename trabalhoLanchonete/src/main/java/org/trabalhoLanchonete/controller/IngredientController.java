package org.trabalhoLanchonete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.trabalhoLanchonete.model.Ingredient;

@Controller
public class IngredientController implements CrudController <Integer, Ingredient>{

	@RequestMapping("allIngredients")
	public String clientForm() {
		return "ingredients";
	}
	
	@Transactional
	@RequestMapping(value = "saveIngredient", method = RequestMethod.POST)
	@Override
	public String save(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@RequestMapping(value = "updateIngredient", method = RequestMethod.POST)
	@Override
	public String update(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@RequestMapping("deleteIngredient")
	@Override
	public String delete(Integer ingredientKey ) {
		// TODO Auto-generated method stub
		return null;
	}

}
