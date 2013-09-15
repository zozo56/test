<%-- <%@page import="sun.org.mozilla.javascript.internal.regexp.SubString"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<%@page import="java.util.regex.*;" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Votre Recherche</title>
        <link href="css/cssLutin.css" rel="stylesheet" />
    	<link rel=stylesheet type="text/css" href="/css/cssLutin.css">
	</head>
	<body>
		<div id="wrapper">
			<header id="entete">
            	<%@ include file="entete.jsp" %>
			</header>
			<section id="contenu">
				<div id="menuprincipal">
					<%@ include file="/WEB-INF/views/menu.jsp" %>
				</div>
				<div id="formprincipal">
					<fieldset class="fbienvenue">
					<legend> Votre Recherche </legend>
							<form  action="resultat.html" method="post" >
								
							<div class="rech">
								<table >
 									 <tr>
   										<td>Rechercher :</td>
    									<td><input type="text" name="expression" id="expression" value=" "/></td>
    									<td>Crit&egrave;re :</td>
    									<td>
    									  <select id="sel" name="critere">
    									  		<option >--- Crit&egrave;re ---</option>
    									  		<option>CLient</option>
    									  		<option>D&eacute;p&ocirc;t</option>
    									  		<option>Article</option>
    									  </select>
    									</td>
    									<td><input type="submit" value="Rechercher" id="recherche" class="recherche" /></td>
   									</tr>									 									
								</table>
							</div>	
							
							<div id="resultRech">
								   <%
								   Pattern p = Pattern.compile("@");
								 
	Vector<String[]> vecteurDeDonnees=null;
  	 String[] allServiceNames=null;
  	 if(request.getAttribute("donnees")!= null){
  		vecteurDeDonnees = (Vector<String[]>)request.getAttribute("donnees");
  	out.println("<table id='tresults'>");
  	 for(int i=0; i<vecteurDeDonnees.size();i++){
  		 out.println("<tr>");
            allServiceNames = new String[vecteurDeDonnees.get(i).length];
            allServiceNames = vecteurDeDonnees.get(i);
       		for(String s:allServiceNames){
       			if(s.indexOf('@')!=-1)
       				out.println("<td id='cresults'><a href='mailto:"+s+" title='Envoyer un Mail''>"+s+"</a></td>");
       			else
     	  		 out.println("<td id='cresults'>"+s+"</td>");
      	 	}
       	 out.println("</tr>");
  	 }
 	out.println("</table>");
  	 }else{
  		 
  	 }
%>
							</div>	
							
						</form>
					</fieldset>
				</div>
            	
			</section>
			<footer id="pied">
            	<%@ include file="/WEB-INF/views/pied.jsp" %>
			</footer>
		</div>
	</body>
</html>