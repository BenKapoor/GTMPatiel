package eu.ensup.gestionEleve.domaine;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("ELEVE") avec la méthode TABLE PER CLASS
public class Etudiant extends Personne {
	private String dateNaissance;

	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Etudiant [dateNaissance=" + dateNaissance + "]";
	}

	public Etudiant(int id, String nom, String prenom, String mail, String adresse, int telephone,
			String dateNaissance) {
		super(id, nom, prenom, mail, adresse, telephone);
		this.dateNaissance = dateNaissance;
	}

	public Etudiant(int id, String nom, String prenom, String mail, String adresse, int telephone) {
		super(id, nom, prenom, mail, adresse, telephone);
	}

}
