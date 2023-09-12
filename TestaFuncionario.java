package poo;

public class TestaFuncionario {
    public static void main(String[] args) {

        Vendedor funcionario1 = new Vendedor("Carla", 'F', 26, "Matutino", 14567, true);
        funcionario1.visualizar();

        Vendedor funcionario2 = new Vendedor("Júlio", 'M', 32, "Vespertino", 15649, true);
        funcionario2.visualizar();

        Gerente funcionario3 = new Gerente("Roberto", 'M', 45, "Horário Admnistrativo", 16478, true, true);
        funcionario3.visualizar();

        Gerente funcionario4 = new Gerente("Larissa", 'F', 34, "Noturno", 16498, true, true);
        funcionario4.visualizar();
    }
}