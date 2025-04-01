package com.matqueme.gestiondestock.repository;

import com.matqueme.gestiondestock.model.LigneCommandeFournisseur;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur, Integer> {

  List<LigneCommandeFournisseur> findAllByCommandeFournisseurId(Integer idCommande);

  List<LigneCommandeFournisseur> findAllByArticleId(Integer idCommande);
}
