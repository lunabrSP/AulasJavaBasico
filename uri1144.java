import java.util.Scanner;

public class uri1144 {

    public static void main (String[] args) {

        Scanner GetTeclado = new Scanner(System.in);
        int ValI = 0, Cubo = 0, Raiz = 0, Repeticoes = 0;

        Repeticoes = GetTeclado.nextInt();

        for (ValI = 1; ValI <= Repeticoes; ValI ++) {

            Raiz = (int)Math.pow(ValI,2);
            Cubo = (int)Math.pow(ValI,3);

            System.out.println (ValI + " " + Raiz + " " + Cubo);
            System.out.println (ValI + " " + (Raiz + 1) + " " + (Cubo + 1));
        }
    }
}