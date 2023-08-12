package unidade3;

public class UsoGenerico2 {

	public static void main(String[] args) {
		
		//exemplo (login string nome, string senha)
		ExemploGenericos2<Double, String> aob = new ExemploGenericos2<>(88.8, "Vitor");

		aob.getType();
		
		
	}
	
}
