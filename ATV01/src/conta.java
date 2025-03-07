public class conta {
    private String cpf;
    private int nBanco;
    private double saldo;
    public double valor;
    public conta(String cpf, double valor, double saldo, int nBanco) {
        this.cpf = cpf;
        this.valor = valor;
        this.saldo = saldo;
        this.nBanco = nBanco;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getnBanco() {
        return nBanco;
    }
    public void setnBanco(int nBanco) {
        this.nBanco = nBanco;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public double bonificação(){
        return saldo/10;
    }
    public double saque(){
        return saldo-valor;
    }
    public double deposito(){
        return saldo+valor;
    }
    public void mostrar(){
        System.out.println("CPF"+cpf);
        System.out.println("Numero do banco"+nBanco);
        System.out.println("Saldo"+saldo);
    }
}
