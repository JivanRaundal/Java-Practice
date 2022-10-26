
package Assignment7;


public class APP3 extends javax.swing.JFrame
{
    public APP3()
    {
        initComponents();
        CommonFunctions.addDateTime(lbldate);
        CommonFunctions.addLabelBackground(lblclose, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\close1.png");
    
        CommonFunctions.addLabelBackground(lblbinaryimg, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\binary_img.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        lblclose = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        subPanel1 = new javax.swing.JPanel();
        lblbinaryimg = new javax.swing.JLabel();
        lblmsg = new javax.swing.JLabel();
        subPanel2 = new javax.swing.JPanel();
        lbloperation1 = new javax.swing.JLabel();
        lbloperation2 = new javax.swing.JLabel();
        lbloperation3 = new javax.swing.JLabel();

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

        lbldate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        separator1.setBackground(new java.awt.Color(0, 0, 0));
        separator1.setOpaque(true);

        subPanel1.setBackground(new java.awt.Color(255, 204, 255));
        subPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout subPanel1Layout = new javax.swing.GroupLayout(subPanel1);
        subPanel1.setLayout(subPanel1Layout);
        subPanel1Layout.setHorizontalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblbinaryimg, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );
        subPanel1Layout.setVerticalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblbinaryimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblmsg.setBackground(new java.awt.Color(255, 51, 255));
        lblmsg.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg.setText("Select any of the following operations :-");
        lblmsg.setOpaque(true);

        subPanel2.setBackground(new java.awt.Color(255, 204, 255));
        subPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbloperation1.setBackground(new java.awt.Color(255, 51, 255));
        lbloperation1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbloperation1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloperation1.setText("NUMBER SYSTEM CONVERSION");
        lbloperation1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbloperation1.setOpaque(true);
        lbloperation1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbloperation1MouseClicked(evt);
            }
        });

        lbloperation2.setBackground(new java.awt.Color(255, 51, 255));
        lbloperation2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbloperation2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloperation2.setText("SIMPLE INTEREST CALCULATOR");
        lbloperation2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbloperation2.setOpaque(true);
        lbloperation2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbloperation2MouseClicked(evt);
            }
        });

        lbloperation3.setBackground(new java.awt.Color(255, 51, 255));
        lbloperation3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbloperation3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbloperation3.setText("FIBONACCI SERIES UPTO 'N' NUMBER");
        lbloperation3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbloperation3.setOpaque(true);
        lbloperation3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbloperation3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout subPanel2Layout = new javax.swing.GroupLayout(subPanel2);
        subPanel2.setLayout(subPanel2Layout);
        subPanel2Layout.setHorizontalGroup(
            subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbloperation1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbloperation2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbloperation3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanel2Layout.setVerticalGroup(
            subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbloperation1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbloperation2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbloperation3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator1)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(subPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblmsg, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                    .addComponent(subPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldate, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        // TODO add your handling code here:
        CommonFunctions.stopThread();
        this.dispose();
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lbloperation1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbloperation1MouseClicked
    {//GEN-HEADEREND:event_lbloperation1MouseClicked
        // TODO add your handling code here:
        NumberConversion numConversion = new NumberConversion(this);
        numConversion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbloperation1MouseClicked

    private void lbloperation2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbloperation2MouseClicked
    {//GEN-HEADEREND:event_lbloperation2MouseClicked
        // TODO add your handling code here:
        SimpleInterest SI = new SimpleInterest(this);
        SI.setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_lbloperation2MouseClicked

    private void lbloperation3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbloperation3MouseClicked
    {//GEN-HEADEREND:event_lbloperation3MouseClicked
        // TODO add your handling code here:
        FibonacciSeries fibo = new FibonacciSeries(this);
        fibo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbloperation3MouseClicked

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
            java.util.logging.Logger.getLogger(APP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(APP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(APP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(APP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new APP3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblbinaryimg;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JLabel lbloperation1;
    private javax.swing.JLabel lbloperation2;
    private javax.swing.JLabel lbloperation3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JSeparator separator1;
    private javax.swing.JPanel subPanel1;
    private javax.swing.JPanel subPanel2;
    // End of variables declaration//GEN-END:variables
}
