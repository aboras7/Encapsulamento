package poo;

public class TestaCurso {
    public static void main(String[] args) {
        Curso psicologia = new Curso("Psicologia", "UNIP", + 7.0f, 10, 850.0f);
        psicologia.visualizar();

        Curso java = new Curso("Desenvolvedor Java Fullstack", "Generation", 7, 1, 0);
        java.visualizar();
    }
}
