import java.util.Scanner;

public class uri1064 {

    public static void main(String[] args) {
        Scanner GetTeclado = new Scanner (System.in);
        int VarI = 0;
        int VarX = 0;
        float ArrayVars[] = new float [6]; 
        float Media = 0, Acumulado = 0;
       
        do {
            System.out.println ("\nDigite o valor:");
            ArrayVars[VarI] = GetTeclado.nextFloat();

            if (ArrayVars[VarI] > 0) {
                VarX ++;
                Acumulado = Acumulado + ArrayVars[VarI];
            }

            

            VarI ++;
        } while (VarI <= 5);

        Media = Acumulado / VarX; 
        
        System.out.println("\n" + VarX + " valores positivos.");
        System.out.println("\nMedia: " + Media);
        
    }
}