package mbome.controller;

import java.io.IOException;
import java.lang.annotation.Annotation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


@org.springframework.stereotype.Controller
public  class Details implements Controller {
		
	
		@RequestMapping("/aide")
		public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
				String mess="Bonjour  �  tous ";
					return new ModelAndView("aide","Message",mess);
			
		}

}
