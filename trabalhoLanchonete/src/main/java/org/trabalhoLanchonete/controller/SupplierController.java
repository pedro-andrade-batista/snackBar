package org.trabalhoLanchonete.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.trabalhoLanchonete.model.Supplier;

public class SupplierController implements CrudController <Integer, Supplier>{
		
	@RequestMapping("allSupplier")
	public String clientForm() {
		return "suppliers";
	}
	
	@Transactional
	@RequestMapping(value = "saveSupplier", method = RequestMethod.POST)
	@Override
	public String save(Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@RequestMapping(value = "updateSupplier", method = RequestMethod.POST)
	@Override
	public String update(Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@RequestMapping("deleteSupplier")
	@Override
	public String delete(Integer supplierKey) {
		// TODO Auto-generated method stub
		return null;
	}

}
