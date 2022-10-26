
package Mypackage;

import javax.swing.ButtonGroup;


public class RadioButtons extends javax.swing.JFrame
{

    public RadioButtons()
    {
        initComponents();
        
        //ButtonGroup for same catagory RadioButtons
        ButtonGroup bggender = new ButtonGroup();
        bggender.add(rdbmale);
        bggender.add(rdbfemale);
        
        ButtonGroup bgsubjects = new ButtonGroup();
        bgsubjects.add(rdbc);
        bgsubjects.add(rdbcpp);
        bgsubjects.add(rdbds);
        bgsubjects.add(rdbjava);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        subPanel = new javax.swing.JPanel();
        lblmsg1 = new javax.swing.JLabel();
        rdbmale = new javax.swing.JRadioButton();
        rdbfemale = new javax.swing.JRadioButton();
        rdbc = new javax.swing.JRadioButton();
        rdbcpp = new javax.swing.JRadioButton();
        rdbds = new javax.swing.JRadioButton();
        rdbjava = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 204, 255));
        mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 2, true));

        subPanel.setBackground(new java.awt.Color(255, 153, 153));
        subPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));

        lblmsg1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblmsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg1.setText("Choose Gender");

        javax.swing.GroupLayout subPanelLayout = new javax.swing.GroupLayout(subPanel);
        subPanel.setLayout(subPanelLayout);
        subPanelLayout.setHorizontalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblmsg1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        subPanelLayout.setVerticalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblmsg1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        rdbmale.setBackground(new java.awt.Color(255, 204, 255));
        rdbmale.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdbmale.setText("MALE");
        rdbmale.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                rdbmaleItemStateChanged(evt);
            }
        });

        rdbfemale.setBackground(new java.awt.Color(255, 204, 255));
        rdbfemale.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdbfemale.setText("FEMALE");

        rdbc.setBackground(new java.awt.Color(255, 204, 255));
        rdbc.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rdbc.setText("C");

        rdbcpp.setBackground(new java.awt.Color(255, 204, 255));
        rdbcpp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rdbcpp.setText("CPP");

        rdbds.setBackground(new java.awt.Color(255, 204, 255));
        rdbds.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rdbds.setText("DS");

        rdbjava.setBackground(new java.awt.Color(255, 204, 255));
        rdbjava.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rdbjava.setText("JAVA");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(rdbc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdbcpp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(rdbmale, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(rdbfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(rdbds, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(rdbjava)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbmale, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbcpp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbds, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbjava, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
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

    private void rdbmaleItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_rdbmaleItemStateChanged
    {//GEN-HEADEREND:event_rdbmaleItemStateChanged
        // TODO add your handling code here:
        if(rdbmale.isSelected())
            lblmsg1.setText("Male Selected");
        else
            lblmsg1.setText("Male Not Selected");
    }//GEN-LAST:event_rdbmaleItemStateChanged

 
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
            java.util.logging.Logger.getLogger(RadioButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RadioButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RadioButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RadioButtons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RadioButtons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblmsg1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton rdbc;
    private javax.swing.JRadioButton rdbcpp;
    private javax.swing.JRadioButton rdbds;
    private javax.swing.JRadioButton rdbfemale;
    private javax.swing.JRadioButton rdbjava;
    private javax.swing.JRadioButton rdbmale;
    private javax.swing.JPanel subPanel;
    // End of variables declaration//GEN-END:variables
}
