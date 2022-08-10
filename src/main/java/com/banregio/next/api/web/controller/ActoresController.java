package com.banregio.next.api.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banregio.next.api.domian.entity.Actor;
import com.banregio.next.api.domian.repository.ActoresRepository;


@RestController
@RequestMapping(value = "/actores")


public class ActoresController {

	
	private ActoresRepository actoresrepository;;
	
	@Autowired
	public ActoresController(ActoresRepository actoresrepository) {
		super();
		this.actoresrepository = actoresrepository;
	}


	@GetMapping()
	List<Actor> findAll(){		
		return actoresrepository.findAll();
	}
}
