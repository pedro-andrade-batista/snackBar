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

	
	public Ingredient() {
		super();
	}
	
	public Ingredient(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", nome=" + name + "]";
	}
	
	
}
