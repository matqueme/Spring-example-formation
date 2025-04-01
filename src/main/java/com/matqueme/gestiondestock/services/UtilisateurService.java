package com.matqueme.gestiondestock.services;

import com.matqueme.gestiondestock.dto.ChangerMotDePasseUtilisateurDto;
import com.matqueme.gestiondestock.dto.UtilisateurDto;
import java.util.List;

public interface UtilisateurService {

  UtilisateurDto save(UtilisateurDto dto);

  UtilisateurDto findById(Integer id);

  List<UtilisateurDto> findAll();

  void delete(Integer id);

  UtilisateurDto findByEmail(String email);

  UtilisateurDto changerMotDePasse(ChangerMotDePasseUtilisateurDto dto);


}
