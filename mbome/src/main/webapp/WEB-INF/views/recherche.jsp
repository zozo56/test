<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Identification BB Luttin</title>
        <link href="css/cssLutin.css" rel="stylesheet" />
    	<link rel=stylesheet type="text/css" href="/BBLUTIN/WebContent/css/cssLutin.css">
	</head>
	<body>
		<div id="wrapper">
			<header id="entete">
            	<%@ include file="/WEB-INF/views/entete.jsp" %>
			</header>
			<section id="contenu">
				<div id="menuprincipal">
					<%@ include file="menu.jsp" %>
				</div>
				<div id="formprincipal">
					<fieldset class="fbienvenue">
					<legend> Effectuer une Recherche </legend>
							<form action="resultat.html" method="post" >
								
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