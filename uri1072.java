import java.util.Scanner;

public class uri1072 {

    public static void main(String[] args) {
     
        int ValorPermitido = 0, Valor = 0, i = 0, RangeIn = 0, RangeOut = 0;
                
        Scanner GetTeclado = new Scanner (System.in);

            System.out.println ("\nFavor digitar a quantidade de valores que serao permitidos digitar: ");
            ValorPermitido = GetTeclado.nextInt();
        
            for (i = 0; i < ValorPermitido; i++) {
                System.out.println ("\nDigite o valor: ");  
                Valor = GetTeclado.nextInt();

                if (Valor < 10) RangeOut++;
                if (Valor >= 10 && Valor<= 20) RangeIn++;
                if (Valor > 20) RangeOut++;             
            }
            //Bloco de impressao
            System.out.println("\nResultado da analise\n");
            System.out.println(RangeIn + " IN");
            System.out.println(RangeOut + " OUT");

    }
        
}