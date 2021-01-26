package org.trabalhoLanchonete.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Order {
	
	@Id
	@GeneratedValue
	private int orderNumber;
	private LocalDate dateOfOrder;
	
	
	@ManyToOne
	private Client client;
	
	@ManyToMany
	private List<Snack> snacks;

	public Order() {
		super();
		this.snacks = new ArrayList<>();
	}

	public Order(int numberOfOrder, LocalDate dateOfOrder, Client client, List<Snack> snacks) {
		super();
		this.orderNumber = numberOfOrder;
		this.dateOfOrder = dateOfOrder;
		this.client = client;
		this.snacks = snacks;
	}
	

	public Order(int numberOfOrder, LocalDate dateOfOrder, Client client) {
		super();
		this.snacks = new ArrayList<>();
		this.orderNumber = numberOfOrder;
		this.dateOfOrder = dateOfOrder;
		this.client = client;
	}

	public int getNumberOfOrder() {
		return orderNumber;
	}

	public void setNumberOfOrder(int numberOfOrder) {
		this.orderNumber = numberOfOrder;
	}

	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(LocalDate dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Snack> getSnacks() {
		return snacks;
	}

	public void addSnacks(Snack snacks) {
		this.snacks.add(snacks);
	}

	@Override
	public String toString() {
		return "Order [numberOfOrder=" + orderNumber + ", dateOfOrder=" + dateOfOrder + ", client=" + client
				+ ", snacks=" + snacks + "]";
	}

	
	
	
	
	
	
}
