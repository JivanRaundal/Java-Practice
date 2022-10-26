
package Assignment7;

import javax.swing.JOptionPane;

public class FibonacciSeries extends javax.swing.JFrame
{

    APP3 parentFrame;
    public FibonacciSeries(APP3 ref)
    {
        parentFrame = ref;
        initComponents();
        CommonFunctions.addLabelBackground(lblclose, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\close1.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        lblclose = new javax.swing.JLabel();
        lblback = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        lblmsg1 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        btnfibseries = new javax.swing.JButton();
        ansScrollPane = new javax.swing.JScrollPane();
        txtans = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 204, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });

        lblback.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblback.setText("<<<");
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

        lblmsg1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblmsg1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblmsg1.setText("Enter the number :");

        txtnum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtnumKeyTyped(evt);
            }
        });

        btnfibseries.setBackground(new java.awt.Color(255, 0, 0));
        btnfibseries.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnfibseries.setForeground(new java.awt.Color(255, 255, 255));
        btnfibseries.setText("FIBONACCI SERIES");
        btnfibseries.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnfibseries.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnfibseriesActionPerformed(evt);
            }
        });

        txtans.setColumns(20);
        txtans.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtans.setRows(5);
        txtans.setText("ANSWER HERE");
        ansScrollPane.setViewportView(txtans);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnfibseries, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 156, Short.MAX_VALUE)
                        .addComponent(lblmsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ansScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator1))
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblback, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnfibseries, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(ansScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        // TODO add your handling code here:
        parentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblbackMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblbackMouseClicked
    {//GEN-HEADEREND:event_lblbackMouseClicked
        // TODO add your handling code here:
        parentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblbackMouseClicked

    private void txtnumKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtnumKeyTyped
    {//GEN-HEADEREND:event_txtnumKeyTyped
        // TODO add your handling code here:
        CommonFunctions.integerValidation(evt);
    }//GEN-LAST:event_txtnumKeyTyped

    private void btnfibseriesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnfibseriesActionPerformed
    {//GEN-HEADEREND:event_btnfibseriesActionPerformed
        // TODO add your handling code here:
        try
        {
            int n = Integer.parseInt(txtnum.getText()); 
            
            int arr[] = new int[n+2];
            arr[0] = 0;
            arr[1] = 1;
            int i;
            for(i=2; i<=n; i++)
            {
                arr[i] = arr[i-1] + arr[i-2]; 
            }
            String str = "FIBONACCI SERIES : ";
            for(i=0; i<=n; i++)
            {
                str = str + String.valueOf(arr[i]) + " "; 
            }
            txtans.setText(str);
        } 
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
    }//GEN-LAST:event_btnfibseriesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ansScrollPane;
    private javax.swing.JButton btnfibseries;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmsg1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JSeparator separator1;
    private javax.swing.JTextArea txtans;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}
