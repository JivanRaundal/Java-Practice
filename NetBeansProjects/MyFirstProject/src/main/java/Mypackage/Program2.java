
package Mypackage;


public class Program2 extends javax.swing.JFrame
{

    public Program2()
    {
        initComponents();
        
        //connections
        /*MyKeyListener2 mkl = new MyKeyListener2();
        txtname1.addKeyListener(mkl);
        txtname2.addKeyListener(mkl); */    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        txtnumber = new javax.swing.JTextField();
        txtname1 = new javax.swing.JTextField();
        txtname2 = new javax.swing.JTextField();
        btnclick = new javax.swing.JButton();
        btnpress = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(204, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 204, 255)));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtnumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtnumber.setToolTipText("");
        txtnumber.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtnumberKeyTyped(evt);
            }
        });

        txtname1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtname1.setToolTipText("");
        txtname1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtname1KeyTyped(evt);
            }
        });

        txtname2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtname2.setToolTipText("");
        txtname2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtname2KeyTyped(evt);
            }
        });

        btnclick.setBackground(new java.awt.Color(255, 0, 51));
        btnclick.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnclick.setForeground(new java.awt.Color(255, 255, 0));
        btnclick.setText("CLICK");
        btnclick.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 0, 0), null, null));
        btnclick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclick.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnclickActionPerformed(evt);
            }
        });

        btnpress.setBackground(new java.awt.Color(255, 0, 51));
        btnpress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnpress.setForeground(new java.awt.Color(255, 255, 0));
        btnpress.setText("PRESS");
        btnpress.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 51), null));
        btnpress.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpress.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnpressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnclick, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnpress, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclick, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnclickActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnclickActionPerformed
    {//GEN-HEADEREND:event_btnclickActionPerformed
        // TODO add your handling code here:
        txtname1.setText("Button Clicked");
    }//GEN-LAST:event_btnclickActionPerformed

    private void btnpressActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnpressActionPerformed
    {//GEN-HEADEREND:event_btnpressActionPerformed
        // TODO add your handling code here:
        txtname1.setText("Button Pressed");
    }//GEN-LAST:event_btnpressActionPerformed

    private void txtname1KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtname1KeyTyped
    {//GEN-HEADEREND:event_txtname1KeyTyped
        // TODO add your handling code here:
        CommonFunctions.alphabetValidation(evt);
    }//GEN-LAST:event_txtname1KeyTyped

    private void txtname2KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtname2KeyTyped
    {//GEN-HEADEREND:event_txtname2KeyTyped
        // TODO add your handling code here:
        CommonFunctions.alphabetValidation(evt);
    }//GEN-LAST:event_txtname2KeyTyped

    private void txtnumberKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtnumberKeyTyped
    {//GEN-HEADEREND:event_txtnumberKeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtnumberKeyTyped


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
            java.util.logging.Logger.getLogger(Program2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Program2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Program2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Program2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Program2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnclick;
    public javax.swing.JButton btnpress;
    private javax.swing.JPanel mainPanel;
    public javax.swing.JTextField txtname1;
    public javax.swing.JTextField txtname2;
    public javax.swing.JTextField txtnumber;
    // End of variables declaration//GEN-END:variables
}

/*
class MyKeyListener2 extends KeyAdapter
{
    public void keyTyped(KeyEvent e)
    {
        char ch = e.getKeyChar();
        
        if(Character.isAlphabetic(ch))
        {
            
        }
        else
        {
            e.consume();
        }
    }
} */