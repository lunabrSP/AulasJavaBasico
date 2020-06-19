import java.util.Scanner;

public class uri1142 {

    public static void main (String[] args) {

            Scanner GetTeclado = new Scanner (System.in);

            int Linhas = 0, ValI = 0, ValX = 0;

            System.out.println ("\nPor favor, digite a quantidade de linhas a serem analisadas:");

            Linhas = GetTeclado.nextInt();

            for (ValI = 1; ValI <= Linhas; ValI++) {
                                
                System.out.println ((ValI + ValX) + " " + (ValI + ValX + 1) + " " + (ValI + ValX + 2) + " PUM");
                ValX = ValX + 3;
                
            }
    }

}
