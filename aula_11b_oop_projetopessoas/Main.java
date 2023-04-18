package aula011;
public class Main {
    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa(); 'Pessoa' is abstract; cannot be instantiated
/*
        Visitante v1 = new Visitante();
        v1.setNome("Anibal");
        v1.setIdade(23);
        v1.setSexo("M");
        System.out.println(v1.toString());

 */
        Aluno a1 = new Aluno();
        a1.setNome("Ricky");
        a1.setMatricula(1452);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        //System.out.println(a1.toString());
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1453);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();


    }
}