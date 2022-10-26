
package Assignment7;

import javax.swing.JOptionPane;

public class PerimeterTriangle extends javax.swing.JFrame
{
    Area frameArea;
    public PerimeterTriangle(Area ref)
    {
        frameArea = ref;
        initComponents();
         CommonFunctions.addLabelBackground(lblclose, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\cross_icon1.png");
        CommonFunctions.addLabelBackground(lblback, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\back_icon3.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        lblclose = new javax.swing.JLabel();
        lblback = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        subPanel1 = new javax.swing.JPanel();
        txtside1 = new javax.swing.JTextField();
        txtside3 = new javax.swing.JTextField();
        lblmsg = new javax.swing.JLabel();
        txtside2 = new javax.swing.JTextField();
        btnperi = new javax.swing.JButton();
        lblans = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(386, 301));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });

        lblback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblback.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblbackMouseClicked(evt);
            }
        });

        separator1.setBackground(new java.awt.Color(0, 0, 0));
        separator1.setOpaque(true);

        txtside1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtside1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtside1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtside1KeyTyped(evt);
            }
        });

        txtside3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtside3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtside3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtside3KeyTyped(evt);
            }
        });

        lblmsg.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg.setText("ENTER 3 SIDES OF TRIANGLE");

        txtside2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtside2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtside2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtside2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout subPanel1Layout = new javax.swing.GroupLayout(subPanel1);
        subPanel1.setLayout(subPanel1Layout);
        subPanel1Layout.setHorizontalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanel1Layout.createSequentialGroup()
                        .addComponent(txtside1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txtside2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(txtside3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblmsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        subPanel1Layout.setVerticalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtside3)
                    .addGroup(subPanel1Layout.createSequentialGroup()
                        .addComponent(txtside1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtside2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(11, 11, 11))
        );

        btnperi.setBackground(new java.awt.Color(255, 0, 0));
        btnperi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnperi.setForeground(new java.awt.Color(255, 255, 255));
        btnperi.setText("PERIMETER");
        btnperi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnperi.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnperiActionPerformed(evt);
            }
        });

        lblans.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblans.setText("ANSWER HERE");
        lblans.setOpaque(true);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(lblback, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnperi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator1)
                    .addComponent(subPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblback, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lblclose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnperi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblans, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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
        frameArea.setVisible(true);
        frameArea.mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblbackMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblbackMouseClicked
    {//GEN-HEADEREND:event_lblbackMouseClicked
        // TODO add your handling code here:
        frameArea.setVisible(true);
        frameArea.mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblbackMouseClicked

    private void txtside1KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtside1KeyTyped
    {//GEN-HEADEREND:event_txtside1KeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtside1KeyTyped

    private void txtside3KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtside3KeyTyped
    {//GEN-HEADEREND:event_txtside3KeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtside3KeyTyped

    private void txtside2KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtside2KeyTyped
    {//GEN-HEADEREND:event_txtside2KeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtside2KeyTyped

    private void btnperiActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnperiActionPerformed
    {//GEN-HEADEREND:event_btnperiActionPerformed
        // TODO add your handling code here:
        try
        {
            double s1 = Double.parseDouble(txtside1.getText());
            double s2 = Double.parseDouble(txtside2.getText());
            double s3 = Double.parseDouble(txtside3.getText());
            double ans = s1 + s2 + s3;
            lblans.setText("PERIMETER OF TRIANGLE = " + ans);
        } 
        catch(NumberFormatException e)
        {
            txtside1.setText("");
            txtside2.setText("");
            txtside3.setText("");
            lblans.setText("ANSWER HERE");
            JOptionPane.showMessageDialog(this, "Invalid Data", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnperiActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnperi;
    private javax.swing.JLabel lblans;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JSeparator separator1;
    private javax.swing.JPanel subPanel1;
    private javax.swing.JTextField txtside1;
    private javax.swing.JTextField txtside2;
    private javax.swing.JTextField txtside3;
    // End of variables declaration//GEN-END:variables
}
