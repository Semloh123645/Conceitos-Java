package PooJava.Abstrata;

public class Trabalhador extends Pessoa{
    private String profissao;
    private double salario;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void hello() {
//        Quando o método é abstrato, deve ser instanciado também
        System.out.println("hello");
    }
}
