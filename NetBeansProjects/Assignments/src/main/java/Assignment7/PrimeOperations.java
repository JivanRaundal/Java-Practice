
package Assignment7;

import javax.swing.JOptionPane;


public class PrimeOperations extends javax.swing.JFrame
{
    APP1 parentFrame;
    public PrimeOperations(APP1 ref)
    {
        parentFrame = ref;
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
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        lblnum1 = new javax.swing.JLabel();
        lblnum2 = new javax.swing.JLabel();
        btnans = new javax.swing.JButton();
        scrollBar = new javax.swing.JScrollPane();
        txtans = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(386, 301));
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

        txtnum1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtnum1KeyTyped(evt);
            }
        });

        txtnum2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtnum2KeyTyped(evt);
            }
        });

        lblnum1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblnum1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnum1.setText("NUM-1");

        lblnum2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblnum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnum2.setText("NUM-2");

        javax.swing.GroupLayout subPanel1Layout = new javax.swing.GroupLayout(subPanel1);
        subPanel1.setLayout(subPanel1Layout);
        subPanel1Layout.setHorizontalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblnum1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(txtnum1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnum2)
                    .addComponent(lblnum2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        subPanel1Layout.setVerticalGroup(
            subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnum2)
                    .addComponent(txtnum1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        btnans.setBackground(new java.awt.Color(255, 0, 0));
        btnans.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnans.setForeground(new java.awt.Color(255, 255, 255));
        btnans.setText("ANSWER");
        btnans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnans.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnansActionPerformed(evt);
            }
        });

        txtans.setColumns(20);
        txtans.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtans.setRows(5);
        txtans.setText("ANSWER HERE");
        scrollBar.setViewportView(txtans);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(lblback, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(btnans)
                .addGap(135, 135, 135))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator1)
                    .addComponent(subPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollBar))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblback, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lblclose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnans, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(scrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
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

    private void txtnum1KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtnum1KeyTyped
    {//GEN-HEADEREND:event_txtnum1KeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtnum1KeyTyped

    private void txtnum2KeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtnum2KeyTyped
    {//GEN-HEADEREND:event_txtnum2KeyTyped
        // TODO add your handling code here:
        CommonFunctions.numericValidation(evt);
    }//GEN-LAST:event_txtnum2KeyTyped

    private void btnansActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnansActionPerformed
    {//GEN-HEADEREND:event_btnansActionPerformed
        // TODO add your handling code here:
        primeOperation();
    }//GEN-LAST:event_btnansActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnans;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblnum1;
    private javax.swing.JLabel lblnum2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane scrollBar;
    private javax.swing.JSeparator separator1;
    private javax.swing.JPanel subPanel1;
    private javax.swing.JTextArea txtans;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables

	private void primeOperation()
	{
		txtans.setText("");
		String prime_ans = "Prime Numbers : ";
		String str1 = txtnum1.getText();
		String str2 = txtnum2.getText();
		
		try
		{
			//If only one number is entered, then check if that number is prime or not
			if(str1.equals(""))		
			{
				if(isPrimeNumber(Integer.parseInt(str2)))
					txtans.setText(str2 + " is a prime number");
				else
					txtans.setText(str2 + " is not a prime number");
				return;
			}
			if(str2.equals(""))
			{
				if(isPrimeNumber(Integer.parseInt(str1)))
					txtans.setText(str1 + " is a prime number");
				else
					txtans.setText(str1 + " is not a prime number");
				return;
			}
			
			//if both numbers are entered, then find prime numbers between them
			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);
			int num1 = a < b ? a : b;
			int num2 = a > b ? a : b;
			
			if(num1 < 2 && num1 >=0)
			{
				num1 = 2;
			}
			
			int i,j,flag;
			for(i=num1; i<=num2;  i++)
			{
				flag = 0;
				for(j=2; j<=i/2; j++)
				{
					if(i%j == 0)
					{
						flag = 1;
						break;
					}
				}
				if(flag == 0)
				{
					prime_ans = prime_ans + String.valueOf(i) + ", ";
					txtans.setText(prime_ans);
				}
			}
		}
		catch(NumberFormatException ne)
		{
                    txtnum1.setText("");
                    txtnum2.setText("");					
                    txtnum1.requestFocus();				//this method will move cursor on txtstartNumber only
                    JOptionPane.showMessageDialog(this, "Invalid Data", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private boolean isPrimeNumber(int num)
	{
		int i,flag=0;
		if(num<2 && num>=0)
			return false;			//not prime
			
		for(i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				flag=1;
				break;
			}
		}
		if(flag == 0)
			return true;
		else
			return false;
	}
}
