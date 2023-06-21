public class Aluno {
    private String name, matricula;
    private double mediaFinal;
    private Turma turma;

    public Aluno(String name, String matricula){
        this.name = name;
        this.matricula = matricula;
    }

    // Getters e Setters
    public String getName(){
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }
}
