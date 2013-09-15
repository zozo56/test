package mbome.dao;
public class Majuscules {
	
	
	public  String minusculeVersMajuscule(String s){
		
		s = s.toUpperCase();
		return s;
		
		
	}
	public  String majusculeVersMinuscule(String d){
		
		d = d.toLowerCase();
		return d;
				
	}
	
	
	public  String premiereLettreEnMajuscule(String s){
		String temp[];
		String resul = "";
		temp = s.split(" ");
		for(int i=0;i<temp.length;i++){
			resul = resul + temp[i].substring(0,1).toUpperCase() + temp[i].substring(1).toLowerCase()+" ";
		}
		return resul;
	}
	/*public static void main(){
		System.out.println(minusculeVersMajuscule("entrer"));
	}*/
}
