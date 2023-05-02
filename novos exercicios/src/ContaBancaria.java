public class ContaBancaria {
    //O objetivo do projeto é desenvolver uma aplicação relacionada a bancos,
    // vamos aplicar os conceitos de POO e as regras de negócio para a estruturação do código.
    // Cadastre os clientes em seu banco, faça depósitos, faça saques e transferências para outras contas
    // de clientes. 
    //Logo abaixo, existe um diagrama de classe para que você possa dar o pontapé inicial.

    private String titular;
    private int numConta;
    private double saldo;


    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(saldo >= valor) {
            this.saldo -= valor;
            }else{
                System.out.println("Valor Insuficiente!!");
            }

    }
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(String titular, double valor){
        if(saldo >= valor) {
            this.saldo -= valor;
        }else{
            System.out.println("Valor Insuficiente!!");
        }
    }



}
