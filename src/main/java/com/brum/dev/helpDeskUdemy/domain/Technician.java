package com.brum.dev.helpDeskUdemy.domain;

import java.util.ArrayList;
import java.util.List;

import com.brum.dev.helpDeskUdemy.domain.enums.Profile;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Technician extends Person{
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "technician")
	private List<Ticket> tickets = new ArrayList<>();
	
	public Technician() {
		super();
		addProfile(Profile.TECHNICIAN);
	}

	public Technician(Integer id, String name, String cpf, String email, String password) {
		super(id, name, cpf, email, password);
		addProfile(Profile.TECHNICIAN);
	}

	public void addTicket(Ticket ticket){
		this.tickets.add(ticket);
	}

}
