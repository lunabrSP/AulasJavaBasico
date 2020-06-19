import java.util.Scanner;

public class uri1018 {

public static void main(String args[]) {
    
    Scanner tecladoGet = new Scanner(System.in);

    int Ced100, Ced50, Ced20, Ced10, Ced5, Ced2, Ced1, Resto, Valor;

    int Variavel;
    System.out.printf ("\nDigite o valor para divisao em cedulas:");
    Valor = tecladoGet.nextInt();

    Variavel = 100;

    Ced100 = Valor / Variavel;
    Resto = Valor % Variavel;

    Variavel = 50;
    Ced50 = Resto / Variavel;
    Resto = Resto % Variavel;

    Variavel = 20;
    Ced20 = Resto / Variavel;
    Resto = Resto % Variavel;

    Variavel = 10;
    Ced10 = Resto / Variavel;
    Resto = Resto % Variavel;

    Variavel = 5;
    Ced5 = Resto / Variavel;
    Resto = Resto % Variavel;

    Variavel = 2;
    Ced2 = Resto / Variavel;
    Resto = Resto % Variavel;

    Variavel = 1;
    Ced1 = Resto / Variavel;
    

   // System.out.printf ("\n%d Valor total", Valor);

    System.out.printf("\n%d Valor Total - \n%d Notas de 100 \n%d Notas de 50 \n%d Notas de 20 \n%d Notas de 10 \n%d Notas de 5 \n%d Notas de 2 \n%d Notas de 1", Valor, Ced100, Ced50, Ced20, Ced10, Ced5, Ced2, Ced1 );

}

}