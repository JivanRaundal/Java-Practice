
package Assignment7;

public class NumberConversion extends javax.swing.JFrame
{
    APP3 parentFrame;
    public NumberConversion(APP3 ref)
    {
        parentFrame = ref;
        initComponents();
        CommonFunctions.addLabelBackground(lblclose, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\close1.png");
        
        CommonFunctions.addLabelBackground(lblBinaryImg, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\dec_to_binary.jpg");
        CommonFunctions.addLabelBackground(lblOctalImg, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\dec_to_octal.png");
        CommonFunctions.addLabelBackground(lblHexImg, "D:\\A_REGAL_CLASSES\\JAVA_CLASS\\NetBeansProjects\\Assignments\\src\\main\\java\\Images\\dec_to_hex.png");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        lblclose = new javax.swing.JLabel();
        conversionTabbedPane = new javax.swing.JTabbedPane();
        decimalTOBinaryPanel = new javax.swing.JPanel();
        subPanel1 = new javax.swing.JPanel();
        lblBinaryImg = new javax.swing.JLabel();
        lblsteps = new javax.swing.JLabel();
        subPanel2 = new javax.swing.JPanel();
        lblmsg = new javax.swing.JLabel();
        txtdecimalBinary = new javax.swing.JTextField();
        btnbinary = new javax.swing.JButton();
        lblmsg2 = new javax.swing.JLabel();
        lblansBinary = new javax.swing.JLabel();
        decimalToOctalPanel = new javax.swing.JPanel();
        subPanel3 = new javax.swing.JPanel();
        lblOctalImg = new javax.swing.JLabel();
        lblsteps1 = new javax.swing.JLabel();
        subPanel4 = new javax.swing.JPanel();
        lblmsg1 = new javax.swing.JLabel();
        txtdecimalOctal = new javax.swing.JTextField();
        btnoctal = new javax.swing.JButton();
        lblmsg3 = new javax.swing.JLabel();
        lblansOctal = new javax.swing.JLabel();
        decimalToHexPanel = new javax.swing.JPanel();
        subPanel5 = new javax.swing.JPanel();
        lblHexImg = new javax.swing.JLabel();
        lblsteps2 = new javax.swing.JLabel();
        subPanel6 = new javax.swing.JPanel();
        lblmsg4 = new javax.swing.JLabel();
        txtdecimalHex = new javax.swing.JTextField();
        btnHex = new javax.swing.JButton();
        lblmsg5 = new javax.swing.JLabel();
        lblansHex = new javax.swing.JLabel();
        lblback = new javax.swing.JLabel();

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

        conversionTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        conversionTabbedPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        conversionTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        conversionTabbedPane.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        conversionTabbedPane.setOpaque(true);

        decimalTOBinaryPanel.setBackground(new java.awt.Color(255, 255, 255));

        subPanel1.setBackground(new java.awt.Color(255, 255, 255));
        subPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblsteps.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblsteps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsteps.setText("STEPS");

        javax.swing.GroupLayout subPanel1Layout = new javax.swing.GroupLayout(subPanel1);
        subPanel1.setLayout(subPanel1Layout);
        subPanel1Layout.setHorizontalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBinaryImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblsteps, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        subPanel1Layout.setVerticalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanel1Layout.createSequentialGroup()
                .addComponent(lblsteps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBinaryImg, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subPanel2.setBackground(new java.awt.Color(255, 204, 204));
        subPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblmsg.setBackground(new java.awt.Color(255, 153, 153));
        lblmsg.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        lblmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg.setText("Enter Decimal Number :");
        lblmsg.setOpaque(true);

        txtdecimalBinary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdecimalBinary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdecimalBinary.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtdecimalBinaryKeyTyped(evt);
            }
        });

        btnbinary.setBackground(new java.awt.Color(255, 0, 0));
        btnbinary.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnbinary.setForeground(new java.awt.Color(255, 255, 255));
        btnbinary.setText("CONVERT");
        btnbinary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbinary.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnbinaryActionPerformed(evt);
            }
        });

        lblmsg2.setBackground(new java.awt.Color(255, 153, 153));
        lblmsg2.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        lblmsg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg2.setText("Binary Equivalent is :");
        lblmsg2.setOpaque(true);

        lblansBinary.setBackground(new java.awt.Color(255, 153, 153));
        lblansBinary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblansBinary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblansBinary.setOpaque(true);

        javax.swing.GroupLayout subPanel2Layout = new javax.swing.GroupLayout(subPanel2);
        subPanel2.setLayout(subPanel2Layout);
        subPanel2Layout.setHorizontalGroup(
            subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdecimalBinary)
                    .addComponent(btnbinary, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(subPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmsg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblansBinary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanel2Layout.setVerticalGroup(
            subPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdecimalBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnbinary, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblmsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblansBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout decimalTOBinaryPanelLayout = new javax.swing.GroupLayout(decimalTOBinaryPanel);
        decimalTOBinaryPanel.setLayout(decimalTOBinaryPanelLayout);
        decimalTOBinaryPanelLayout.setHorizontalGroup(
            decimalTOBinaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decimalTOBinaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(subPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        decimalTOBinaryPanelLayout.setVerticalGroup(
            decimalTOBinaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decimalTOBinaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(decimalTOBinaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        conversionTabbedPane.addTab("DECIMAL TO BINARY", decimalTOBinaryPanel);

        decimalToOctalPanel.setBackground(new java.awt.Color(255, 255, 255));

        subPanel3.setBackground(new java.awt.Color(255, 255, 255));
        subPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblsteps1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblsteps1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsteps1.setText("STEPS");

        javax.swing.GroupLayout subPanel3Layout = new javax.swing.GroupLayout(subPanel3);
        subPanel3.setLayout(subPanel3Layout);
        subPanel3Layout.setHorizontalGroup(
            subPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOctalImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(subPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsteps1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        subPanel3Layout.setVerticalGroup(
            subPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanel3Layout.createSequentialGroup()
                .addComponent(lblsteps1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOctalImg, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subPanel4.setBackground(new java.awt.Color(204, 255, 255));
        subPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblmsg1.setBackground(new java.awt.Color(0, 204, 204));
        lblmsg1.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        lblmsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg1.setText("Enter Decimal Number :");
        lblmsg1.setOpaque(true);

        txtdecimalOctal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdecimalOctal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdecimalOctal.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtdecimalOctalKeyTyped(evt);
            }
        });

        btnoctal.setBackground(new java.awt.Color(255, 0, 0));
        btnoctal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnoctal.setForeground(new java.awt.Color(255, 255, 255));
        btnoctal.setText("CONVERT");
        btnoctal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnoctal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnoctalActionPerformed(evt);
            }
        });

        lblmsg3.setBackground(new java.awt.Color(0, 204, 204));
        lblmsg3.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        lblmsg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg3.setText("Octal Equivalent is :");
        lblmsg3.setOpaque(true);

        lblansOctal.setBackground(new java.awt.Color(0, 204, 204));
        lblansOctal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblansOctal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblansOctal.setOpaque(true);

        javax.swing.GroupLayout subPanel4Layout = new javax.swing.GroupLayout(subPanel4);
        subPanel4.setLayout(subPanel4Layout);
        subPanel4Layout.setHorizontalGroup(
            subPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel4Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(subPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdecimalOctal)
                    .addComponent(btnoctal, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(subPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmsg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmsg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblansOctal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanel4Layout.setVerticalGroup(
            subPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdecimalOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnoctal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblmsg3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblansOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout decimalToOctalPanelLayout = new javax.swing.GroupLayout(decimalToOctalPanel);
        decimalToOctalPanel.setLayout(decimalToOctalPanelLayout);
        decimalToOctalPanelLayout.setHorizontalGroup(
            decimalToOctalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decimalToOctalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(subPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        decimalToOctalPanelLayout.setVerticalGroup(
            decimalToOctalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decimalToOctalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(decimalToOctalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        conversionTabbedPane.addTab("DECIMAL TO OCTAL", decimalToOctalPanel);

        decimalToHexPanel.setBackground(new java.awt.Color(255, 255, 255));

        subPanel5.setBackground(new java.awt.Color(255, 255, 255));
        subPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblsteps2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblsteps2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsteps2.setText("STEPS");

        javax.swing.GroupLayout subPanel5Layout = new javax.swing.GroupLayout(subPanel5);
        subPanel5.setLayout(subPanel5Layout);
        subPanel5Layout.setHorizontalGroup(
            subPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHexImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsteps2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        subPanel5Layout.setVerticalGroup(
            subPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanel5Layout.createSequentialGroup()
                .addComponent(lblsteps2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHexImg, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subPanel6.setBackground(new java.awt.Color(204, 255, 204));
        subPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblmsg4.setBackground(new java.awt.Color(0, 204, 0));
        lblmsg4.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        lblmsg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg4.setText("Enter Decimal Number :");
        lblmsg4.setOpaque(true);

        txtdecimalHex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdecimalHex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdecimalHex.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtdecimalHexKeyTyped(evt);
            }
        });

        btnHex.setBackground(new java.awt.Color(255, 0, 0));
        btnHex.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnHex.setForeground(new java.awt.Color(255, 255, 255));
        btnHex.setText("CONVERT");
        btnHex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHex.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHexActionPerformed(evt);
            }
        });

        lblmsg5.setBackground(new java.awt.Color(51, 204, 0));
        lblmsg5.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        lblmsg5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmsg5.setText("Hexadecimal Equivalent is :");
        lblmsg5.setOpaque(true);

        lblansHex.setBackground(new java.awt.Color(51, 204, 0));
        lblansHex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblansHex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblansHex.setOpaque(true);

        javax.swing.GroupLayout subPanel6Layout = new javax.swing.GroupLayout(subPanel6);
        subPanel6.setLayout(subPanel6Layout);
        subPanel6Layout.setHorizontalGroup(
            subPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel6Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(subPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdecimalHex)
                    .addComponent(btnHex, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(subPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmsg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmsg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblansHex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subPanel6Layout.setVerticalGroup(
            subPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmsg4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdecimalHex, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnHex, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblmsg5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblansHex, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout decimalToHexPanelLayout = new javax.swing.GroupLayout(decimalToHexPanel);
        decimalToHexPanel.setLayout(decimalToHexPanelLayout);
        decimalToHexPanelLayout.setHorizontalGroup(
            decimalToHexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decimalToHexPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(subPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        decimalToHexPanelLayout.setVerticalGroup(
            decimalToHexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decimalToHexPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(decimalToHexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        conversionTabbedPane.addTab("DECIMAL TO HEXADECIMAL", decimalToHexPanel);

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

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(conversionTabbedPane)
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblclose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblback, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conversionTabbedPane)
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

    private void txtdecimalBinaryKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtdecimalBinaryKeyTyped
    {//GEN-HEADEREND:event_txtdecimalBinaryKeyTyped
        // TODO add your handling code here:
        CommonFunctions.integerValidation(evt);
    }//GEN-LAST:event_txtdecimalBinaryKeyTyped

    private void btnbinaryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnbinaryActionPerformed
    {//GEN-HEADEREND:event_btnbinaryActionPerformed
        // CODE TO CONVERT DECIMAL TO BINARY
        int num = Integer.parseInt(txtdecimalBinary.getText()); 
        lblansBinary.setText(Integer.toBinaryString(num));      //inbuilt method
        
        /*
        int binary[] = new int[16];             //for 16-bit binary
        int i=0;
        while(num > 0 && i<16)
        {
            binary[i] = (num % 2);
            num = num/2;
            i++;
        }
        //we have to reverse binary array
        String ansBinary = "";
        int count=0;
        int len = binary.length;
        for(int j=len-1; j>=0; j--)
        {
            count++;
            ansBinary = ansBinary + String.valueOf(binary[j]);
            if(count == 4)
            {
                count = 0;
                ansBinary = ansBinary + " ";
            }
        }
        lblansBinary.setText(ansBinary);
        */
    }//GEN-LAST:event_btnbinaryActionPerformed

    private void txtdecimalOctalKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtdecimalOctalKeyTyped
    {//GEN-HEADEREND:event_txtdecimalOctalKeyTyped
        // TODO add your handling code here:
        CommonFunctions.integerValidation(evt);
    }//GEN-LAST:event_txtdecimalOctalKeyTyped

    private void txtdecimalHexKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtdecimalHexKeyTyped
    {//GEN-HEADEREND:event_txtdecimalHexKeyTyped
        // TODO add your handling code here:
        CommonFunctions.integerValidation(evt);
    }//GEN-LAST:event_txtdecimalHexKeyTyped

    private void btnoctalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnoctalActionPerformed
    {//GEN-HEADEREND:event_btnoctalActionPerformed
        //CODE TO CONVERT DECIMAL TO OCTAL
        int num = Integer.parseInt(txtdecimalOctal.getText());
        lblansOctal.setText(Integer.toOctalString(num));        //Inbuilt method
        
        /*
        int octal[] = new int[16];
        int i=0;
        while(num>0 && i<16)
        {
            octal[i] = num % 8;
            num = num / 8; 
            i++;
        }
        //we have to reverse octal array
        String ansOctal = "";
        for(int j=(i-1); j>=0; j--)
        {
            ansOctal = ansOctal + String.valueOf(octal[j]); 
        }
        lblansOctal.setText(ansOctal);
        */
    }//GEN-LAST:event_btnoctalActionPerformed

    private void btnHexActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHexActionPerformed
    {//GEN-HEADEREND:event_btnHexActionPerformed
        // CODE TO CONVERT DECIMAL TO HEXADECIMAL
        int num = Integer.parseInt(txtdecimalHex.getText());
        lblansHex.setText(Integer.toHexString(num));  //inbuilt method
        
        /*
        char hex[] = new char[16];
        int i=0;
        while(num!=0)
        {
            int temp = 0;
            temp = num % 16;
            
            if(temp < 10)
            {
                hex[i] = (char)(temp + 48);
                i++;
            }
            else
            {
                hex[i] = (char)(temp + 55);
                i++;
            }
            num = num / 16;
        }
        //we have to reverse hex array
        String anshex = "";
        for(int j=(i-1); j>=0; j--)
        {
            anshex = anshex + String.valueOf(hex[j]); 
        }
        lblansHex.setText(anshex); 
        */
    }//GEN-LAST:event_btnHexActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHex;
    private javax.swing.JButton btnbinary;
    private javax.swing.JButton btnoctal;
    private javax.swing.JTabbedPane conversionTabbedPane;
    private javax.swing.JPanel decimalTOBinaryPanel;
    private javax.swing.JPanel decimalToHexPanel;
    private javax.swing.JPanel decimalToOctalPanel;
    private javax.swing.JLabel lblBinaryImg;
    private javax.swing.JLabel lblHexImg;
    private javax.swing.JLabel lblOctalImg;
    private javax.swing.JLabel lblansBinary;
    private javax.swing.JLabel lblansHex;
    private javax.swing.JLabel lblansOctal;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JLabel lblmsg1;
    private javax.swing.JLabel lblmsg2;
    private javax.swing.JLabel lblmsg3;
    private javax.swing.JLabel lblmsg4;
    private javax.swing.JLabel lblmsg5;
    private javax.swing.JLabel lblsteps;
    private javax.swing.JLabel lblsteps1;
    private javax.swing.JLabel lblsteps2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel subPanel1;
    private javax.swing.JPanel subPanel2;
    private javax.swing.JPanel subPanel3;
    private javax.swing.JPanel subPanel4;
    private javax.swing.JPanel subPanel5;
    private javax.swing.JPanel subPanel6;
    private javax.swing.JTextField txtdecimalBinary;
    private javax.swing.JTextField txtdecimalHex;
    private javax.swing.JTextField txtdecimalOctal;
    // End of variables declaration//GEN-END:variables
}
