package esempi.week11;

public class Funzioni {

	public static void main(String[] args) {
	   
		//metodo di classe
		salutaStatico();
		
		
		
		Funzioni miafunc = new Funzioni();
		//metodo che appartiena agli oggetti di tipo funzione
		miafunc.saluta();
		
		String temp = miafunc.salutaPlus("ciao");
		System.out.println(temp);
		System.out.println(temp);


	}
	
	public void saluta(){
	
		System.out.println("ciao");
	}
	
	
	public String salutaPlus(String messaggio){//string saluta plus è public ma passa una stringa non void 
		//ritorna tutto bene  nel syso ciao +messaggio che è l'arg nelle parentesi
		
		System.out.println("ciao"+ messaggio);
		return "tutto bene!";
		
	}
	
	public static void salutaStatico(){
		System.out.println("ciao");
	}
	
}
