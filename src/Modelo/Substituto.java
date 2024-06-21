package Modelo;

import Modelo.Docente;

/**
 *
 * @author Abigail
 *
 */

public class Substituto extends Docente {
    public int cargaHoraria;
    /**
     * 12 ou 24
     */

    public Substituto() {
        super();
        cargaHoraria = 0;
    }

    public Substituto(String codigo, String nome, double salario, String nivel, String titulacao, int carga) {
        super(codigo, nome, salario, nivel, titulacao);
        this.cargaHoraria = carga;
    }
      
    @Override
    public double calcularSalario() {
        double salario = getSalario();
        switch (getNivel()) {
            case "S2":
                salario = salario * 1.1;
                System.out.println(salario);
            case "S1":
                salario = salario * 1.05;
                System.out.println(salario);
                break;
            default:
                System.out.println("error: nivel isn't classified");
                break;
        }
        return salario;
    }
    
    // SET && GET
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}
