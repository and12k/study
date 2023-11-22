public class Pessoa implements Comparable<Pessoa> {
    private String nome, sexo;

    Pessoa(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }



}
