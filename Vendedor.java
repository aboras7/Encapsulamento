package poo;

public class Vendedor extends Funcionario {
    Boolean chaveLoja;

    public Vendedor(String nome, Character sexo, int idade, String turno, int id, Boolean chaveLoja) {
        super(nome, sexo, idade, turno, id);
        this.chaveLoja = chaveLoja;
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
        System.out.println("Tem chave da loja? " + this.chaveLoja + "\n");

    }
}