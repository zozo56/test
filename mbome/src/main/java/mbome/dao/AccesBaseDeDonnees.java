package mbome.dao;

import mbome.pojo.Client;
import mbome.pojo.Depot;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;





public class AccesBaseDeDonnees {



		String baseDedonnes;
		String id;
		String mp;
		Connection connect;
		Vector<String[]> donnees;
		Majuscules majuscule;






	public AccesBaseDeDonnees(String base) throws ClassNotFoundException {
		majuscule = new Majuscules();
		baseDedonnes=base;
		id="root";
		mp="baptiste";
		donnees =new Vector<String[]> ();
		Class.forName("com.mysql.jdbc.Driver");
		
		//Creation d`une variable pour  la connexion
		try {
			connect= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+baseDedonnes, id, mp);
		} catch (SQLException e) {
			System.out.println("Connexion  impossible � la  base de donn�es");
		}
	}




	 public ResultSet extractionDonnees() throws SQLException{
		//Creation de la  requette
		
		PreparedStatement req = null;
		try {
			req = (PreparedStatement) connect.clientPrepareStatement("select * from client " );
		} catch (SQLException e) {
			System.out.println("Impossible d`excecuter la   requete");
		}
			
			//Execution  de la  requette  et  recuperation de des  resultats
			ResultSet resultat = null;
			try {
				resultat = req.executeQuery();
			} catch (SQLException e) {
				System.out.println("Impossible de recuperer les donn�es");
				e.printStackTrace();
			}
			
		
		 return resultat;
		
	}
	








public String recherchesPossibles(String colonne,String table){
		String expRequette=null;
		//TableClient
			if(table.equals("client")){
				String[] enteteClient={"Numero","Nom","Prenom","Adresse","Code Postal","Ville","Telephone","E-mail"};
				donnees.clear();
				donnees.add(enteteClient);
				if(colonne.equals(" ")){
					 expRequette="select * from "+table;
				}else{
					expRequette="select * from "+table +" where Nom like'%"+colonne+"%' OR Prenom like '%"+colonne+"%'";
				}
			}
			
			//Table article
			if(table.equals("article")){
				String[] enteteArticle={"Num. Depot","Num. CLient","Desc. Produit","Age","P. Vente","P. Depot","Vendu"};
				donnees.clear();
				donnees.add(enteteArticle);
				if(colonne.equals(" ")){
					 expRequette="select NumDepot, NumClient, DescProduit, Age, PrixVente, PrixDepot,Vendu from "+table;
				}else{
					expRequette="select * from "+table +" where NumArticle like '%"+colonne+"%'";
				}
			}
			
			//Table article
			if(table.equals("depot")){
				String[] enteteDepot={"Num. Depot","Num. CLient","Categorie","Date Depot","Date Retrait","Etat"};
				donnees.clear();
				donnees.add(enteteDepot);
				if(colonne.equals(" ")){
					 expRequette="select * from "+table;
				}else{
					expRequette="select * from "+table +" where NumDepot like '%"+colonne+"%'";
				}
			}
			
		return expRequette;
	}
	 public Vector<String[]> rechercheDonnees(String exp,String critere) throws SQLException{
		//Creation de la  requette
		 String requette=recherchesPossibles(exp,critere);
		 
		
		
			PreparedStatement req = null;
			try {
				req = (PreparedStatement) connect.clientPrepareStatement(requette);
			} catch (SQLException e) {
				System.out.println("Impossible d`excecuter la   requete");
			}
				
				//Execution  de la  requette  et  recuperation de des  resultats
			ResultSet resultat = null;
			try {
					resultat = req.executeQuery();
			} catch (SQLException e) {
					System.out.println("Impossible de recuperer les donn�es");
					e.printStackTrace();
			}
				

		
				
				while(resultat.next()){
					java.sql.ResultSetMetaData metaData = resultat.getMetaData();
					int taille=metaData.getColumnCount();
					
					String[] ligne=new String[taille];
					
					for(int i=1; i<=taille; i++){
						ligne[i-1]=resultat.getString(i);	
						//System.out.print(resultat.getString(i)+" ");
					}
					
					donnees.add(ligne);
			}
			 return donnees;
		}
	
	 //Insertion de donn�es dans  la  base 
	







