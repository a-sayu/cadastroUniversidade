package semcamadas;

/**
 *
 * @author Abigail
 *
 */

public class Efetivo extends Docente {
    public String area;
    /**
     * Biológicas, Exatas, Humanas, Saúde
     */

    public Efetivo() {
        super();
        area = "undefined";
    }

    public Efetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area) {
        super(codigo, nome, salario, nivel, titulacao);
        this.area = area;
    }
    
    @Override
    public double calcularSalario() {
        double salario = getSalario();
        salario = salario * 1.05;
        switch (getNivel()) {
            case "D3":
                salario = salario * 1.2;
                System.out.println(salario);
            case "D2":
                salario = salario * 1.1;
                System.out.println(salario);
                break;
            case "D1":
                salario = salario * 1.5;
                System.out.println(salario);
                break;
            default:
                System.out.println("error: nivel isn't classified");
                break;
        }
        return salario;
    }
    
    // SET && GET
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
