package poo;

public class Cliente {

    private String nome;
    private int idade;
    private float peso;
    private float altura;
    private int rg;


    public Cliente(String nome, int idade, float peso, float altura, int rg) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {

        return peso;
    }

    public void setPeso(float peso) {

        this.peso = peso;
    }

    public float getAltura() {

        return altura;
    }

    public void setAltura(float altura) {

        this.altura = altura;
    }

    public float getSaldo() {

        return rg;
    }

    public void setRg(int rg) {

        this.rg = rg;
    }

    public void visualizar() {
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nPeso: " + this.peso + "\nAltura: " + this.altura + "\nRG: " + rg + "\n");

    }
}