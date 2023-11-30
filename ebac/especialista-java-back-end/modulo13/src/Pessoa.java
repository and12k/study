import java.util.Date;

public abstract class Pessoa {

    String nome, RG, CPF;

    Pessoa (String nome, String rg, String CPF){
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
