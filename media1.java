import java.util.Scanner;

public class media1 {
    
    public static void main(String[] args) {
        Scanner getentrada = new Scanner(System.in);
        double valor1, valor2, media;

        System.out.println("\nVamos calcular sua media\nDigite a 1a nota:");
        valor1 = getentrada.nextDouble();

        System.out.println("\nDigite a 2a nota:");
        valor2 = getentrada.nextDouble();
        
        media = (valor1 * 3.5 + valor2 * 7.5) / 11;
        System.out.printf ("\nSua media eh %.5f", media);
    }     
}