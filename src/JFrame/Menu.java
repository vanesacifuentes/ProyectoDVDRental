/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import AppPackage.AnimationClass;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        Shape form = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27);
        AWTUtilities.setWindowShape(this, form);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlCerrar = new javax.swing.JLabel();
        JLMinimizar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Bdevolucion = new javax.swing.JButton();
        Bmensajes = new javax.swing.JButton();
        BInventario = new javax.swing.JButton();
        jLInventario = new javax.swing.JLabel();
        jLAlquilar1 = new javax.swing.JLabel();
        jLDevolver = new javax.swing.JLabel();
        jLChat = new javax.swing.JLabel();
        Bdevolucion1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JlCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        JlCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(JlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 10, 30, -1));

        JLMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        JLMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(JLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 10, 40, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("Menú");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 110, -1));

        Bdevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pelicula (1).png"))); // NOI18N
        Bdevolucion.setBorder(null);
        Bdevolucion.setContentAreaFilled(false);
        Bdevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BdevolucionMouseClicked(evt);
            }
        });
        jPanel1.add(Bdevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 140, 140));

        Bmensajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chat3.png"))); // NOI18N
        Bmensajes.setBorder(null);
        Bmensajes.setContentAreaFilled(false);
        Bmensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BmensajesMouseClicked(evt);
            }
        });
        jPanel1.add(Bmensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 200, 140, 140));

        BInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario.png"))); // NOI18N
        BInventario.setBorder(null);
        BInventario.setContentAreaFilled(false);
        BInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BInventarioMouseClicked(evt);
            }
        });
        jPanel1.add(BInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 140, 140));

        jLInventario.setBackground(new java.awt.Color(238, 112, 82));
        jLInventario.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jLInventario.setForeground(new java.awt.Color(238, 112, 82));
        jLInventario.setText("Inventario");
        jPanel1.add(jLInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 80, -1));

        jLAlquilar1.setBackground(new java.awt.Color(238, 112, 82));
        jLAlquilar1.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jLAlquilar1.setForeground(new java.awt.Color(238, 112, 82));
        jLAlquilar1.setText("Alquilar");
        jPanel1.add(jLAlquilar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLDevolver.setBackground(new java.awt.Color(238, 112, 82));
        jLDevolver.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jLDevolver.setForeground(new java.awt.Color(238, 112, 82));
        jLDevolver.setText("Realizar devolución");
        jPanel1.add(jLDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 150, -1));

        jLChat.setBackground(new java.awt.Color(238, 112, 82));
        jLChat.setFont(new java.awt.Font("Decker", 0, 16)); // NOI18N
        jLChat.setForeground(new java.awt.Color(238, 112, 82));
        jLChat.setText("Chat");
        jPanel1.add(jLChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 350, 50, -1));

        Bdevolucion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Devolver1.png"))); // NOI18N
        Bdevolucion1.setBorder(null);
        Bdevolucion1.setContentAreaFilled(false);
        Bdevolucion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bdevolucion1MouseClicked(evt);
            }
        });
        jPanel1.add(Bdevolucion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 140, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JlCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea salir del login?","Exit",dialog);
        if(result == 0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_JlCerrarMouseClicked

    private void JLMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLMinimizarMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_JLMinimizarMouseClicked

    private void BmensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BmensajesMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        Chat llamado = new Chat();
        llamado.setVisible(true);
    }//GEN-LAST:event_BmensajesMouseClicked

    private void BdevolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BdevolucionMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        AlquilarPelicula llamado = new AlquilarPelicula();
        llamado.setVisible(true);
    }//GEN-LAST:event_BdevolucionMouseClicked

    private void BInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BInventarioMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        Inventario llamado = new Inventario();
        llamado.setVisible(true);
    }//GEN-LAST:event_BInventarioMouseClicked

    private void Bdevolucion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bdevolucion1MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        Devolucion llamado = new Devolucion();
        llamado.setVisible(true);
    }//GEN-LAST:event_Bdevolucion1MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BInventario;
    private javax.swing.JButton Bdevolucion;
    private javax.swing.JButton Bdevolucion1;
    private javax.swing.JButton Bmensajes;
    private javax.swing.JLabel JLMinimizar;
    private javax.swing.JLabel JlCerrar;
    private javax.swing.JLabel jLAlquilar1;
    private javax.swing.JLabel jLChat;
    private javax.swing.JLabel jLDevolver;
    private javax.swing.JLabel jLInventario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}