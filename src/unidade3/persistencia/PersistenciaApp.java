package unidade3.persistencia;

import br.abctreinamentos.rh.Administrativo;

public class PersistenciaApp {

	public static void main(String[] args) {
		
		GenericDAO<Administrativo> admin = new GenericDAO<>();
		admin.create(new Administrativo());
		
		
	}
	
}
