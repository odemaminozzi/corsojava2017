package esempi.week11;

public class MiaClasse {
	
	public int mioNumero;
	
	
	
	
	
	
	public MiaClasse(){
		mioNumero = 1 ;
				
		
	}
   public void mioMetodo(){//mio metodo è void non ritorna nulla
	   System.out.println("ciao");
   }
   public static void main (String []arg){
	   MiaClasse mc = new MiaClasse();
	   System.out.println(mc);//riferimento di miaClasse
	   MiaClasse mc2 = mc ;
	   System.out.println(mc2);//riferimenti allo stesso ogg
	   
	   mc = null;
	   mc2 = null;
	   System.out.println(mc);
	   System.out.println(mc2);
   }
}
