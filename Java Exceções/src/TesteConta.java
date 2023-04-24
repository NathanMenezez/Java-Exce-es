import entities.Conta;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 1000);

        conta.sacar(1000);
    }
}
