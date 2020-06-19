public class empregado {

    private String Nome;
    private String Cargo;
    private double Salario;

    public empregado (String V1, String V2, double V3) {

            Nome = V1;
            Cargo = V2;
            Salario = V3;
    }

    void setNome (String varNome) {
            Nome = varNome;
    }

    void setCargo (String varCargo) {
            Cargo = varCargo;
    }
    
    void setSalario (double varSalario) {
            Salario = varSalario;
    }

    String getNome () {
        return Nome;
    }

    String getCargo () {
        return Cargo;
    }

    double getSalario () {
        return Salario;
    }

    void AumentaSalario (double perc) {
        Salario = (Salario * perc) + Salario;
    }

    String Imprimir () {
        return "O funcionario " + Nome + ", com cargo " + Cargo + " tem o salario de R$:" + String.format("%.2f", Salario);
    }
    //String.format("%.2f", salario)   

}