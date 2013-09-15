<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création d'un client</title>
        <link type="text/css" rel="stylesheet" href="css/style.css" />
		<link rel=stylesheet type="text/css" href="css/cssLutin.css">
    </head>
    <body>

<nav id="menuprincipal">
	<ul>
		<div class="pd">
  	   		<a href="enregistrer_client.html"><li> Enregistrer un Client</li></a> 
  	    </div>
  	    <div class="dd">
  	 	 <a href="depot.html"><li>Enregistrer un D&eacute;pot</li></a>
  	 	  <a href="#"><li>Archiver un Dépot</li></a>
  	 	  <a href="recherche.html"><li>Effectuer  une Recherche</li></a>
  	 	</div>
  	 	<div class="td">
  	 	 <a href="vente.html"><li>Effectuer une Vente</li></a>
  	 	</div>
  	 </ul>
</nav>

        <div>
            <form method="get" action="creationClient">
                <fieldset>
                    <legend>Informations client</legend>
     
                    <label for="nomClient">Nom <span class="requis">*</span></label>
                    <input type="text" id="nomClient" name="nomClient" value="" size="20" maxlength="20" />
                    <br />
                     
                    <label for="prenomClient">Prénom </label>
                    <input type="text" id="prenomClient" name="prenomClient" value="" size="20" maxlength="20" />
                    <br />
     
                    <label for="adresseClient">Adresse de livraison <span class="requis">*</span></label>
                    <input type="text" id="adresseClient" name="adresseClient" value="" size="20" maxlength="20" />
                    <br />
     
                    <label for="telephoneClient">Numéro de téléphone <span class="requis">*</span></label>
                    <input type="text" id="telephoneClient" name="telephoneClient" value="" size="20" maxlength="20" />
                    <br />
                     
                    <label for="emailClient">Adresse email</label>
                    <input type="email" id="emailClient" name="emailClient" value="" size="20" maxlength="60" />
                    <br />
                </fieldset>
                <input type="submit" value="Valider"  />
                <input type="reset" value="Remettre à zéro" /> <br />
            </form>
        </div>
    </body>
</html>