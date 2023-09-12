package poo;

public class Funcionario {

    private String nome;
    private Character sexo;
    private int idade;
    private String turno;
    private int id;

    public Funcionario(String nome, Character sexo, int idade, String turno, int id) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.turno = turno;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void visualizar() {
        System.out.println("Funcionário: ");
        System.out.println("Nome: " + this.nome + "\nSexo: " + this.sexo + "\nIdade: " + this.idade + "\nTurno: " + this.turno + "\nID: " + this.id);
    }
}

