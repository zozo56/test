package mbome.pojo;


public class Depot {
	
	public Depot(){
		monClient = new Client();
	}
	private String messageRetour;
	public String getMessageRetour() {
		return messageRetour;
	}

	public void setMessageRetour(String messageRetour) {
		this.messageRetour = messageRetour;
	}
	private Client monClient;
	public Client getMonClient() {
		return monClient;
	}

	public void setMonClient(Client monClient) {
		this.monClient = monClient;
	}


	private String idc=null, nom=null, prenom=null, adresse=null,codePostal=null, telephone=null, mail=null,ville=null;	
	private String ndt=null, mdep=null,dd=null, cat=null, dr=null, com=null, taux=null;
	private String numart=null, descart=null, pdepart=null, pvart=null, ageart=null;
	
	public String getIdc() {
		return idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
	}
	
	public String getNdt() {
		return ndt;
	}

	public void setNdt(String ndt) {
		this.ndt = ndt;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getAdresse() {
		return adresse;
	}




	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getMail() {
		return mail;
	}





	public void setMail(String mail) {
		this.mail = mail;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getMdep() {
		return mdep;
	}


	public void setMdep(String mdep) {
		this.mdep = mdep;
	}


	public String getDd() {
		return dd;
	}


	public void setDd(String dd) {
		this.dd = dd;
	}


	public String getCat() {
		System.out.println(cat);
		return cat;
	}


	public void setCat(String cat) {
		this.cat = cat;
		System.out.println(cat);
	}


	public String getDr() {
		return dr;
	}


	public void setDr(String dr) {
		this.dr = dr;
	}


	public String getCom() {
		return com;
	}


	public void setCom(String com) {
		this.com = com;
	}


	public String getTaux() {
		return taux;
	}


	public void setTaux(String taux) {
		this.taux = taux;
	}


	public String getNumart() {
		return numart;
	}


	public void setNumart(String numart) {
		this.numart = numart;
	}


	public String getDescart() {
		return descart;
	}


	public void setDescart(String descart) {
		this.descart = descart;
	}


	public String getPdepart() {
		return pdepart;
	}


	public void setPdepart(String pdepart) {
		this.pdepart = pdepart;
	}


	public String getPvart() {
		return pvart;
	}


	public void setPvart(String pvart) {
		this.pvart = pvart;
	}


	public String getAgeart() {
		return ageart;
	}


	public void setAgeart(String ageart) {
		this.ageart = ageart;
	}
	
}
