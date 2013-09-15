<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Depot BB Luttin</title>
        <link href="css/cssLutin.css" rel="stylesheet" />
          <link href="css/Aristo/Aristo.css" rel="stylesheet" />
    	<link rel=stylesheet type="text/css" href="/BBLUTIN/WebContent/css/cssLutin.css">
    	<script type="text/javascript" src="js/jquery.js"> </script>
    	<script type="text/javascript" src="js/jqueryui.js"> </script>
		<script type="text/javascript" src="js/depot.js"> </script>
	</head>
	<body>
		<div id="wrapper">
			<header id="entete">
            	<%@ include file="/WEB-INF/views/entete.jsp" %>
			</header>
			<section id="contenu">
				<div id="menuprincipal">
					<%@ include file="/WEB-INF/views/menu.jsp" %>
				</div>
				<div id="formprincipal">
				
					<fieldset class="fbienvenue">
								<span class="bilan">${ajout}</span>
								<legend> Enregistrer un D&eacute;pot </legend>
								
							<form action="ajoutdepot.html" method="post" >
							
							<div class="pdepot">
								<div class="ppdepot">
								<table >
 									 <tr>
   										<td class="desc">Id Client:</td>
    									<td class="contenu">
    										<input type="text" name="monClient.idc" id="idc"/>
    										<div id="ridc" class="ridc"></div></td>
    									<td class="desc">Code Postal :</td>
    									<td><input type="text" name="codePostal" id="cp" readonly="readonly"/></td>
    									
  									</tr>
  									<tr>
   										<td class="desc">Nom :</td>
    									<td><input type="text" name="nom" id="nom" readonly="readonly"/></td>
    									<td class="desc">Ville:</td>
    									<td class="contenu"><input type="text" name="ville" id="ville" readonly="readonly"/></td>
    									
  									</tr>
  									<tr>
   										<td class="desc">Pr&eacute;nom:</td>
    									<td><input type="text" name="prenom" id="prenom" readonly="readonly"/></td>
    									<td class="desc">Adresse:</td>
    									<td class="contenu"><input type="text" name="adresse" id="adr" readonly="readonly"/></td>
  									</tr>
  									<tr>
   										<td class="desc">Téléphone:</td>
    									<td class="contenu"><input type="text" name="telephone" id="tel" readonly="readonly"/></td>
    									<td class="desc">Email:</td>
    									<td><input type="text" name="mail" id="mail" readonly="readonly"/></td>
  									</tr>
  									
								</table>
								</div>
								<div class="dpdepot" >
									<span> B&eacute;b&eacute; Lutin<br />
									27 Bis Rue Dinan<br />
									 21 000 Dinan</span>
								</div>
							</div>	
							
							<div class="ddepot">
								<table >
 									 <tr>
   										<td class="desc">Num d&eacute;pot:</td>
    									<td class="contenu"><input type="text" readonly="readonly" name="ndt" id="ndt" /></td>
    									<td class="desc">Date d&eacute;pot :</td>
    									<td><input type="text" name="dd" id="dd" class="datepicker"/></td>
    									<td class="desc">M. D&eacute;posant:</td>
    									<td><input type="text" name="mdep" id="mdep" readonly="readonly"/></td>
  									</tr>
  									
  									<tr>
   										<td class="desc">Cat&eacute;gorie:</td>
    									<td class="contenu"><select id="cat" name="cat"></select></td>
    									<td class="desc">Date Retrait :</td>
    									<td><input type="text" name="dr" id="dr" class="datepicker"/></td>
    									<td class="desc">Commission :</td>
    									<td><input type="text" name="com" id="com" readonly="readonly"/></td>
  									</tr>
  									<tr>
   										<td class="desc"><!--Téléphone:--></td>
    									<td class="contenu"><!--<input type="text" name="tel" id="tel"/>--></td>
    									<td class="desc"><!--Email:--></td>
    									<td><!--  <input type="text" name="mail" id="mail"/>--></td>
    									<td class="desc">Taux (en %) :</td>
    									<td><input type="text" name="taux" id="taux" readonly="readonly"/></td>
  									</tr>
								</table>
							</div>	
							<div class="tdepot">
								<div class="ppdepot">
								<table >
 									 <tr>
   										<td class="descp"> Num. Article </td>
    									<td class="descp"> Description</td>
    									<td class="descp"> Prix D&eacute;pot </td>
    									<td class="descp"> Prix de Vente </td>
    									<td class="descp"> Age </td>
  									</tr>
  									<tr>
   										<td class="contenu"><input type="text" name="numart" id="numart"/></td>
    									<td class="contenu"><input type="text" name="descart" id="descart"/></td>
    									<td class="contenu"><input type="text" name="pdepart" id="pdepart"/></td>
    									<td class="contenu"><input type="text" name="pvart" id="pvart0" readonly="readonly"/></td>
    									<td class="contenu"><input type="text" name="ageart" id="ageart"/></td>
    									<td><a class="plus" title="Rajouter une ligne">+</a></td>
  									</tr>
  									<tr>
   										<td class="contenu"><input type="text" name="numart" id="numart"/></td>
    									<td class="contenu"><input type="text" name="descart" id="descart"/></td>
    									<td class="contenu"><input type="text" name="pdepart" id="pdepart"/></td>
    									<td class="contenu"><input type="text" name="pvart" id="pvart1" readonly="readonly"/></td>
    									<td class="contenu"><input type="text" name="ageart" id="ageart"/></td>
    									<td><a class="plus" title="Rajouter une ligne">+</a></td>
  									</tr>
  									<tr>
   										<td class="contenu"><input type="text" name="numart" id="numart"/></td>
    									<td class="contenu"><input type="text" name="descart" id="descart"/></td>
    									<td class="contenu"><input type="text" name="pdepart" id="pdepart"/></td>
    									<td class="contenu"><input type="text" name="pvart" id="pvart2" readonly="readonly"/></td>
    									<td class="contenu"><input type="text" name="ageart" id="ageart"/></td>
    									<td><a class="plus" title="Rajouter une ligne">+</a></td>
  									</tr>
  									<tr>
   										<td class="contenu"><input type="text" name="numart" id="numart"/></td>
    									<td class="contenu"><input type="text" name="descart" id="descart"/></td>
    									<td class="contenu"><input type="text" name="pdepart" id="pdepart"/></td>
    									<td class="contenu"><input type="text" name="pvart" id="pvart3" readonly="readonly"/></td>
    									<td class="contenu"><input type="text" name="ageart" id="ageart"/></td>
    									<td><a class="plus" title="Rajouter une ligne">+</a></td>
  									</tr>
								</table>
								</div>
								<div class="qdepot"><input type="submit" value="Enregistrer" id="entrer" class="entrer" /></div>
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