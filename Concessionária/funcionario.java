public abstract class Funcionario {
    private String nome;
    private String Id;
    private double salario;

    public Funcionario(String nome, String Id, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public abstract void executarFuncao();
    
    public String getNome() {
        return nome;
    }
    public String getId() {
        return cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void exibirInfo() {
        System.out.println("Nome do funcionario: "+nome);
        System.out.println("Id: "+Id);
        System.out.println("Salário: "+salario);
    }
}
