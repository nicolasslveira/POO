public abstract class Veiculo implements Manutencao, Seguro, Garantia {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;
    private int periodoGarantia;  // em anos
    private int anoFabricacao;

    public Veiculo(String modelo, String marca, int ano, double preco, int anoFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
        this.periodoGarantia = 0;  // Inicialmente sem garantia
    }

    @Override
    public void realizarReparo() {
        System.out.println("Reparando o veículo...");
    }

    @Override
    public void realizarRevisao() {
        System.out.println("Realizando revisão do veículo...");
    }

    @Override
    public void verificarValidade() {
        System.out.println("Verificando a validade do seguro do veículo...");
    }

    @Override
    public void renovarSeguro() {
        System.out.println("Renovando o seguro do veículo...");
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

    // Métodos abstratos
    public abstract void ligar();
    public abstract void desligar();

    // Métodos comuns
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
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
        System.out.println("Garantia válida: " + (verificarGarantiaValida() ? "Sim" : "Não"));
    }
}
