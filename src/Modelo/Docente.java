package Modelo;

/**
 *
 * @author Abigail
 *
 */

public abstract class Docente extends Funcionario {
    private String titulacao;
    /**
     * Graduação, Mestrado, Doutorado, Livre-Docencia
     */

    public Docente() {
        super();
        titulacao = "undefined";
    }

    public Docente(String codigo, String nome, double salario, String nivel, String titulacao) {
        super(codigo, nome, salario, nivel);
        this.titulacao = titulacao;
    }
    
    @Override
    public abstract double calcularSalario();
    
    // SET && GET
    
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
}
