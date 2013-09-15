<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel=stylesheet type="text/css" href="css/cssLutin.css">
<link type="text/css" href="css/ui-lightness/jqueryui.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/aide.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.20.custom.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
			
		</script>
<title>Rubrique d'aide</title>
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
            				 	
							<fieldset class="faide">
								<legend> Astuces d'utilisation </legend>
									<div id="accordion">
		<h3> <a href="#">Enregistrer un CLient</a></h3>
        <div class="adescp">
       	 <span> Pour enregistrer un client</span>
        	<ul>
        	  <li>Cliquer sur <span class="gb">Enregistrer un CLient </span></li>
              <li>
                    Remplissez tous  les champs en suivant  les indications suivantes:
                    	<ol>
        					  <li> Le <span class="gb">mail</span> de la forme <span class="gb">xxx@yyyy.zz </span></li>
        					  <li>Le <span class="gb">téléphone</span> doit contenir <span class="gb">10 chiffres sans espaces</span></li>
      	  				</ol>	
              </li>
          </ul>
        	
        </div>
			<h3> <a href="#">Envoyer un mail à un client </a></h3>
        <div class="adescp">
       	 <span> Pour Envoyer un mail</span>
        	<ul>
        	  <li>Cliquer sur <span class="gb">Effectuer une recherche </span></li>
              <li>
                    Remplissez tous  les champs en suivant  les indications suivantes:
                    	<ol>
        					  <li> Le <span class="gb">mail</span> de la forme <span class="gb">xxx@yyyy.zz </span></li>
        					  <li>Le <span class="gb">téléphone</span> doit contenir <span class="gb">10 chiffres sans espaces</span></li>
      	  				</ol>	
              </li>
          </ul>
        	
        </div>
			<h3> <a href="#">Enregistrer un Dépot</a></h3>
        <div class="adescp">
       	 <span> Pour enregistrer un Dépot</span>
        	<ul>
        	  <li>Cliquer sur <span class="gb">Enregistrer un Dépot </span></li>
              <li>
                    Remplissez tous  les champs en suivant  les indications suivantes:
                    	<ol>
        					  <li> Le <span class="gb">mail</span> de la forme <span class="gb">xxx@yyyy.zz </span></li>
        					  <li>Le <span class="gb">téléphone</span> doit contenir <span class="gb">10 chiffres sans espaces</span></li>
      	  				</ol>	
              </li>
          </ul>
        	
        </div>
		</div>
				 			</fieldset>
					
                    </section>
                </div>
			</div>
			<footer id="pied">
            	<%@ include file="/WEB-INF/views/pied.jsp" %>
			</footer>
		</div>
	</body>
</html>