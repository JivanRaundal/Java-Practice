
package mypackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class depositFrame extends javax.swing.JFrame
{
    Connection con = null; 
    Statement st = null;
    ResultSet rs = null;
    int oldBalance;
    userFrame parent;
    
    public depositFrame(userFrame frame)
    {
        initComponents();
        parent = frame;
        CommonFunctions.addDateTime(lblDate);
        CommonFunctions.addLabelBackground(lblClearIcon, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\BankManagement\\src\\main\\java\\images\\clear.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        subPanel = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblmsg = new javax.swing.JLabel();
        lblmsg1 = new javax.swing.JLabel();
        lblDeposit = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnDeposit = new javax.swing.JButton();
        lblClearIcon = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        subPanel2 = new javax.swing.JPanel();

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

        lblDate.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblmsg.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        lblmsg.setForeground(new java.awt.Color(255, 255, 255));
        lblmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg.setText("STATE BANK OF INDIA");

        lblmsg1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblmsg1.setForeground(new java.awt.Color(255, 255, 255));
        lblmsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg1.setText("Branch - Pune");

        javax.swing.GroupLayout subPanelLayout = new javax.swing.GroupLayout(subPanel);
        subPanel.setLayout(subPanelLayout);
        subPanelLayout.setHorizontalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblmsg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmsg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblClose)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        subPanelLayout.setVerticalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(subPanelLayout.createSequentialGroup()
                        .addComponent(lblClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        lblDeposit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblDeposit.setForeground(new java.awt.Color(51, 102, 255));
        lblDeposit.setText("DEPOSIT");

        lblAmount.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(51, 102, 255));
        lblAmount.setText("AMOUNT:");

        txtAmount.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(255, 51, 51));
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtAmountKeyTyped(evt);
            }
        });

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

        lblClearIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClearIcon.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblClearIconMouseClicked(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblBack.setForeground(new java.awt.Color(51, 102, 255));
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

        subPanel2.setBackground(new java.awt.Color(51, 102, 255));
        subPanel2.setPreferredSize(new java.awt.Dimension(0, 15));

        javax.swing.GroupLayout subPanel2Layout = new javax.swing.GroupLayout(subPanel2);
        subPanel2.setLayout(subPanel2Layout);
        subPanel2Layout.setHorizontalGroup(
            subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        subPanel2Layout.setVerticalGroup(
            subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addGap(195, 195, 195))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(lblDeposit))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblAmount)
                        .addGap(18, 18, 18)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblClearIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addComponent(subPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnDeposit)
                        .addGap(18, 18, 18)
                        .addComponent(lblBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblClearIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120)))
                .addComponent(subPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void lblClearIconMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblClearIconMouseClicked
    {//GEN-HEADEREND:event_lblClearIconMouseClicked
        txtAmount.setText("");
    }//GEN-LAST:event_lblClearIconMouseClicked

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDepositActionPerformed
    {//GEN-HEADEREND:event_btnDepositActionPerformed
        if(txtAmount.getText().isEmpty() || txtAmount.getText().equals("0"))
        {
            JOptionPane.showMessageDialog(null, "Enter Amount to be deposited");
        }
        else
        {
            try
            {
                String Query = "select * from customertb where account = " + parent.AccountNo;
                con = CommonFunctions.getConnection();
                st = con.createStatement();
                rs = st.executeQuery(Query);
                if(rs.next())
                {
                   oldBalance = rs.getInt("balance");
                }
                con.close();
                
                con = CommonFunctions.getConnection();
                int newBalance = oldBalance + Integer.parseInt(txtAmount.getText());
                Statement st2 = con.createStatement();
                String query = "UPDATE customertb set balance="+newBalance+" where account="+parent.AccountNo;
                st2.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Amount Deposited Successfully");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        txtAmount.setText("");
    }//GEN-LAST:event_btnDepositActionPerformed

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtAmountKeyTyped
    {//GEN-HEADEREND:event_txtAmountKeyTyped
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtAmountKeyTyped

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblBackMouseClicked
    {//GEN-HEADEREND:event_lblBackMouseClicked
        CommonFunctions.stopThread();
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

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
            java.util.logging.Logger.getLogger(depositFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(depositFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(depositFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(depositFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                //new depositFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblClearIcon;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDeposit;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JLabel lblmsg1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel subPanel;
    private javax.swing.JPanel subPanel2;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
