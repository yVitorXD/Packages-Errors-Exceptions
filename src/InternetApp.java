
public class InternetApp implements internet{

	
	//informa que o m�todo esta obsoleto
	@Deprecated
	public void conectar() {
	}
	
	//sobreescreve o metodo
	@Override
	public void conectarSSL() {
		System.out.println("Conectando");
	}


	

}
