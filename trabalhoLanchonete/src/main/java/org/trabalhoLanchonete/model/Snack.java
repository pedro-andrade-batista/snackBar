package org.trabalhoLanchonete.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Snack {
	
	@Id
	@GeneratedValue
	private int snackNumber;
	private String name;
	private Double price;
	@ManyToMany
	private List<Ingredient> ingredients;

	public Snack() {
		super();
		this.ingredients = new ArrayList();
	}

	public Snack(int snackNumber, String name, Double price, List<Ingredient> ingredients) {
		super();
		this.snackNumber = snackNumber;
		this.name = name;
		this.ingredients = ingredients;
		this.price = price;
	}

	public int getSnackNumber() {
		return snackNumber;
	}

	public void setSnackNumber(int snackNumber) {
		this.snackNumber = snackNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	

	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Snack [snackNumber=" + snackNumber + ", name=" + name + ", ingredients=" + ingredients + "]";
	}
	
}
