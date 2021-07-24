package com.asus.apistudent.service;

import java.util.List;

public interface BaseService<E> {
	
	public List<E> findAll();
	public E findById(Long id) throws Exception;
	public E save(E enity);
	public E update(Long id, E entity) throws Exception;
	public E delete(Long id) throws Exception;

}
