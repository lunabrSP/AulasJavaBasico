import java.util.Scanner;

public class uri1020 {

    public static void main (String args []) {
        
        Scanner teclasGet = new Scanner(System.in);

        System.out.println("\nDigite aqui uma quantidade de dias:");

        int idadedias = teclasGet.nextInt();

        int resto, anos, meses, dias;
        anos = idadedias / 365;
        resto = idadedias % 365;
        meses = resto / 30;
        dias = resto % 30;

        System.out.println(anos + "ano(s)\n");
        System.out.println(meses + "mes(es)\n");
        System.out.println(dias + "dia(s)\n");
        
    }

    //private static String validateclado () {
      //  System.out.println("Classe!!");

        //validateclado = "volta";
    }

}