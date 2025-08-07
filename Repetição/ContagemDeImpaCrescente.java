package EstruturaDeRepeticao_for;

import java.util.Scanner;

public class ContagemDeImpaCrescente {

    /**
     *
     * faça um programa que leia um número inteiro positivo impa N
     * e imprima todos os números ímpares de 1 até N em ordem crescente.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ler número inteiro ímpa N: ");
        int N = sc.nextInt();

        System.out.println("------ Números ímpares de 1 até N ------");

        for (int i = 1; i <= N ; i++) {

            if (i % 2 != 0){

                System.out.println(i);
            }
        }

        sc.close();

    }
}
