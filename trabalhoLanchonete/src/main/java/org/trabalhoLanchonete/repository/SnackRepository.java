package org.trabalhoLanchonete.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.trabalhoLanchonete.model.Snack;

public class SnackRepository implements CrudRepository <Integer, Snack>{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public boolean insert(Snack object) {
		manager.persist(object);
		return true;
	}

	@Override
	public boolean update(Snack object) {
		manager.merge(object);
		return true;
	}

	@Override
	public boolean delete(Snack object) {
		manager.remove(object);
		return true;
	}

	@Override
	public List<Snack> getAll() {
		TypedQuery<Snack> query = manager.createQuery("select s from Snack s", Snack.class);
		return query.getResultList();
	}

	@Override
	public Snack getOne(Integer objectKey) {
		return manager.find(Snack.class, objectKey);
	}

}
