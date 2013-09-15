package mbome.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


@org.springframework.stereotype.Controller
public  class IndexController implements Controller {
		
	
		@RequestMapping("/depot")
		public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
				/*System.out.println("Reponse : "+request.getParameter("identifiant"));
				String mess="Bonjour  �  tous ";*/
					return new ModelAndView("depot","Message", "");	
		}

}
