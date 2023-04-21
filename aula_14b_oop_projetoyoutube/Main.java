package projetoyoutube;
public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 15 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creouza", 12, "F", "creo");

       /*
        System.out.println("VIDEOS\n---------------------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n---------------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        */

        Visualizacao visuali [] = new Visualizacao [5];
        visuali[0] = new Visualizacao (g[0], v[2]); // juba assiste HTML5
        visuali[0].avaliar();
        System.out.println(visuali[0].toString());


        visuali[1] = new Visualizacao (g[0], v[1]); // juba assiste PHP
        visuali[1].avaliar(87.0f);
        System.out.println(visuali[1].toString());




    }
}