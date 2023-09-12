package poo;

public class TestaGame {
    public static void main(String[] args) {
        Produto jogo1 = new Produto("Red Dead Redemption 2", 299.90f, 20, "Ação/Aventura", "Rockstar Games.");
        jogo1.visualizar();

        Produto jogo2 = new Produto("The Last of Us", 249.90f, 30, "Ação/Aventura", "Naughty Dog");
        jogo2.visualizar();
    }
}
