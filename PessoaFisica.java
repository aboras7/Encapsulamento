package poo;

public class PessoaFisica extends Cliente {

    String cpf;

    public PessoaFisica(String nome, int idade, float peso, float altura, int rg, String cpf) {
        super(nome, idade, peso, altura, rg);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public void visualizar () {
        super.visualizar();
        System.out.println("CPF: " + this.cpf + "\n");

    }
}
