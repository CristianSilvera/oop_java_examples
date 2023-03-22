package aula04;
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);

        //c1.setModelo("BIC");
        //c1.modelo = "BIC";
        //c1.setPonta(0.5f);
        c1.status();

        Caneta c2 = new Caneta( "BIC", "Azul", 0.4f);

        c2.status();

        //System.out.println("Thenho uma caneta " + c1.getModelo() + " de ponta " +
                //c1.getPonta());
    }

}