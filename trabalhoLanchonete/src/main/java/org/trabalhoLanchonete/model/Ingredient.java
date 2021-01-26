package org.trabalhoLanchonete.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Ingredient {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@ManyToMany
	private List<Supplier> suppliers;
	
	public Ingredient() {
		super();
		this.suppliers = new ArrayList();
	}
	
	public Ingredient(int id, String name, List<Supplier> suppliers) {
		super();
		this.id = id;
		this.name = name;
		this.suppliers = suppliers;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String nome) {
		this.name = nome;
	}
	
	
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	
	public void addSupplier(Supplier supplier) {
		this.suppliers.add(supplier);
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", nome=" + name + "]";
	}
	
	
}
