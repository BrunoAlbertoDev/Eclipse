package EstruturaDeRepeticao_for;

public class ContagemDeMultiplosTres {

    public static void main(String[] args) {

        int N = 3;
        int contaMultiplotres = 0;

        System.out.println("Multiplos de Três: ");
        for (int i = 1; i <= 10; i++) {

            if (i % N == 0) {

                System.out.println(i);
                contaMultiplotres++;
            }
        }
        System.out.println("Contagem Multiplo de Três: "+contaMultiplotres);
    }
}
