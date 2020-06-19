import java.util.Scanner;

public class uri1038 {

    public static void main(String args []) {

        Scanner GetTeclado = new Scanner (System.in);
        
        //Tabela de lanches
        // Cachorro quente ( 1 | 4)
        // X-Salada (2 | 4,50)
        // X-Bacon (3 | 5)
        // Torrada Simples (4 | 2)
        // Refrigerante (5 | 1,50)

        float[][] ProdutosValores = new float[5][2];
        float ValorConta;
        int ItemConsumido, QtdConsumida;
        //Definindo os valores dos produtos
        // Cachorro quente ( 1 | 4)
        ProdutosValores[0][0] = 1f;
        ProdutosValores[0][1] = 4.0f;
        
        // X-Salada (2 | 4,50)
        ProdutosValores[1][0] = 2f;
        ProdutosValores[1][1] = 4.5f;
        
        // X-Bacon (3 | 5)
        ProdutosValores[2][0] = 3f;
        ProdutosValores[2][1] = 1.0f;
        
        // Torrada Simples (4 | 2)
        ProdutosValores[3][0] = 4f;
        ProdutosValores[3][1] = 2.0f;
        
        // Refrigerante (5 | 1,50)
        ProdutosValores[4][0] = 5f;
        ProdutosValores[4][1] = 1.5f;
 
        System.out.println("\nOs itens dispniveis sao:\n" + 
        "1 - Cachorro quente\n2 - X-Salada\n3 - X-Bacon\n4 - Torrada Simples\n5 - Refrigerante");
        System.out.println("\nFavor digitar o item consumido:\n");
        ItemConsumido = GetTeclado.nextInt();

        if (ItemConsumido <= 0 || ItemConsumido > 5) {
                System.out.println("\nVoce so pode escolher entre os intes acima mencionados!");
                System.exit(0);
        }
    
        ItemConsumido = ItemConsumido - 1;

        System.out.println("\nFavor digitar o quantidade consumida:\n");
        QtdConsumida = GetTeclado.nextInt();
        
        if (QtdConsumida <= 0) {
            System.out.println("\nVoce tem que ter consumido ao menos 1 item!");
            System.exit(0);
        }
 
        ValorConta = ProdutosValores[ItemConsumido][1] * QtdConsumida;
        System.out.println("\nSua conta:" + ValorConta);

    }

}