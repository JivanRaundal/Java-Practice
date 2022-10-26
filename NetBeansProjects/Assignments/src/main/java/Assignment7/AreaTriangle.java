
package Assignment7;

import javax.swing.JOptionPane;

public class AreaTriangle extends javax.swing.JFrame
{
    Area frameArea;
    public AreaTriangle(Area ref)
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
        txtbase = new javax.swing.JTextField();
        txtheight = new javax.swing.JTextField();
        lblbase = new javax.swing.JLabel();
        lblheight = new javax.swing.JLabel();
        btnarea = new javax.swing.JButton();
        lblans = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

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

        txtbase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbase.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtbaseKeyTyped(evt);
            }
        });

        txtheight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtheight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtheight.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtheightKeyTyped(evt);
            }
        });

        lblbase.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblbase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbase.setText("BASE");

        lblheight.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblheight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblheight.setText("HEIGHT");

        javax.swing.GroupLayout subPanel1Layout = new javax.swing.GroupLayout(subPanel1);
        subPanel1.setLayout(subPanel1Layout);
        subPanel1Layout.setHorizontalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblbase, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(txtbase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtheight)
                    .addComponent(lblheight, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        subPanel1Layout.setVerticalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbase, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblheight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtheight)
                    .addComponent(txtbase, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        btnarea.setBackground(new java.awt.Color(255, 0, 0));
        btnarea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnarea.setForeground(new java.awt.Color(255, 255, 255));
        btnarea.setText("AREA");
        btnarea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnarea.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnareaActionPerformed(evt);
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
                .addGap(142, 142, 142)
                .addComponent(btnarea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblclose, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lblback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnarea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblans, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
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

    private void txtbaseKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtbaseKeyTyped
    {//GEN-HEADEREND:event_txtbaseKeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtbaseKeyTyped

    private void txtheightKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtheightKeyTyped
    {//GEN-HEADEREND:event_txtheightKeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtheightKeyTyped

    private void btnareaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnareaActionPerformed
    {//GEN-HEADEREND:event_btnareaActionPerformed
        // TODO add your handling code here:
        if(btnarea.getText().equals("AREA"))
        {
            try
            {
                double base = Double.parseDouble(txtbase.getText());
                double height = Double.parseDouble(txtheight.getText());
                double ans = (height * base) / 2;
                double ansRoundOff = Math.round(ans*100.0)/100.0;      //To Round off ans upto 2 digits after decimal
                lblans.setText("AREA OF TRIANGLE = " + ansRoundOff);
                
            } 
            catch (NumberFormatException e)
            {
                txtbase.setText("");
                txtheight.setText("");
                lblans.setText("ANSWER HERE");
                JOptionPane.showMessageDialog(this, "Invalid data", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(btnarea.getText().equals("PERIMETER"))
        {
            //perimeter code here
        }
    }//GEN-LAST:event_btnareaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnarea;
    private javax.swing.JLabel lblans;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblbase;
    private javax.swing.JLabel lblclose;
    public javax.swing.JLabel lblheight;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JSeparator separator1;
    private javax.swing.JPanel subPanel1;
    private javax.swing.JTextField txtbase;
    private javax.swing.JTextField txtheight;
    // End of variables declaration//GEN-END:variables
}
