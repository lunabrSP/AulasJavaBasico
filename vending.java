//import java.util.Scanner;

public class vending {

    private double Credito;
    private Refri ListaRefris[];
    
public vending (double VCredito, Refri VRefris[]) {
    this.Credito = VCredito;
    this.ListaRefri = VRefris[];
    this.ListaRefri[0] = new VRefris("Mountain Dew", 6.50, 15);
    this.ListaRefri[1] = new VRefris("Crush", 6.00, 15);
    this.ListaRefri[2] = new VRefris("Coke", 7.00, 15);
    this.ListaRefri[3] = new VRefris("Pepsi", 6.50, 15);
}



}