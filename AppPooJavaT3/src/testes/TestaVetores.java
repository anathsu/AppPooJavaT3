package testes;

import java.util.Scanner;

public class TestaVetores {
	public static void main(String[] args) {
		int tamanho = Integer.valueOf(args[0]);
		int mes = 0;
		//vetores
		float[] valores = new float[tamanho];
		String[] meses = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
		float[] totais = new float[12];
		
		System.out.println("Tamanho do vetor: " + valores.length);
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Digite um valor: ");
			valores[i] = teclado.nextFloat();
			System.out.print("Digite o mes: ");
			mes = teclado.nextInt();
			totais[mes-1] = totais[mes-1] + valores[i];
		}
		for (int i = 0; i < totais.length; i++) {
			System.out.printf("%s = %.2f \n", meses[i], totais[i]);
		}
		float total = 0;
		for(float valor : valores){ // FOR IT
			total = total + valor;
		}
		System.out.println("Total a ser pago: " + total);
	}
}
