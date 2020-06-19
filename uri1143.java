import java.util.Scanner;

public class uri1143 {

    public static void main (String[] args) {

        Scanner GetTeclado = new Scanner(System.in);

        int Linhas = 0, ValI = 0, Raiz = 0, Cubo = 0;

        System.out.println("\nPor favor, digite a quantidade de linhas a serem analisdas:");
    
        Linhas = GetTeclado.nextInt();

        for (ValI = 1; ValI <= Linhas; ValI++) {
            Raiz = (int)Math.pow(ValI,2);
            Cubo = (int)Math.pow(ValI,3);

            System.out.println("\n" + ValI + " " + Raiz + " " + Cubo);
        }
    }
}