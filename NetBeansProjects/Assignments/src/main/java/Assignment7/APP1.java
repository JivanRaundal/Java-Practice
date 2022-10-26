
package Assignment7;


public class APP1 extends javax.swing.JFrame
{


    public APP1()
    {
        initComponents();
        CommonFunctions.addDateTime(lbldate);
        CommonFunctions.addButtonBackground(btnclose, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\close1.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        lbldate = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        subPanel1 = new javax.swing.JPanel();
        lblschoolName = new javax.swing.JLabel();
        seperator1 = new javax.swing.JSeparator();
        seperator2 = new javax.swing.JSeparator();
        lbloperations = new javax.swing.JLabel();
        subPanel2 = new javax.swing.JPanel();
        lbloperation1 = new javax.swing.JLabel();
        lbloperation2 = new javax.swing.JLabel();
        lbloperation3 = new javax.swing.JLabel();
        lbloperation4 = new javax.swing.JLabel();
        lbloperation5 = new javax.swing.JLabel();
        lbloperation6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        lbldate.setBackground(new java.awt.Color(204, 204, 204));
        lbldate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbldate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnclose.setBorder(null);
        btnclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btncloseActionPerformed(evt);
            }
        });

        subPanel1.setBackground(new java.awt.Color(255, 204, 204));

        lblschoolName.setBackground(new java.awt.Color(255, 153, 153));
        lblschoolName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblschoolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblschoolName.setText("MATHEMATICS CALCULATOR");
        lblschoolName.setOpaque(true);

        javax.swing.GroupLayout subPanel1Layout = new javax.swing.GroupLayout(subPanel1);
        subPanel1.setLayout(subPanel1Layout);
        subPanel1Layout.setHorizontalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblschoolName, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addContainerGap())
        );
        subPanel1Layout.setVerticalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblschoolName, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        seperator1.setBackground(new java.awt.Color(51, 51, 51));
        seperator1.setOpaque(true);

        seperator2.setBackground(new java.awt.Color(51, 51, 51));
        seperator2.setOpaque(true);

        lbloperations.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbloperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloperations.setText("Please select any of the following operations :-");
        lbloperations.setOpaque(true);

        subPanel2.setBackground(new java.awt.Color(255, 255, 255));
        subPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lbloperation1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbloperation1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloperation1.setText("ARITHMETIC OPERATIONS");
        lbloperation1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbloperation1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbloperation1.setOpaque(true);
        lbloperation1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbloperation1MouseClicked(evt);
            }
        });

        lbloperation2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbloperation2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloperation2.setText("AREA CALCULATOR");
        lbloperation2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbloperation2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbloperation2.setOpaque(true);
        lbloperation2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbloperation2MouseClicked(evt);
            }
        });

        lbloperation3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbloperation3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloperation3.setText("PERIMETER / CIRCUMFERENCE");
        lbloperation3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbloperation3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbloperation3.setOpaque(true);
        lbloperation3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbloperation3MouseClicked(evt);
            }
        });

        lbloperation4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbloperation4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloperation4.setText("BASE RAISED TO POWER");
        lbloperation4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbloperation4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbloperation4.setOpaque(true);
        lbloperation4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbloperation4MouseClicked(evt);
            }
        });

        lbloperation5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbloperation5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloperation5.setText("PRIME OPERATIONS");
        lbloperation5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbloperation5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbloperation5.setOpaque(true);
        lbloperation5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbloperation5MouseClicked(evt);
            }
        });

        lbloperation6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbloperation6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloperation6.setText("LCM & GCD");
        lbloperation6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbloperation6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbloperation6.setOpaque(true);
        lbloperation6.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbloperation6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout subPanel2Layout = new javax.swing.GroupLayout(subPanel2);
        subPanel2.setLayout(subPanel2Layout);
        subPanel2Layout.setHorizontalGroup(
            subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subPanel2Layout.createSequentialGroup()
                        .addComponent(lbloperation1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbloperation2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanel2Layout.createSequentialGroup()
                        .addComponent(lbloperation3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbloperation4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanel2Layout.createSequentialGroup()
                        .addComponent(lbloperation5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbloperation6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        subPanel2Layout.setVerticalGroup(
            subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbloperation1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbloperation2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbloperation3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbloperation4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 32, Short.MAX_VALUE)
                .addGroup(subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbloperation5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbloperation6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbloperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seperator2)
                            .addComponent(seperator1)
                            .addComponent(subPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbldate, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(subPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(seperator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbloperations, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btncloseActionPerformed
    {//GEN-HEADEREND:event_btncloseActionPerformed
        // TODO add your handling code here:
        CommonFunctions.stopThread();           //to stop Thread running in CommonFunctions class for date & time
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void lbloperation1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbloperation1MouseClicked
    {//GEN-HEADEREND:event_lbloperation1MouseClicked
        // TODO add your handling code here:
        ArithmeticOperations arithmeticFrame = new ArithmeticOperations(this);
        arithmeticFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbloperation1MouseClicked

    private void lbloperation2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbloperation2MouseClicked
    {//GEN-HEADEREND:event_lbloperation2MouseClicked
        // TODO add your handling code here:
        Area areaDialog = new Area(this, false);
        areaDialog.lblcircle.setText("AREA OF CIRCLE");
        areaDialog.lblrectangle.setText("AREA OF RECTANGLE / SQUARE");
        areaDialog.lbltriangle.setText("AREA OF TRIANGLE");
        areaDialog.setVisible(true);
    }//GEN-LAST:event_lbloperation2MouseClicked

    private void lbloperation3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbloperation3MouseClicked
    {//GEN-HEADEREND:event_lbloperation3MouseClicked
        // TODO add your handling code here:
        Area areaDialog = new Area(this, false);
        areaDialog.lblcircle.setText("CIRCUMFERENCE OF CIRCLE");
        areaDialog.lblrectangle.setText("PERIMETER OF RECTANGLE / SQUARE");
        areaDialog.lbltriangle.setText("PERIMETER OF TRIANGLE");
        areaDialog.setVisible(true);
    }//GEN-LAST:event_lbloperation3MouseClicked

    private void lbloperation4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbloperation4MouseClicked
    {//GEN-HEADEREND:event_lbloperation4MouseClicked
        // TODO add your handling code here:
        BasePower basePower = new BasePower(this);
        basePower.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbloperation4MouseClicked

    private void lbloperation5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbloperation5MouseClicked
    {//GEN-HEADEREND:event_lbloperation5MouseClicked
        // TODO add your handling code here:
        PrimeOperations primeFrame = new PrimeOperations(this);
        primeFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbloperation5MouseClicked

    private void lbloperation6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbloperation6MouseClicked
    {//GEN-HEADEREND:event_lbloperation6MouseClicked
        // TODO add your handling code here:
        LCM_GCD lcmFrame = new LCM_GCD(this);
        lcmFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbloperation6MouseClicked


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
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(APP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new APP1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbloperation1;
    private javax.swing.JLabel lbloperation2;
    private javax.swing.JLabel lbloperation3;
    private javax.swing.JLabel lbloperation4;
    private javax.swing.JLabel lbloperation5;
    private javax.swing.JLabel lbloperation6;
    private javax.swing.JLabel lbloperations;
    private javax.swing.JLabel lblschoolName;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JSeparator seperator1;
    private javax.swing.JSeparator seperator2;
    private javax.swing.JPanel subPanel1;
    private javax.swing.JPanel subPanel2;
    // End of variables declaration//GEN-END:variables
}
