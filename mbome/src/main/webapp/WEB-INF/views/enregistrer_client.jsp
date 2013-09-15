<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<script type="text/javascript" src="js/jquery.js"> </script>
		<script type="text/javascript" src="js/client.js"> </script>
		<title>Enregistrer Un Client</title>
        <link href="css/cssLutin.css" rel="stylesheet" />
    	<link rel=stylesheet type="text/css" href="/BBLUTIN/WebContent/css/cssLutin.css">
	</head>
	<body>
		<div id="wrapper">
			<header id="entete">
				<%@ include file="/WEB-INF/views/entete.jsp" %>
			</header>
			<div id="contenu">
				<div id="menuprincipal">
							<%@ include file="/WEB-INF/views/menu.jsp" %>
				</div>
				
            	<div class="ajoutContact">
            		
            		<section >
            				 	<p class="bilan">${ajout}</p>
                     	<form action="recapitulatif_client.html" method="post">
							<fieldset class="findex">
								<legend>Enregistrer Un Client </legend>
								<table >
								 <tr>
   										<td class="desc">Id Client:<span class="erreur">*</span></td>
    									<td class="contenu"><input type="text" name="idc" id="idc"/></td>
    									<td class="desc">Code Postal :<span class="erreur">*</span></td>
    									<td><input type="text" name="codePostal" id="cp"/></td>
    									
  									</tr>
  									<tr>
   										<td class="desc">Nom :<span class="erreur">*</span></td>
    									<td><input type="text" name="nom" id="nom"/></td>
    									<td class="desc">Ville:<span class="erreur">*</span></td>
    									<td class="contenu"><input type="text" name="ville" id="ville"/></td>
    									
  									</tr>
  									<tr>
   										<td class="desc">Pr&eacute;nom:<span class="erreur">*</span></td>
    									<td><input type="text" name="prenom" id="prenom"/></td>
    									<td class="desc">Adresse:<span class="erreur">*</span></td>
    									<td class="contenu"><input type="text" name="adresse" id="adr"/></td>
  									</tr>
  									<tr>
   										<td class="desc">Téléphone:<span class="erreur">*</span></td>
    									<td class="contenu"><input type="text" name="telephone" id="tel"/></td>
    									<td class="desc">Email:<span class="erreur">*</span></td>
    									<td><input type="text" name="mail" id="mail"/></td>
  									</tr>
								<tr> <td colspan="4"><center><input type="submit" value="Enregistrer" id="engClient" class="engClient" /></center></td></tr>
								</table>
				 			</fieldset>
						</form>
					
                    </section>
                </div>
			</div>
			<footer id="pied">
            	<%@ include file="/WEB-INF/views/pied.jsp" %>
			</footer>
		</div>
	</body>
</html>