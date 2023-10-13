public class Carro {

    private String nomeCarro;
    private int ano;
    private boolean estado = false;
    private double combustivel = 0;


    public Carro (String nomeCarro, int ano){
        this.nomeCarro = nomeCarro;
        this.ano = ano;

    }

    public boolean isEstado() {
        return estado;
    }

    public String getNomeCarro(){
        return nomeCarro;
    }

    public int getAno() {
        return ano;
    }

    public void verificaGasolina(){
        System.out.println("O carro tem " + combustivel + " litros de combustivel");
    }

    public void setCombustivel(double combustivelNovo){
        this.combustivel = combustivelNovo;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void ligaCarro(){
        this.estado = true;
        System.out.println("Carro ligado");
    }

    public void desligaCarro(){
        this.estado = false;
        System.out.println("Carro desligado");
    }

    public String retornaDadosCarro(){
        return "Nome do veiculo: " + nomeCarro +
                "\n" +
                "Ano de fabricação: " + ano;

    }
}
