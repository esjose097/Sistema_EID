/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import ReportesNegocio.Rango;
import control.ControlReportes;
import interfaces.IReportes;
import java.awt.BorderLayout;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author eliu
 */
public class Reportes extends javax.swing.JFrame {

    IReportes reporte;

    public Reportes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        bgMateria = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelTipo = new javax.swing.JPanel();
        rbSalidas = new javax.swing.JRadioButton();
        rbEntradas = new javax.swing.JRadioButton();
        panelMateria = new javax.swing.JPanel();
        rbMateriaPrima = new javax.swing.JRadioButton();
        rbProducto = new javax.swing.JRadioButton();
        btnGenerar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanelReporte = new javax.swing.JPanel();
        jTabbedPaneOpciones = new javax.swing.JTabbedPane();
        jPanelDias = new javax.swing.JPanel();
        cbRango = new javax.swing.JComboBox<>();
        jPanelPeriodo = new javax.swing.JPanel();
        dc_desde = new com.toedter.calendar.JDateChooser();
        dc_hasta = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes");
        setBackground(new java.awt.Color(102, 255, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        panelTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        bgTipo.add(rbSalidas);
        rbSalidas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbSalidas.setText("Salida");

        bgTipo.add(rbEntradas);
        rbEntradas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbEntradas.setSelected(true);
        rbEntradas.setText("Entrada");

        javax.swing.GroupLayout panelTipoLayout = new javax.swing.GroupLayout(panelTipo);
        panelTipo.setLayout(panelTipoLayout);
        panelTipoLayout.setHorizontalGroup(
            panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEntradas)
                    .addComponent(rbSalidas))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelTipoLayout.setVerticalGroup(
            panelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbEntradas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(rbSalidas)
                .addContainerGap())
        );

        panelMateria.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        bgMateria.add(rbMateriaPrima);
        rbMateriaPrima.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbMateriaPrima.setSelected(true);
        rbMateriaPrima.setText("Materia Prima");

        bgMateria.add(rbProducto);
        rbProducto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbProducto.setText("Producto");

        javax.swing.GroupLayout panelMateriaLayout = new javax.swing.GroupLayout(panelMateria);
        panelMateria.setLayout(panelMateriaLayout);
        panelMateriaLayout.setHorizontalGroup(
            panelMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbProducto)
                    .addComponent(rbMateriaPrima))
                .addContainerGap())
        );
        panelMateriaLayout.setVerticalGroup(
            panelMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMateriaPrima)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(rbProducto)
                .addContainerGap())
        );

        btnGenerar.setBackground(new java.awt.Color(102, 255, 102));
        btnGenerar.setText("Generar Reporte");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(255, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnGenerar))
                    .addComponent(panelMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerar)
                    .addComponent(btnVolver)))
        );

        jPanelReporte.setBackground(new java.awt.Color(255, 255, 255));
        jPanelReporte.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        javax.swing.GroupLayout jPanelReporteLayout = new javax.swing.GroupLayout(jPanelReporte);
        jPanelReporte.setLayout(jPanelReporteLayout);
        jPanelReporteLayout.setHorizontalGroup(
            jPanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelReporteLayout.setVerticalGroup(
            jPanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        cbRango.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbRango.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoy", "Ayer", "Una Semana", "Un Mes" }));

        javax.swing.GroupLayout jPanelDiasLayout = new javax.swing.GroupLayout(jPanelDias);
        jPanelDias.setLayout(jPanelDiasLayout);
        jPanelDiasLayout.setHorizontalGroup(
            jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbRango, 0, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDiasLayout.setVerticalGroup(
            jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cbRango, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPaneOpciones.addTab("Rango", jPanelDias);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Hasta");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("De");

        javax.swing.GroupLayout jPanelPeriodoLayout = new javax.swing.GroupLayout(jPanelPeriodo);
        jPanelPeriodo.setLayout(jPanelPeriodoLayout);
        jPanelPeriodoLayout.setHorizontalGroup(
            jPanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeriodoLayout.createSequentialGroup()
                .addGroup(jPanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPeriodoLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(jPanelPeriodoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dc_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPeriodoLayout.createSequentialGroup()
                        .addComponent(dc_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPeriodoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(65, 65, 65))))
        );
        jPanelPeriodoLayout.setVerticalGroup(
            jPanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPeriodoLayout.createSequentialGroup()
                .addGroup(jPanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dc_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dc_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTabbedPaneOpciones.addTab("Periodo", jPanelPeriodo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanelReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPaneOpciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        int index = jTabbedPaneOpciones.getSelectedIndex(); // 0-> Rango - 1-> Periodo

        if (index == 0) {
            this.setTitle("Cargando Reporte...");
            ReportePorRango();
            this.setTitle("Reportes");
        } else {
            this.setTitle("Cargando Reporte...");
            ReportePorPeriodo();
            this.setTitle("Reportes");
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    public void ReportePorRango() {
        int index = cbRango.getSelectedIndex();
        Rango rango = Rango.HOY;
        String tipo = "";
        String materia = "";

        reporte = new ControlReportes();
        JasperPrint print = null;

        for (Enumeration<AbstractButton> buttons = bgTipo.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                tipo = button.getText();
            }
        }

        for (Enumeration<AbstractButton> buttons = bgMateria.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                materia = button.getText();
            }
        }

        switch (index) {
            case 0:
                rango = Rango.HOY;
                break;
            case 1:
                rango = Rango.AYER;
                break;
            case 2:
                rango = Rango.UNA_SEMANA;
                break;
            case 3:
                rango = Rango.UN_MES;
                break;
        }

        if (materia.equals("Materia Prima")) {
            print = reporte.Get_ReporteMP_Rango(rango, tipo);
        } else {
            //TODO: Hacer productos
        }

        jPanelReporte.removeAll();
        jPanelReporte.setLayout(new BorderLayout());
        jPanelReporte.repaint();
        jPanelReporte.add(new JRViewer(print));

    }

    public void ReportePorPeriodo() {
        int index = cbRango.getSelectedIndex();
        String tipo = "";
        String materia = "";
        Date desde = null;
        Date hasta = null;

        reporte = new ControlReportes();
        JasperPrint print = null;

        for (Enumeration<AbstractButton> buttons = bgTipo.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                tipo = button.getText();
            }
        }

        for (Enumeration<AbstractButton> buttons = bgMateria.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                materia = button.getText();
            }
        }

        desde = dc_desde.getDate();
        hasta = dc_hasta.getDate();

        if (materia.equals("Materia Prima")) {
            print = reporte.Get_ReporteMP_Periodo(desde, hasta, tipo);
        } else {
            //TODO: Hacer productos
        }

        jPanelReporte.removeAll();
        jPanelReporte.setLayout(new BorderLayout());
        jPanelReporte.repaint();
        jPanelReporte.add(new JRViewer(print));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgMateria;
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbRango;
    private com.toedter.calendar.JDateChooser dc_desde;
    private com.toedter.calendar.JDateChooser dc_hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDias;
    private javax.swing.JPanel jPanelPeriodo;
    private javax.swing.JPanel jPanelReporte;
    private javax.swing.JTabbedPane jTabbedPaneOpciones;
    private javax.swing.JPanel panelMateria;
    private javax.swing.JPanel panelTipo;
    private javax.swing.JRadioButton rbEntradas;
    private javax.swing.JRadioButton rbMateriaPrima;
    private javax.swing.JRadioButton rbProducto;
    private javax.swing.JRadioButton rbSalidas;
    // End of variables declaration//GEN-END:variables
}
