package Modelo;

/**
 *
 * @author Abigail && Miguel
 * 
 */

public class Universidade {
    private String nome;
    private Departamento departamentos[];
    private final int MAX = 100;
    private int cont;
    
    public Universidade () {
        nome = "Undefined";
    }
    
    public Universidade (String nome) {
        this.nome = nome;
        inicializar();
    }
    
    private void inicializar(){
        departamentos = new Departamento[MAX];
        cont = 0;
    }
        
    public void addDepartamento(Departamento departamento) {
        if (cont < MAX) {
            departamentos[cont] = departamento;
            cont++;
        } else System.out.println("error: not enough space");
    }
    
    public Departamento buscarDepartamento(String codigoDepartamento) {
        for (int i = 0; i < cont; i++) {
            if (departamentos[i].getCodigo().equals(codigoDepartamento))
                return departamentos[i];
        }
        return null;
    }
    
    public void addFuncionario(Funcionario funcionario, String codigoDepartamento) {
        Departamento d = buscarDepartamento(codigoDepartamento);
        d.addFuncionario(funcionario);
    }
    
    public Funcionario buscarFuncionarioPorCodigo(String codigoFuncionario) {
        for (int i = 0; i < cont; i++) {
            Funcionario f = departamentos[i].buscarFuncionarioCodigo(codigoFuncionario);
            if (f != null) {
                return f;
            }
        }
        return null;
    }
    
    public Funcionario buscarFuncionarioPorNome(String nomeFuncionario) {
        for (int i = 0; i < cont; i++) {
            Funcionario f = departamentos[i].buscarFuncionarioNome(nomeFuncionario);
            if (f != null) {
                return f;
            }
        }
        return null;
    }
    
    // SET && GET
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMAX() {
        return MAX;
    }
        
}
