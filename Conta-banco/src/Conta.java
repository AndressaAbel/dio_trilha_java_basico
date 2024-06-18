public class Conta {
    private String nome;
    private String sobrenome;
    private String agencia;
    private int numeroConta;
    private double saldo;

    public Conta(String nome, String sobrenome, String agencia, int numeroConta, double saldo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor >0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
        } System.out.println("Valor de depósito inválido.");
    }
    
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        }  System.out.println("Saldo insuficiente ou valor de saque inválido.");
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDetalhesConta() {
        return "Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo" + saldo + " já está disponível para saque.";
    }
}
