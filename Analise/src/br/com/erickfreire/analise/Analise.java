package br.com.erickfreire.analise;

import java.util.Scanner;

/**
 * Porgrama em Java que analisa quantas pessoas passaram em um exame
 * @author Erick Freire
 * @version 1 - Criado em 04-04-2021
 */

public class Analise {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int passou = 0;
		int reprovou = 0;
		int contadorEstudante = 1;
		
		while(contadorEstudante <= 10) {
			System.out.print("Informe um resultado 1 - passou ou 2 - reprovou: ");
			int resultado = entrada.nextInt();
			
			if(resultado == 1)
				passou = passou + 1;
			else
				reprovou = reprovou + 1;
			
			contadorEstudante = contadorEstudante + 1;
		}
		
		System.out.printf("Passou: %d%nReprovou: %d%n", passou, reprovou);
		
		if(passou >= 8)
			System.out.println("Bonus para o professor: ");

	}

}
