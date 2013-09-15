package mbome.controller;

import java.net.BindException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.tomcat.util.log.SystemLogHandler;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.portlet.mvc.SimpleFormController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import mbome.dao.AccesBaseDeDonnees;
import mbome.dao.Majuscules;
import mbome.pojo.Client;


@org.springframework.stereotype.Controller
@SessionAttributes

public class EnregistrerUnClient {
	Majuscules  maj = new Majuscules();
	public EnregistrerUnClient() {
	
	}

	
	@RequestMapping(value="/recapitulatif_client",method=RequestMethod.POST)
	public ModelAndView ajouterUnDepot(@ModelAttribute("client")Client client, BindingResult result) throws ClassNotFoundException, SQLException{
	
		AccesBaseDeDonnees abd=new AccesBaseDeDonnees("dbbblutin");
		abd.insertionDonnees(client);
		return new ModelAndView("enregistrer_client", "ajout", maj.minusculeVersMajuscule(client.getNom())+" "+maj.premiereLettreEnMajuscule(client.getPrenom())+" a bien �t� enregistr�");
	}
	
	@RequestMapping("/recapitulatif_client")
	public ModelAndView AjouterUnDepot()  {
		
		return new ModelAndView("contact", "ajout", new Client());
	}

}