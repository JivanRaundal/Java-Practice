
package mypackage;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;


public class WebcamApp extends javax.swing.JFrame
{
    volatile boolean state = true;
    Webcam webcam;
    int flag = 0;
    
    public WebcamApp()
    {
        initComponents();
        
        webcam = Webcam.getDefault();       //get's default webcam of device
        webcam.setViewSize(new Dimension(320,240));     //possible ones are [176x144] [320x240] [640x480] 
        webcam.open();
        
        Thread t = new Thread()             // to look like video
        {
            public void run()
            {
                while(state)
                {
                    Image img = webcam.getImage();
                    lblphoto.setIcon(new ImageIcon(img));
                }
            }
        };
        t.start();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        lblphoto = new javax.swing.JLabel();
        btncapture = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        btnfetch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(255, 204, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "WEBCAM ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        lblphoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        lblphoto.setOpaque(true);

        btncapture.setBackground(new java.awt.Color(255, 0, 51));
        btncapture.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btncapture.setForeground(new java.awt.Color(255, 255, 255));
        btncapture.setText("CAPTURE");
        btncapture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncapture.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btncaptureActionPerformed(evt);
            }
        });

        txtid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtid.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtidKeyTyped(evt);
            }
        });

        lblid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblid.setText("ID");

        btnfetch.setBackground(new java.awt.Color(0, 153, 0));
        btnfetch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnfetch.setForeground(new java.awt.Color(255, 255, 255));
        btnfetch.setText("FETCH");
        btnfetch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnfetch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnfetchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid)
                            .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(btnfetch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncapture))
                    .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btncapture, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnfetch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncaptureActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btncaptureActionPerformed
    {//GEN-HEADEREND:event_btncaptureActionPerformed
        if(flag != 0)
        {
            return;
        }
        
        try 
        {
            Image img = webcam.getImage();
            state = false;
            lblphoto.setIcon(new ImageIcon(img));
            //ImageIO.write(webcam.getImage(), "PNG", new File("D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Project1\\src\\main\\java\\images\\myimage.png"));
            ImageIO.write((RenderedImage)img, "PNG", new File("D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Project1\\src\\main\\java\\images\\myimage.png"));
            webcam.close();
            
            FileInputStream fin = new FileInputStream("D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Project1\\src\\main\\java\\images\\myimage.png");
            // Note: Create fin so that it can read our png photo file in byte format. So that we can write it in database.
            
            //Connection With Database to store the Image in byte format
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "Jivan_Raundal", "Jivan@123");
            PreparedStatement pst = con.prepareStatement("INSERT INTO images(image) VALUES(?)");
            pst.setBlob(1, fin);    //we will insert image into database in byte format read in fin
            pst.executeUpdate();            //OR pst.execute();
            JOptionPane.showMessageDialog(this, "Image inserted successfully");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
        
        flag = 1;
    }//GEN-LAST:event_btncaptureActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        // TODO add your handling code here:
        state = false;
    }//GEN-LAST:event_formWindowClosing

    private void btnfetchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnfetchActionPerformed
    {//GEN-HEADEREND:event_btnfetchActionPerformed
        // CODE TO FETCH RECORD / IMAGE FROM DATABASE USING ID
        state = false;
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "Jivan_Raundal", "Jivan@123");
            Statement st = con.createStatement();
            String query = "SELECT * FROM images WHERE id = "+Integer.parseInt(txtid.getText());
            ResultSet rs = st.executeQuery(query);
            
            if(rs.first())
            {
                JOptionPane.showMessageDialog(this, "Image Found");
                
                byte[] imagebyte = rs.getBytes("image"); 
                /*
                NOTE : -Your image from database is now stored in imagebyte array in the form of bytes.
                       -Now, we will create an image of type Image from imagebye array. 
                */
                Image img = getToolkit().createImage(imagebyte);
                /*
                NOTE: -Here, we created an image from imagebyte array.
                      -Now, let's assign this image to label. So, to assign image to label, first we will create a 
                       new image of type Image having width & height same as label.
                */
                Image newimg = img.getScaledInstance(lblphoto.getWidth(), lblphoto.getHeight(), Image.SCALE_SMOOTH); 
                lblphoto.setIcon(new ImageIcon(newimg));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Image not Found");
            }
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
        
    }//GEN-LAST:event_btnfetchActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtidKeyTyped
    {//GEN-HEADEREND:event_txtidKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch))      //if not digit then consume the event
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtidKeyTyped

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
            java.util.logging.Logger.getLogger(WebcamApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(WebcamApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(WebcamApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(WebcamApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new WebcamApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncapture;
    private javax.swing.JButton btnfetch;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
