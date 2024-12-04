public class Moto extends Veiculo{
    private int qtdRodas;
     public Moto(String modelo, String marca, int ano, double preco, int anoFabricacao, int qtdPortas) {
        super(modelo, marca, ano, preco, anoFabricacao);
    }
    try{
        if (qtdRodas <= 0) {
            throw new IllegalArgumentException("Quantidade de rodas invalidas!");
        }
        this.qtdRodas = qtdRodas;
    }
    catch (IllegalArgumentException e) {
        System.err.println("Digite valores validos: " + e.getMessage());
    }
     @Override
    public void ligar() {
        System.out.println("Tuuruuuum");
    }
    @Override
    public void desligar() {
        System.out.println("Tscee");
    }
    public void exibirInfo() {
        super.exibirInfo();
    }
}