public void insertionDonnees(Client client) throws SQLException{
		
		String req="INSERT INTO client (`NumClient`, `Nom`, `Prenom`, `Adresse`, `CodePostale`, `Ville`, `NumTel`, `Email`) VALUES ('"+client.getIdc()+"','"+ majuscule.minusculeVersMajuscule(client.getNom())+"','"+ majuscule.premiereLettreEnMajuscule(client.getPrenom())+ "', '"+majuscule.premiereLettreEnMajuscule(client.getAdresse())+"',"+ client.getCodePostal()+",'"+ majuscule.premiereLettreEnMajuscule(client.getVille())+"','"+ client.getTelephone()+"','"+ majuscule.majusculeVersMinuscule(client.getMail())+"')";
		



//String req ="INSERT INTO  client  (`NumClient`, `Nom`, `Prenom`, `Adresse`, `CodePostale`, `Ville`, `NumTel`, `Email`) VALUES (110, 'Achille', 'Oph�lie', '1 Avenue des tigres', 67000, 'REIMS', '06 11 33 22 44', 'ophelie.guer@hmail.com')";
		
		//Creation de la  requette
				Statement requette = (Statement) connect.createStatement();
				requette.executeUpdate(req);
		
		System.out.println(" Insertion des donn�es");
	}
	
	 //Insertion de donn�es dans  la  base 
		public void insertionDonnees(Depot depot) throws SQLException{
			String pv=depot.getPvart();
			String pd = depot.getPdepart();
			String age = depot.getAgeart();
			String desc = depot.getDescart();
			
			//Insertion dans depot
			String reqDepot="INSERT INTO depot ( `NumClient`, `CAT`, `DateDepot`, `DateRetrait`, `Archive`) VALUES ('"+depot.getMonClient().getIdc()+"','"+ depot.getCat()+ "', '"+depot.getDd()+"','"+ depot.getDr()+"',0)";
			
			//Creation de la  requette
			Statement requetteDepot = (Statement) connect.createStatement();
			requetteDepot.executeUpdate(reqDepot);
			
			//Insertion dans Article
			for(int i=0;i<pv.split(",").length;i++){
				//String reqArticle="INSERT INTO depot (`NumArticle`, `NumDepot`, `NumClient`, `DescProduit`, `Age`, `PrixVente`, `PrixDepot`) VALUES ('"+ depot.getNumart()+"','"+ depot.getNdt()+ "', '"+depot.getIdc()+"',"+ depot.getDescart()+","+ depot.getAgeart()+","+ depot.getPvart()+","+ depot.getPdepart()+")";
				//String reqArticle="INSERT INTO article (`NumDepot`, `NumClient`, `DescProduit`, `Age`, `PrixVente`, `PrixDepot`,`Vendu`) VALUES ('"+ depot.getNdt()+ "', '"+depot.getIdc()+"','"+desc.split(",")[i]+"','"+age.split(",")[i]+"','"+pv.split(",")[i]+"','"+pd.split(",")[i]+"',0)";
				String reqArticle="INSERT INTO article (`NumDepot`, `NumClient`, `DescProduit`, `Age`, `PrixVente`, `PrixDepot`,`Vendu`) VALUES ('"+ depot.getNdt()+ "', '"+depot.getMonClient().getIdc()+"','"+desc.split(",")[i]+"','"+age.split(",")[i]+"','"+pv.split(",")[i]+"','"+Float.parseFloat(pv.split(",")[i])/Float.parseFloat("1.5")+"',0)";
																																						
				//Creation de la  requette
				Statement requetteArticle = (Statement) connect.createStatement();
				requetteArticle.executeUpdate(reqArticle);
				System.out.println(pv.split(",")[i]+" "+pd.split(",")[i]+" "+age.split(",")[i]+" "+desc.split(",")[i]);
			}
			
			System.out.println(" Insertion des donn�es");
		}
	
	
	public void  affichageDeResultats(Vector<String[]> result) throws SQLException{
		//Affichage resultats
		for(String[] tab:result){
			for(int i=0;i<tab.length;i++)
				System.out.println(tab[i]);
		}
		
	}
	
	/*Requette Ajax (Remplir la partie cliente du formulaire de depot)*/
	public String ClientDepot(String exp,String table) throws SQLException{
		 //String Aretourner="<div class='valAretourner'>";
		 String Aretourner="<div class='valAretourner'>";
		//Creation de la  requette
		 //String requette="select NumClient from "+table+" where NumClient like '"+exp+"'";
		 String requette= "select NumClient from "+table+" where NumClient like '%"+exp+"%'";
			PreparedStatement req = null;
			try {
				req = (PreparedStatement) connect.clientPrepareStatement(requette);
			} catch (SQLException e) {
				System.out.println("Impossible d`excecuter la   requete");
			}
				
				//Execution  de la  requette  et  recuperation de des  resultats
			ResultSet resultat = null;
			try {
					resultat = req.executeQuery();
			} catch (SQLException e) {
					System.out.println("Impossible de recuperer les donn�es");
					e.printStackTrace();
			}	

			//if(resultat.equals(null)){
			while(resultat.next()){
					java.sql.ResultSetMetaData metaData = resultat.getMetaData();
					int taille=metaData.getColumnCount();
					
					String[] ligne=new String[taille];
					
					for(int i=1; i<=taille; i++){
						ligne[i-1]="<td class='rnum'>"+resultat.getString(i)+"</td>";
						Aretourner+="<div id='rnum' onclick='javascript:onSelectedIdClient(this.innerHTML)'>"+resultat.getString(i)+"</div>";
					}
			}
			//Aretourner+="</div>";
			Aretourner+="</div>";
		/*	}else{
				
				Aretourner+=" Aucun critere ne correspond � votre recherche </div>";
				System.out.println(Aretourner);
			}*/
			 return Aretourner;
		}
	
	
	
	/*Requette Ajax (Remplir la partie cliente du formulaire de depot)*/
	public String Client(String exp,String table) throws SQLException{
		String[] ligne=null;
		String clientTrouve="r";
		String requette=null;
		//Creation de la  requette
		if(table.equals("depot"))
			 requette= "select NumDepot from depot order By NumDepot Desc limit 1";
		else
			requette= "select * from "+table+" where NumClient='"+exp+"'";
			PreparedStatement req = null;
			try {
				req = (PreparedStatement) connect.clientPrepareStatement(requette);
			} catch (SQLException e) {
				System.out.println("Impossible d`excecuter la   requete");
			}
				
				//Execution  de la  requette  et  recuperation de des  resultats
			ResultSet resultat = null;
			try {
					resultat = req.executeQuery();
			} catch (SQLException e) {
					System.out.println("Impossible de recuperer les donn�es");
					e.printStackTrace();
			}	

			//if(resultat.equals(null)){
			while(resultat.next()){
					java.sql.ResultSetMetaData metaData = resultat.getMetaData();
					int taille=metaData.getColumnCount();
					
				ligne=new String[taille];
					
					for(int i=1; i<=taille; i++){
						ligne[i-1]=resultat.getString(i);
						clientTrouve+="r,bfs;!"+resultat.getString(i);
					}

			}
		
		/*	}else{
				
				Aretourner+=" Aucun critere ne correspond � votre recherche </div>";
				System.out.println(Aretourner);
			}*/
			req.close();
			
			 return clientTrouve;
		}
	
	/* Selectionner les clategories */
	public String categories() throws SQLException{

		String categories="-- Categories --";
		String requette= "select description from categories";
		PreparedStatement req = null;
		try {
			req = (PreparedStatement) connect.clientPrepareStatement(requette);
		} catch (SQLException e) {
			System.out.println("Impossible d`excecuter la   requete");
		}
			
			//Execution  de la  requette  et  recuperation des  resultats
		ResultSet resultat = null;
		try {
				resultat = req.executeQuery();
		} catch (SQLException e) {
				System.out.println("Impossible de recuperer les donn�es");
				e.printStackTrace();
		}	
		int i=1;
		while(resultat.next()){
					categories+="r,bfs;!"+resultat.getString(i);

		}
		return categories;
	}
	/*public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		AccesBaseDeDonnees acc= new AccesBaseDeDonnees("dbbblutin");
		ResultSet res=acc.extractionDonnees();
		acc.affichageDeResultats(res);
	}*/

	
	/*Requette Ajax (Remplir la partie cliente du formulaire de depot)*/
	public String article(String exp,String table) throws SQLException{
	
		 String Aretourner="<div class='valAretourner'>";
		//Creation de la  requette
		 String requette= "select DescProduit from "+table+" where DescProduit like '%"+exp+"%'";
			PreparedStatement req = null;
			try {
				req = (PreparedStatement) connect.clientPrepareStatement(requette);
			} catch (SQLException e) {
				System.out.println("Impossible d`excecuter la   requete");
			}
				
				//Execution  de la  requette  et  recuperation de des  resultats
			ResultSet resultat = null;
			try {
					resultat = req.executeQuery();
			} catch (SQLException e) {
					System.out.println("Impossible de recuperer les donn�es");
					e.printStackTrace();
			}	

			//if(resultat.equals(null)){
			while(resultat.next()){
					java.sql.ResultSetMetaData metaData = resultat.getMetaData();
					int taille=metaData.getColumnCount();
					
					String[] ligne=new String[taille];
					
					for(int i=1; i<=taille; i++){
						ligne[i-1]="<td class='rnum'>"+resultat.getString(i)+"</td>";
						Aretourner+="<div id='descarr' onclick='javascript:onSelectedArt(this.innerHTML)'>"+resultat.getString(i)+"</div>";
					}
			}
			//Aretourner+="</div>";
			Aretourner+="</div>";
		/*	}else{
				
				Aretourner+=" Aucun critere ne correspond � votre recherche </div>";
				System.out.println(Aretourner);
			}*/
			 return Aretourner;
		}
	
	/*Requette Ajax (Remplir la partie cliente du formulaire de depot)*/
	public String detailsArticle(String exp,String table) throws SQLException{
		//Creation de la  requette
		
		 String requette=null;
		 String[] ligne=null;
			String clientTrouve="r";
			//Creation de la  requette
				requette= "select  NumArticle, DescProduit, PrixVente from "+table+" where REPLACE(NumArticle,' ','')='"+exp.replaceAll("\\s", "")+"'";
				PreparedStatement req = null;
				try {
					req = (PreparedStatement) connect.clientPrepareStatement(requette);
				} catch (SQLException e) {
					System.out.println("Impossible d`excecuter la   requete");
				}
					
					//Execution  de la  requette  et  recuperation de des  resultats
				ResultSet resultat = null;
				try {
						resultat = req.executeQuery();
				} catch (SQLException e) {
						System.out.println("Impossible de recuperer les donn�es");
						e.printStackTrace();
				}	

				//if(resultat.equals(null)){
				while(resultat.next()){
						java.sql.ResultSetMetaData metaData = resultat.getMetaData();
						int taille=metaData.getColumnCount();
						
					ligne=new String[taille];
						
						for(int i=1; i<=taille; i++){
							ligne[i-1]=resultat.getString(i);
							clientTrouve+="r,bfs;!"+resultat.getString(i);
						}

				}
			
			/*	}else{
					
					Aretourner+=" Aucun critere ne correspond � votre recherche </div>";
					System.out.println(Aretourner);
				}*/
				req.close();
				
				 return clientTrouve;
		}
}
