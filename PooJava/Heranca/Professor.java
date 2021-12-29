package PooJava.Heranca;

public class Professor extends Pessoa{
    private String materia;
    private int tempoServ;
    private boolean trabalhando;

    public void Professor(){

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getTempoServ() {
        return tempoServ;
    }

    public void setTempoServ(int tempoServ) {
        this.tempoServ = tempoServ;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = true;
    }

    public void aposentar(){
        this.trabalhando = false;

    }

    @Override
    public String toString() {
        return "Professor{ +Nome='"+getNome()+"', Idade='"+getIdade()+"', Sexo='"+getSexo()+
                "materia='" + materia + '\'' +
                ", tempoServ=" + tempoServ +
                ", trabalhando=" + trabalhando +
                '}';
    }
}
