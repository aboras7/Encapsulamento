package poo;

public class TestaCliente {
    public static void main(String[] args) {

        PessoaFisica c1 = new PessoaFisica("Juliana", 27, 62.5f, 1.59f, 506212657, "555.555.555-55");
        c1.visualizar();

        PessoaFisica c2 = new PessoaFisica("Diego", 19, 66.7f, 1.80f, 526222222, "444.444.444-44");
        c2.visualizar();

        PessoaJuridica c3 = new PessoaJuridica("Camila", 50, 70.0f, 1.70f, 555555555, "11.111.111/0001-11");
        c3.visualizar();

        PessoaJuridica c4 = new PessoaJuridica("Luana", 30, 61.0f, 1.62f, 333333333, "22.222.222/0001-22");
        c4.visualizar();

    }
}
