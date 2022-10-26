
package Assignment7;

public class APP4 extends javax.swing.JFrame implements Runnable
{
    private Thread t;
    private boolean flag;
    private int min, sec, ms;
    
    public APP4()
    {
        initComponents();
        CommonFunctions.addLabelBackground(lblclose, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\close2.png");
        CommonFunctions.addLabelBackground(lblwatchimg, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\stopwatch2.png");
        
        flag = false;
        min = sec = ms = 0;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        lblclose = new javax.swing.JLabel();
        lblwatchimg = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        lblsec = new javax.swing.JLabel();
        lblmsec = new javax.swing.JLabel();
        lblmintitle = new javax.swing.JLabel();
        lblsectitle = new javax.swing.JLabel();
        lblmsectitle = new javax.swing.JLabel();
        btnstart = new javax.swing.JButton();
        btnstop = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "STOPWATCH", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N

        lblclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });

        lblmin.setBackground(new java.awt.Color(0, 0, 0));
        lblmin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblmin.setForeground(new java.awt.Color(255, 255, 255));
        lblmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmin.setText("00");
        lblmin.setOpaque(true);

        lblsec.setBackground(new java.awt.Color(0, 0, 0));
        lblsec.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblsec.setForeground(new java.awt.Color(255, 255, 255));
        lblsec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsec.setText("00");
        lblsec.setOpaque(true);

        lblmsec.setBackground(new java.awt.Color(0, 0, 0));
        lblmsec.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblmsec.setForeground(new java.awt.Color(255, 255, 255));
        lblmsec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsec.setText("00");
        lblmsec.setOpaque(true);

        lblmintitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblmintitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmintitle.setText("MIN");

        lblsectitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblsectitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsectitle.setText("SEC");

        lblmsectitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblmsectitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsectitle.setText("MS");

        btnstart.setBackground(new java.awt.Color(0, 204, 51));
        btnstart.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnstart.setForeground(new java.awt.Color(255, 255, 255));
        btnstart.setText("START");
        btnstart.setBorder(null);
        btnstart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnstartActionPerformed(evt);
            }
        });

        btnstop.setBackground(new java.awt.Color(255, 0, 0));
        btnstop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnstop.setForeground(new java.awt.Color(255, 255, 255));
        btnstop.setText("STOP");
        btnstop.setBorder(null);
        btnstop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnstop.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnstopActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(0, 102, 204));
        btnreset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setText("RESET");
        btnreset.setBorder(null);
        btnreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblmintitle, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addComponent(lblmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(lblwatchimg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnstart, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblsectitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblsec, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnstop, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblmsec, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addComponent(lblmsectitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 140, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmintitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsectitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmsectitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsec, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmsec, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnstart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnstop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addComponent(lblwatchimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        flag = false;
        this.dispose();
    }//GEN-LAST:event_lblcloseMouseClicked

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnstartActionPerformed
    {//GEN-HEADEREND:event_btnstartActionPerformed
        // TODO add your handling code here:
        if(flag == false)
        {
            startThread();
        }
    }//GEN-LAST:event_btnstartActionPerformed

    private void btnstopActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnstopActionPerformed
    {//GEN-HEADEREND:event_btnstopActionPerformed
        // TODO add your handling code here:
        if(flag == true)
        {
            stopThread();                   //OR flag = false
        }
    }//GEN-LAST:event_btnstopActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnresetActionPerformed
    {//GEN-HEADEREND:event_btnresetActionPerformed
        // TODO add your handling code here:
        flag = false;
        lblmin.setText("00");
        lblsec.setText("00");
        lblmsec.setText("00");
        min = sec = ms = 0;        
    }//GEN-LAST:event_btnresetActionPerformed


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
            java.util.logging.Logger.getLogger(APP4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(APP4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(APP4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(APP4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new APP4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnstart;
    private javax.swing.JButton btnstop;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JLabel lblmintitle;
    private javax.swing.JLabel lblmsec;
    private javax.swing.JLabel lblmsectitle;
    private javax.swing.JLabel lblsec;
    private javax.swing.JLabel lblsectitle;
    private javax.swing.JLabel lblwatchimg;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    synchronized public void run()          //If used wait() then synchronization is must
    {
        while(flag)
        {
            try
            {
                Thread.sleep(9);
                //wait(9);            //OR Thread.sleep(1);       //for 1 milisec              
                //code here
                ms++;
                
                if(ms == 100)
                {
                    sec++;
                    ms = 0;
                }
                if(sec == 60)
                {
                    min++;
                    sec = 0;
                }
                
                //OR
                /*sec = sec + ms/100;
                min = min + sec/60;
                ms = ms%100;
                sec = sec%60; */
                
                lblmin.setText(String.valueOf(min));
                lblsec.setText(String.valueOf(sec));
                lblmsec.setText(String.valueOf(ms)); 
            } 
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    private void startThread()
    {
        t = new Thread(this);
        flag = true;
        t.start();
    }
    private void stopThread()
    {
        flag = false;
    }
}
