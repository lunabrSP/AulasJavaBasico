public class biblioteca {

    private String      Titulo;
    private String      Autor;
    private String      Categoria;
    private int         AnoPubli;
    private int         Estante;
    private int         Prateleira;
    private int         Emprestado = 0;

    public biblioteca (String ETitulo, String EAutor, String ECategoria, int EAnoPubli, int EEstante, int EPrateleira, int EEmprestado) {
            Titulo = ETitulo;
            Autor = EAutor;
            Categoria = ECategoria;
            AnoPubli = EAnoPubli;
            Estante = EEstante;
            Prateleira = EPrateleira;
            Emprestado = EEmprestado;

    }

    String getTitulo() {
        return Titulo; 
    }
    
    String getAutor() {
        return Autor; 
    }
    
    String getCategoria() {
        return Categoria;
    }
    
    int getAnoPubli() {
        return AnoPubli;
    }
    
    int getEstante () {
        return Estante;
    }

    int getPrateleira () {
        return Prateleira;
    }

    void SetEmprestado (int VarEmpre) {
        Emprestado = VarEmpre;     }

    int GetEmprestado () {
        return Emprestado;  }

    public String Disponivel (boolean VarInteno) {

        String MSG;
        int VerEmprestado;
        VerEmprestado = GetEmprestado();
        if (VerEmprestado != 0) {
            return "O titulo ja esta emprestado para o aluno:" + Emprestado;
        } 
        else {

            if (VarInteno == false) {
                return "O titulo esta disponivel na Estante: " + getEstante() + " e na prateleira: " + getPrateleira();
            }
            else {
                return "COD01 - DISPONIVEL";
            }
            }
    }

    public String Emprestar (int VarMatricula) {
        String MSG = "";
        if (Disponivel(true) == "COD01 - DISPONIVEL") {          
            if (VarMatricula == 0) {
                MSG = "Necessario informar a matricula para emprestar o titulo!";
            } else {              
                SetEmprestado (VarMatricula);
                MSG = "Titulo emprestado para a matricula " + VarMatricula;
            }   
        }
        return MSG;
    }

    public String ListaTitulos () {
        return "\nTitulo: " + getTitulo() + " Autor: " + getAutor() + " Categoria: " + getCategoria() + " Ano Publicacao: " + getAnoPubli() + " Estante: " + getEstante() + " Prateleira: " + getPrateleira();
    }
}