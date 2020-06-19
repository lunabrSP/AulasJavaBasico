public class Refri {

    private String Nome;
    private double Preco;
    private int Estoque;

    public Refri (String LNome, double LPreco, int LEstoque) {
        Nome = LNome;
        Preco = LPreco;
        Estoque = LEstoque;
    }

    public void setNome (String Var1) {
        this.Nome = Var1;
    }
    public String getNome () {
        return this.Nome;
    }

    public void setPreco (double Var1) {
        this.Preco = Var1;
    }
    public double getPreco () {
        return this.Preco;
    }

    public void setEstoque (int Var1) {
        this.Estoque = Var1;
    }
    public int getEstoque () {
        return this.Estoque;
    }

    public boolean TirarEstoque (){
        if (this.Estoque == 0) {
            return false;
        } else {
            this.estoque ++;
            return true;
        }
    } 

}
