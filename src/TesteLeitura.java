import java.io.IOException;

public class TesteLeitura {

	public static void main(String[] args) {

		
		//Quando trabalhamos com entrada e saida, o codigo abriga a utilizar o try/catch
		//vetor de bytes
		byte bytes[] = new byte[10];
		System.out.println("Digite algo");
		try {
			System.in.read(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}							//Transforma o conjunto de bytes em String
		System.out.println("Eco " + new String(bytes));
		
		
		
	}

}
