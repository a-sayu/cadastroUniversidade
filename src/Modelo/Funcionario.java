package semcamadas;

/**
 *
 * @author Abigail
 *
 */

public abstract class Funcionario {
    private String codigo;
    private String nome;
    private double salario;
    private String nivel;
    
    /**
     * d1,s1: +5
     * t1, d2, s2: +10
     * t2,d3 +20
     * de: +5
     */

    public Funcionario() {
        codigo = "00000";
        nome = "undefined";
    }

    public Funcionario(String codigo, String nome, double salario, String nivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
    }

    public abstract double calcularSalario();
    
    // SET && GET
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
