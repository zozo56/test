package mbome.controller;

import java.sql.SQLException;

import mbome.dao.AccesBaseDeDonnees;
import mbome.pojo.Login;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class SeConnecter {
	@RequestMapping(value="/depot",method=RequestMethod.POST)
	public ModelAndView ajouterUnDepot(@ModelAttribute("client")Login login, BindingResult result) throws ClassNotFoundException, SQLException{
		System.out.println(login.getIdentifiant());
		AccesBaseDeDonnees abd=new AccesBaseDeDonnees("dbbblutin");
		//abd.insertionDonnees(client);
		return new ModelAndView("depot", "login", login);
	}
}
