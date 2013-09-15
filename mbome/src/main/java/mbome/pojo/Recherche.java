package mbome.pojo;

public class Recherche {
	private String expression;
	private String critere;

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getCritere() {
		if(critere.equals("D�p�t"))
			critere="depot";
		System.out.println("Le Critere est :"+critere);
		return critere.toLowerCase();
	}

	public void setCritere(String critere) {
		this.critere = critere;
	}
	

}
