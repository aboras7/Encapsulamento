package poo;

public class Curso {
    String nome;
    String instituicao;
    float media;
    int semestres;
    float mensalidade;

    public Curso(String nome, String instituicao, float media, int semestres, float mensalidade) {
        this.nome = nome;
        this.instituicao = instituicao;
        this.media = media;
        this.semestres = semestres;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void visualizar() {
        System.out.println("Nome do curso: " + this.nome + "\nInstituição de ensino: " + this.instituicao +
                "\nMédia: " + this.media + "\nSemestres: " + this.semestres + "\nValor da mensalidade: " + this.mensalidade + "\n");

    }
}