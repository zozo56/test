valmontant=false;
valcom=false;
valtaux=false;
montantdeposant=0;
taux=50;
$(function(){
	//R
	
	
	
	$(".plus").live('click',function(){
	var nbLigne = $("input[id=pdepart]").length;
	ligne='<tr>'+
	'<td class="contenu"><input type="text" name="numart" id="numart"/></td>' +
	'<td class="contenu"><input type="text" name="descart" id="descart"/></td>'+
	'<td class="contenu"><input type="text" name="pdepart" id="pdepart"/></td>'+
	'<td class="contenu"><input type="text" name="pvart" id="pvart'+nbLigne+'" readonly="readonly"/></td>'+
	'<td class="contenu"><input type="text" name="ageart" id="ageart"/></td>'+
	'<td><a class="plus" title="Rajouter une ligne">+</a></td>'+
	'</tr>';
		
		$("tr:last").after(ligne);
	});
	
$("#idc").keyup(function(){
		$.ajax({
			type: "POST",
			url: "depot.html",
			cache: false,
			data: "name="+$("#idc").val()+" filtre",
			success: function(reponse){
				$(".ridc").empty();
				$(".ridc").html(reponse);
			},
			error: function(e){
				$(".ridc").empty();
				$(".ridc").html("Votre recherche contien des erreurs");
			 }
			});
	});
	
	/*	$("#nom").keyup(function(){
		$.ajax({
			type: "POST",
			url: "depot.html",
			cache: false,
			data: "name="+$("#nom").val()+" filtre",
			success: function(reponse){
			$(".ridc").empty();
			$(".ridc").html(reponse);
			},
			error: function(e){
				$(".ridc").empty();
				$(".ridc").html("Votre recherche contien des erreurs");
			 }
			});
	});*/
	
	/*
	$(".ridc").click(function(){
		var valeur=$("#rnum:first").text();
		alert("Val="+valeur);
		$.ajax({
			type: "POST",
			url: "depot.html",
			cache: false,
			data: "name="+valeur+" recherche",
			success: function(reponse){
				$(".ridc").empty();
				chaine(reponse);
			},
			error: function(e){
				$(".ridc").empty();
				$(".ridc").html("Votre recherche contien des erreurs");
			 }
			});
	});
	*/
	$.datepicker.setDefaults($.datepicker.regional['fr']);
	/*var pickers = $(".datepicker").datepicker({
		dateFormat : 'yy-mm-dd',
		minDate : -15,
		maxDate : 300,
		onSelect : function(date){
			var option = this.id == 'dd'? 'minDate':'maxDate';
			pickers.not('#'+this.id).datepicker('option',option,date);
		},
	});
	*/
	$("#dr").datepicker({
		dateFormat : 'yy-mm-dd',
		minDate : 0,
		maxDate : 180
	});
	/*chargement de categories*/
	$.ajax({
		type: "POST",
		url: "depot.html",
		cache: false,
		data: "name=test categories",
		success: function(reponse){			
		$(".ridc").empty();
		$("#cat").empty();
		$("#cat").html(deroulant(reponse));
		},
		error: function(e){
			$(".ridc").empty();
			$(".ridc").html("Votre recherche contien des erreurs");
		 }
	});
	
	/* Montant 
	$("#mdep").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#mdep+.erreur").remove();
	     valmontant=true;
	});
	 

	$("#mdep").focusout(function() {
		if($("#mdep").val() == ""){
			$("#mdep").css("border-color","red");
	     	val="<div class='erreur'>Entrez un montant</div>";
	     	//$("#mdep").after(val);
	     	valmontant=false;
		}else if(!$("#mdep").val().match(/^[0-9.0-9]{2,}$/)){
			$("#mdep").css("border-color","red");
	     	val="<div class='erreur'>Des chiffres attendus</div>";
	     	///$("#mdep").after(val);
	     	valmdep=false;
		}else{
			 $("#mdep").css("border","none");
		     $("#mdep+.erreur").remove();
			valmdep=true;
		}
	});*/
	
	/* Commission 
	$("#com").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#com+.erreur").remove();
	     valmontant=true;
	});
	 

	$("#com").focusout(function() {
		if($("#com").val() == ""){
			$("#com").css("border-color","red");
	     	val="<div class='erreur'>Entrez un Taux</div>";
	     	//$("#com").after(val);
	     	valcom=false;
		}else if(!$("#com").val().match(/^[0-9.0-9]{2,}$/)){
			$("#com").css("border-color","red");
	     	val="<div class='erreur'>Des chiffres attendus</div>";
	     	//$("#com").after(val);
	     	valcom=false;
		}else{
			 $("#com").css("border","none");
		     $("#com+.erreur").remove();
			valcom=true;
		}
	});*/
	
	
	/* taux 
	$("#taux").focusin(function() {
	     $(this).css("border","solid 2px blue");
	     $("#taux+.erreur").remove();
	     valmontant=true;
	});
	 

	$("#taux").focusout(function() {
		if($("#taux").val() == ""){
			$("#taux").css("border-color","red");
	     	val="<div class='erreur'>Entrez une commision</div>";
	     	//$("#taux").after(val);
	     	valtaux=false;
		}else if(!$("#taux").val().match(/^[0-9.0-9]{2,}$/)){
			$("#taux").css("border-color","red");
	     	val="<div class='erreur'>Des chiffres attendus</div>";
	     	//$("#taux").after(val);
	     	valtaux=false;
		}else{
			 $("#taux").css("border","none");
		     $("#taux+.erreur").remove();
			valtaux=true;
		}
	});*/
	
	//alert($("input[id=pdepart]").length);
	/* former un select*/
	$('#pdepart').live('focusout',function(){
		
		try {
			$("input[id=taux]").val(50);
			if($("input[id=mdep]").val()==""){
				$("input[id=mdep]").val(0);
			}
			$("input[id=mdep]").val(0);
			var tabPrix = $("input[id=pdepart]");
			var somme = 0;
			for ( var int = 0; int < tabPrix.length; int++) {
				if (tabPrix[int].value !="") {
					somme+=parseFloat(tabPrix[int].value);
					$("input[id=pvart"+int+"]").val(tabPrix[int].value*parseFloat(1+0.5));
				}	
				
				
			}
			$("input[id=mdep]").val(somme);
			$("input[id=com]").val(0);

			somme = 0;
			for ( var int = 0; int < tabPrix.length; int++) {
				var valChamp=document.getElementById("pvart"+int).value;
				//alert(document.getElementById("pvart"+int).value);
				if (valChamp!="") {
					somme+=parseFloat(valChamp);
				}	
			}
			
			$("input[id=com]").val(parseFloat(parseFloat(somme)-$("input[id=mdep]").val()));
			
			/*
			montantdeposant=parseFloat($("input[id=mdep]").val());
			$("input[id=mdep]").empty();
			montantdeposant+=parseFloat($(this).val());
			$("input[id=mdep]").val(montantdeposant);
			var pv=parseFloat(montantdeposant)*parseFloat(taux);
			*/
			$(this).next('td').empty();
		} catch (e) {
			alert("Erreur de calcul montant:"+e);
		}
		
		/*$("input[id=pvart]").val(pv);*/
	});

});

