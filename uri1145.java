import java.util.Scanner;
public class uri1145 {
    public static void main (String[] args){
        Scanner GetTeclado = new Scanner(System.in);
        int ValFor1 = 0, ValFor2 = 0, Linhas = 0, Quebra = 0;
        System.out.println("\nDigite a variavel X:");
        Quebra = GetTeclado.nextInt();
        System.out.println("\nDigite a variavel Y:");
        Linhas = GetTeclado.nextInt();

        int Valores[][] = new int[Quebra][Linhas];

    /*  for (ValFor1 = 1; ValFor1 <= Linhas; ValFor1++) {
            for (ValFor2 = 1; ValFor2 <= Quebra; ValFor2 ++) {
                System.out.println(ValFor1 + " " + (ValFor1 + ValFor2));
                ValFor1 = ValFor1 + ValFor2;
            }
        }*/

        do {

            for (ValFor2 = 1; ValFor2 <= Quebra; ValFor2++) {

                Valores[ValFor1][ValFor2] = 

                System.out.println((ValFor1 + ValFor2) + " " + ((ValFor1++) + ValFor2));    
            }
           
            ValFor1 = ValFor1 + Quebra;

        } while (ValFor1 < Linhas);

    }
}