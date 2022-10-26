
package mypackage;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class EditProfileFrame extends javax.swing.JFrame
{
    userFrame parent;
    
    public EditProfileFrame(userFrame frame)
    {
        parent = frame;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnPhonePanel = new javax.swing.JButton();
        btnEmailPanel = new javax.swing.JButton();
        btnPasswordPanel = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PhonePanel = new javax.swing.JPanel();
        lblmsg1 = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        btnPhoneUpdate = new javax.swing.JButton();
        EmailPanel = new javax.swing.JPanel();
        lblmsg2 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        btnEmailUpdate = new javax.swing.JButton();
        PasswordPanel = new javax.swing.JPanel();
        lblmsg3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnPasswordUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkStartColor(new java.awt.Color(102, 204, 255));

        btnPhonePanel.setBackground(new java.awt.Color(0, 0, 255));
        btnPhonePanel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPhonePanel.setForeground(new java.awt.Color(255, 255, 255));
        btnPhonePanel.setText("CHANGE PHONE NO.");
        btnPhonePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPhonePanel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPhonePanelActionPerformed(evt);
            }
        });

        btnEmailPanel.setBackground(new java.awt.Color(0, 0, 255));
        btnEmailPanel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEmailPanel.setForeground(new java.awt.Color(255, 255, 255));
        btnEmailPanel.setText("CHANGE EMAIL ID");
        btnEmailPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmailPanel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEmailPanelActionPerformed(evt);
            }
        });

        btnPasswordPanel.setBackground(new java.awt.Color(0, 0, 255));
        btnPasswordPanel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPasswordPanel.setForeground(new java.awt.Color(255, 255, 255));
        btnPasswordPanel.setText("CHANGE PASSWORD");
        btnPasswordPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasswordPanel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPasswordPanelActionPerformed(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("Back");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPhonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnPhonePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(lblBack)
                .addGap(23, 23, 23))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PhonePanel.setBackground(new java.awt.Color(153, 204, 255));

        lblmsg1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblmsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg1.setText("Enter new Phone Number :");

        txtPhoneNo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtPhoneNo.setForeground(new java.awt.Color(255, 0, 51));
        txtPhoneNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhoneNo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtPhoneNoKeyTyped(evt);
            }
        });

        btnPhoneUpdate.setBackground(new java.awt.Color(51, 102, 255));
        btnPhoneUpdate.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPhoneUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnPhoneUpdate.setText("UPDATE");
        btnPhoneUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPhoneUpdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPhoneUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PhonePanelLayout = new javax.swing.GroupLayout(PhonePanel);
        PhonePanel.setLayout(PhonePanelLayout);
        PhonePanelLayout.setHorizontalGroup(
            PhonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhonePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PhonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhonePanelLayout.createSequentialGroup()
                        .addComponent(lblmsg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhonePanelLayout.createSequentialGroup()
                        .addGap(0, 95, Short.MAX_VALUE)
                        .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PhonePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPhoneUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        PhonePanelLayout.setVerticalGroup(
            PhonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhonePanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblmsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnPhoneUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", PhonePanel);

        EmailPanel.setBackground(new java.awt.Color(0, 204, 204));

        lblmsg2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblmsg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg2.setText("Enter new Email ID :");

        txtEmailID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtEmailID.setForeground(new java.awt.Color(255, 0, 51));
        txtEmailID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnEmailUpdate.setBackground(new java.awt.Color(51, 102, 255));
        btnEmailUpdate.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEmailUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnEmailUpdate.setText("UPDATE");
        btnEmailUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmailUpdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEmailUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmailPanelLayout = new javax.swing.GroupLayout(EmailPanel);
        EmailPanel.setLayout(EmailPanelLayout);
        EmailPanelLayout.setHorizontalGroup(
            EmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmailPanelLayout.createSequentialGroup()
                        .addComponent(lblmsg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmailPanelLayout.createSequentialGroup()
                        .addGap(0, 95, Short.MAX_VALUE)
                        .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmailPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmailUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        EmailPanelLayout.setVerticalGroup(
            EmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmailPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblmsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnEmailUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", EmailPanel);

        PasswordPanel.setBackground(new java.awt.Color(204, 204, 255));

        lblmsg3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblmsg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg3.setText("Enter new Password :");

        txtPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 0, 51));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnPasswordUpdate.setBackground(new java.awt.Color(51, 102, 255));
        btnPasswordUpdate.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPasswordUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnPasswordUpdate.setText("UPDATE");
        btnPasswordUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPasswordUpdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPasswordUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PasswordPanelLayout = new javax.swing.GroupLayout(PasswordPanel);
        PasswordPanel.setLayout(PasswordPanelLayout);
        PasswordPanelLayout.setHorizontalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout.createSequentialGroup()
                        .addComponent(lblmsg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout.createSequentialGroup()
                        .addGap(0, 95, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPasswordUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        PasswordPanelLayout.setVerticalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblmsg3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnPasswordUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", PasswordPanel);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -30, 440, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblBackMouseClicked
    {//GEN-HEADEREND:event_lblBackMouseClicked
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnPhonePanelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPhonePanelActionPerformed
    {//GEN-HEADEREND:event_btnPhonePanelActionPerformed
        //jTabbedPane1.setSelectedIndex(0);
        jTabbedPane1.setSelectedComponent(PhonePanel);
    }//GEN-LAST:event_btnPhonePanelActionPerformed

    private void btnEmailPanelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEmailPanelActionPerformed
    {//GEN-HEADEREND:event_btnEmailPanelActionPerformed
        //jTabbedPane1.setSelectedIndex(1);
        jTabbedPane1.setSelectedComponent(EmailPanel);
    }//GEN-LAST:event_btnEmailPanelActionPerformed

    private void btnPasswordPanelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPasswordPanelActionPerformed
    {//GEN-HEADEREND:event_btnPasswordPanelActionPerformed
        //jTabbedPane1.setSelectedIndex(2);
        jTabbedPane1.setSelectedComponent(PasswordPanel);
    }//GEN-LAST:event_btnPasswordPanelActionPerformed

    private void txtPhoneNoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtPhoneNoKeyTyped
    {//GEN-HEADEREND:event_txtPhoneNoKeyTyped
        CommonFunctions.integerValidation(evt);
    }//GEN-LAST:event_txtPhoneNoKeyTyped

    private void btnPhoneUpdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPhoneUpdateActionPerformed
    {//GEN-HEADEREND:event_btnPhoneUpdateActionPerformed
        if(txtPhoneNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter Phone Number");
        }
        else
        {
            try
            {
                Connection con = CommonFunctions.getConnection();
                Statement st = con.createStatement();
                st.executeUpdate("UPDATE customertb set phone='"+txtPhoneNo.getText()+"' where account="+parent.AccountNo);
                
                JOptionPane.showMessageDialog(null, "Phone no. updated successfully!");
                con.close();  
            } 
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        txtPhoneNo.setText("");
    }//GEN-LAST:event_btnPhoneUpdateActionPerformed

    private void btnEmailUpdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEmailUpdateActionPerformed
    {//GEN-HEADEREND:event_btnEmailUpdateActionPerformed
        if(txtEmailID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter Email ID");
        }
        else
        {
            try
            {
                Connection con2 = CommonFunctions.getConnection();
                Statement st2 = con2.createStatement();
                st2.executeUpdate("UPDATE customertb set email='"+txtEmailID.getText()+"' where account="+parent.AccountNo);
                
                JOptionPane.showMessageDialog(null, "Email ID updated successfully!");
                con2.close();
            } 
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        txtEmailID.setText("");
    }//GEN-LAST:event_btnEmailUpdateActionPerformed

    private void btnPasswordUpdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPasswordUpdateActionPerformed
    {//GEN-HEADEREND:event_btnPasswordUpdateActionPerformed
        if(txtPassword.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter Password");
        }
        else
        {
            try
            {
                Connection con3 = CommonFunctions.getConnection();
                Statement st3 = con3.createStatement();
                st3.executeUpdate("UPDATE customertb set pass='"+txtPassword.getText()+"' where account="+parent.AccountNo);
                
                JOptionPane.showMessageDialog(null, "Password updated successfully!");
                con3.close();
            } 
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        txtPassword.setText("");
    }//GEN-LAST:event_btnPasswordUpdateActionPerformed


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
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                //new EditProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmailPanel;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JPanel PhonePanel;
    private javax.swing.JButton btnEmailPanel;
    private javax.swing.JButton btnEmailUpdate;
    private javax.swing.JButton btnPasswordPanel;
    private javax.swing.JButton btnPasswordUpdate;
    private javax.swing.JButton btnPhonePanel;
    private javax.swing.JButton btnPhoneUpdate;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblmsg1;
    private javax.swing.JLabel lblmsg2;
    private javax.swing.JLabel lblmsg3;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}
