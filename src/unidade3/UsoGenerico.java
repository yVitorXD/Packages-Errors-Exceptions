package unidade3;
import unidade3.ExemploGenericos;

public class UsoGenerico {

	public static void main(String[] args) {
		
		ExemploGenericos<Integer> iob = new ExemploGenericos<>(88);
		
		iob.showType();
		//Integer
		
		ExemploGenericos<String> sob = new ExemploGenericos<String>("Antonio");
		
		sob.showType();
		//String
	}
	
}
