package poo;

import java.time.LocalDate;

public class Ingresso {

    String nome;
    float valor;
    LocalDate data;
    String local;
    String setor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Ingresso(String nome, float valor, LocalDate data, String local, String setor) {
        this.nome = nome;
        this.valor = valor;
        this.data = data;
        this.local = local;
        this.setor = setor;
    }

    public void visualizar () {
        System.out.println("Nome: " + this.nome + "\nValor: " + this.valor + "\nData: " + this.data + "\nLocal do evento: " + this.local + "\nSetor: " + this.setor + "\n");
    }
}