public class Main {
    public static void main(String[] args) {
        Cliente jefferson = new Cliente();
        jefferson.setNome("Jefferson");

        Conta cc = new ContaCorrente(jefferson);
        Conta poupanca = new ContaPoupanca(jefferson);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        //cc.transferir(50,joao);

        cc.imprimirExtrato();
        System.out.println("================================");
        System.out.println("Transferindo valor solicitado...");
        System.out.println("================================");
        poupanca.imprimirExtrato();
        System.out.println("================================");
        System.out.println("  Valor depositado com sucesso! ");
        System.out.println("================================");
    }
}
