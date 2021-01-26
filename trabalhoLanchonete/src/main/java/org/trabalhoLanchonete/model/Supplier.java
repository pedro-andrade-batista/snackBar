package org.trabalhoLanchonete.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Supplier {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String phone;
	private String address;
	
	@ManyToMany
	private List<Ingredient> ingredients;

	
	public Supplier() {
		super();
		this.ingredients = new ArrayList();
	}
	
	
	public Supplier(int id, String name, String phone, String address, List<Ingredient> ingredients) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.ingredients = ingredients;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
	}
	
	
	
}
