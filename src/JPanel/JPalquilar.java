/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPanel;

/**
 *
 * @author nicol
 */
public class JPalquilar extends javax.swing.JPanel {

    /**
     * Creates new form JPalquilar
     */
    public JPalquilar() {
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

        jPalquiladas = new javax.swing.JPanel();
        jPcliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPalquiladas.setBackground(new java.awt.Color(255, 255, 255));
        jPalquiladas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alquiler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPalquiladas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPalquiladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 330, 120));

        jPcliente.setBackground(new java.awt.Color(255, 255, 255));
        jPcliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 0, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPcliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Categoria");
        jPcliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Terror", "Comedia", "Drama", "Infantil", " " }));
        jPcliente.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 160, 20));

        jTextField1.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPcliente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 160, -1));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Cédula:");
        jPcliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextField2.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPcliente.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 210, -1));

        jButton1.setText("+");
        jPcliente.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 20, -1));

        jButton2.setText("jButton1");
        jPcliente.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 20, -1));

        add(jPcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 330, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPalquiladas;
    private javax.swing.JPanel jPcliente;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
