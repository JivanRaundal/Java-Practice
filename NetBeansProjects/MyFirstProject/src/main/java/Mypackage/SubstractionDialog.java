/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Jivan
 */
public class SubstractionDialog extends javax.swing.JDialog
{

    /**
     * Creates new form SubstractionDialog
     */
    public SubstractionDialog(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        btnsub = new javax.swing.JButton();
        lblans = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 255, 204));
        mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));

        txtnum1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtnum1KeyTyped(evt);
            }
        });

        txtnum2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtnum2KeyTyped(evt);
            }
        });

        btnsub.setBackground(new java.awt.Color(255, 0, 0));
        btnsub.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnsub.setForeground(new java.awt.Color(255, 255, 0));
        btnsub.setText("SUB");
        btnsub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsub.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsubActionPerformed(evt);
            }
        });

        lblans.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblans.setText("ANSWER HERE");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblans, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnum1KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtnum1KeyTyped
    {//GEN-HEADEREND:event_txtnum1KeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtnum1KeyTyped

    private void txtnum2KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtnum2KeyTyped
    {//GEN-HEADEREND:event_txtnum2KeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtnum2KeyTyped

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsubActionPerformed
    {//GEN-HEADEREND:event_btnsubActionPerformed
        // TODO add your handling code here:
        String str1, str2;
        str1 = txtnum1.getText();
        str2 = txtnum2.getText();
        try
        {
            double x = Double.parseDouble(str1);
            double y = Double.parseDouble(str2);
            double ans = x - y;
            Double ansRoundOff = Math.round(ans*100.0)/100.0;      //To Round off ans upto 2 digits after decimal
            lblans.setText("SUBSTRACTION = " + ansRoundOff);
        }
        catch(NumberFormatException ne)
        {
            txtnum1.setText("");
            txtnum2.setText("");
            lblans.setText("ANSWER HERE");
            JOptionPane.showMessageDialog(btnsub, "Invalid Data", "ErrorMessage", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsubActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(SubstractionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SubstractionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SubstractionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SubstractionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                SubstractionDialog dialog = new SubstractionDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsub;
    private javax.swing.JLabel lblans;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables
}
