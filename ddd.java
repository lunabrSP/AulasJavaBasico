import java.util.Scanner;

public class ddd {
      
    public static void main(String[] args) {

        Scanner GetTeclado = new Scanner(System.in);
        
        int GetDDD, PosicaoVetor, DDDBusca, Retorno;
        String DDDS[][] = new String [8][2];
        
        //Sao Paulo
        DDDS[0][0] = "11";
        DDDS[0][1] = "Sao Paulo";
        
        //Campinas
        DDDS[1][0] = "19";
        DDDS[1][1] = "Campinas";
        
        //Rio de Janeiro
        DDDS[2][0] = "21";
        DDDS[2][1] = "Rio de Janeiro";
        
        //Belo Horizonte
        DDDS[3][0] = "31";
        DDDS[3][1] = "Belo Horizonte";
        
        //Juiz de Fora
        DDDS[4][0] = "32";
        DDDS[4][1] = "Juiz de Fora";

        //Vitoria
        DDDS[5][0] = "27";
        DDDS[5][1] = "Vitoria";

        //FD
        DDDS[6][0] = "61";
        DDDS[6][1] = "Brasilia";

        //Vitoria
        DDDS[7][0] = "71";
        DDDS[7][1] = "Salvador";

        System.out.println("\nDigite aqui o DDD da discagem:");
        GetDDD = GetTeclado.nextInt();

        Retorno = 0;

        for (int i = 0; i < 7; ++i) 
        {
  
            DDDBusca = Integer.parseInt(DDDS[i][0]);

            if (GetDDD == DDDBusca) {
                System.out.println("A sua ligacao para " + DDDS[i][1] + " do DDD " + DDDS[i][0] + " sera agendada!");
                Retorno = 1;
            }            
        }
        
        if (Retorno == 0) {
            System.out.println("O DDD digitado nao faz parte da lista de DDDs permitidos"); }
        }
}