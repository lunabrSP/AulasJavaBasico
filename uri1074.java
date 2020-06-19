
import java.util.Scanner;

public class uri1074 {

    public static void main(String[] args) {
     
        Scanner GetTeclado = new Scanner (System.in);
        boolean Leitura = false, Par = false, Impar = false, Positivo = false, Negativo = false, Zero = false;
        int Valores = 0, ValI = 0, ValorAnalisado = 0;
        String Mensagem = "Padrao";

        do {
            //Runtime.exec("cls"); //Limpa a tela
            System.out.println ("\nPor favor, digite a quantidade de valores que serao lidos:");
            Valores = GetTeclado.nextInt();
            if (Valores >= 1 && Valores <= 10000) {
                Leitura = true;
            }
        } while (Leitura == false);
        
               
        for (ValI = 1; ValI <= Valores; ValI ++) {
            Mensagem = "";
            System.out.println ("\nPor favor, digite o valor a ser analisado:");
            ValorAnalisado = GetTeclado.nextInt();
            if (ValorAnalisado % 2 == 0) { Mensagem = Mensagem + "EVEN "; } else { Mensagem = Mensagem + "ODD ";}
            if (ValorAnalisado > 0 ) { Mensagem = Mensagem + "POSITIVE"; } else  { Mensagem = Mensagem + "NEGATIVE";}
            if (ValorAnalisado == 0 ) { Mensagem = "NULL";}
           
            //Bloco de impressao
            System.out.println (Mensagem);
        }
                
    }
        
}