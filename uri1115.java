import java.util.Scanner;

public class uri1115 {

    public static void main(String[] args) {
     
        Scanner GetTeclado = new Scanner (System.in);
        boolean Leitura = false;
        int Coord1 = 0, Coord2 = 0;

        do {
            System.out.println ("\nDigite a 1a coordenada:");
            Coord1 = GetTeclado.nextInt();
            
            if (Coord1 == 0) { 
                System.out.println ("\nCoordenada nula!");
                break;
            }
            System.out.println ("\nDigite a 2a coordenada:");
            Coord2 = GetTeclado.nextInt();
            if (Coord2 == 0) { 
                System.out.println ("\nCoordenada nula!");
                break;
            }

            if (Coord1 > 0) { 
                if (Coord2 > 0) {
                    System.out.println ("\nPrimeiro Quadrante");
                } else { //(Coord2 < 0) {
                    System.out.println ("\nQuarto Quadrante");
                }
            } 
            else if (Coord1< 0) { 
                if (Coord2 > 0) {
                    System.out.println ("\nSegurdo Quadrante");
                } else { //} (Coord2 < 0) {
                    System.out.println ("\nTerceiro Quadrante");
                }
            }

        } while (Leitura == false);

    }

}