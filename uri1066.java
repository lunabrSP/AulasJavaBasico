import java.util.Scanner;

public class uri1066 {

    public static void main(String[] Args) {
        
        Scanner GetKeys = new Scanner (System.in);

        int VarI = 0, VarX = 0, VarY = 0, VarXI = 0, VarYI = 0;

        float Valores[] = new float[5];

        do {
            Valores[VarI] = GetKeys.nextFloat();
            
            if (Valores[VarI] % 2 == 0)  {
                VarX ++;
            } else { VarXI ++;}

            if (Valores[VarI] > 0) {
                VarYI ++;
            } else if (Valores[VarI] != 0) { VarY ++;}

            VarI ++;
            
        } while (VarI <=4);

        //Bloco de impressao

        System.out.println ("\n" + VarX + " valor(es) par(es)");
        System.out.println ("\n" + VarXI + " valor(es) impar(es)");
        System.out.println ("\n" + VarYI + " valor(es) positivo(s)");
        System.out.println ("\n" + VarY + " valor(es) negativo(s)");

    }

}