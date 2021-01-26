package org.trabalhoLanchonete.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.trabalhoLanchonete.model.Client;

@Repository
public class ClientRepository implements CrudRepository <Integer, Client>{

	@PersistenceContext
	private EntityManager manager;

	@Override
	public boolean insert(Client client) {
		manager.persist(client);
		return true;
	}

	@Override
	public boolean update(Client client) {
		 manager.merge(client);
		return true;
	}

	@Override
	public boolean delete(Client client) {
		manager.remove(client);
		return true;
	}

	@Override
	public List<Client> getAll() {
		TypedQuery<Client> query = manager.createQuery("select c from Client c", Client.class);
		return query.getResultList();
	}

	@Override
	public Client getOne(Integer clientKey) {
		return manager.find(Client.class, clientKey);
	}

}
