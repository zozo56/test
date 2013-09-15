validentifiant=false;
valpasswd=false;
$(function(){
	/* login */
	$("#identifiant").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#identifiant+.erreur").remove();
	     valmontant=true;
	});
	 

	$("#identifiant").focusout(function() {
		if($("#identifiant").val() == ""){
			$("#identifiant").css("border-color","red");
	     	val="<div class='erreur'>Entrez un login</div>";
	     	$("#identifiant").after(val);
	     	validentifiant=false;
		}else if(!$("#identifiant").val().match(/^[a-z0-9]{4,}$/)){
			$("#identifiant").css("border-color","red");
	     	val="<div class='erreur'>Le login doit contenir au moins 6 valeurs</div>";
	     	$("#identifiant").after(val);
	     	validentifiant=false;
		}else{
			 $("#identifiant").css("border","none");
		     $("#identifiant+.erreur").remove();
			validentifiant=true;
		}
	});
	
	
	/* mot de passe */
	$("#passwd").focusin(function() {
		$(this).val();
	     $(this).css("border","solid 2px blue");
	     $("#passwd+.erreur").remove();
	     valmontant=true;
	});
	 

	$("#passwd").focusout(function() {
		if($("#passwd").val() == ""){
			$("#passwd").css("border-color","red");
	     	val="<div class='erreur'>Entrez un Mot de passe</div>";
	     	$("#passwd").after(val);
	     	valpasswd=false;
		}else if(!$("#passwd").val().match(/^[a-z0-9]{8,}$/)){
			$("#passwd").css("border-color","red");
	     	val="<div class='erreur'>Le Mot de passe doit contenir au moins 8 valeurs</div>";
	     	$("#passwd").after(val);
	     	valpasswd=false;
		}else{
			 $("#passwd").css("border","none");
		     $("#passwd+.erreur").remove();
			valpasswd=true;
		}
	});
	
	/* login */
	$("#entrer").click(function() {
	     if((valpasswd==false) || (validentifiant==false)){
	    	 return false;
	    	 alert("Le formulaire contient des erreurs");
	     }
	    	 
	     else
	    	 return true;
	});
});