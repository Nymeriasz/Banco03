package Banco03;

public class Cliente {
    Conta conta;
    Agencia agencia;
    final String nome = "Maria";
    public Cliente(){
        this.conta = new Conta();
        this.agencia = new Agencia();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "agencia= " + Agencia.getNage() +
                ", conta= " + Conta.getNcon() +
                ", nome='" + nome + '\'' +
                '}';
    }
}
