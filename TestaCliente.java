package poo;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Juliana", 27, 62.5f, 1.59f, 506212657);
        c1.visualizar();

        Cliente c2 = new Cliente("Diego", 19, 66.7f, 1.80f, 526212122);
        c2.visualizar();
    }
}
