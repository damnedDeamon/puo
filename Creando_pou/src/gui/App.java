/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.List;
import model.Comida;
import model.Energia;
import model.Entretencion;
import model.HiloComida;
import model.Salud;

public class App extends javax.swing.JFrame {
    
    private List<Comida> listacomida;
    private List<Salud> listaSalud;
    private List<Entretencion> listaEntretencion;
    private List<Energia> listaEnergia;
    
    public App() {
        initComponents();
        setLocationRelativeTo(null);
        comida();
        Thread hiloCom = new HiloComida(jpbComida);
        hiloCom.start();
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jpbComida = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jpbSalud = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jpbDiversion = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jpbEnergia = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        cboComida = new javax.swing.JComboBox();
        cboSalud = new javax.swing.JComboBox<>();
        cboJuego = new javax.swing.JComboBox<>();
        cboEnergia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/comida.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jpbComida.setValue(100);
        getContentPane().add(jpbComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 90, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salud.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jpbSalud.setValue(100);
        getContentPane().add(jpbSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 11, 90, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/diversion.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jpbDiversion.setValue(100);
        getContentPane().add(jpbDiversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 100, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/energia.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jpbEnergia.setValue(100);
        getContentPane().add(jpbEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 11, 100, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/perro-dudoso.gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 110, 120));

        getContentPane().add(cboComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 90, -1));

        getContentPane().add(cboSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 90, -1));

        getContentPane().add(cboJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 90, -1));

        getContentPane().add(cboEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboComida;
    private javax.swing.JComboBox<String> cboEnergia;
    private javax.swing.JComboBox<String> cboJuego;
    private javax.swing.JComboBox<String> cboSalud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jpbComida;
    private javax.swing.JProgressBar jpbDiversion;
    private javax.swing.JProgressBar jpbEnergia;
    private javax.swing.JProgressBar jpbSalud;
    // End of variables declaration//GEN-END:variables

    private void comida(){
        listacomida = new ArrayList<>();
        
        listacomida.add(new Comida(1, "Frutilla"));
        listacomida.add(new Comida(2, "Mandarina"));
        listacomida.add(new Comida(3, "Naranja"));
        listacomida.add(new Comida(4, "Limon"));
        listacomida.add(new Comida(5, "Fresa"));
        listacomida.add(new Comida(5, "Melón"));
        
        for (Comida com : listacomida) {
            cboComida.addItem(com);
        }
    }
    private void energia(){
        listaEnergia = new ArrayList<>();
    }
    private void salud(){
        listaSalud = new ArrayList<>();
    }
    private void entretencion(){
        listaEntretencion = new ArrayList<>();
    }
}
