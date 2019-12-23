package com.odix.fr.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odix.fr.model.Fichier;


@Repository
public interface FichierRepository extends JpaRepository<Fichier, UUID> {

}
