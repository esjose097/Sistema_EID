/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import control.ControlMateriaPrima;
import dominio.ExistenciaMp;
import dominio.MateriaPrima;
import interfaces.IMateriaPrima;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import placeholder.TextPrompt;

/**
 *
 * @author Comunidad del anillo
 */
public class MateriaPrima_Entradas_Salidas extends javax.swing.JFrame {

    /**
     * Creates new form MateriaPrima_Entradas_Salidas
     */
    IMateriaPrima Imp;
    
    
    public MateriaPrima_Entradas_Salidas() {
        initComponents();
        this.Imp = new ControlMateriaPrima();
        actualizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupModo = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventario = new javax.swing.JTable();
        jLabelListaProvisional = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        rbEntrada = new javax.swing.JRadioButton();
        rbSalida = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        SpinnerCantidad = new javax.swing.JSpinner();
        jLabelCantidad = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JListListaProvisional = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entradas y Salidas Materias Primas");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton2.setText("Volver");

        tableInventario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Distribuidora", "Unidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableInventario);
        if (tableInventario.getColumnModel().getColumnCount() > 0) {
            tableInventario.getColumnModel().getColumn(1).setPreferredWidth(30);
        }
        TableCellRenderer rendererFromHeader = tableInventario.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);

        jLabelListaProvisional.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelListaProvisional.setText("Lista Provisional");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Lupa.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardarCambios.setBackground(new java.awt.Color(0, 204, 102));
        btnGuardarCambios.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setText("<html>Guardar<br>Cambios</html>");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        buttonGroupModo.add(rbEntrada);
        rbEntrada.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbEntrada.setSelected(true);
        rbEntrada.setText("Entrada");

        buttonGroupModo.add(rbSalida);
        rbSalida.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbSalida.setText("Salida");

        btnAgregar.setBackground(new java.awt.Color(255, 153, 51));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        SpinnerCantidad.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabelCantidad.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelCantidad.setText("Cant:");

        JListListaProvisional.setModel(new DefaultListModel<ExistenciaMp>()
        );
        jScrollPane3.setViewportView(JListListaProvisional);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelListaProvisional))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbEntrada)
                            .addComponent(rbSalida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelListaProvisional)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbEntrada)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(rbSalida)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCantidad))
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnGuardarCambios)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        new TextPrompt("Buscar...",txtBuscar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int[] indexs = tableInventario.getSelectedRows();
        int cant = (int) SpinnerCantidad.getValue();
        DefaultTableModel model = (DefaultTableModel) tableInventario.getModel();
        DefaultListModel<ExistenciaMp> listmodel = (DefaultListModel<ExistenciaMp>) JListListaProvisional.getModel();
        
        MateriaPrima ex;
        Vector v;

        for (int index : indexs) {
            v = model.getDataVector().elementAt(index);
            ex = new MateriaPrima((int) v.get(0), (String) v.get(1), (String) v.get(2), (String) v.get(3));
            listmodel.addElement(new ExistenciaMp(ex, cant));
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        borrarLista();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
       boolean option= rbEntrada.getModel().isSelected();
       ObtenerDatosLista();
       ArrayList<ExistenciaMp> ex=ObtenerDatosLista();
       if(option){
           System.out.println("Entrada");
           Imp.guardarEntrada(ex);
       }else{
           System.out.println("Salida");
           Imp.guardarSalida(ex);
       }
       
       borrarLista();
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String buscar=txtBuscar.getText();
       if(buscar.equalsIgnoreCase("")){
           actualizarTabla();
       }else{
           
       }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(MateriaPrima_Entradas_Salidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MateriaPrima_Entradas_Salidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MateriaPrima_Entradas_Salidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MateriaPrima_Entradas_Salidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MateriaPrima_Entradas_Salidas().setVisible(true);
            }
        });
    }

    public void actualizarTabla() {
        ArrayList<MateriaPrima> listaMateria = Imp.ObtenerMateriaPrima();
        borrarTabla();
        DefaultTableModel model = (DefaultTableModel) tableInventario.getModel();

        for (MateriaPrima materiaPrima : listaMateria) {
            model.addRow(new Object[]{materiaPrima.getId(), materiaPrima.getNombre(), materiaPrima.getDistribuidora(), materiaPrima.getUnidad()});
        }

    }

    public void borrarTabla() {
        DefaultTableModel model = (DefaultTableModel) tableInventario.getModel();
        model.getDataVector().clear();
    }

    public void borrarLista() {
        DefaultListModel<ExistenciaMp> listmodel = (DefaultListModel<ExistenciaMp>) JListListaProvisional.getModel();
        listmodel.clear();
    }
    
    public ArrayList<ExistenciaMp> ObtenerDatosLista(){
        int length = -1;
        ArrayList<ExistenciaMp> ex=new ArrayList<>();
        DefaultListModel<ExistenciaMp> listmodel = (DefaultListModel<ExistenciaMp>) JListListaProvisional.getModel();
        length= listmodel.size();
        for (int i = 0; i < length; i++) {
            ex.add(listmodel.elementAt(i));
         }
       return ex;
    }
    
    public void buscarA(String buscar){
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<ExistenciaMp> JListListaProvisional;
    private javax.swing.JSpinner SpinnerCantidad;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.ButtonGroup buttonGroupModo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelListaProvisional;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rbEntrada;
    private javax.swing.JRadioButton rbSalida;
    private javax.swing.JTable tableInventario;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
