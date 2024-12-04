public abstract class Veiculo implements Manutencao, Seguro, Garantia {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;
    private int periodoGarantia;
    private int anoFabricacao;
    public Veiculo(String modelo, String marca, int ano, double preco, int anoFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
        this.periodoGarantia = 0;
    }
    @Override
    public void realizarReparo() {
        System.out.println("Reparando o veículo!");
    }
    @Override
    public void realizarRevisao() {
        System.out.println("Realizando revisão do veículo!");
    }
    @Override
    public void renovarSeguro() {
        System.out.println("Seguro renovado com sucesso!");
    }
    @Override
    public void definirPeriodoGarantia(int anos) {
        if (anos > 0) {
            this.periodoGarantia = anos;
            System.out.println("Garantia definida por " + anos + " anos.");
        } else {
            System.out.println("Período de garantia inválido.");
        }
    }

    @Override
    public boolean verificarGarantiaValida() {
        int anoAtual = java.time.LocalDate.now().getYear();
        int anoGarantiaFinal = this.anoFabricacao + this.periodoGarantia;
        return anoAtual <= anoGarantiaFinal;
    }
    public abstract void ligar();
    public abstract void desligar();

    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }
    public double getPreco() {
        return preco;
    }
    public void exibirInfo() {
        System.out.println("Veiculo do modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Do ano: " + ano);
        System.out.println("Saindo de: " + preco);
        System.out.println("Garantia válida: " + (verificarGarantiaValida() ? "Sim" : "Não"));
    }
}
