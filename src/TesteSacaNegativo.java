public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226, 1, new Cliente("Paulo Silveira", "222.222.222-22", "Programador"));
        conta.deposita(100);
        System.out.println(conta.saca(200));
        System.out.println(conta.getSaldo());
    }
}
