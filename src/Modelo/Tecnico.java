package Modelo;

/**
 *
 * @author Abigail
 *
 */

public class Tecnico extends Funcionario {
    private String funcao;
    /**
     * Assessor, Laboratorio, Secretário
     */

    public Tecnico() {
        super();
        funcao = "undefined";
    }

    public Tecnico(String codigo, String nome, double salario, String nivel, String funcao) {
        super(codigo, nome, salario, nivel);
        this.funcao = funcao;
    }
    
    @Override
    public double calcularSalario() {
        double salario = getSalario();
        switch (getNivel()) {
            case "T2":
                salario = salario * 1.2;
                System.out.println(salario);
            case "T1":
                salario = salario * 1.1;
                System.out.println(salario);
                break;
            default:
                System.out.println("error: nivel isn't classified");
                break;
        }
        return salario;
    }
    
    // SET && GET

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
