package Interface;

import Modelo.Departamento;

/**
 *
 * @author Abigail
 *
 */

public class SistemaCadastro {
    
    public SistemaCadastro() {}
    
    public void executar() {
        System.out.println("Inicio");
        java.awt.EventQueue.invokeLater(() -> {
            new TelaInicial().setVisible(true);
        });
    }
    
    public static void geral () {
        /**
         * Apresentar Todos os Departamentos
         * Seus respectivos funcionarios
         * Gasto total com os Funcionarios
         */
    }
    
    public static void resumirDepartamentos () {
        /**
         * Apresentar informações como:
         * nome, qtd funcionarios, gasto
         * total com funcionarios
         */
    }
    
    public void resumirDepartamentoGastoEspecifico (double min, double max) {
        /**
         * Apresentar o anterior se o gasto
         * estiver entre uma faixa de valores
         * inserido pelo usuário
         */
    }
    
    public void exibirDepartamentoInfo(Departamento departamento) {
        /**
         * Exibir todas as informações de um
         * depto selecionado, funcionarios, gasto
         * totais
         * Pode ser indicado por codigo ou selecionar
         * em lista
         */
    }
    
    public void funcionarioSalarioEspecifico (double min, double max) {
        /**
         * Apresentar os dados dos funcionarios em
         * uma faixa salarial especifica definida
         * pelo usuário
         */
    }
    
    public static void exibirTodosFuncionarios () {
        
    }
    
    public static void exibirTodosTecnicos () {

    }
    
    public static void exibirTodosDocentes () {

    }
    
    public static void exibirTodosEfetivos () {

    }
    
    public static void exibirTodosSubstitutos () {

    }
    
    public void buscarFuncionarioPorCodigo (String codigo) {

    }
    
    public void buscarFuncionarioPorNome (String nome) {

    }
    
}
