public class Main {
    public static void main(String[] args) {

        //
        Carro carroNovo = new Carro("Ford Ka", 2017);

        // Método para verificar se o carro está ligado
        System.out.println("O carro está ligado?: " + carroNovo.isEstado());

        // Ligar carro
        carroNovo.ligaCarro();

        // Verificar combustivel
        carroNovo.verificaGasolina();

        // Desligar carro para colocar combustivel
        carroNovo.desligaCarro();

        /**
         * Colocar combustivel no carro
         * @param int
         */
        carroNovo.setCombustivel(45);

        // Ligar carro novamente
        carroNovo.ligaCarro();

        // Verificar combustivel novamente
        carroNovo.verificaGasolina();

        // Desligar carro
        carroNovo.desligaCarro();

        // Informar dados do carro
       System.out.println(carroNovo.retornaDadosCarro());
    }


}