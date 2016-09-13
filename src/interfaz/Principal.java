/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.DenominadorCeroException;
import clases.NumeroMixto;
import javax.swing.JOptionPane;

/**
 *
 * @author Herrera
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        jLabel1 = new javax.swing.JLabel();
        txtNumerador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtDenominador1 = new javax.swing.JTextField();
        txtEntero1 = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox<>();
        txtEntero2 = new javax.swing.JTextField();
        txtNumerador2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtDenominador2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtEntero3 = new javax.swing.JTextField();
        txtNumerador3 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtDenominador3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        cmdFraccionario = new javax.swing.JButton();
        txtNumerador4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtDenominador4 = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("JasmineUPC", 3, 36)); // NOI18N
        jLabel1.setText("NÚMEROS MIXTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        getContentPane().add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 70, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 100, -1));

        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        getContentPane().add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 70, -1));

        txtEntero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntero1KeyTyped(evt);
            }
        });
        getContentPane().add(txtEntero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        getContentPane().add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        txtEntero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntero2KeyTyped(evt);
            }
        });
        getContentPane().add(txtEntero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 60, -1));

        txtNumerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador2KeyTyped(evt);
            }
        });
        getContentPane().add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 60, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 90, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 100, -1));

        txtDenominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador2KeyTyped(evt);
            }
        });
        getContentPane().add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 60, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEntero3.setEditable(false);
        jPanel3.add(txtEntero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, -1));

        txtNumerador3.setEditable(false);
        jPanel3.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, -1));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 10));

        txtDenominador3.setEditable(false);
        jPanel3.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 80, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 120));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Fracción"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Fraccionario");
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        cmdFraccionario.setText("Fraccionario");
        cmdFraccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFraccionarioActionPerformed(evt);
            }
        });
        jPanel4.add(cmdFraccionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtNumerador4.setEditable(false);
        jPanel4.add(txtNumerador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 60, -1));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 110, 10));

        txtDenominador4.setEditable(false);
        jPanel4.add(txtDenominador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 60, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 280, 110));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 110, 30));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 110, 30));

        setSize(new java.awt.Dimension(671, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        
          if (txtEntero1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el entero de la primera fracción", "error", JOptionPane.ERROR_MESSAGE);
            txtEntero1.requestFocusInWindow();
            txtEntero1.selectAll();
            
          } else if (txtEntero2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el entero de la segunda fracción", "error", JOptionPane.ERROR_MESSAGE);
            txtEntero2.requestFocusInWindow();
            txtEntero2.selectAll();
            
            
        } else if (txtNumerador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el primer numerador", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
            txtNumerador1.selectAll();
            
         
        } else if (txtNumerador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el segundo numerador", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNumerador2.requestFocusInWindow();
            txtNumerador2.selectAll();
            
            
        } else if (txtDenominador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el primer denominador", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
            txtDenominador1.selectAll();
            
            
        } else if (txtDenominador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el segundo denominador", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDenominador2.requestFocusInWindow();
            txtDenominador2.selectAll();
            
        } 
            
            
        else {

            int op, e1,e2,n1,n2,d1,d2;
            NumeroMixto f1, f2, f3 = null;
            op = cmbOperacion.getSelectedIndex();
            n1 = Integer.parseInt(txtNumerador1.getText());
            n2 = Integer.parseInt(txtNumerador2.getText());
            d1 = Integer.parseInt(txtDenominador1.getText());
            d2 = Integer.parseInt(txtDenominador2.getText());
            e1 = Integer.parseInt(txtEntero1.getText());
            e2 = Integer.parseInt(txtEntero2.getText());
            try {
                f1 = new NumeroMixto(e1,n1,d1);
                f2 = new NumeroMixto(e2,n2,d2);
                switch (op) {
                    case 0:
                        f3 = f1.sumar(f2);

                        break;
                    case 1:
                        f3 = f1.restar(f2);

                        break;
                    case 2:
                        f3 = f1.multiplicar(f2);

                        break;
                    case 3:
                        f3 = f1.dividir(f2);
                        break;

                }
                txtNumerador3.setText("" + f3.getNumerador());
                txtDenominador3.setText("" + f3.getDenominador());
                txtEntero3.setText("" + f3.getEntero());
                
            } catch (DenominadorCeroException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
       
        txtEntero1.setText("");
        txtEntero2.setText("");
        txtEntero3.setText("");
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtNumerador4.setText("");
        
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtDenominador4.setText("");
        
        
        
        txtEntero1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtEntero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntero1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEntero1KeyTyped

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
         char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
         char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador1KeyTyped

    private void txtEntero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntero2KeyTyped
         char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEntero2KeyTyped

    private void txtNumerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador2KeyTyped

    private void txtDenominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador2KeyTyped

    private void cmdFraccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFraccionarioActionPerformed
         
        
        String  num, den;
        int num3, den3, c1,ente3, nm, dn;
      
        if (txtEntero3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe adquirir el resultado", "error", JOptionPane.ERROR_MESSAGE);
            txtEntero1.requestFocusInWindow();
            txtEntero1.selectAll();
        } 
          else if (txtNumerador3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe adquirise el resultado de la operación realizada", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtEntero1.requestFocusInWindow();
            txtEntero1.selectAll();
        }
          else if (txtDenominador3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe adquirise el resultado de la operación realizada", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtEntero3.requestFocusInWindow();
            txtEntero3.selectAll();
        }
                 else {

            

        num3 = Integer.parseInt(txtNumerador3.getText());
        den3 = Integer.parseInt(txtDenominador3.getText());
        ente3 = Integer.parseInt(txtEntero3.getText());
        nm=(den3*ente3)+num3;
        dn= den3;
        num = String.valueOf(nm);
        txtNumerador4.setText(num);
        den = String.valueOf(dn);
        txtDenominador4.setText(den);
}
    }//GEN-LAST:event_cmdFraccionarioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdFraccionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtDenominador4;
    private javax.swing.JTextField txtEntero1;
    private javax.swing.JTextField txtEntero2;
    private javax.swing.JTextField txtEntero3;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumerador4;
    // End of variables declaration//GEN-END:variables
}
