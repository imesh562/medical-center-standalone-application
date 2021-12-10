package medicalc;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class reg extends javax.swing.JFrame {

    public reg() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Cancel = new javax.swing.JButton();
        JButton_Register = new javax.swing.JButton();
        jLabelLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Uname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RePassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        Dob = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        MobileNum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Arogya Medical Centre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelMin)
                    .addComponent(jLabelClose))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("First Name :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Password :");

        Fname.setBackground(new java.awt.Color(108, 122, 137));
        Fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fname.setForeground(new java.awt.Color(228, 241, 254));

        Password.setBackground(new java.awt.Color(108, 122, 137));
        Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(228, 241, 254));

        Cancel.setBackground(new java.awt.Color(242, 38, 19));
        Cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        JButton_Register.setBackground(new java.awt.Color(34, 167, 240));
        JButton_Register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JButton_Register.setForeground(new java.awt.Color(255, 255, 255));
        JButton_Register.setText("Register");
        JButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_RegisterActionPerformed(evt);
            }
        });

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(248, 148, 6));
        jLabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogin.setText("Click here to go back to Log In.");
        jLabelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please Enter Your Information to Register.");

        Lname.setBackground(new java.awt.Color(108, 122, 137));
        Lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lname.setForeground(new java.awt.Color(228, 241, 254));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Last Name :");

        Uname.setBackground(new java.awt.Color(108, 122, 137));
        Uname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Uname.setForeground(new java.awt.Color(228, 241, 254));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Username :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Retype Pass :");

        RePassword.setBackground(new java.awt.Color(108, 122, 137));
        RePassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RePassword.setForeground(new java.awt.Color(228, 241, 254));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Birth Date :");

        Dob.setBackground(new java.awt.Color(108, 122, 137));
        Dob.setForeground(new java.awt.Color(228, 241, 254));
        Dob.setToolTipText("");
        Dob.setDateFormatString("yyyy-MM-d ");
        Dob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Address :");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Address.setBackground(new java.awt.Color(108, 122, 137));
        Address.setColumns(20);
        Address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Address.setForeground(new java.awt.Color(228, 241, 254));
        Address.setLineWrap(true);
        Address.setRows(5);
        Address.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Address);

        MobileNum.setBackground(new java.awt.Color(108, 122, 137));
        MobileNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MobileNum.setForeground(new java.awt.Color(228, 241, 254));
        MobileNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MobileNumKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("Mobile Num :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username should be at least 6 characters long. ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password should be exactly 8 charachter long. ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(JButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(Password)
                            .addComponent(Fname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Uname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RePassword)
                            .addComponent(Dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MobileNum, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addComponent(jLabelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(Dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MobileNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLogin)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 430, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        log_in log = new log_in();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
        log_in log = new log_in();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelLoginMouseClicked

    private void JButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_RegisterActionPerformed

        String FirstName = Fname.getText();
        String LastName = Lname.getText();
        String Username = Uname.getText();
        String PW = String.valueOf(Password.getPassword());
        String REPW = String.valueOf(RePassword.getPassword());
        String address = Address.getText();
        String number = MobileNum.getText();
        String bdate = null;
        
        //This Code is used to check if FirstName is null when registering.
        if(FirstName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Your FirstName.");
        }
        
        //This Code is used to check if LastName is null when registering.
        else if(LastName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Your LastName.");
        }
        
        //This Code is used to check if Username is null when registering.
        else if(Username.equals("") || Username.length()<6)
        {
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Username.");
        }
        
        //This Code is used to check if Password is null when registering.
        else if(PW.equals("")||PW.length()!=8)
        {
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Password.");
        }
        
        //This Code is used to check if Password is equal to Retyping Password is when registering.
        else if(!PW.equals(REPW))
        {
            JOptionPane.showMessageDialog(null, "Retype The Password.");
        }

        //This Code is used to check if Mobile Number is null when registering.
        else if(number.equals("")|| number.length()<10)
        {
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Mobile Number.");
        }

        //This Code is used to check if Address is null when registering.
        else if(address.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Your Address.");
        }
        
        else{
            
            //This Code is used to check if DOB is null when registering.
            if(Dob.getDate() != null)
            {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            bdate = dateformat.format(Dob.getDate());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please Enter Your Birthday");
            }
            
            //This Code is used to check if username is available when registering.
            String CODE ="SELECT * FROM login_info.login_info WHERE Username='"+Username+"';";
            PreparedStatement statemnt ;
            try {
                statemnt = dbConnection.getConnection().prepareStatement(CODE);
                ResultSet rs = statemnt.executeQuery();
            if(rs.next())
            {
            JOptionPane.showMessageDialog(null, "Please Enter A Different Username.");
            }
            } catch (SQLException ex) {
                Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //This Code is used to check if Password is available when registering.
            String SQL ="SELECT * FROM login_info.login_info WHERE Password='"+PW+"';";
            PreparedStatement stmt ;
            try {
                stmt = dbConnection.getConnection().prepareStatement(SQL);
                ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
            JOptionPane.showMessageDialog(null, "Please Enter A Different Password");
            }
            } catch (SQLException ex) {
                Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }

            
        PreparedStatement ps;
        String query = "INSERT INTO `login_info`.`login_info` (`Firstname`, `Lastname`, `Username`, `DOB`, `Password`,`Address`,`MoNumber`) VALUES (?,?,?,?,?,?,?);";
        
        try {
            ps = dbConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, FirstName);
            ps.setString(2, LastName);
            ps.setString(3, Username);
            ps.setString(4, bdate);
            ps.setString(5, PW);
            ps.setString(6, address);
            ps.setString(7, number);
            
            if (ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null, "Registration Complete");
                log_in log = new log_in();
                log.setVisible(true);
                log.pack();
                log.setLocationRelativeTo(null);
                log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_JButton_RegisterActionPerformed
    }
        
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        log_in log = new log_in();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    //This Code is used to stop user from entering letters and enter more than 10 digits for Mobile Number.
    private void MobileNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MobileNumKeyPressed
        String phoneNumber = MobileNum.getText();
        int length = phoneNumber.length();
        char c= evt.getKeyChar();
        //checking for number 0 to 9.
        if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
        //checking for number of digits more than 10.
        if(length<10){
            //can edit.
            MobileNum.setEditable(true);
            } 
        
        else{
            //cannot edit if length is more than 10.
            MobileNum.setEditable(false);
            }
        }
        else{//allowing backspace key and space key.
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
            MobileNum.setEditable(true);}
            else{
                    MobileNum.setEditable(false);}
            
        }
    }//GEN-LAST:event_MobileNumKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JButton Cancel;
    private com.toedter.calendar.JDateChooser Dob;
    private javax.swing.JTextField Fname;
    private javax.swing.JButton JButton_Register;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField MobileNum;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPasswordField RePassword;
    private javax.swing.JTextField Uname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}