public class Pessoa {
    private String nome;
    private char sexo;


    Pessoa (String nome){
        this.nome = nome;
    }

    Pessoa (String nome, char sexo){
        this.nome = nome;
        this.sexo = sexo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public char getSexo() {
        return sexo;
    }
}
