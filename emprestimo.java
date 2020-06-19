import java.util.Scanner;

public class emprestimo {

    public static void main (String[] arg) {

        Scanner GetTeclado = new Scanner(System.in);
        int Matricula = 0;
        int Menu = 0, SubMenu = 0;
        boolean MMenu = false;
        
        biblioteca Livro1, Livro2, Livro3, Livro4, Livro5;

        Livro1 = new biblioteca("Biblia", "Deus", "Religiosos", 26, 1, 1, 987298614);
        Livro2 = new biblioteca("Flamengo Campeao", "Zico", "Historia", 1981, 12, 34, 0);
        Livro3 = new biblioteca("Ivanhoe", "Jose", "Historia", 77, 2, 1900, 76880932);
        Livro4 = new biblioteca("Salmos", "Davi", "Religiosos", 1, 2, 1, 987298614);
        Livro5 = new biblioteca("Dona Benta", "Ofelia", "Receitas", 1977, 30, 40, 0);

        do {
            System.out.println ("\nMenu Biblioteca:\n1.Verificar Disponibilidade\n2.Emprestar Titulo\n99.Sair");
            
            Menu = GetTeclado.nextInt();
            
                switch (Menu) {
                    case 1:
                        System.out.println ("1." + Livro1.ListaTitulos());                        
                        System.out.println ("2." + Livro2.ListaTitulos());                        
                        System.out.println ("3." + Livro3.ListaTitulos());                        
                        System.out.println ("4." + Livro4.ListaTitulos());
                        System.out.println ("5." + Livro5.ListaTitulos());
                        System.out.println ("\nEscolha o titulo por numero:");

                        SubMenu = GetTeclado.nextInt();

                        switch (SubMenu) {
                            case 1:
                                System.out.println (Livro1.Disponivel (false));
                                break;
                            case 2:
                                System.out.println (Livro2.Disponivel (false));
                                break;
                            case 3:
                                System.out.println (Livro3.Disponivel (false));
                                break;
                            case 4:
                                System.out.println (Livro4.Disponivel (false));
                                break;
                            case 5:
                                System.out.println (Livro5.Disponivel (false));
                                break;
                        }
                        break;
                    case 2:
                        System.out.println ("1." + Livro1.ListaTitulos());                        
                        System.out.println ("2." + Livro2.ListaTitulos());                        
                        System.out.println ("3." + Livro3.ListaTitulos());                        
                        System.out.println ("4." + Livro4.ListaTitulos());
                        System.out.println ("5." + Livro5.ListaTitulos());

                        System.out.println ("\nEscolha o titulo por numero:");
                        SubMenu = GetTeclado.nextInt();

                        System.out.println ("\nDigite a matricula do aluno:");
                        Matricula = GetTeclado.nextInt();

                        switch (SubMenu) {
                            case 1:
                                System.out.println(Livro1.Emprestar (Matricula));
                                break;
                            case 2:
                                System.out.println(Livro2.Emprestar (Matricula));
                                break;
                            case 3:
                                System.out.println(Livro3.Emprestar (Matricula));
                                break;
                            case 4:
                                System.out.println(Livro4.Emprestar (Matricula));
                                break;
                            case 5:
                                System.out.println(Livro5.Emprestar (Matricula));
                                break;                   
                        }
                        break;
                    case 99:
                        MMenu = true;
                        break;
                }
        } while (MMenu == false);
    }
}