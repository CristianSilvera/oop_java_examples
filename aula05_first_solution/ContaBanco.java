package aula05_first_solution;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    static String status;

    public ContaBanco(int numConta, String tipo, String dono, float saldo) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        ContaBanco.status = status;
    }

    public void cuentaInfo() {
        System.out.println(this.getDono());
        System.out.println("Tipo " + this.getTipo() + " " + "Nro. " +this.getNumConta());

    }
}
