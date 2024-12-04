public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String modelo, String marca, int ano, double preco, int anoFabricacao, int qtdPortas) {
        super(modelo, marca, ano, preco, anoFabricacao);
    }
    try {
        if (ano <= 0) {
            throw new IllegalArgumentException("Ano invalido!");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("Preço invalido!");
        }
        if (qtdPortas <= 1) {
            throw new IllegalArgumentException("Quantidade de portas invalidas!");
        }
    this.qtdPortas = qtdPortas;
} 
    catch (IllegalArgumentException e) {
        System.err.println("Parametros de entrada com erro: " + e.getMessage());
    }

    @Override
    public void ligar() {
        System.out.println("Vrruuuuuuum");
    }
    @Override
    public void desligar() {
        System.out.println("Tuuuuu");
    }
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Quantidade de portas: " + qtdPortas);
    }
}
