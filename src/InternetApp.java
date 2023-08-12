@Copyright(autor = "Vitor", data = "04/01/2002", versao = "01")

public class InternetApp implements internet{

	
	//informa que o método esta obsoleto
	@Deprecated
	public void conectar() {
	}
	
	//sobreescreve o metodo
	@Override
	public void conectarSSL() {
		System.out.println("Conectando");
	}


}
