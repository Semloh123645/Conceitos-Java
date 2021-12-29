package PooJava.Heranca;

public class Aluno extends Pessoa {
    private String curso;
    private int matricula;
    private boolean matriculado;

    public Aluno(String curso, int matricula, boolean matriculado) {
        this.curso = curso;
        this.matricula = matricula;
        this.matriculado = true;
    }
    public Aluno(){

    }


    public void cancelarMatricula(){
        this.matriculado = false;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    @Override
    public String toString() {
        return "Aluno{ Nome='"+getNome()+"', Idade='"+getIdade()+"', Sexo='"+getSexo()+
                "' curso='" + curso + '\'' +
                ", matricula=" + matricula +
                ", matriculado=" + matriculado +
                '}';
    }
}
