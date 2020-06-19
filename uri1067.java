import java.util.Scanner;

public class uri1067 {

    public static void main(String[] args) {
     
        Scanner GetTeclado = new Scanner (System.in);

        int Valor = 0, ValorInicial = 1;
        boolean Entrada = false;
        
        do {
            System.out.println ("\nFavor digitar o valor que sera analisado: ");
            Valor = GetTeclado.nextInt();
            if (Valor <= 0 && Valor <= 1000) {
                Entrada = false;
            } else { 
                Entrada = true;
            }
        } while (Entrada == false);  
        
        for (ValorInicial = 1; ValorInicial <= Valor; ValorInicial++) {
            if (ValorInicial % 2 != 0) {
                System.out.println("Valor impar!: " + ValorInicial);
            }
        }
    }
        
}