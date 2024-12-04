public abstract class Veiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Veiculo(String tipo,String modelo, String marca, int ano, double preco) {
        this.tipo=tipo;
        this.modelo =modelo;
        this.marca = marca;
        this.ano= ano;
        this.preco=preco;
    }

    // Métodos abstratos
    public abstract void ligar();
    public abstract void desligar();

    // Métodos comuns
    public String getTipo(){
        return tipo;
    }

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
        System.out.println("Tipo de veiculo: "+tipo);
        System.out.println("Modelo do veiculo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Seu preço e: " + preco);
    }
}
