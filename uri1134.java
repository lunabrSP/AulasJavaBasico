import java.util.Scanner;

public class uri1134 {

    public static void main (String[] args){

        Scanner GetKeyboard = new Scanner(System.in);
        int Combustivel = 0;
        int[][] Memoria = new int[3][2];
        boolean Menu = false;

        Memoria[0][0] = 1;
        Memoria[0][0] = 2;
        Memoria[0][0] = 3;

        do {

            System.out.println ("\nEscolha o combustivel abastecido:\n");
            System.out.println ("\n1 - Alcool\n2 - Gasolina\n3 - Diesel\n4 - Fim");
            
            Combustivel = GetKeyboard.nextInt();
            
            if (Combustivel < 1 || Combustivel >4) {
                System.out.println ("\nRedigite o combustivel abastecido.");
            }
            if (Combustivel == 4) {
                System.out.println ("\nMuito Obrigado!");
                System.out.println ("\nMemoria de abastecimento: ");
                Menu = true;
            }

            switch (Combustivel) {
                case 1:
                    Memoria[0][1]++;
                    break;
                case 2:
                    Memoria[1][1]++;
                    break;
                case 3:
                    Memoria[2][1]++;
                    break;
                default:
                    break;
            }

        } while (Menu == false);

        //Bloco de impressao
        System.out.println ("\nMuito obrigado!\n");
        System.out.println ("Alcool: "   + Memoria[0][1]);
        System.out.println ("Gasolina: " + Memoria[1][1]);
        System.out.println ("Diesel: "   + Memoria[2][1]);

    }

}