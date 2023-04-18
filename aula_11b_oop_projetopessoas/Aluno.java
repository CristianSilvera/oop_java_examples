package aula011;

public class Aluno extends Pessoa { //utilizo final en las class --> no quiero que tenga hijos.
    private int matricula;
    private String curso;

    public void pagarMensalidade() { //utilizo final en los métodos --> no quiero que se sobrescriban.
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
