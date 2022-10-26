
package mypackage;
import java.sql.*;
import javax.swing.JOptionPane;

public class program1 extends javax.swing.JFrame
{

 program1()
    {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        txtid = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        lblfname = new javax.swing.JLabel();
        lbllname = new javax.swing.JLabel();
        btninsert = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblid.setText("ID");

        txtfname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtfname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtlname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtlname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblfname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblfname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfname.setText("FirstName");

        lbllname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbllname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllname.setText("LastName");

        btninsert.setBackground(new java.awt.Color(255, 51, 0));
        btninsert.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btninsert.setForeground(new java.awt.Color(255, 255, 255));
        btninsert.setText("INSERT");
        btninsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninsert.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btninsertActionPerformed(evt);
            }
        });

        btnsearch.setBackground(new java.awt.Color(255, 51, 0));
        btnsearch.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("SEARCH");
        btnsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsearchActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(255, 51, 0));
        btnupdate.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnupdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 51, 0));
        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblfname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbllname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnsearch)
                        .addGap(18, 18, 18)
                        .addComponent(btninsert)
                        .addGap(18, 18, 18)
                        .addComponent(btnupdate)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsearchActionPerformed
    {//GEN-HEADEREND:event_btnsearchActionPerformed
        // TODO add your handling code here:
        //code to search record from database
        String url = "jdbc:mysql://localhost:3306/practice";        //database url
        String username = "Jivan_Raundal";                          //mysql username
        String password = "Jivan@123";                              //mysql passsword
        
        /*
        try
        {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();                   //transport vehicle
            
            int id = Integer.parseInt(txtid.getText());
            String query = "select * from student where id = " + id;
            ResultSet rs;       //ResultSet object is simply a table in NetBeans which stores fetched records
            rs = st.executeQuery(query); 
            
            if(rs.first())   //first() moves the cursor to the first row in result set & returns true if cursor is on valid position
            {
                //JOptionPane.showMessageDialog(btnsearch, "Records found");
                String firstname = rs.getString("fname");
                String lastname  = rs.getString("lname"); 
                txtfname.setText(firstname);
                txtlname.setText(lastname);
            }
            else
            {
                txtfname.setText("");
                txtlname.setText("");
                JOptionPane.showMessageDialog(btnsearch, "No such records found");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "Error = "+e, "SQLException", JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Please enter valid ID");
        }
        */
        
        try
        {
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            String query = "select * from student where id = " + Integer.parseInt(txtid.getText());
            ResultSet rs = st.executeQuery(query); 
            if(rs.first())
            {
                //JOptionPane.showMessageDialog(this, "Record Found");
                txtfname.setText(rs.getString("fname"));
                txtlname.setText(rs.getString("lname"));
            }
            else
            {
                txtfname.setText("");
                txtlname.setText("");
                JOptionPane.showMessageDialog(this, "No such record found");
            }
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btninsertActionPerformed
    {//GEN-HEADEREND:event_btninsertActionPerformed
        // TODO add your handling code here:
        String fname = txtfname.getText();
        String lname = txtlname.getText();
        
        /*
        String query = "INSERT INTO student(fname,lname,townid,clgid) VALUES('"+fname+"','"+lname+"',3,2)";
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","Jivan_Raundal","Jivan@123"); 
            Statement st = con.createStatement();
            st.executeUpdate(query); 
            JOptionPane.showMessageDialog(this, "Record inserted successfully");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
        */
        
        //ANOTHER METHOD (Using PreparedStatement)
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","Jivan_Raundal","Jivan@123");
            PreparedStatement pst;
            pst = con.prepareStatement("INSERT INTO student(fname,lname,townid,clgid) VALUES(?,?,?,?)");
            pst.setString(1, fname);    //replaces 1st ?
            pst.setString(2, lname);    //replaces 2nd ?
            pst.setInt(3, 2);
            pst.setInt(4, 3);
            //pst is completely prepared to get fired on database
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record inserted successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnupdateActionPerformed
    {//GEN-HEADEREND:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtid.getText());
        String fname = txtfname.getText();
        String lname = txtlname.getText();
        
        /*
        String query = "UPDATE student SET fname = '"+fname+"',lname = '"+lname+"' where id = "+id;
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","Jivan_Raundal","Jivan@123");
            Statement st = con.createStatement();
            st.executeUpdate(query); 
            JOptionPane.showMessageDialog(this, "Record updates successfully");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
        */
        
        //ANOTHER METHOD
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","Jivan_Raundal","Jivan@123");
            PreparedStatement pst = con.prepareStatement("UPDATE student SET fname = ?, lname = ? where id = ?"); 
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setInt(3, id);
            pst.executeUpdate(); 
            JOptionPane.showMessageDialog(this, "Record updates successfully");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btndeleteActionPerformed
    {//GEN-HEADEREND:event_btndeleteActionPerformed
        // TODO add your handling code here:
        String query = "DELETE FROM student WHERE id = " + Integer.parseInt(txtid.getText());
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","Jivan_Raundal","Jivan@123");
            Statement st = con.createStatement();
            st.executeUpdate(query); 
            JOptionPane.showMessageDialog(this, "Record deleted successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
    }//GEN-LAST:event_btndeleteActionPerformed


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
            java.util.logging.Logger.getLogger(program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(program1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new program1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbllname;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlname;
    // End of variables declaration//GEN-END:variables
}
