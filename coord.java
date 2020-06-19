import java.util.Scanner;

public class coord {

public static void main(String[] args) {
    
    Scanner GetKeyboard = new Scanner(System.in);

    float XEntry, YEntry;
    String Mensagem="Padrao";
    
    System.out.println("\nVoce tem 4 quadrantes. Digite as suas coordenadas (X,Y):");

    System.out.println("\nDigite sua coordenada X:");
    XEntry = GetKeyboard.nextFloat();

    System.out.println("\nDigite sua coordenada Y:");
    YEntry = GetKeyboard.nextFloat();

    if (XEntry > 0f && YEntry > 0f) {
        Mensagem = "Voce est ano Q1";
    } else {
        if (XEntry > 0f && YEntry < 0f) {
            Mensagem = "Voce esta no Q2";
        }
    }

    if (XEntry < 0f && YEntry > 0f) {
        Mensagem = "Voce esta no Q3";
    } else {
        if (XEntry < 0f && YEntry < 0f) {
            Mensagem = "Voce esta no Q4";
        }
    }

    if (XEntry ==0 || YEntry == 0){ 
            Mensagem = "Voce esta na Origem!"; 
    }

    System.out.printf (Mensagem);

}

}