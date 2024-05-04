package Banco03;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Agencia.nage();
        Conta.ncon();
        System.out.println(c);

        Cliente c2 = new Cliente();
        Agencia.nage();
        Conta.ncon();
        System.out.println(c2);
    }
}
