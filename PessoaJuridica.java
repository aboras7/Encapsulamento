package poo;

public class PessoaJuridica extends Cliente {
        String cnpj;

    public PessoaJuridica(String nome, int idade, float peso, float altura, int rg, String cnpj) {
        super(nome, idade, peso, altura, rg);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void visualizar () {
        super.visualizar();
        System.out.println("CNPJ: " + this.cnpj + "\n");

    }
}

