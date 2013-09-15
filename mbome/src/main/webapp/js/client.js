$(function(){
	valadr=false;
	valIdc=false;
	valcp=false;
	valnom=false;
	valprenom=false;
	valmail=false;
	valtel=false;
	valville=false;
	/* Identifiant du Client */
	$("#idc").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#idc+.erreur").remove();
	     valIdc=true;
	});
	 
	
	$("#idc").focusout(function() {
		if($("#idc").val() == ""){
			$("#idc").css("border-color","red");
	     	val="<div class='erreur'>Entrez un Id</div>";
	     	$("#idc").after(val);
	     	valIdc=false;
		}else if(!$("#idc").val().match(/^[0-9]+$/i)){
			$("#idc").css("border-color","red");
	     	val="<div class='erreur'>Id Invalide</div>";
	     	$("#idc").after(val);
	     	valIdc=false;
		}else{
			 $("#idc").css("border","none");
		     $("#idc+.erreur").remove();
			valIdc=true;
		}
	});
	
	/* Code Postal du Client */
	$("#cp").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#cp+.erreur").remove();
	     valcp=true;
	});
	 
	
	$("#cp").focusout(function() {
		if($("#cp").val() == ""){
			$("#cp").css("border-color","red");
	     	val="<div class='erreur'>Entrez un Code Postal</div>";
	     	$("#cp").after(val);
	     	valcp=false;
		}else if(!$("#cp").val().match(/^[0-9]+$/i)){
			$("#cp").css("border-color","red");
	     	val="<div class='erreur'>Code Postal Invalide</div>";
	     	$("#cp").after(val);
	     	valcp=false;
		}else{
			 $("#cp").css("border","none");
		     $("#cp+.erreur").remove();
			valcp=true;
		}
	});
	
	/* Nom du Client */
	$("#nom").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#nom+.erreur").remove();
	     valnom=true;
	});
	 
	
	$("#nom").focusout(function() {
		if($("#nom").val() == ""){
			$("#nom").css("border-color","red");
	     	val="<div class='erreur'>Entrez un Nom</div>";
	     	$("#nom").after(val);
	     	valnom=false;
		}else if(!$("#nom").val().match(/^[a-z]+$/i)){
			$("#nom").css("border-color","red");
	     	val="<div class='erreur'>Nom Invalide</div>";
	     	$("#nom").after(val);
	     	valnom=false;
		}else{
			 $("#nom").css("border","none");
		     $("#nom+.erreur").remove();
			valnom=true;
		}
	});
	
	/* Prenom du Client */
	$("#prenom").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#prenom+.erreur").remove();
	     valprenom=true;
	});
	 
	
	$("#prenom").focusout(function() {
		if($("#prenom").val() == ""){
			$("#prenom").css("border-color","red");
	     	val="<div class='erreur'>Entrez un Prenom</div>";
	     	$("#prenom").after(val);
	     	valprenom=false;
		}else if(!$("#prenom").val().match(/^[a-z ]{3,}$/i)){
			$("#prenom").css("border-color","red");
	     	val="<div class='erreur'>3 lettres min.</div>";
	     	$("#prenom").after(val);
	     	valprenom=false;
		}else{
			 $("#prenom").css("border","none");
		     $("#prenom+.erreur").remove();
			valprenom=true;
		}
	});
	
	/* Mail du Client */
	$("#mail").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#mail+.erreur").remove();
	     valmail=true;
	});
	 
	
	$("#mail").focusout(function() {
		if($("#mail").val() == ""){
			$("#mail").css("border-color","red");
	     	val="<div class='erreur'>Entrez un mail</div>";
	     	$("#mail").after(val);
	     	valmail=false;
		}else if(!$("#mail").val().match(/^[a-z0-9._-]+@[a-z0-9.-]{2,}[.][a-z]{2,3}$/)){
			$("#mail").css("border-color","red");
	     	val="<div class='erreur'>mail de la forme moi@toi.yy</div>";
	     	$("#mail").after(val);
	     	valmail=false;
		}else{
			 $("#mail").css("border","none");
		     $("#mail+.erreur").remove();
			valmail=true;
		}
	});
	
	/* Tel */
	$("#tel").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#tel+.erreur").remove();
	     valtel=true;
	});
	 
	
	$("#tel").focusout(function() {
		if($("#tel").val() == ""){
			$("#tel").css("border-color","red");
	     	val="<div class='erreur'>Entrez un Numero</div>";
	     	$("#tel").after(val);
	     	valtel=false;
		}else if(!$("#tel").val().match(/^(01|02|03|04|05|06|08|07|09)[0-9]{8}/gi)){
			$("#tel").css("border-color","red");
	     	val="<div class='erreur'>Numero de la forme 0100200300</div>";
	     	$("#tel").after(val);
	     	valtel=false;
		}else{
			 $("#tel").css("border","none");
		     $("#tel+.erreur").remove();
			valtel=true;
		}
	});
	
	/* Ville du Client */
	$("#ville").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#ville+.erreur").remove();
	     valville=true;
	});
	 
	
	$("#ville").focusout(function() {
		if($("#ville").val() == ""){
			$("#ville").css("border-color","red");
	     	val="<div class='erreur'>Entrez une ville</div>";
	     	$("#ville").after(val);
	     	valville=false;
		}else if(!$("#ville").val().match(/^[a-z]+$/i)){
			$("#ville").css("border-color","red");
	     	val="<div class='erreur'>Ville Invalide</div>";
	     	$("#ville").after(val);
	     	valville=false;
		}else{
			 $("#ville").css("border","none");
		     $("#ville+.erreur").remove();
			valville=true;
		}
	});
	
	/* Adresse du Client */
	$("#adr").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#adr+.erreur").remove();
	     valadr=true;
	});
	 
	
	$("#adr").focusout(function() {
		if($("#adr").val() == ""){
			$("#adr").css("border-color","red");
	     	val="<div class='erreur'>Entrez une adresse</div>";
	     	$("#adr").after(val);
	     	valadr=false;
		}else if(!$("#adr").val().match(/^[a-z0-9a-z ]+$/i)){
			$("#adr").css("border-color","red");
	     	val="<div class='erreur'>Adresse Invalide</div>";
	     	$("#adr").after(val);
	     	valadr=false;
		}else{
			 $("#adr").css("border","none");
		     $("#adr+.erreur").remove();
			valadr=true;
		}
	});
	
	
	/* Enregistrer du Client */
	$("#engClient").click(function() {
	     if((valadr==false) || (valIdc==false) ||(valcp==false)||(valnom==false)||(valprenom==false)||(valmail==false)||(valtel==false)||(valville==false)){
	    	 return false;
	    	 alert("Le formulaire contient des erreurs");
	     }
	    	 
	     else
	    	 return true;
	});
});