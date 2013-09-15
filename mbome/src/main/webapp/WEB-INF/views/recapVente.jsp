<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Enregistrer Un Client</title>
<link href="css/cssLutin.css" rel="stylesheet" />
<link rel=stylesheet type="text/css"
	href="/BBLUTIN/WebContent/css/cssLutin.css">
</head>
<body>
	<div id="wrapper">
		<header id="entete"> <%@ include
			file="/WEB-INF/views/entete.jsp"%> </header>
		<div id="contenu">
			<div id="menuprincipal">
				<%@ include file="menu.jsp"%>
			</div>
			<div class="ajoutContact">

				<section>

				<form action="recapitulatif_client.html" method="post">
					<fieldset class="findex">
						<legend>R&eacute;cap Vente </legend>
						
						
					</fieldset>
				</form>

				</section>
			</div>
		</div>
		<footer id="pied"> <%@ include file="/WEB-INF/views/pied.jsp"%>
		</footer>
	</div>
</body>
</html>