package com.banregio.next.api.domian.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banregio.next.api.domian.entity.Actor;

public interface ActoresRepository extends JpaRepository<Actor, Integer>{


	//@Query(value = "Select * From actor where first_name 'ED'",nativeQuery = true)
	//List<Actor> buscarPorNombre();
	
	//@Query("Select a from actor a where a.firstName = 'ED'")
	//List<Actor> buscarPorNombreJPA();
	
	//asi lo pide el banco
	//List<Actor> findByFirstNameDesc(String  firstNatme);
	
}