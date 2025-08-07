package EstruturaDeRepeticao_for;

import java.util.Scanner;

public class FatorialOrdemCrescente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Número");
        System.out.print("Número: ");
        int numero = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <=numero ; i++) {

            System.out.println(fatorial+" * "+i+" = "+(fatorial*i));
            fatorial*=i;
        }

        System.out.println("Fatorial de "+numero+" é "+fatorial);
    }
}
