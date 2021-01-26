package org.trabalhoLanchonete.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.trabalhoLanchonete.model.Order;

public class OrderRepository implements CrudRepository <Integer, Order>{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public boolean insert(Order object) {
		manager.persist(object);
		return true;
	}

	@Override
	public boolean update(Order object) {
		manager.merge(object);
		return true;
	}

	@Override
	public boolean delete(Order object) {
		manager.remove(object);
		return true;
	}

	@Override
	public List<Order> getAll() {
		TypedQuery<Order> query = manager.createQuery("select o from Order o", Order.class);
		return query.getResultList();
	}

	@Override
	public Order getOne(Integer objectKey) {
		return manager.find(Order.class, objectKey);
	}
}
