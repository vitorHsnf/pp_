import java.util.ArrayList;
public class Turma {
    private String codigo, sala, horario;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, String sala, String horario){
        this.codigo = codigo;
        this.sala = sala;
        this.horario = horario;
        this.alunos = new ArrayList<Aluno>();
    }

    // Getters e Setters
    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void AddAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public String getAlunos(){
        String list = "Lista de Alunos: \n";
        for (int i = 0; i < this.alunos.size(); i++){
            list += this.alunos.get(i).getName()+"\n"+
                    this.alunos.get(i).getMatricula() + "\n" +
                    this.alunos.get(i).getMediaFinal() + "\n";
        }
        return list;
    }
}
