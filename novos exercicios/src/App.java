public class App {
    public static void main(String[] args) throws Exception {
      
        ContaBancaria Leo = new ContaBancaria();
        Leo.setTitular("Leonardo");
        Leo.setNumConta(123456789);
        Leo.setSaldo(1000);

        ContaBancaria Gigi = new ContaBancaria();
        Gigi.setTitular("Giovanna");
        Gigi.setNumConta(987654321);
        Gigi.setSaldo(2000);

        System.out.println("Saldos Iniciais!");
        System.out.println("Saldo do Leonardo R$: " + Leo.getSaldo());
        System.out.println("Saldo da Giovanna R$: " + Gigi.getSaldo());

        Leo.sacar(100);
        Leo.depositar(500);
        Leo.transferir("Gigi", 300); Gigi.depositar(300);

        Gigi.sacar(300);
        Gigi.depositar(800);
        Gigi.transferir("Leo", 200); Leo.depositar(200);

        System.out.println("\nSaldo Final");
        System.out.println("Saldo do Leonardo R$: " + Leo.getSaldo());
        System.out.println("Saldo da Giovanna R$: " + Gigi.getSaldo());



        



    }
}
