package com.odix.fr.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Fichier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7697898031944652164L;
	
	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false, unique=true)
	private UUID id;
	
    @Column(unique=true)
    private String nomFichier;
    
    @Column(unique=true)
    private String urlFichier;
    
    @Column(unique=true)
    private String dateCreationFichier;
    
    @Column(unique=true)
    private String tailleFichier;
    
	//C'est la personne qui a inséré le fichier
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Utilisateur proprietaire;

	public Fichier() {
		super();
	}

	public UUID getId() {
		return id;
	}

	public String getNomFichier() {
		return nomFichier;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	public String getUrlFichier() {
		return urlFichier;
	}

	public void setUrlFichier(String urlFichier) {
		this.urlFichier = urlFichier;
	}

	public String getDateCreationFichier() {
		return dateCreationFichier;
	}

	public String getTailleFichier() {
		return tailleFichier;
	}

	public void setDateCreationFichier(String dateCreationFichier) {
		this.dateCreationFichier = dateCreationFichier;
	}

	public void setTailleFichier(String tailleFichier) {
		this.tailleFichier = tailleFichier;
	}

	public Utilisateur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Utilisateur proprietaire) {
		this.proprietaire = proprietaire;
	}
	
}
