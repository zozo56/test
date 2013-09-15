package mbome.controller;


import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;





import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import mbome.dao.AccesBaseDeDonnees;
import mbome.pojo.Article;
import mbome.pojo.Client;
import mbome.pojo.Recherche;


@org.springframework.stereotype.Controller
@SessionAttributes


public class ResultatsRecherche {

	@RequestMapping(value="/resultat",method=RequestMethod.POST)
	public ModelAndView ajouterUnDepot(@ModelAttribute("recherche")Recherche recherche, BindingResult result) throws ClassNotFoundException, SQLException{
		
		AccesBaseDeDonnees abd=new AccesBaseDeDonnees("dbbblutin");
		
		Vector<String[]> vecteur =abd.rechercheDonnees(recherche.getExpression(), recherche.getCritere());
		abd.affichageDeResultats(vecteur);
		
		return new ModelAndView("resultat", "donnees", vecteur);
	}
	
	@RequestMapping("/recherche#resultRech")
	public ModelAndView AjouterUnDepot()  {
		
		return new ModelAndView("contact", "ajout", new Client());
	}
}
