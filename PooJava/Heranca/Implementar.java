package PooJava.Heranca;

public class Implementar {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Marcelo", "Masculino", 21);
        Aluno a = new Aluno("Gestão", 2014, true);
        Professor p1 = new Professor();
        p1.setNome("Nonato");
        p1.setIdade(100);
        p1.setSexo("Feminino");
        p1.setMateria("Matemática");
        p1.setTempoServ(500);
        p1.aposentar();

        p.fazerNiver();
        a.setNome("Willy");
        a.setIdade(26);
        a.setSexo("Feminino");

        a.cancelarMatricula();
        a.fazerNiver();
        System.out.println(a.toString());
        System.out.println(p.toString());
        System.out.println(p1.toString());
    }
}
