/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Admin extends javax.swing.JDialog
{
    java.awt.Frame parentframe;
    Connection con=null;
    Connection delcon=null;
    Statement st=null;
    ResultSet rs=null;
    public Admin()
    {
    }
    public Admin(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        parentframe=parent;
        initComponents();
        displayTableInfo();
        CommonFunctions.addLabelBackground(lblclose,"D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\BankManagement\\src\\main\\java\\images\\close-icon.png"); 

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblclose = new javax.swing.JLabel();
        lblsbi = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblinfo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelcreate = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblgender = new javax.swing.JLabel();
        txtdob = new javax.swing.JTextField();
        lbldob = new javax.swing.JLabel();
        lbldateformat = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblpass = new javax.swing.JLabel();
        lbladd = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        txtac = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        lblac = new javax.swing.JLabel();
        cmbgender = new javax.swing.JComboBox<>();
        btncreate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jPanelcustdetails = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jPaneldeleteac = new javax.swing.JPanel();
        lbldelac = new javax.swing.JLabel();
        txtdelac = new javax.swing.JTextField();
        btndel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });

        lblsbi.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        lblsbi.setForeground(new java.awt.Color(255, 255, 255));
        lblsbi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsbi.setText("SBI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(lblsbi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblsbi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.Color.white);

        lblinfo.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        lblinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblinfo.setText("Info");
        lblinfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        lblinfo.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblinfoMouseClicked(evt);
            }
        });

        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jPanelcreate.setBackground(new java.awt.Color(51, 153, 255));

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblname.setText("Name :");

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtname.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtnameActionPerformed(evt);
            }
        });

        lblgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblgender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblgender.setText("Gender :");

        txtdob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtdob.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtdob.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtdobActionPerformed(evt);
            }
        });

        lbldob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldob.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbldob.setText("Date of Birth :");

        lbldateformat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldateformat.setForeground(new java.awt.Color(255, 255, 255));
        lbldateformat.setText("(DD/MM/YYYY)");

        lblphone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblphone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblphone.setText("Phone :");

        txtphone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtphone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtphone.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtphoneActionPerformed(evt);
            }
        });

        lblemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblemail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblemail.setText("E-mail :");

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtemail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtemail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtemailActionPerformed(evt);
            }
        });

        lblpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpass.setText("Password :");

        lbladd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbladd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbladd.setText("Address :");

        txtadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtadd.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtadd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtaddActionPerformed(evt);
            }
        });

        txtac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtac.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtac.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtacActionPerformed(evt);
            }
        });

        txtpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtpass.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtpassActionPerformed(evt);
            }
        });

        lblac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblac.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblac.setText("Account Number :");

        cmbgender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Male", "Female", "Other" }));

        btncreate.setBackground(new java.awt.Color(0, 0, 204));
        btncreate.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btncreate.setForeground(new java.awt.Color(255, 255, 255));
        btncreate.setText("CREATE");
        btncreate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btncreateActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(0, 0, 204));
        btnclear.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelcreateLayout = new javax.swing.GroupLayout(jPanelcreate);
        jPanelcreate.setLayout(jPanelcreateLayout);
        jPanelcreateLayout.setHorizontalGroup(
            jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcreateLayout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldob, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblphone, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbladd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelcreateLayout.createSequentialGroup()
                        .addComponent(btncreate)
                        .addGap(38, 38, 38)
                        .addComponent(btnclear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcreateLayout.createSequentialGroup()
                        .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelcreateLayout.createSequentialGroup()
                                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbldateformat, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtemail)
                                .addComponent(txtadd)
                                .addComponent(txtac)
                                .addComponent(txtpass))
                            .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))))
        );
        jPanelcreateLayout.setVerticalGroup(
            jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcreateLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldateformat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbldob, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblphone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbladd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelcreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(397, 397, 397))
        );

        jTabbedPane1.addTab("Create A/C", jPanelcreate);

        jPanelcustdetails.setBackground(new java.awt.Color(51, 153, 255));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "A/C No.", "Name", "Gender", "DOB", "Phone", "E-mail", "Address", "Password", "Balance"
            }
        ));
        jScrollPane1.setViewportView(customerTable);

        javax.swing.GroupLayout jPanelcustdetailsLayout = new javax.swing.GroupLayout(jPanelcustdetails);
        jPanelcustdetails.setLayout(jPanelcustdetailsLayout);
        jPanelcustdetailsLayout.setHorizontalGroup(
            jPanelcustdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcustdetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelcustdetailsLayout.setVerticalGroup(
            jPanelcustdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcustdetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Customer details", jPanelcustdetails);

        jPaneldeleteac.setBackground(new java.awt.Color(51, 153, 255));

        lbldelac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldelac.setText("Account Number :");

        txtdelac.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        btndel.setBackground(new java.awt.Color(0, 0, 0));
        btndel.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btndel.setForeground(new java.awt.Color(255, 255, 255));
        btndel.setText("Search & Delete");
        btndel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btndelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneldeleteacLayout = new javax.swing.GroupLayout(jPaneldeleteac);
        jPaneldeleteac.setLayout(jPaneldeleteacLayout);
        jPaneldeleteacLayout.setHorizontalGroup(
            jPaneldeleteacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldeleteacLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lbldelac, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneldeleteacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdelac, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPaneldeleteacLayout.setVerticalGroup(
            jPaneldeleteacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldeleteacLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPaneldeleteacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldelac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdelac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btndel)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete A/C", jPaneldeleteac);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(lblinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void displayTableInfo()
    {
        try
        {
            Connection mycon = CommonFunctions.getConnection();
            Statement myst = mycon.createStatement();
            ResultSet myrs = myst.executeQuery("SELECT * FROM customertb");
            customerTable.setModel(DbUtils.resultSetToTableModel(myrs));
            mycon.close();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error = "+e);
        }
    }
    
    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
        parentframe.setVisible(true);        
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblinfoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblinfoMouseClicked
    {//GEN-HEADEREND:event_lblinfoMouseClicked
        // TODO add your handling code here:this.setVisible(false);
        Info ar=new Info(parentframe,true);
        ar.setLocationRelativeTo(this);
        ar.setVisible(true);
    }//GEN-LAST:event_lblinfoMouseClicked

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtpassActionPerformed
    {//GEN-HEADEREND:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtacActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtacActionPerformed
    {//GEN-HEADEREND:event_txtacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtacActionPerformed

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtaddActionPerformed
    {//GEN-HEADEREND:event_txtaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtemailActionPerformed
    {//GEN-HEADEREND:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtphoneActionPerformed
    {//GEN-HEADEREND:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtdobActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtdobActionPerformed
    {//GEN-HEADEREND:event_txtdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdobActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtnameActionPerformed
    {//GEN-HEADEREND:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btndelActionPerformed
    {//GEN-HEADEREND:event_btndelActionPerformed
        // TODO add your handling code here:
        if(txtdelac.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter A/C No");
        }
        else
        {
            int ac=Integer.parseInt(txtdelac.getText());
            String query="Delete from customertb where (account="+ac+")";
            try
            {
                delcon=CommonFunctions.getConnection();
                st=delcon.createStatement();
                
                ResultSet rs = st.executeQuery("select * from customertb where account="+ac);
                if(rs.first())
                {
                    st.executeUpdate(query);
                    JOptionPane.showMessageDialog(this,"Deleted successfully...");
                    txtdelac.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid A/C Number!");
                    txtdelac.setText("");
                }
            } 
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error in delete"+ e);
            }
        }
    }//GEN-LAST:event_btndelActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnclearActionPerformed
    {//GEN-HEADEREND:event_btnclearActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        cmbgender.setSelectedIndex(0);
        txtdob.setText("");
        txtac.setText("");
        txtemail.setText("");
        txtpass.setText("");
        txtadd.setText("");
        txtphone.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btncreateActionPerformed
    {//GEN-HEADEREND:event_btncreateActionPerformed
        // TODO add your handling code here:
        String query="INSERT INTO customertb values(?,?,?,?,?,?,?,?,?)";
        if(txtname.getText().isEmpty() || txtac.getText().isEmpty() || txtadd.getText().isEmpty() || txtdob.getText().isEmpty()
                || txtemail.getText().isEmpty() || txtpass.getText().isEmpty() || txtphone.getText().isEmpty()
                || cmbgender.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "Missing information");
        }
        else
        {
            try
            {
                con=CommonFunctions.getConnection();
                PreparedStatement pst=con.prepareStatement(query);
                pst.setInt(1,Integer.parseInt(txtac.getText()));
                pst.setString(2,txtname.getText());
                pst.setString(3,(String)cmbgender.getSelectedItem());
                pst.setString(4,txtdob.getText());
                pst.setString(5,txtphone.getText());
                pst.setString(6,txtemail.getText());
                pst.setString(7,txtadd.getText());
                pst.setString(8,txtpass.getText());
                pst.setInt(9,1000);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "A/c Created Successfully...");
                txtname.setText("");
                cmbgender.setSelectedIndex(0);
                txtdob.setText("");
                txtac.setText("");
                txtemail.setText("");
                txtpass.setText("");
                txtadd.setText("");
                txtphone.setText("");
            } 
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btncreateActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Admin dialog = new Admin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndel;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JTable customerTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelcreate;
    private javax.swing.JPanel jPanelcustdetails;
    private javax.swing.JPanel jPaneldeleteac;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblac;
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lbldateformat;
    private javax.swing.JLabel lbldelac;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblinfo;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblsbi;
    private javax.swing.JTextField txtac;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtdelac;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
