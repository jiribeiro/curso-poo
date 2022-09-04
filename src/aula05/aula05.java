package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setDono("Jonathan");
        c1.abrirConta("CC");
        c1.depositar(1000);
        c1.sacar(320);
        System.out.println(c1.getSaldo());
    }
    
}
