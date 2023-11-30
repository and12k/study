import java.util.Date;

public class PessoaJuridica extends Pessoa {
    String numeroInscricao;
    String nomeEmpresarial;
    String CNPJ;
    Date dateAbertura;
    boolean situacaoCadastral;

    public PessoaJuridica(String nome, String rg, String CPF, String CNPJ, String numeroInscricao, Date dateAbertura, boolean situacaoCadastral) {
        super(nome, rg, CPF);
        this.CNPJ = CNPJ;
        this.numeroInscricao = numeroInscricao;
        this.dateAbertura = dateAbertura;
        this.situacaoCadastral = situacaoCadastral;
    }

    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    public void setNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
    }

    public Date getDateAbertura() {
        return dateAbertura;
    }

    public void setDateAbertura(Date dateAbertura) {
        this.dateAbertura = dateAbertura;
    }

    public boolean isSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(boolean situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    @Override
    public String toString() {
        return " PessoaJuridica { " + '\n' +
                " numeroInscricao= " + numeroInscricao + '\n' +
                " nomeEmpresarial= " + nomeEmpresarial + '\n' +
                " CNPJ= " + CNPJ + '\n' +
                " dateAbertura= " + dateAbertura + '\n' +
                " situacaoCadastral= " + situacaoCadastral + '\n' +
                " nome= " + nome + '\n' +
                " RG= " + RG + '\n' +
                " CPF= " + CPF + '\n' +
                '}';
    }
}
