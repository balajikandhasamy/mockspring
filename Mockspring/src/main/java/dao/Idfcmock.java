package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import dto.Mockdto;



public class Idfcmock {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();


	public void insert(Mockdto dto){
		
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		
	}


	public Mockdto fetch(int id) {
		Mockdto d=entityManager.find(Mockdto.class,  id); 
		return d;
		
	}
}
