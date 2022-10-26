
package mypackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class userFrame extends javax.swing.JFrame
{

    public int AccountNo;
    String name;
    Connection con  = null;
    Statement st = null;
    ResultSet rs = null;
    Login parent;
    
    public userFrame()
    {
        lblName.setText("Name : "+name);
        lblAccountNo.setText("Account Number : "+AccountNo);
        
        initComponents(); 
        CommonFunctions.addLabelBackground(lblimg, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\BankManagement\\src\\main\\java\\images\\bank2.png");
        CommonFunctions.addDateTime(lblDate);
    }
    
    public userFrame(Login frame)
    {
        initComponents(); 
        parent = frame;
        AccountNo = Integer.parseInt(parent.txtuname.getText());
        
        try
        {
             con = CommonFunctions.getConnection();
             st = con.createStatement();
             rs = st.executeQuery("select * from customertb where account = "+AccountNo);
             if(rs.next())
             {
                 name = rs.getString("name");
             }
             lblName.setText("Name : "+name);
             lblAccountNo.setText("Account Number : "+AccountNo);
             
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        CommonFunctions.addLabelBackground(lblimg, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\BankManagement\\src\\main\\java\\images\\bank2.png");
        CommonFunctions.addDateTime(lblDate);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        subPanel = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblmsg = new javax.swing.JLabel();
        lblmsg1 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAccountNo = new javax.swing.JLabel();
        btnDeposit = new javax.swing.JButton();
        btnCards = new javax.swing.JButton();
        btnMyProfile = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        btnBalance = new javax.swing.JButton();
        btnChangeProfile = new javax.swing.JButton();
        lblmsg2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        subPanel.setBackground(new java.awt.Color(51, 102, 255));

        lblClose.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblCloseMouseClicked(evt);
            }
        });

        lblmsg.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        lblmsg.setForeground(new java.awt.Color(255, 255, 255));
        lblmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg.setText("STATE BANK OF INDIA");

        lblmsg1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblmsg1.setForeground(new java.awt.Color(255, 255, 255));
        lblmsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg1.setText("Branch - Pune");

        lblDate.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout subPanelLayout = new javax.swing.GroupLayout(subPanel);
        subPanel.setLayout(subPanelLayout);
        subPanelLayout.setHorizontalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblmsg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(lblClose))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        subPanelLayout.setVerticalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClose))
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        lblName.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name : XYZ");

        lblAccountNo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblAccountNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccountNo.setText("Account Number : XXXXXX");

        btnDeposit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(51, 102, 255));
        btnDeposit.setText("DEPOSIT");
        btnDeposit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeposit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDepositActionPerformed(evt);
            }
        });

        btnCards.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCards.setForeground(new java.awt.Color(51, 102, 255));
        btnCards.setText("MY ACCOUNT");
        btnCards.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCards.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCardsActionPerformed(evt);
            }
        });

        btnMyProfile.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnMyProfile.setForeground(new java.awt.Color(51, 102, 255));
        btnMyProfile.setText("MY PROFILE");
        btnMyProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMyProfile.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMyProfileActionPerformed(evt);
            }
        });

        btnWithdraw.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(51, 102, 255));
        btnWithdraw.setText("WITHDRAW");
        btnWithdraw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWithdraw.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnBalance.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnBalance.setForeground(new java.awt.Color(51, 102, 255));
        btnBalance.setText("BALANCE");
        btnBalance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBalance.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBalanceActionPerformed(evt);
            }
        });

        btnChangeProfile.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnChangeProfile.setForeground(new java.awt.Color(51, 102, 255));
        btnChangeProfile.setText("EDIT PROFILE");
        btnChangeProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangeProfile.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnChangeProfileActionPerformed(evt);
            }
        });

        lblmsg2.setFont(new java.awt.Font("Century Gothic", 3, 20)); // NOI18N
        lblmsg2.setForeground(new java.awt.Color(255, 51, 51));
        lblmsg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg2.setText("LOGOUT");
        lblmsg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmsg2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblmsg2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCards, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAccountNo, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(lblmsg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCards, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChangeProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(lblmsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblCloseMouseClicked
    {//GEN-HEADEREND:event_lblCloseMouseClicked
        // TODO add your handling code here:
        CommonFunctions.stopThread();
        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDepositActionPerformed
    {//GEN-HEADEREND:event_btnDepositActionPerformed
        CommonFunctions.stopThread();
        new depositFrame(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnWithdrawActionPerformed
    {//GEN-HEADEREND:event_btnWithdrawActionPerformed
        CommonFunctions.stopThread();
        new WithdrawFrame(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnBalanceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBalanceActionPerformed
    {//GEN-HEADEREND:event_btnBalanceActionPerformed
        CommonFunctions.stopThread();
        new BalanceFrame(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBalanceActionPerformed

    private void btnCardsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCardsActionPerformed
    {//GEN-HEADEREND:event_btnCardsActionPerformed
        CommonFunctions.stopThread();
        new CardsFrame(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCardsActionPerformed

    private void btnMyProfileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMyProfileActionPerformed
    {//GEN-HEADEREND:event_btnMyProfileActionPerformed
        CommonFunctions.stopThread();
        new MyprofileFrame(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMyProfileActionPerformed

    private void btnChangeProfileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnChangeProfileActionPerformed
    {//GEN-HEADEREND:event_btnChangeProfileActionPerformed
        CommonFunctions.stopThread();
        new EditProfileFrame(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnChangeProfileActionPerformed

    private void lblmsg2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblmsg2MouseClicked
    {//GEN-HEADEREND:event_lblmsg2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_lblmsg2MouseClicked


    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(userFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                //new userFrame(12345678).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalance;
    private javax.swing.JButton btnCards;
    private javax.swing.JButton btnChangeProfile;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnMyProfile;
    private javax.swing.JButton btnWithdraw;
    public javax.swing.JLabel lblAccountNo;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDate;
    public javax.swing.JLabel lblName;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JLabel lblmsg1;
    private javax.swing.JLabel lblmsg2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel subPanel;
    // End of variables declaration//GEN-END:variables
}
