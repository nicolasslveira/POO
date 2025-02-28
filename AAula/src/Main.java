public class Main {
    public static void main(String[] args) {
        Genero g=new Genero();
        g.id=1;
        g.descricao="Comedia";

        Filme f=new Filme();
        f.id=1;
        f.titulo="Se beber";
        f.ano=2000;
        f.genero=g;
        System.out.println(f.genero.descricao);
    }
}
