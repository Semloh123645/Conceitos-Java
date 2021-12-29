package PooJava.Polimorfismo;

public class AlunoGraduado extends Mestre{

    AlunoGraduado(){

    }

    @Override
    public void counter() {
        System.out.println("Chute Lateral");
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome='" + getNome() + '\'' +
                ", estilo='" + getEstilo() + '\'' +
                '}';
    }
}
