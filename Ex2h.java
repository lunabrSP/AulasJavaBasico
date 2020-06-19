import java.util.Scanner;

public class Ex2h{

    public static void main(String[] args) {
        Scanner teclas = new Scanner (System.in);
   
        float inteiro, conta; 

        String nome;
     
        System.out.println ("Digite seu nome aqui:");
        nome = teclas.nextLine();

        System.out.println ("\nDigite sua altura aqui");
        inteiro = teclas.nextFloat();

        conta = inteiro * 2;

        System.out.println ("\n" + nome + ", a sua altura em marte eh:\n" + conta);
        //System.out.printf("Distancia de %.3f kilometros\n", dist);
    }
}