function onSelectedIdClient(idClient){
	//alert("entree ici="+idClient);
	try {
		$.ajax({
			type: "POST",
			url: "depot.html",
			cache: false,
			data: "name="+idClient+" recherche",
			success: function(reponse){
				$(".ridc").empty();
				chaine(reponse);
			},
			error: function(e){
				$(".ridc").empty();
				$(".ridc").html("Votre recherche contient des erreurs");
			 }
			});
	} catch (e) {
		alert("Erreur ::"+e);
	}
	
}


/*Gestion des  chaines de cracteres */
function chaine(donnes){
	
	var tableau=donnes.split('r,bfs;!');
	$("input[id=idc]").val( tableau[1]);
	$("input[id=nom]").val( tableau[2]);
	$("input[id=prenom]").val( tableau[3]);
	$("input[id=adr]").val( tableau[4]);
	$("input[id=cp]").val( tableau[5]);
	$("input[id=ville]").val( tableau[6]);
	$("input[id=tel]").val( tableau[7]);
	$("input[id=mail]").val( tableau[8]);
	$("input[id=ndt]").val( tableau[9]);
	
	/** Date ***/
	var currentTime = new Date();
	var month = currentTime.getMonth() + 1;
	if(month<=9)
		month="0"+month;
	var day = currentTime.getDate();
	if(day<=9)
		day="0"+day;
	var year = currentTime.getFullYear();
	var date=year+"-"+month+"-"+day;
	$("input[id=dd]").val(date);
	//alert(tableau[9]);
}




function deroulant(donnes){
	var op="";
	var sel=donnes.split('r,bfs;!');
	for(var i=0; i<sel.length;i++)
		op+="<option value="+sel[i]+">"+sel[i]+"</option>";
	return op;
}
