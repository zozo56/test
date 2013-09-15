	ligne='<tr class="artligne"><td class="desar"><input type="text" name="aav" class="aav"/><div id="aridc" class="aridc"></div></td>'+
		  '<td class="part">0 €</td><td class="sart"><a class="artplus" title="Rajouter une ligne">+</a></td></tr>	';
$(function(){
	$(".aav").live("keyup",function(){
		var thediv = this;
		$.ajax({
			type: "POST",
			url: "recapVente.html",
			cache: false,
			data: "exp="+$(this).val()+" article",
			success: function(reponse){
			$(thediv).next(".aridc").empty();
			$(thediv).next(".aridc").html(reponse);
			},
			error: function(e){
			$(that+"~.aridc").empty();
			$(that+"~.aridc").html("Votre recherche contien des erreurs");
			 }
			});
	});
	

 /* Ajouter une ligne 
	$(".artplus").click(function(){
		$("tr:last").after(ligne);
	});*/
	
	$(".artplus").live("click",function(){$("tr:last").after(ligne);});
	

    $("#descarr").click(function() {
		alert("entree ici="+idClient);
	});
	
});

function onSelectedArt(idClient){
	//alert("entree ici="+idClient);
	try {
		$.ajax({
			type: "POST",
			url: "recapVente.html",
			cache: false,
			data: "exp="+idClient+" details",
			success: function(reponse){
				$("#aridc").empty();
				venteArt(reponse);
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

function venteArt(donnes){
	var tableau=donnes.split('r,bfs;!');
	$("input[name=aav]:last").val( tableau[2]);
	$("#aridc").html(tableau[1]);
	$(".part:last").html( tableau[3]+" €");
}