package DevSuperiorExercicios;

import java.util.Scanner;

public class Negativos {

    /**
     *   Problema "negativos"
     *
     *   Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
     *   e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. Em seguida mostre 
     *   quais são os números pares e ímapres negativos(Certifique de ignorar os positivos). no final calcule a media de 
     *   apenas números negativos ímpares.
     *
     *   Exemplo:
     * Quantos numeros voce vai digitar? 6
     * Digite um numero: 8
     * Digite um numero: -2
     * Digite um numero: 9
     * Digite um numero: 10
     * Digite um numero: -3
     * Digite um numero: -7
     * NUMEROS NEGATIVOS: -2 -3 -7
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você que digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        int numerosNegativos = 0 ;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

        }


        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 0){

                System.out.print(numeros[i]+" ");

            }


        }


        int recebePares = 0;
        System.out.println("\nNUMEROS PARES NEGATIVOS: ");
       for (int i = 0; i < numeros.length; i++) {


        if (numeros[i] < 0   &&  numeros[i] % 2 == 0) {
            
            recebePares = numeros[i];
            System.out.print(recebePares+" ");

        }
            
           }

             int recebeImpares = 0;
             int somaImpares = 0;
             double mediaImpares = 0;
            System.out.println("\nNUMEROS ÍMPARES NEGATIVOS: ");
           for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] < 0 && numeros[i] % 2 != 0) {
                
                somaImpares+=numeros[i];
                recebeImpares = numeros[i];
                System.out.print(recebeImpares+" ");

            }
           }

           System.out.print("\nsoma dos Ìmpares Negativos = "+somaImpares);

           mediaImpares = (double)somaImpares/n;

           System.out.println("\n Média dos números negativos ="+mediaImpares);


            sc.close();
        }

    }

