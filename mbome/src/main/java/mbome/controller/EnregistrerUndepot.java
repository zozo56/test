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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import mbome.dao.AccesBaseDeDonnees;
import mbome.pojo.Client;
import mbome.pojo.Depot;


@org.springframework.stereotype.Controller
@SessionAttributes

public class EnregistrerUndepot {
	
	public EnregistrerUndepot() {
	
	}

	/*Requette Ajax pour avoir un Id*/
	//mise en commentaire car erreur de creation "/depot" : déjà mappé ailleurs
	/*
	@RequestMapping(value="/depot",method=RequestMethod.POST)
	public @ResponseBody String Depot(@RequestParam(value="name") String val) throws ClassNotFoundException, SQLException{
		String data=null, don=null;
		AccesBaseDeDonnees abd=new AccesBaseDeDonnees("dbbblutin");

		if(val.split(" ")[1].equals("filtre")){
			data=abd.ClientDepot(val.split(" ")[0], "client");
		}
		
		/*recherche les donnes du client *
		if(val.split(" ")[1].equals("recherche")){
			data=abd.Client(val.split(" ")[0], "client");
			don=abd.Client("NumClient", "depot");
			String NumDepotSuivan=""+(Integer.parseInt(don.split(",bfs;!")[1])+1);
			data+="r,bfs;!"+NumDepotSuivan;
		}
		
		/*chargements de categories*
		if(val.split(" ")[1].equals("categories")){
			data=abd.categories();
		}
		return data;		
	}
	*/
	
	/*Requette Ajax pour avoir toutes les donnees d'un client 
	@RequestMapping(value="/depot",method=RequestMethod.POST)
	public @ResponseBody String[] client(@RequestParam(value="valeur") String val) throws ClassNotFoundException, SQLException{
		//System.out.println(depot.getIdc());
		AccesBaseDeDonnees abd=new AccesBaseDeDonnees("dbbblutin");
		String[] data=abd.Client(val, "client");
		return null;		
	}
	*/
	
	@RequestMapping(value="/ajoutdepot",method=RequestMethod.POST)
	public ModelAndView ajouterUnDepot(@ModelAttribute("depot")Depot depot, BindingResult result) throws ClassNotFoundException, SQLException{
		
		AccesBaseDeDonnees abd=new AccesBaseDeDonnees("dbbblutin");
		abd.insertionDonnees(depot);
		return new ModelAndView("depot", "ajout", " le dépot a bien �t� enregistr�");
		//return new ModelAndView("ajoutdepot", "ajout", depot);
	}
	
	
	
	@RequestMapping("/ajoute")
	public ModelAndView AjouterUnDepot()  {
		
		return new ModelAndView("contact", "ajout", new Client());
	}

}
