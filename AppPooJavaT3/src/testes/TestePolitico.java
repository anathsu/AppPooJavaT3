package testes;

import negocio.Politico;

public class TestePolitico {
	public static void main(String[] args) {
		
		Politico p1 = new Politico();
		p1.nome = "Zézin";
		p1.salario = 30000;
		p1.mandatos = 4;
		p1.senador = true;
		p1.show();
		
	}

}
