<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core' %>
<html>
	<head>
		<title>Identification BB Luttin</title>
        <link href="css/cssLutin.css" rel="stylesheet" />
    	<link rel=stylesheet type="text/css" href="css/cssLutin.css">
    	
	</head>
	<body>
		<div id="wrapper">
			<header id="entete">
				
            	<img alt="bb lutin" title="bb luttin" src="images/logo.png" class="logo" />
			</header>
			<div id="contenu">
			<!-- <a href="depot.html">bienvenue</a> -->
			
            	<div class="formuIndex">
            		<section>
                     	<form name="f" action="<c:url value='j_spring_security_check'/>" method="POST">
							<fieldset class="findex">
								<legend>Se Connecter </legend>
								<table >
								 <tr class="ligne">
						 			<td class="desc"> Indentifiant:</td>
									 <td class="zone"><input type='text' name='j_username'/ ></td>
								 </tr>
								<tr class="ligne">
						 			<td class="desc"> Mot de Passe:</td>
									<td class="zone"><input type='password' name='j_password'></td>
								</tr>
								
								<tr><td colspan='2'><input name="submit" id="entrer" type="submit"></td></tr>
								<tr><td colspan='2'><input name="reset" type="reset"></td></tr>
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