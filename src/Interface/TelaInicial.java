
package Interface;

import Controlador.Controlador;
import Interface.CadastroDepartamento;
import Interface.CadastroFuncionario;
import Modelo.Departamento;
import Modelo.Funcionario;

/**
 *
 * @author Abigail
 * 
 */

public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form telaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        BuscaPanel = new javax.swing.JPanel();
        buscaField = new javax.swing.JTextField();
        buscaLabel = new javax.swing.JLabel();
        buscaBtn = new javax.swing.JButton();
        filtroCheckBox = new javax.swing.JCheckBox();
        codBuscaRadio = new javax.swing.JRadioButton();
        nomeBuscaRadio = new javax.swing.JRadioButton();
        funcBuscaRadio = new javax.swing.JRadioButton();
        deptoBuscaRadio = new javax.swing.JRadioButton();
        BarraDeFerramentas = new javax.swing.JMenuBar();
        MenuRelatorio = new javax.swing.JMenu();
        resumoGeral = new javax.swing.JMenuItem();
        resumoDepartamento = new javax.swing.JMenuItem();
        resumoFuncionario = new javax.swing.JMenuItem();
        MenuDepartamentos = new javax.swing.JMenu();
        addDepartamento = new javax.swing.JMenuItem();
        departamentos = new javax.swing.JMenuItem();
        MenuFuncionarios = new javax.swing.JMenu();
        addFunc = new javax.swing.JMenuItem();
        funcionarios = new javax.swing.JMenuItem();
        Busca = new javax.swing.JMenu();
        buscaItem = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro da Universidade");
        setName("telaInicial"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        buscaLabel.setText("Busca:");

        buscaBtn.setText("Fazer Busca");
        buscaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaBtnActionPerformed(evt);
            }
        });

        filtroCheckBox.setText("Ver Mais Filtros");

        buttonGroup1.add(codBuscaRadio);
        codBuscaRadio.setText("Por Código");

        buttonGroup1.add(nomeBuscaRadio);
        nomeBuscaRadio.setText("Por Nome");

        buttonGroup2.add(funcBuscaRadio);
        funcBuscaRadio.setSelected(true);
        funcBuscaRadio.setText("de Funcionários");

        buttonGroup2.add(deptoBuscaRadio);
        deptoBuscaRadio.setText("de Departamentos");

        javax.swing.GroupLayout BuscaPanelLayout = new javax.swing.GroupLayout(BuscaPanel);
        BuscaPanel.setLayout(BuscaPanelLayout);
        BuscaPanelLayout.setHorizontalGroup(
            BuscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscaPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(BuscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(BuscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(BuscaPanelLayout.createSequentialGroup()
                            .addComponent(buscaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(buscaField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BuscaPanelLayout.createSequentialGroup()
                        .addGroup(BuscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(funcBuscaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deptoBuscaRadio))
                        .addGap(27, 27, 27)
                        .addGroup(BuscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codBuscaRadio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeBuscaRadio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(BuscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filtroCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        BuscaPanelLayout.setVerticalGroup(
            BuscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscaField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcBuscaRadio)
                    .addComponent(nomeBuscaRadio)
                    .addComponent(filtroCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codBuscaRadio)
                    .addComponent(deptoBuscaRadio)
                    .addComponent(buscaBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        BarraDeFerramentas.setPreferredSize(new java.awt.Dimension(256, 30));

        MenuRelatorio.setText("Relatório");

        resumoGeral.setText("Resumo Geral");
        MenuRelatorio.add(resumoGeral);

        resumoDepartamento.setText("Resumo dos Departamentos");
        MenuRelatorio.add(resumoDepartamento);

        resumoFuncionario.setText("Resumo dos Funcionarios");
        MenuRelatorio.add(resumoFuncionario);

        BarraDeFerramentas.add(MenuRelatorio);

        MenuDepartamentos.setText("Departamentos");

        addDepartamento.setText("Adicionar Departamento");
        addDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartamentoActionPerformed(evt);
            }
        });
        MenuDepartamentos.add(addDepartamento);

        departamentos.setText("Todos os Departamentos");
        MenuDepartamentos.add(departamentos);

        BarraDeFerramentas.add(MenuDepartamentos);

        MenuFuncionarios.setText("Funcionarios");

        addFunc.setText("Adicionar Funcionarios");
        addFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuncActionPerformed(evt);
            }
        });
        MenuFuncionarios.add(addFunc);

        funcionarios.setText("Todos os Funcionarios");
        MenuFuncionarios.add(funcionarios);

        BarraDeFerramentas.add(MenuFuncionarios);

        Busca.setText("Busca");

        buscaItem.setText("Fazer Busca");
        buscaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaItemActionPerformed(evt);
            }
        });
        Busca.add(buscaItem);

        BarraDeFerramentas.add(Busca);

        setJMenuBar(BarraDeFerramentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BuscaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BuscaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuncActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroFuncionario().setVisible(true);
        });
    }//GEN-LAST:event_addFuncActionPerformed

    private void addDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDepartamentoActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroDepartamento().setVisible(true);
        });
    }//GEN-LAST:event_addDepartamentoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        BuscaPanel.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void buscaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaItemActionPerformed
        BuscaPanel.setVisible(true);
    }//GEN-LAST:event_buscaItemActionPerformed

    private void buscaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaBtnActionPerformed
        boolean forma = codBuscaRadio.isSelected();
        boolean tipo = funcBuscaRadio.isSelected();
        String termo = buscaField.getText();
        Controlador control = new Controlador();
        if (forma == true) { // Por Codigo
            if (tipo == false) { // Por Departamento
                Departamento d = control.buscarDepartamento(termo);
                if (d != null) System.out.println("found");
            } else { // Por Funcionario
                Funcionario f = control.buscarFuncionario(termo);
                if (f != null) System.out.println("found");
            }
        } else if (forma == true) { // Por Nome
            if (tipo == false) { // Por Departamento
                Departamento d = control.buscarDepartamentoNome(termo);
                if (d != null) System.out.println("found");
            } else { // Por Funcionario
                Funcionario f = control.buscarFuncionarioNome(termo);
                if (f != null) System.out.println("found");
            }
        } else {
            System.out.println("not found");
        }
    }//GEN-LAST:event_buscaBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(() -> {
            new TelaInicial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraDeFerramentas;
    private javax.swing.JMenu Busca;
    private javax.swing.JPanel BuscaPanel;
    private javax.swing.JMenu MenuDepartamentos;
    private javax.swing.JMenu MenuFuncionarios;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenuItem addDepartamento;
    private javax.swing.JMenuItem addFunc;
    private javax.swing.JButton buscaBtn;
    private javax.swing.JTextField buscaField;
    private javax.swing.JMenuItem buscaItem;
    private javax.swing.JLabel buscaLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton codBuscaRadio;
    private javax.swing.JMenuItem departamentos;
    private javax.swing.JRadioButton deptoBuscaRadio;
    private javax.swing.JCheckBox filtroCheckBox;
    private javax.swing.JRadioButton funcBuscaRadio;
    private javax.swing.JMenuItem funcionarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JRadioButton nomeBuscaRadio;
    private javax.swing.JMenuItem resumoDepartamento;
    private javax.swing.JMenuItem resumoFuncionario;
    private javax.swing.JMenuItem resumoGeral;
    // End of variables declaration//GEN-END:variables
}
