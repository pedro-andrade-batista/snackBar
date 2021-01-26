package org.trabalhoLanchonete.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.trabalhoLanchonete.model.Supplier;

public class SupplierRepository implements CrudRepository <Integer, Supplier>{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public boolean insert(Supplier object) {
		manager.persist(object);
		return true;
	}

	@Override
	public boolean update(Supplier object) {
		manager.merge(object);
		return true;
	}

	@Override
	public boolean delete(Supplier object) {
		manager.remove(object);
		return true;
	}

	@Override
	public List<Supplier> getAll() {
		TypedQuery<Supplier> query = manager.createQuery("select s from Supplier s", Supplier.class);
		return query.getResultList();
	}

	@Override
	public Supplier getOne(Integer objectKey) {
		return manager.find(Supplier.class, objectKey);
	}

}
