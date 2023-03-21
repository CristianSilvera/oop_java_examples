package aula_03_oop_beber_agua;

public class Main {
    public static void main(String[] args) {
        BeberAgua b1 = new BeberAgua();
        b1.marca = "Salus";
        b1.litros = 1;
        b1.porcentaje = 90;
        b1.tapada = false;

        b1.status();
        b1.beber();

    }
}