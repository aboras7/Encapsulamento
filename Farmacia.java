package poo;

import java.time.LocalDate;
import java.util.Date;

public class Farmacia {
    String nome;
    float preco;
    boolean generico;
    boolean receita;
    LocalDate validade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isGenerico() {
        return generico;
    }

    public void setGenerico(boolean generico) {
        this.generico = generico;
    }

    public boolean isReceita() {
        return receita;
    }

    public void setReceita(boolean receita) {
        this.receita = receita;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public Farmacia(String nome, float preco, boolean generico, boolean receita, LocalDate validade) {
        this.nome = nome;
        this.preco = preco;
        this.generico = generico;
        this.receita = receita;
        this.validade = validade;
    }

        public void visualizar () {
            System.out.println("Nome: " + this.nome + "\nPreço: " + this.preco + "\nTem genérico? " + this.generico + "\nPrecisa de receita? " + this.receita + "\nValidade: " + this.validade + "\n");
        }

}
