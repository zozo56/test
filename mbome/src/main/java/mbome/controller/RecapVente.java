package mbome.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mbome.dao.AccesBaseDeDonnees;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@org.springframework.stereotype.Controller
@SessionAttributes
public class RecapVente {

	public RecapVente() {}

	/*Requette Ajax pour avoir un Article*/
	//@RequestMapping(value="/recapVente",method=RequestMethod.POST)
	public @ResponseBody String Depot(@RequestParam(value="exp") String val) throws ClassNotFoundException, SQLException{
		String data=null, don=null;

		AccesBaseDeDonnees abd=new AccesBaseDeDonnees("dbbblutin");
		if(val.split(" ")[1].equals("article")){
			data=abd.article(val.split(" ")[0], "article");
		}

		if(val.split(" ")[1].equals("details")){
			data=abd.detailsArticle(val.split(" ")[0], "article");
			System.out.println(data);
		}
		
		System.out.println("recapVente1");
		return data;		
	}
	
	@RequestMapping(value="/recapVente",method=RequestMethod.POST)
	public ModelAndView handleRequest(HttpServletRequest arg0,HttpServletResponse arg1) throws Exception {
		
		System.out.println("recapVente");
		return new ModelAndView("recapVente","Message","salut");
	}


}
