package aula05;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos Personalizados

    public void estadoAtual() {
        System.out.println("#####################################################");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("#####################################################");
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC") { //también se puede escribir if("CC" .equals(t))
            this.setSaldo(50);
    } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!! " + this.getDono());
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta nao pode ser fechada porque ainda tem dinhero");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta nao pode ser fechada pois tem debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!!");
        }
    }
    public void depositar(float v){
        if (this.isStatus()) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Conta fechada. Nao e possivel depositar na conta.");
        }
    }
    public void sacar(float v){
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Imposivel sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0; //v es o valor
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.isStatus()) {
            this.setSaldo (this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }

    //Métodos Especiais
    public ContaBanco() {
        //this.setSaldo(0);
        //this.setStatus(false);
        this.saldo = 0;
        this.status = false;
    }


    // Getters and Setters
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
