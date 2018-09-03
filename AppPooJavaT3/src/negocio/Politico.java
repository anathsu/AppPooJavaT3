package negocio;

public class Politico {
	public String nome;
	public float salario;
	public boolean senador;
	public int mandatos;
	public int meses;
	
	final int VALOR_SENADOR = 8;
	final int VALOR_PREFEITO = 4;
	final int VALOR_ANO = 12;
	
	public Politico(){
		nome = "Não informado";
		salario = 999;
		mandatos = 1;
	}
	
	private float calcSalTotal(){
		if(senador){
			meses = VALOR_ANO * (senador ? VALOR_SENADOR : VALOR_PREFEITO);
			meses = mandatos * meses;
			return meses * salario;
		} else {
			meses = (mandatos *(VALOR_PREFEITO * VALOR_ANO));
			return meses * salario;
		}
	}
	public void show(){
		System.out.printf("%s arrecadou R$%.2f em sua vida política", nome, calcSalTotal());
	}

}
