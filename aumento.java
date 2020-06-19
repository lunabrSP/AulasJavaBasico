public class aumento {

    public static void main (String[] arg) {
        
        empregado E1, E2;

        E1 = new empregado("Raphel", "Gerente de Sistemas", 16000);
        E2 = new empregado("Andrea", "Auditora", 6000);

        System.out.print("\n" + E1.Imprimir());
        System.out.print("\n" + E2.Imprimir());

        E1.AumentaSalario(0.10);
        E2.AumentaSalario(0.07);
        
        System.out.print("\n" + E1.Imprimir());
        System.out.print("\n" + E2.Imprimir());

    }
}