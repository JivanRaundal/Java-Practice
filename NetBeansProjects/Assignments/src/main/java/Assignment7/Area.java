
package Assignment7;

import java.awt.Frame;


public class Area extends javax.swing.JDialog
{
    Frame mainFrame;
    public Area(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        mainFrame = parent;
        initComponents();
        setLocationRelativeTo(parent);
        CommonFunctions.addLabelBackground(lblclose, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\cross_icon1.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        lblclose = new javax.swing.JLabel();
        lblcircle = new javax.swing.JLabel();
        lbltriangle = new javax.swing.JLabel();
        lblrectangle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "OPERATIONS ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        lblclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });

        lblcircle.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblcircle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcircle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblcircle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcircle.setOpaque(true);
        lblcircle.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcircleMouseClicked(evt);
            }
        });

        lbltriangle.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbltriangle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltriangle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbltriangle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbltriangle.setOpaque(true);
        lbltriangle.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbltriangleMouseClicked(evt);
            }
        });

        lblrectangle.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblrectangle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrectangle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblrectangle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblrectangle.setOpaque(true);
        lblrectangle.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblrectangleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblcircle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltriangle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(lblrectangle, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblcircle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblrectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbltriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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
    }// </editor-fold>//GEN-END:initComponents

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblcircleMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcircleMouseClicked
    {//GEN-HEADEREND:event_lblcircleMouseClicked
        // TODO add your handling code here:
        if(lblcircle.getText().equals("AREA OF CIRCLE"))
        {
            AreaCircle circleArea = new AreaCircle(this);
            circleArea.btnarea.setText("AREA");
            circleArea.setVisible(true);
            mainFrame.setVisible(false);
            this.setVisible(false);
        }
        if(lblcircle.getText().equals("CIRCUMFERENCE OF CIRCLE"))
        {
            AreaCircle circumCircle = new AreaCircle(this);
            circumCircle.btnarea.setText("CIRCUM");
            circumCircle.setVisible(true);
            mainFrame.setVisible(false);
            this.setVisible(false);
        }
    }//GEN-LAST:event_lblcircleMouseClicked

    private void lblrectangleMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblrectangleMouseClicked
    {//GEN-HEADEREND:event_lblrectangleMouseClicked
        // TODO add your handling code here:
        if(lblrectangle.getText().equals("AREA OF RECTANGLE / SQUARE"))
        {
            AreaRectangle rectArea = new AreaRectangle(this);
            rectArea.btnarea.setText("AREA");
            rectArea.setVisible(true);
            mainFrame.setVisible(false);
            this.setVisible(false);
        }     
        if(lblrectangle.getText().equals("PERIMETER OF RECTANGLE / SQUARE"))
        {
            AreaRectangle rectPeri = new AreaRectangle(this);
            rectPeri.btnarea.setText("PERI");
            rectPeri.setVisible(true);
            mainFrame.setVisible(false);
            this.setVisible(false);
        }  
    }//GEN-LAST:event_lblrectangleMouseClicked

    private void lbltriangleMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbltriangleMouseClicked
    {//GEN-HEADEREND:event_lbltriangleMouseClicked
        // TODO add your handling code here:
        if(lbltriangle.getText().equals("AREA OF TRIANGLE"))
        {
            AreaTriangle triangleArea = new AreaTriangle(this);
            triangleArea.setVisible(true);
            mainFrame.setVisible(false);
            this.setVisible(false);
        }
        if(lbltriangle.getText().equals("PERIMETER OF TRIANGLE"))
        {
            PerimeterTriangle trianglePeri = new PerimeterTriangle(this);
            trianglePeri.setVisible(true);
            mainFrame.setVisible(false);
            this.setVisible(false);
        } 
    }//GEN-LAST:event_lbltriangleMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblcircle;
    private javax.swing.JLabel lblclose;
    public javax.swing.JLabel lblrectangle;
    public javax.swing.JLabel lbltriangle;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
