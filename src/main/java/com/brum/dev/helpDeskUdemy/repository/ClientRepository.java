package com.brum.dev.helpDeskUdemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brum.dev.helpDeskUdemy.domain.entities.Client;

public interface ClientRepository  extends JpaRepository<Client, Integer>{

}
