/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalFrame;

/**
 *
 * @author nicol
 */
public class iFchatEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form iFchatEmpleado
     */
    public iFchatEmpleado() {
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

        jPanel1 = new javax.swing.JPanel();
        JPNotificaciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPnotiMensajes = new javax.swing.JPanel();
        jPenvio = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        JTMensaje = new javax.swing.JTextField();
        JPmensajes = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPNotificaciones.setBackground(new java.awt.Color(255, 255, 255));
        JPNotificaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        JPNotificaciones.setForeground(new java.awt.Color(153, 153, 153));
        JPNotificaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("Mensajes");
        JPNotificaciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        JPnotiMensajes.setBackground(new java.awt.Color(255, 255, 255));
        JPnotiMensajes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        JPNotificaciones.add(JPnotiMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, 450));

        jPanel1.add(JPNotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 240, 510));

        jPenvio.setBackground(new java.awt.Color(255, 255, 255));
        jPenvio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPenvio.setForeground(new java.awt.Color(153, 153, 153));
        jPenvio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/send.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setContentAreaFilled(false);
        jPenvio.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 50, 40));

        JTMensaje.setForeground(new java.awt.Color(153, 153, 153));
        JTMensaje.setText("Escribe un mensaje...");
        JTMensaje.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPenvio.add(JTMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 590, 40));

        jPanel1.add(jPenvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 720, 80));

        JPmensajes.setBackground(new java.awt.Color(255, 255, 255));
        JPmensajes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(JPmensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 480, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPNotificaciones;
    private javax.swing.JPanel JPmensajes;
    private javax.swing.JPanel JPnotiMensajes;
    private javax.swing.JTextField JTMensaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPenvio;
    // End of variables declaration//GEN-END:variables
}
