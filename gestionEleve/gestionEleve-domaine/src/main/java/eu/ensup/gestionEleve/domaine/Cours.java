package eu.ensup.gestionEleve.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Cours implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCours;
	private String libelle;
	private int nbHeure;
	@ManyToMany(mappedBy = "cours")
	private List<Personne> personnes = new ArrayList();
	@Override
	public String toString() {
		return "Cours [idCours=" + idCours + ", libelle=" + libelle + ", nbHeure=" + nbHeure + ", personnes="
				+ personnes + "]";
	}
	public int getIdCours() {
		return idCours;
	}
	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getNbHeure() {
		return nbHeure;
	}
	public void setNbHeure(int nbHeure) {
		this.nbHeure = nbHeure;
	}
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	public Cours(int idCours, String libelle, int nbHeure, List<Personne> personnes) {
		super();
		this.idCours = idCours;
		this.libelle = libelle;
		this.nbHeure = nbHeure;
		this.personnes = personnes;
	}
	public Cours() {
		super();
	}
	
}
