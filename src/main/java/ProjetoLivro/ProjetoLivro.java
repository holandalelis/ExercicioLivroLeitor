package ProjetoLivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro l[] = new Livro[3];


        p[0] = new Pessoa("Pedro", 33, "Masculino");
        p[1] = new Pessoa("Mayara", 31, "Feminino");
        p[2] = new Pessoa("Genecí", 77, "Feminino");

        l[0] = new Livro("Ensaio sobre a cegueira", "José Saramago", 320, p[0]);
        l[1] = new Livro("A queda", "Albert Camus", 100, p[1]);
        l[2] = new Livro("Duna", "Frank Herbert", 700, p[2]);
        l[3] = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 500, p[0]);
        l[0].abrir();
        l[0].folhear(400);
        System.out.println(l[0].detalhes());
    }
}
