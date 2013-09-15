package mbome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class ProjetController {
	
	
	@RequestMapping("/")
	public ModelAndView afficherIndex(){
		System.out.println("la page Index");
		return new ModelAndView("index","", "");
	}
	
	@RequestMapping(value="/toto.jsp")
	public void afficherToto(){
		System.out.println("la page toto");
	}
	
	@RequestMapping(value="/tati")
	public void afficherTati(){
		System.out.println("la page tati");
	}
	
}
