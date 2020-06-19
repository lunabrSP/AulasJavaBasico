import java.util.Scanner;

public class dist {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float dist, temp, vel, consumo;

        System.out.println ("\nVamos calcular o trajeto da sua viagem\n");

        System.out.println ("P. favor, digite o tempo da viagem:\n");
        temp = entrada.nextFloat();
        System.out.println ("\nP. favor, digite a velocidade:\n");
        vel = entrada.nextFloat();

        dist = temp * vel;
        

        System.out.printf("A sua distância eh %.3f",dist);
    }

}