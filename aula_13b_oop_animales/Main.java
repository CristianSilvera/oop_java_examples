package aula13;
public class Main {
    public static void main(String[] args) {
        // Programa principal
        //Mamifero x = new Mamifero();
        //x.emitirSom();
        //Lobo x = new Lobo();
        //x.emitirSom();

        Cachorro c = new Cachorro();
        c.reagir("Vai apanhar!");
        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);

    }
}