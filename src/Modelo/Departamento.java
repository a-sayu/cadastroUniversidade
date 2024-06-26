package Modelo;

/**
 *
 * @author Abigail && Miguel
 * 
 */

public class Departamento {
    private String codigo;
    private String nome;
    private Funcionario funcionarios[];
    private final int MAX = 100;
    private int cont;

    public Departamento() {
        codigo = "undefined";
        nome = "undefined";
    }

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        inicializar();
    }

    private void inicializar(){
        funcionarios = new Funcionario[MAX];
        cont = 0;
    }
    
    public void addFuncionario(Funcionario funcionario) {
        if (cont < MAX) {
            funcionarios[cont] = funcionario;
            cont++;
        } else System.out.println("error: not enough space");
    }
    
    public Funcionario buscarFuncionarioCodigo (String codigo) {
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i].getCodigo().equals(codigo)) {
                return funcionarios[i];
            }
        }
        return null;
    }
    
    public Funcionario buscarFuncionarioNome (String nome) {
        for (int i = 0; i < cont; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return funcionarios[i];
            }
        }
        return null;
    }
    
    public double calcularGasto() {
        double gasto = 0;
        for (int i = 0; i < cont; i++) {
            gasto = gasto + funcionarios[i].getSalario();
        }
        return gasto;
    }
    
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
    
    public int getCont() {
        return cont;
    }

    public int getMAX() {
        return MAX;
    }

}
