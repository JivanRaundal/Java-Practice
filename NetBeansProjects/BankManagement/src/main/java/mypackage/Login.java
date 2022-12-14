/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame
{

    /**
     * Creates new form FirstDesign
     */
    public Login()
    {
        initComponents();
        CommonFunctions.addLabelBackground(lblclose, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\BankManagement\\src\\main\\java\\images\\shutdown-icon.png");
        CommonFunctions.addLabelBackground(lblbankimage, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\BankManagement\\src\\main\\java\\images\\bank logo-icon.png");
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
        subpanel = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        txtuname = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        lbluname = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        cmbchoice = new javax.swing.JComboBox<>();
        lblrole = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblbankimage = new javax.swing.JLabel();
        lblbankname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jframe");
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(51, 102, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));

        subpanel.setBackground(new java.awt.Color(153, 204, 255));
        subpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Castellar", 1, 16))); // NOI18N
        subpanel.setForeground(new java.awt.Color(255, 51, 51));

        btnlogin.setBackground(new java.awt.Color(255, 51, 0));
        btnlogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnloginActionPerformed(evt);
            }
        });

        txtuname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbluname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbluname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluname.setText("Username:");

        lblpass.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblpass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpass.setText("Password:");

        cmbchoice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbchoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Customer" }));

        lblrole.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblrole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrole.setText("Select Role:");

        javax.swing.GroupLayout subpanelLayout = new javax.swing.GroupLayout(subpanel);
        subpanel.setLayout(subpanelLayout);
        subpanelLayout.setHorizontalGroup(
            subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbluname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtuname, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(txtpass))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblrole, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbchoice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(subpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        subpanelLayout.setVerticalGroup(
            subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbchoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrole, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(subpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });

        lblbankname.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        lblbankname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbankname.setText("SBI BANK");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblbankname, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblbankimage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addComponent(subpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblbankname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lblbankimage, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(subpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        // TODO add your handling code here:
        CommonFunction.exitApp(this);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnloginActionPerformed
    {//GEN-HEADEREND:event_btnloginActionPerformed
        // TODO add your handling code here:
        if(cmbchoice.getSelectedItem().equals("Select"))
        {
            JOptionPane.showMessageDialog(this,"Please Select a Role");
        }
        if(cmbchoice.getSelectedItem().equals("Admin"))
        {
            if(txtuname.getText().equals("Admin"))
            {
                if(txtpass.getText().equals("Admin@123"))
                {
                    this.setVisible(false);
                    Admin admin=new Admin(this,true);
                    admin.setLocationRelativeTo(this);
                    admin.setVisible(true);
                    txtuname.setText("");
                    txtpass.setText("");
                    cmbchoice.setSelectedIndex(0);
                }  
                else
                {
                    JOptionPane.showMessageDialog(this,"Wrong Password..!!!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Wrong Username..!!!");
            }
        }
        if(cmbchoice.getSelectedItem().equals("Customer"))
        {
            try
            {
                Connection con = CommonFunctions.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from customertb where account="+Integer.parseInt(txtuname.getText()));
                if(rs.first())
                {
                    String password = rs.getString("pass");
                    if(password.equals(txtpass.getText()))
                    {
                        new userFrame(this).setVisible(true);
                        this.setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Incorrect Password!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Username!");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error="+e);
            }
            txtuname.setText("");
            txtpass.setText("");
            cmbchoice.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnloginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JComboBox<String> cmbchoice;
    private javax.swing.JLabel lblbankimage;
    private javax.swing.JLabel lblbankname;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblrole;
    private javax.swing.JLabel lbluname;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel subpanel;
    public javax.swing.JTextField txtpass;
    public javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
