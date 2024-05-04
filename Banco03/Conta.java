package Banco03;

public class Conta {
    static int ncon = 0;
    public Conta(){
        ncon++;
    }
    public static void ncon(){
        System.out.println("O banco tem "+getNcon()+" conta(s)");
    }

    public static int getNcon() {
        return ncon;
    }
}
