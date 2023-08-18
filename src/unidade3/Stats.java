package unidade3;

public class Stats<T extends Number> {

	T[] num;

	public Stats(T[] num) {
		super();
		this.num = num;
	}
	
	double media() 
	{
		
		double soma = 0;
		for(int i=0; i<num.length;i++) {
			soma = soma + num[i].doubleValue();
			
			
		}
		return soma;
		
		
	}
	
	
	
}
