<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Depot BB Luttin</title>
        <link href="css/cssLutin.css" rel="stylesheet" />
          <link href="css/Aristo/Aristo.css" rel="stylesheet" />
    	<link rel=stylesheet type="text/css" href="/BBLUTIN/WebContent/css/cssLutin.css">
    	<script type="text/javascript" src="js/jquery.js"> </script>
		<script type="text/javascript" src="js/vente.js"> </script>
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
								<legend> Effectuer une Vente</legend>
							<form action="recapVente.html" method="post" >
							<div class="vente">
								<div class="artdepot">
								<table >
 									 <tr class="artligne" bgcolor="#585858" style="color:#fff"><font >
   										<td class="desar">Description de l'article</td>
   										<td class="part">Prix de l'article</td>
   										<td class="sart"></td>
   										</font>
  									</tr>
  									<tr class="artligne">
   										<td class="desar">
   										<input type="text" name="aav" class="aav"/>
   										<div id="aridc" class="aridc"></div>
   										</td>
   										<td class="part">0 euros</td>
   										<td class="sart"><a class="artplus" title="Rajouter une ligne">+</a></td>
  									</tr>						
								</table>
								</div>
								<div class="dpdepot" >
									<span> B&eacute;b&eacute; Luttin<br />
									27 Bis Rue Dinan<br />
									 21 000 Dinan</span>
								</div>
								<br /><br /><br /><br />
								
									
  										<span class="cdesc">HT (en e):</span><span class="cval"></span><br />
  										<span class="cdesc">Taux (en %):</span><span class="cval"></span><br />
  										<span class="cdesc">TT (en e):</span><span class="cval"></span><br />
								
							 
								
							</div>	
							<div class="tdepot">
								<div class="qdepot"><input type="submit" value="Effectuer La Vente" id="entrer" class="entrer" /></div>
							</div>	
							
						</form>
					</fieldset>
				</div>
            	
			</section>
			<footer id="pied">
            	<%@ include file="pied.jsp" %>
			</footer>
		</div>
	</body>
</html>