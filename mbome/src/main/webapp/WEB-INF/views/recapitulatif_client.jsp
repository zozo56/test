<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
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
							<%@ include file="menu.jsp" %>
				</div>
            	<div class="ajoutContact">
            		
            		<section >
            		
                     	<form action="recapitulatif_client.html" method="post">
							<fieldset class="findex">
								<legend>Client Enregistr&eacute; </legend>
								<table >
								 <tr>
   										<td class="desc">Id Client:</td>
    									<td class="rcontenu">${ajout.idc}</td>
    									<td class="desc">Code Postal :</td>
    									<td class="rcontenu">${ajout.codePostal}</td>
    									
  									</tr>
  									<tr>
   										<td class="desc">Nom :</td>
    									<td class="rcontenu">${ajout.nom}</td>
    									<td class="desc">Ville:</td>
    									<td class="rcontenu">${ajout.ville}</td>
    									
  									</tr>
  									<tr>
   										<td class="desc">Pr&eacute;nom:</td>
    									<td class="rcontenu">${ajout.prenom}</td>
    									<td class="desc">Adresse:</td>
    									<td class="rcontenu">${ajout.adresse}</td>
  									</tr>
  									<tr>
   										<td class="desc">Téléphone:</td>
    									<td class="rcontenu">${ajout.telephone}</td>
    									<td class="desc">Email:</td>
    									<td class="rcontenu">${ajout.mail}</td>
  									</tr>
								<tr> <td colspan="4"><center><a href="enregistrer_client.html" id="valider" >Valider</a></center></td></tr>
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