package PooJava.Interface;

public class Servidor implements Pessoa{
    public boolean trabalhando = true;
    @Override
    public void aposentar() {
        trabalhando = false;
    }

    public static void main(String[] args) {
        Servidor s = new Servidor();
        s.aposentar();
        System.out.println(s.trabalhando);
    }
}
