import java.io.IOException; 

public abstract class Venda implements Veiculo, Cliente {
    private double valorVenda;

    public Venda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    public abstract void processarPagamento() throws IOException, SQLException;

    public abstract void concluirVenda() throws IOException;

    public double getValorVenda() {
        return valorVenda;
    }
}
