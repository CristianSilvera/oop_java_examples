package aula_02_oop_caneta;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Big";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 0;
        c1.tampar();
        //c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "verde";
        c2.destampar();
        c1.status();
        c2.rabiscar();
    }
}