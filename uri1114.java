import java.util.Scanner;

public class uri1114 {

    public static void main(String[] args) {
     
        Scanner GetTeclado = new Scanner (System.in);
        boolean Leitura = false;
        int Valores = 0;
        String Mensagem = "Padrao";

        do {
            //Runtime.exec("cls"); //Limpa a tela
            System.out.println ("\nPor favor, digite a senha correta para acessar o sistema:");
            Valores = GetTeclado.nextInt();
            if (Valores == 2002) {
                Leitura = true;
                System.out.println ("\nAcesso permitido!");
            } else { System.out.println ("\nSenha invalida!"); }
        } while (Leitura == false);
       
    }

}