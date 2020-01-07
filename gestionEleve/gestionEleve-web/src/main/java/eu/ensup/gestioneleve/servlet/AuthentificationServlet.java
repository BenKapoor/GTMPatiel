package eu.ensup.gestioneleve.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthentifiactionServlet
 * @author benja
 *
 */
public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CHAMP_EMAIL = "email";
	public static final String CHAMP_PASS = "password";
	public static final String ATT_ERREURS = "erreurs";
	public static final String ATT_RESULTAT = "resultat";
	public static final String VUE = "/WEB-INF/Authentification.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthentificationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Affichage de la page d'inscription */
		this.getServletContext().getRequestDispatcher(AuthentificationServlet.VUE).forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String resultat;
		Map<String, String> erreurs = new HashMap();

		/* Récupération des champs du formulaire. */
		String email = request.getParameter(AuthentificationServlet.CHAMP_EMAIL);
		String motDePasse = request.getParameter(AuthentificationServlet.CHAMP_PASS);

		/* Initialisation du résultat global de la validation. */
		if (erreurs.isEmpty()) {
			resultat = "Succès de l'authentification.";
		} else {
			resultat = "Échec de l'authentification.";
		}

		/* Stockage du résultat et des messages d'erreur dans l'objet request */
		request.setAttribute(AuthentificationServlet.ATT_ERREURS, erreurs);
		request.setAttribute(AuthentificationServlet.ATT_RESULTAT, resultat);

		/* Transmission de la paire d'objets request/response à notre JSP */
		this.getServletContext().getRequestDispatcher(AuthentificationServlet.VUE).forward(request, response);
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

}
