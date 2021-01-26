package org.trabalhoLanchonete.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.trabalhoLanchonete.model.Ingredient;

public class IngredientRepository implements CrudRepository <Integer, Ingredient>{


	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public boolean insert(Ingredient object) {
		manager.persist(object);
		return true;
	}

	@Override
	public boolean update(Ingredient object) {
		manager.merge(object);
		return true;
	}

	@Override
	public boolean delete(Ingredient object) {
		manager.remove(object);
		return true;
	}

	@Override
	public List<Ingredient> getAll() {
		TypedQuery<Ingredient> query = manager.createQuery("select i from Ingredient i", Ingredient.class);
		return query.getResultList();
	}

	@Override
	public Ingredient getOne(Integer objectKey) {
		return manager.find(Ingredient.class, objectKey);
	}

}
