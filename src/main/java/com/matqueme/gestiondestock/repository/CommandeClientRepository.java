package com.matqueme.gestiondestock.repository;

import com.matqueme.gestiondestock.model.CommandeClient;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer> {

  Optional<CommandeClient> findCommandeClientByCode(String code);

  List<CommandeClient> findAllByClientId(Integer id);
}
