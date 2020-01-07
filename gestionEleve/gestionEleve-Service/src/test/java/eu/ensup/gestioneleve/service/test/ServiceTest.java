package eu.ensup.gestioneleve.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import eu.ensup.gestionEleve.domaine.Etudiant;
import eu.ensup.gestioneleve.service.GestionService;

public class ServiceTest {
	
	GestionService service = new GestionService();

	/**
	 * Test pour la création d'un étudiant
	 */
	@Test
	public void testCréationEtudiant() {
		Etudiant etu = new Etudiant(1, "Dujardin", "Jean", "jeandujardin@gmail.com", "13 rue de quelque part", 0102030405, "05/04/1980");
		Assert.assertNotNull(service.creerEtudiant(etu));
	}

	/**
	 * Test pour la trouver un étudiant en fonction de son identifiant
	 */
	@Test
	public void testTrouverEtudiant() {
		Etudiant etu = new Etudiant(1, "Dujardin", "Jean", "jeandujardin@gmail.com", "13 rue de quelque part", 0102030405, "05/04/1980");
		service.creerEtudiant(etu);

		Assert.assertTrue("ERREUR INSERTION", etu == service.lireInfoEtudiant(1));
	}

	/**
	 * Test pour la liste de tous les étudiants
	 */
	@Test
	public void testlisterEtudiants() {
		Etudiant etu = new Etudiant(1, "Dujardin", "Jean", "jeandujardin@gmail.com", "13 rue de quelque part", 0102030405, "05/04/1980");
		Etudiant etu2 = new Etudiant(2, "Dujardin", "Jean", "jeandujardin@gmail.com", "13 rue de quelque part", 0102030405, "05/04/1980");
		service.creerEtudiant(etu);
		service.creerEtudiant(etu2);
		
		List<Etudiant> listeEtudiants = service.listerEtudiants();
		Assert.assertEquals(2, listeEtudiants.size());
	}
	
	/**
	 * Test pour la suppression d'un étudiant en fonction de son identifiant
	 */
	@Test
	public void testSupprimerEtudiant() {
		Etudiant etu = new Etudiant(1, "Dujardin", "Jean", "jeandujardin@gmail.com", "13 rue de quelque part", 0102030405, "05/04/1980");
		Etudiant etu2 = new Etudiant(2, "Dujardin", "Jean", "jeandujardin@gmail.com", "13 rue de quelque part", 0102030405, "05/04/1980");
		service.creerEtudiant(etu);
		service.creerEtudiant(etu2);
		
		List<Etudiant> listeEtudiants = service.listerEtudiants();
		Assert.assertEquals(2, listeEtudiants.size());

		service.supprimerEtudiant(1);
		
		Assert.assertEquals(1, listeEtudiants.size());
	}
}

