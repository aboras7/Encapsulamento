package poo;

public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Jorge", 'M', 29, "Matutino", 387415);
        f1.visualizar();

        Funcionario f2 = new Funcionario("Camila", 'F', 24, "Noturno", 387416);
        f2.visualizar();
    }
}