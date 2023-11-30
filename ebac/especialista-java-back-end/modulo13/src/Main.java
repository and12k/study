import java.util.Date;

public class Main {
    public static void main(String[] args) {



        PessoaFisica pessoaFisica = new PessoaFisica(
               "Isadora Maitê Nogueira",
               "41.262.979-3",
                "228.320.622-70",
                "AC",
                "Acrelândia",
                "Avenida Paraná, s/n",
                "Feminino",
                "Aquário",
                new Date(2001,02,04)
                );

        PessoaJuridica pessoaJuridica = new PessoaJuridica(
                "Marina Francisca Silva",
                "50.901.399-5",
                "440.829.352-07",
                "11.651.662/0001-48",
                "410.534.961.864",
                new Date(2013,03,20),
                true

        );

        System.out.println(pessoaFisica.toString());

        System.out.println(pessoaJuridica.toString());

    }
}