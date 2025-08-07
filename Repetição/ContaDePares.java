package EstruturaDeRepeticao_for;

public class ContaDePares {

    public static void main(String[] args) {

        int contagem = 0;
        int limite = 50;

        System.out.println("Conta pares de 1 a 50");
        for (int i = 2; contagem < limite ; i+=2) {

            contagem++;
            System.out.print(i+" ");
        }
    }
}
