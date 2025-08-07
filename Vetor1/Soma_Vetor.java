
package Vetor1;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Bruno Alberto Dev
 */

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor.
 * Em seguida: 
 * - Imprimir todos os elementos do vetor 
 * - Mostrar na tela a soma e a média dos elementos do 
 * 
 */

/**
 * Exemplo: 
Quantos numeros voce vai digitar? 4 
Digite um numero: 8.0 
Digite um numero: 4.0 
Digite um numero: 10.0 
Digite um numero: 14.0 
VALORES = 8.0  4.0  10.0  14.0   
SOMA = 36.00 
MEDIA = 9.00
 */
public class Soma_Vetor {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		double media = 0;
		double soma = 0;
		System.out.print("VALORES: ");
		for (int i = 0; i < n; i++) {
			
			soma+=numeros[i];
			media = soma / n;
			System.out.printf("%.1f  ",numeros[i]);
		}
		

		System.out.printf("\nSOMA =  %.2f ",soma);
		System.out.printf("\nMEDIA =  %.2f ",media);
		
		sc.close();
	}

}
