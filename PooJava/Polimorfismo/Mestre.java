package PooJava.Polimorfismo;

public class Mestre {
    private String nome;
    private String estilo;

    public void counter(){
        System.out.println("Joelhada com clinch");
    }
//    Polimorfismo de sobrecarga é quando eu reescrevo a mesma função, mas alterando
//    os parâmetros
    public void counter(String g){
        System.out.println(g);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Mestre{" +
                "nome='" + nome + '\'' +
                ", estilo='" + estilo + '\'' +
                '}';
    }
}
