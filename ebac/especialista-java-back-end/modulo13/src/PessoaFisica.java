import java.util.Date;

public class PessoaFisica extends Pessoa {
    String estadoNascimento, cidadeNascimento, endereco,sexo, signo;
    Date dataNascimento;

    public PessoaFisica(String nome, String rg, String CPF, String estadoNascimento, String cidadeNascimento, String endereco, String sexo, String signo, Date dataNascimento) {
        super(nome, rg, CPF);
        this.estadoNascimento = estadoNascimento;
        this.cidadeNascimento = cidadeNascimento;
        this.endereco = endereco;
        this.sexo = sexo;
        this.signo = signo;
        this.dataNascimento = dataNascimento;
    }

    PessoaFisica(String nome, String rg, String CPF) {
        super(nome, rg, CPF);

    }

    public String getEstadoNascimento() {
        return estadoNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return " PessoaFisica { " + '\n' +
                " estadoNascimento= " + estadoNascimento + '\n' +
                " cidadeNascimento= " + cidadeNascimento + '\n' +
                " endereco= " + endereco + '\n' +
                " sexo= " + sexo + '\n' +
                " signo= " + signo + '\n' +
                " dataNascimento= " + dataNascimento +
                " nome= " + nome + '\n' +
                " RG= " + RG + '\n' +
                " CPF= " + CPF + '\n' +
                '}';
    }
}
