package poo;

public class Gerente extends Funcionario {

    Boolean chaveCaixa;
    Boolean chaveLoja;

    public Gerente(String nome, Character sexo, int idade, String turno, int id, Boolean chaveCaixa, Boolean chaveLoja) {
        super(nome, sexo, idade, turno, id);
        this.chaveCaixa = chaveCaixa;
        this.chaveLoja = chaveLoja;
    }

    public Boolean getChaveCaixa() {
        return chaveCaixa;
    }

    public void setChaveCaixa(Boolean chaveCaixa) {
        this.chaveCaixa = chaveCaixa;
    }

    public Boolean getChaveLoja() {
        return chaveLoja;
    }

    public void setChaveLoja(Boolean chaveLoja) {
        this.chaveLoja = chaveLoja;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Tem chave do caixa? " + this.chaveCaixa + "\nTem chave da loja? " + this.chaveLoja + "\n");
    }
}
