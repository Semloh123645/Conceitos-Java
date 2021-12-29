package PooJava.Polimorfismo;

public class Implementar {
    public static void main(String[] args) {

        AlunoGraduado ag = new AlunoGraduado();
        AlunoGraduado ag1 = new AlunoGraduado();
        Mestre m = new Mestre();

        m.setNome("Arona");
        m.setEstilo("Karatê");
        m.counter();

        ag.setNome("Marcelo");
        ag.setEstilo("Muay Thai");
        ag.counter();

        ag1.setNome("Nick");
        ag1.setEstilo("Kung-Fu");
        ag1.counter("Joelhada Lateral");

        System.out.println(m.toString());
        System.out.println(ag.toString());
        System.out.println(ag1.toString());

    }
}
