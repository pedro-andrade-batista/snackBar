package org.trabalhoLanchonete.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.trabalhoLanchonete.model.Order;

public class OrderController implements CrudController <Integer, Order>{

	@RequestMapping("allOrders")
	public String clientForm() {
		return "orders";
	}
	
	@Transactional
	@RequestMapping(value = "saveOrder", method = RequestMethod.POST)
	@Override
	public String save(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@RequestMapping(value = "updateOrder", method = RequestMethod.POST)
	@Override
	public String update(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@RequestMapping("deleteOrder")
	@Override
	public String delete(Integer orderKey) {
		// TODO Auto-generated method stub
		return null;
	}

}
