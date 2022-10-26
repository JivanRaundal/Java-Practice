
package Assignment7;

import javax.swing.JOptionPane;


public class AreaRectangle extends javax.swing.JFrame
{

    Area frameArea;
    public AreaRectangle(Area ref)
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
        txtlength = new javax.swing.JTextField();
        txtbreadth = new javax.swing.JTextField();
        lbllength = new javax.swing.JLabel();
        lblbreadth = new javax.swing.JLabel();
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

        txtlength.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtlength.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtlength.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtlengthKeyTyped(evt);
            }
        });

        txtbreadth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbreadth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbreadth.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtbreadthKeyTyped(evt);
            }
        });

        lbllength.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbllength.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllength.setText("LENGTH");

        lblbreadth.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblbreadth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbreadth.setText("BREADTH");

        javax.swing.GroupLayout subPanel1Layout = new javax.swing.GroupLayout(subPanel1);
        subPanel1.setLayout(subPanel1Layout);
        subPanel1Layout.setHorizontalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbllength, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(txtlength))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbreadth)
                    .addComponent(lblbreadth, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        subPanel1Layout.setVerticalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllength, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbreadth, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbreadth)
                    .addComponent(txtlength, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        btnarea.setBackground(new java.awt.Color(255, 0, 0));
        btnarea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnarea.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(lblback, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator1)
                            .addComponent(subPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnarea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblback, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
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

    private void txtlengthKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtlengthKeyTyped
    {//GEN-HEADEREND:event_txtlengthKeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtlengthKeyTyped

    private void txtbreadthKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtbreadthKeyTyped
    {//GEN-HEADEREND:event_txtbreadthKeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtbreadthKeyTyped

    private void btnareaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnareaActionPerformed
    {//GEN-HEADEREND:event_btnareaActionPerformed
        // TODO add your handling code here:
        if(btnarea.getText().equals("AREA"))
        {
            //Area code here
            try
            {
                double ans, ansRoundOff;
                if(txtlength.getText().equals(""))
                {
                    Double breadth = Double.parseDouble(txtbreadth.getText());
                    ans = breadth * breadth;
                    ansRoundOff = Math.round(ans*100.0)/100.0;      //To Round off ans upto 2 digits after decimal
                    lblans.setText("AREA OF SQUARE = " + ansRoundOff);
                }
                else if(txtbreadth.getText().equals(""))
                {
                    Double length = Double.parseDouble(txtlength.getText());    
                    ans = length * length;
                    ansRoundOff = Math.round(ans*100.0)/100.0;      //To Round off ans upto 2 digits after decimal
                    lblans.setText("AREA OF SQUARE = " + ansRoundOff);
                }
                else            //both length & breadth given, it is rectangle
                {
                    Double length = Double.parseDouble(txtlength.getText());
                    Double breadth = Double.parseDouble(txtbreadth.getText());
                    ans = length * breadth;
                    ansRoundOff = Math.round(ans*100.0)/100.0;      //To Round off ans upto 2 digits after decimal
                    lblans.setText("AREA OF RECTANGLE = " + ansRoundOff);
                }
            } 
            catch (NumberFormatException e)
            {
                txtlength.setText("");
                txtbreadth.setText("");
                lblans.setText("ANSWER HERE");
                JOptionPane.showMessageDialog(this, "Invalid data", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(btnarea.getText().equals("PERI"))
        {
            //perimeter code here
            try
            {
                double ans, ansRoundOff;
                if(txtlength.getText().equals(""))
                {
                    Double breadth = Double.parseDouble(txtbreadth.getText());
                    ans = 2 * (breadth + breadth);
                    ansRoundOff = Math.round(ans*100.0)/100.0;      //To Round off ans upto 2 digits after decimal
                    lblans.setText("PERIMETER OF SQUARE = " + ansRoundOff);
                }
                else if(txtbreadth.getText().equals(""))
                {
                    Double length = Double.parseDouble(txtlength.getText());    
                    ans = 2 * (length + length);
                    ansRoundOff = Math.round(ans*100.0)/100.0;      //To Round off ans upto 2 digits after decimal
                    lblans.setText("PERIMETER OF SQUARE = " + ansRoundOff);
                }
                else            //both length & breadth given, it is rectangle
                {
                    Double length = Double.parseDouble(txtlength.getText());
                    Double breadth = Double.parseDouble(txtbreadth.getText());
                    ans = 2 * (length + breadth);
                    ansRoundOff = Math.round(ans*100.0)/100.0;      //To Round off ans upto 2 digits after decimal
                    lblans.setText("PERIMETER OF RECTANGLE = " + ansRoundOff);
                }
            } 
            catch (NumberFormatException e)
            {
                txtlength.setText("");
                txtbreadth.setText("");
                lblans.setText("ANSWER HERE");
                JOptionPane.showMessageDialog(this, "Invalid data", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnareaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnarea;
    private javax.swing.JLabel lblans;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblbreadth;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lbllength;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JSeparator separator1;
    private javax.swing.JPanel subPanel1;
    private javax.swing.JTextField txtbreadth;
    private javax.swing.JTextField txtlength;
    // End of variables declaration//GEN-END:variables
}
