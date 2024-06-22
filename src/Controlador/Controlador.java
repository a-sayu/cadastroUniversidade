package Controlador;

/**
 *
 * @author Abigail && Miguel
 *
 */
import Interface.SistemaCadastro;
import Modelo.Funcionario;
import Modelo.Departamento;
import Modelo.Universidade;

public class Controlador {
    private static Universidade universidade = new Universidade("UNESP");
    
    public void executar () {
        SistemaCadastro sistema = new SistemaCadastro();
        sistema.executar();
    }
    
    public void adicionarDepartamento(Departamento departamento) {
        universidade.addDepartamento(departamento);
    }
    public void adicionarFuncinario(Funcionario funcionario, String codigoDepartamento) {
        universidade.addFuncionario(funcionario, codigoDepartamento);
    }
    
    public Departamento buscarDepartamento(String codigoDepto) {
        Departamento d;
        d = universidade.buscarDepartamento(codigoDepto);
        return d;
    }
    
    public Funcionario buscarFuncionario(String codigoFunc) {
        Funcionario f;
        f = universidade.buscarFuncionarioPorCodigo(codigoFunc);
        return f;
    }
    
    // Get && Set
    
    public static Universidade getUniversidade() {
        return universidade;
    }
    public static void setUniversidade(Universidade universidade) {
        Controlador.universidade = universidade;
    }
}
