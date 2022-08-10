package com.banregio.next.api.domian.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "actor")
@Data
@AllArgsConstructor

public class Actor {
	
	private static final long serialVersionUID = 1L;

	public Actor() {
		super();
		
	}
	
	
	@Id
	@Column(name = "actor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer actorId;
	
	@Column(name = "first_name")
	
	private String firstName;
	
	@Column(name = "last_name")
	
	private String lastName;
	
	
	@Column(name = "last_update")
	private Date lastUpdate;
	
	

}
