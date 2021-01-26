package org.trabalhoLanchonete.repository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface CrudRepository <K, T>{
	

	public boolean insert(T object);
	public boolean update(T object);
	public boolean delete(T object);
	public List<T> getAll();
	public T getOne(K objectKey);
	
}
