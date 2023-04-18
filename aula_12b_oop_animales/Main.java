package aula12;
public class Main {
    public static void main(String[] args) {
        //Animal an = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();

        c.locomover();
        c.emitirSom();
        k.locomover();
        k.emitirSom();

        /*
        m.setPeso(35.3f);

        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();


        a.locomover();
        p.locomover();
        r.locomover();

        */


    }
}