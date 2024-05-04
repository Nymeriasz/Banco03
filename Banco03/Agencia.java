package Banco03;

public class Agencia {
    static int nage = 0;
    public Agencia(){
        nage++;
    }
    public static void nage(){
        System.out.println("O banco tem "+getNage()+" agencia(s)");
    }

    public static int getNage() {
        return nage;
    }
}
