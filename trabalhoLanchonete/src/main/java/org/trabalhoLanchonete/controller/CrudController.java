package org.trabalhoLanchonete.controller;

public interface CrudController <K,T>{
	
	public String save(T object);
	public String update(T object);
	public String delete(K objectKey);

}
