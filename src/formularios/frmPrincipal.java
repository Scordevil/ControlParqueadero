/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public  class frmPrincipal extends javax.swing.JFrame {

    public static int perfil_id;

    public static int getPerfil_id() {
        return perfil_id;
    }

    public static void setPerfil_id(int perfil_id) {
        frmPrincipal.perfil_id = perfil_id;
    }

    public frmPrincipal() {
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

        jMenu3 = new javax.swing.JMenu();
        dpnEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuArchivoParqueadero = new javax.swing.JMenuItem();
        mnuArchivoUsuarios = new javax.swing.JMenuItem();
        mnuArchivoTarifas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuArchivoClave = new javax.swing.JMenuItem();
        mnuArchivoCambioUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuArchivoSalir = new javax.swing.JMenuItem();
        mnuEntradaSalida = new javax.swing.JMenu();
        mnuEntradaSalidaGestion = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuEntradaSalidaReportes = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAyudaAcerca = new javax.swing.JMenuItem();
        mnuAyudaAyuda = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Control de Parqueadero");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dpnEscritorio.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnEscritorioLayout = new javax.swing.GroupLayout(dpnEscritorio);
        dpnEscritorio.setLayout(dpnEscritorioLayout);
        dpnEscritorioLayout.setHorizontalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        dpnEscritorioLayout.setVerticalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        mnuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Archivo.png"))); // NOI18N
        mnuArchivo.setText("Archivo");

        mnuArchivoParqueadero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/auto.png"))); // NOI18N
        mnuArchivoParqueadero.setText("Parqueadero");
        mnuArchivoParqueadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoParqueaderoActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoParqueadero);

        mnuArchivoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Usuario.png"))); // NOI18N
        mnuArchivoUsuarios.setText("Usuarios");
        mnuArchivoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoUsuariosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoUsuarios);

        mnuArchivoTarifas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tarifas.png"))); // NOI18N
        mnuArchivoTarifas.setText("Tarifas");
        mnuArchivoTarifas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoTarifasActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoTarifas);
        mnuArchivo.add(jSeparator1);

        mnuArchivoClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clave.png"))); // NOI18N
        mnuArchivoClave.setText("Cambio Clave");
        mnuArchivoClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoClaveActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoClave);

        mnuArchivoCambioUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CambioUsuario.png"))); // NOI18N
        mnuArchivoCambioUsuario.setText("Cambio Usuario");
        mnuArchivoCambioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCambioUsuarioActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoCambioUsuario);
        mnuArchivo.add(jSeparator2);

        mnuArchivoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salir.png"))); // NOI18N
        mnuArchivoSalir.setText("Salir");
        mnuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuArchivoSalir);

        jMenuBar1.add(mnuArchivo);

        mnuEntradaSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EntradaSalida.png"))); // NOI18N
        mnuEntradaSalida.setText("Entrada/Salida");

        mnuEntradaSalidaGestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gestion.png"))); // NOI18N
        mnuEntradaSalidaGestion.setText("Gestión Entrada");
        mnuEntradaSalidaGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEntradaSalidaGestionActionPerformed(evt);
            }
        });
        mnuEntradaSalida.add(mnuEntradaSalidaGestion);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Atras.png"))); // NOI18N
        jMenuItem1.setText("Gestión Salida");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuEntradaSalida.add(jMenuItem1);
        mnuEntradaSalida.add(jSeparator3);

        mnuEntradaSalidaReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reporte.png"))); // NOI18N
        mnuEntradaSalidaReportes.setText("Reportes");
        mnuEntradaSalidaReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEntradaSalidaReportesActionPerformed(evt);
            }
        });
        mnuEntradaSalida.add(mnuEntradaSalidaReportes);

        jMenuBar1.add(mnuEntradaSalida);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ayuda.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");

        mnuAyudaAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buscar.png"))); // NOI18N
        mnuAyudaAcerca.setText("Acerca de:");
        mnuAyuda.add(mnuAyudaAcerca);

        mnuAyudaAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ayuda3.png"))); // NOI18N
        mnuAyudaAyuda.setText("Ayuda");
        mnuAyuda.add(mnuAyudaAyuda);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArchivoParqueaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoParqueaderoActionPerformed
        frmParqueadero parqueadero = new frmParqueadero();
        dpnEscritorio.add(parqueadero);
        parqueadero.show();
    }//GEN-LAST:event_mnuArchivoParqueaderoActionPerformed

    private void mnuEntradaSalidaGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEntradaSalidaGestionActionPerformed
        frmGestion gestion = new frmGestion();
        dpnEscritorio.add(gestion);
        gestion.show();
    }//GEN-LAST:event_mnuEntradaSalidaGestionActionPerformed

    private void mnuArchivoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoUsuariosActionPerformed
        frmUsuarios misUsuarios = new frmUsuarios();
        dpnEscritorio.add(misUsuarios);
        misUsuarios.show();
    }//GEN-LAST:event_mnuArchivoUsuariosActionPerformed

    private void mnuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuArchivoSalirActionPerformed

    private void mnuArchivoTarifasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoTarifasActionPerformed
        frmTarifas tarifas = new frmTarifas();
        dpnEscritorio.add(tarifas);
        tarifas.show();
    }//GEN-LAST:event_mnuArchivoTarifasActionPerformed

    private void mnuArchivoClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoClaveActionPerformed
        frmCambioClave cambioClave = new frmCambioClave();
        dpnEscritorio.add(cambioClave);
        cambioClave.show();
    }//GEN-LAST:event_mnuArchivoClaveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (perfil_id == 2) {
            mnuArchivoParqueadero.setVisible(false);
            mnuArchivoTarifas.setVisible(false);
            mnuArchivoUsuarios.setVisible(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmGestionSalida gestionS = new frmGestionSalida();
        dpnEscritorio.add(gestionS);
        gestionS.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuArchivoCambioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCambioUsuarioActionPerformed
        frmCambioUsuario cambioUsuario = new frmCambioUsuario(this);
        dpnEscritorio.add(cambioUsuario);
        cambioUsuario.show();
    }//GEN-LAST:event_mnuArchivoCambioUsuarioActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void mnuEntradaSalidaReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEntradaSalidaReportesActionPerformed
        frmReporteDeRegistros registro = new frmReporteDeRegistros();
        dpnEscritorio.add(registro);
        registro.show();
    }//GEN-LAST:event_mnuEntradaSalidaReportesActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
    
    public  void setHide(){
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane dpnEscritorio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuArchivoCambioUsuario;
    private javax.swing.JMenuItem mnuArchivoClave;
    private javax.swing.JMenuItem mnuArchivoParqueadero;
    private javax.swing.JMenuItem mnuArchivoSalir;
    private javax.swing.JMenuItem mnuArchivoTarifas;
    private javax.swing.JMenuItem mnuArchivoUsuarios;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuAyudaAcerca;
    private javax.swing.JMenuItem mnuAyudaAyuda;
    private javax.swing.JMenu mnuEntradaSalida;
    private javax.swing.JMenuItem mnuEntradaSalidaGestion;
    private javax.swing.JMenuItem mnuEntradaSalidaReportes;
    // End of variables declaration//GEN-END:variables
}