package aula_02_oop_caneta;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carge: " + this.carga);
        System.out.print("está tampada? " + this.tampada);
    }
    void rabiscar () {
        if (this.tampada == true) {
            System.out.println(" ERROR! Nao posso rabiscar!!");
        } else {
            System.out.println(" Estou rabiscando");
        }
    }
    void tampar () {
        this.tampada = true;
    }
    void destampar () {
        this.tampada = false;
    }
}
