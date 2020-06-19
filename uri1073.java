import java.util.Scanner;
public class uri1073 {
    public static void main(String[] args) { 
        Scanner GetTeclado = new Scanner (System.in);
        int Valor = 0, ValI = 0, Potencia = 0;
        System.out.println("\nPor favor, digite o numero que sera analisado:\n");
        Valor = GetTeclado.nextInt();
        for (ValI = 1; ValI <= Valor; ValI++) {
            if (ValI % 2 == 0) {
                Potencia = (int)Math.pow(ValI,2);               
                System.out.println("\nNumero par! Potencia: " + Potencia);
            }
        }
    }
}