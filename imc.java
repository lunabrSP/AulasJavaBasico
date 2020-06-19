import java.util.Scanner;

public class imc {

public static void main(String args[]) {
    
    Scanner tecladoGet = new Scanner(System.in);

    String Genero;
    float Altura, PesoIdeal;
    int Sexo;

    System.out.println("\nDigite seu genero (1 - M) ou (2 - F):");
    Sexo = tecladoGet.nextInt();

    if ((Sexo!=1) && (Sexo!=2)) 
    {
        System.out.println("\nO genero precisa ser 1 - Masculino ou 2 - Feminino");
        System.exit(0);
    }

    System.out.println("\nDigite sua altura:");
    Altura = tecladoGet.nextFloat();

    if (Sexo == 1) {
        Genero = "Masculino";
        PesoIdeal = (72.7f * Altura) - 58.0f;
    }
    else {
        Genero = "Feminino";
        PesoIdeal = (62.1f * Altura) - 44.78f ;
    }

    System.out.println("\nSeu peso ideal é " + PesoIdeal);
    System.out.println(", de acordo com seu genero: " + Genero);
}
}