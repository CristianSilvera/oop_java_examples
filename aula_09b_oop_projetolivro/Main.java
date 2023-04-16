package projetolivro;
public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];


        p[0] = new Pessoa("Pedro",22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "José Da Sil", 300, p[0]);
        l[1] = new Livro("Aprendendo Kotlin", "José Da Sil", 500, p[0]);
        l[2] = new Livro("Aprendendo JavaScript", "José Da Sil", 400, p[1]);
        l[0].abrir();
        l[0].folhear(250);
        l[0].avancarPag();

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}