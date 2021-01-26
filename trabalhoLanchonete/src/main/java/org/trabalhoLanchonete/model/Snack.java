package org.trabalhoLanchonete.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Snack {
	
	@Id
	@GeneratedValue
	private int snackNumber;
	
	private String name;

	public Snack() {
		super();
	}

	public Snack(int snackNumber, String name) {
		super();
		this.snackNumber = snackNumber;
		this.name = name;
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

	@Override
	public String toString() {
		return "Snack [snackNumber=" + snackNumber + ", name=" + name + "]";
	}
	
	
	
	

}
