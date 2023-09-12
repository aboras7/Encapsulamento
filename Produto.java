package poo;

public class Produto {
    String nome;
    float preco;
    int quantidade;
    String genero;
    String fabricante;

    public Produto(String nome, float preco, int quantidade, String genero, String fabricante) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.genero = genero;
        this.fabricante = fabricante;
    }

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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public void visualizar() {
        System.out.println("Nome: " + this.nome + "\nPreço: " + this.preco + "\nQuantidade: " + this.quantidade +
                "\nGênero: "+ this.genero + "\nFabricante: " + this.fabricante + "\n");

    }
}
