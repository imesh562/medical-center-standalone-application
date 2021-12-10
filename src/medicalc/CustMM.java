package medicalc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

public class CustMM extends javax.swing.JFrame {

    public CustMM() {
        initComponents();
        Fillcombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        newappoint = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        billtxt = new javax.swing.JTextArea();
        appointment = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        appointTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        labtest = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LabTestTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TestPrice = new javax.swing.JLabel();
        docs = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DocTable = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        about = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tHistory = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        apoointHis = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        labHis = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your Appointments");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add a New Appointment");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Require a Lab Test");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("View Doctors Info");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("About Us");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Log Out");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        Welcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("jLabel1");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Treatment History");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jLabel21))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(266, 266, 266))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 270, 630));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(new java.awt.CardLayout());

        newappoint.setBackground(new java.awt.Color(44, 62, 80));
        newappoint.setPreferredSize(new java.awt.Dimension(732, 636));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Specialties :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Doctors Name :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Available Time Periods :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Please Give Informations for Following Fields.");

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton4.setText("5.00 - 5.20");

        buttonGroup1.add(jToggleButton6);
        jToggleButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton6.setText("5.40 - 6.00");

        buttonGroup1.add(jToggleButton14);
        jToggleButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton14.setText("8.00 - 8.20");

        buttonGroup1.add(jToggleButton10);
        jToggleButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton10.setText("6.40 - 7.00");

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton2.setText("4.20 - 4.40");

        buttonGroup1.add(jToggleButton13);
        jToggleButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton13.setText("7.40 - 8.00");

        buttonGroup1.add(jToggleButton12);
        jToggleButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton12.setText("7.20 - 7.40");

        buttonGroup1.add(jToggleButton11);
        jToggleButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton11.setText("7.00 - 7.20");

        buttonGroup1.add(jToggleButton9);
        jToggleButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton9.setText("6.20 - 6.40");

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton1.setText("4.00 - 4.20");

        buttonGroup1.add(jToggleButton5);
        jToggleButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton5.setText("5.20 - 5.40");

        buttonGroup1.add(jToggleButton15);
        jToggleButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton15.setText("8.20 - 8.40");

        buttonGroup1.add(jToggleButton7);
        jToggleButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton7.setText("6.00 - 6.20");

        buttonGroup1.add(jToggleButton16);
        jToggleButton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton16.setText("8.40 - 9.00");

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton3.setText("4.40 - 5.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton13)
                            .addComponent(jToggleButton7))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jToggleButton14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton15)
                            .addComponent(jToggleButton10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton5))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton6)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton9)
                    .addComponent(jToggleButton10)
                    .addComponent(jToggleButton11))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton12)
                    .addComponent(jToggleButton13)
                    .addComponent(jToggleButton14)
                    .addComponent(jToggleButton15)
                    .addComponent(jToggleButton16))
                .addContainerGap())
        );

        billtxt.setBackground(new java.awt.Color(108, 122, 137));
        billtxt.setColumns(20);
        billtxt.setForeground(new java.awt.Color(228, 241, 254));
        billtxt.setRows(5);
        jScrollPane6.setViewportView(billtxt);

        javax.swing.GroupLayout newappointLayout = new javax.swing.GroupLayout(newappoint);
        newappoint.setLayout(newappointLayout);
        newappointLayout.setHorizontalGroup(
            newappointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newappointLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
            .addGroup(newappointLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newappointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newappointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6)
                .addGap(6, 6, 6))
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newappointLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(newappointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newappointLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newappointLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(271, 271, 271))))
        );
        newappointLayout.setVerticalGroup(
            newappointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newappointLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addGroup(newappointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newappointLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(newappointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newappointLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newappointLayout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)))
                        .addGap(82, 82, 82))
                    .addGroup(newappointLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jPanel2.add(newappoint, "card2");

        appointment.setBackground(new java.awt.Color(44, 62, 80));

        jScrollPane2.setBackground(new java.awt.Color(44, 62, 80));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        appointTable.setBackground(new java.awt.Color(44, 62, 80));
        appointTable.setForeground(new java.awt.Color(255, 255, 255));
        appointTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Doctor Specialty", "Doctor Name", "Time"
            }
        ));
        appointTable.setFillsViewportHeight(true);
        appointTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(appointTable);
        if (appointTable.getColumnModel().getColumnCount() > 0) {
            appointTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            appointTable.getColumnModel().getColumn(1).setPreferredWidth(300);
            appointTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            appointTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Appointments Booked By User");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("To Remove A Appointment Select The Appointment ID That You Want To Remove and Press Remove.");

        jButton2.setBackground(new java.awt.Color(242, 38, 19));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout appointmentLayout = new javax.swing.GroupLayout(appointment);
        appointment.setLayout(appointmentLayout);
        appointmentLayout.setHorizontalGroup(
            appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(19, 19, 19))
            .addGroup(appointmentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        appointmentLayout.setVerticalGroup(
            appointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appointmentLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel13)
                .addGap(56, 56, 56)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jPanel2.add(appointment, "card3");

        labtest.setBackground(new java.awt.Color(44, 62, 80));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Select The Lab Test Name You Want To Get Tested.");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(34, 167, 240));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Confirm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(44, 62, 80));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        LabTestTable.setBackground(new java.awt.Color(44, 62, 80));
        LabTestTable.setForeground(new java.awt.Color(255, 255, 255));
        LabTestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Number", "Username", "Test Name", "Price"
            }
        ));
        LabTestTable.setFillsViewportHeight(true);
        LabTestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabTestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LabTestTable);

        jButton3.setBackground(new java.awt.Color(242, 38, 19));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Price Of The Lab Test :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("To Remove A Lab Test Select The Test Number That You Want To Remove and Press Remove.");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Your Listed Lab Tests.");

        TestPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TestPrice.setForeground(new java.awt.Color(255, 255, 255));
        TestPrice.setText("jLabel18");

        javax.swing.GroupLayout labtestLayout = new javax.swing.GroupLayout(labtest);
        labtest.setLayout(labtestLayout);
        labtestLayout.setHorizontalGroup(
            labtestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labtestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labtestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(labtestLayout.createSequentialGroup()
                        .addGroup(labtestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(labtestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labtestLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(labtestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labtestLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labtestLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(304, 304, 304))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labtestLayout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))))
            .addGroup(labtestLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TestPrice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        labtestLayout.setVerticalGroup(
            labtestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labtestLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addGap(26, 26, 26)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(labtestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(TestPrice))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel17)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel2.add(labtest, "card5");

        docs.setBackground(new java.awt.Color(44, 62, 80));

        DocTable.setBackground(new java.awt.Color(44, 62, 80));
        DocTable.setForeground(new java.awt.Color(255, 255, 255));
        DocTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "Doctors Speciality", "Doctors Name"
            }
        ));
        DocTable.setFillsViewportHeight(true);
        jScrollPane3.setViewportView(DocTable);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Information About all Doctors");

        javax.swing.GroupLayout docsLayout = new javax.swing.GroupLayout(docs);
        docs.setLayout(docsLayout);
        docsLayout.setHorizontalGroup(
            docsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(docsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(docsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
                .addContainerGap())
        );
        docsLayout.setVerticalGroup(
            docsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docsLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.add(docs, "card6");

        about.setBackground(new java.awt.Color(44, 62, 80));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("About Arogya Medical Centre");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("<html>Arogya Medical Centre has over two decades of experience in the healthcare sector, and is known for  <br>providing quality healthcare and valuable experience to all domestic and international patients. Our healthcare offerings are supported by a team of compassionate and dedicated medical professionals<br> who have rich knowledge and experience in their respective domains.</html>");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Contact Us :-");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("E-Mail :- ArogyaMC@gmail.com");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Mobile Number :- 081-2410678");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Address :- Arogya Medical Center, 671 William Gopallawa Mawatha, Kandy");

        javax.swing.GroupLayout aboutLayout = new javax.swing.GroupLayout(about);
        about.setLayout(aboutLayout);
        aboutLayout.setHorizontalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutLayout.createSequentialGroup()
                        .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aboutLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel23))
                            .addGroup(aboutLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addGroup(aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel26)))
                            .addGroup(aboutLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        aboutLayout.setVerticalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel19)
                .addGap(32, 32, 32)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jPanel2.add(about, "card7");

        tHistory.setBackground(new java.awt.Color(44, 62, 80));

        apoointHis.setBackground(new java.awt.Color(44, 62, 80));
        apoointHis.setForeground(new java.awt.Color(255, 255, 255));
        apoointHis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Doctor Name", "Doctors Specielity", "Price"
            }
        ));
        apoointHis.setFillsViewportHeight(true);
        jScrollPane4.setViewportView(apoointHis);

        labHis.setBackground(new java.awt.Color(44, 62, 80));
        labHis.setForeground(new java.awt.Color(255, 255, 255));
        labHis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test ID", "Test Name", "Price"
            }
        ));
        labHis.setFillsViewportHeight(true);
        jScrollPane5.setViewportView(labHis);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Visited Lab Tests List");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Visited Appointment List");

        javax.swing.GroupLayout tHistoryLayout = new javax.swing.GroupLayout(tHistory);
        tHistory.setLayout(tHistoryLayout);
        tHistoryLayout.setHorizontalGroup(
            tHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addComponent(jScrollPane5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tHistoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(241, 241, 241))
            .addGroup(tHistoryLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel27)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        tHistoryLayout.setVerticalGroup(
            tHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tHistoryLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(tHistory, "card7");

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 73, 730, 630));

        jPanel4.setBackground(new java.awt.Color(248, 148, 6));

        jLabelClose1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose1.setText("X");
        jLabelClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });

        jLabelMin1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin1.setText("-");
        jLabelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Arogya Medical Centre");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(660, 660, 660)
                .addComponent(jLabelMin1)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabelMin1)
                    .addComponent(jLabelClose1)))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -9, 1010, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Object selectedItem = jComboBox1.getSelectedItem();
        String selectedItemStr1 = selectedItem.toString();
        Fillcombo2(selectedItemStr1);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (jComboBox2.getSelectedItem()!=null){
        String Item = jComboBox2.getSelectedItem().toString();
        timestore(Item);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private String Username;
    public void setUsername(String uName)
    {
        this.Username=uName;
    }
    
    int docPrice;
    String Time;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String docClass = jComboBox1.getSelectedItem().toString();
        String docName = jComboBox2.getSelectedItem().toString();
        Time=null;
        String Tzone=null;
        int Tcheck=0;
        
        if(jToggleButton1.isSelected())
        {
            Time = "4.00 - 4.20";
            Tzone = "0";
            Tcheck = 1;
        }
 
        if(jToggleButton2.isSelected())
        {
            Time = "4.20 - 4.40";
            Tzone = "1";
            Tcheck = 1;
        }
        
        if(jToggleButton3.isSelected())
        {
            Time = "4.40 - 5.00";
            Tzone = "2";
            Tcheck = 1;
        }
        
        if(jToggleButton4.isSelected())
        {
            Time = "5.00 - 5.20";
            Tzone = "3";
            Tcheck = 1;
        }
        
        if(jToggleButton5.isSelected())
        {
            Time = "5.20 - 5.40";
            Tzone = "4";
            Tcheck = 1;
        }
        
        if(jToggleButton6.isSelected())
        {
            Time = "5.40 - 6.00";
            Tzone = "5";
            Tcheck = 1;
        }
        
        if(jToggleButton7.isSelected())
        {
            Time = "6.00 - 6.20";
            Tzone = "6";
            Tcheck = 1;
        }
        
        if(jToggleButton9.isSelected())
        {
            Time = "6.20 - 6.40";
            Tzone = "7";
            Tcheck = 1;
        }
        
        if(jToggleButton10.isSelected())
        {
            Time = "6.40 - 7.00";
            Tzone = "8";
            Tcheck = 1;
        }
        
        if(jToggleButton11.isSelected())
        {
            Time = "7.00 - 7.20";
            Tzone = "9";
            Tcheck = 1;
        }
        
        if(jToggleButton12.isSelected())
        {
            Time = "7.20 - 7.40";
            Tzone = "10";
            Tcheck = 1;
        }
        
        if(jToggleButton13.isSelected())
        {
            Time = "7.40 - 8.00";
            Tzone = "11";
            Tcheck = 1;
        }
        
        if(jToggleButton14.isSelected())
        {
            Time = "8.00 - 8.20";
            Tzone = "12";
            Tcheck = 1;
        }
        
        if(jToggleButton15.isSelected())
        {
            Time = "8.20 - 8.40";
            Tzone = "13";
            Tcheck = 1;
        }
                
        if(jToggleButton16.isSelected())
        {
            Time = "8.40 - 9.00";
            Tzone = "14";
            Tcheck = 1;
        }
        
        if(Time==null && Tzone==null && Tcheck==0)
        {
            JOptionPane.showMessageDialog(null, "Please Select A Time Period");
        }
        else
        {
        PreparedStatement stmt;
        String line = "UPDATE login_info.docs SET `"+Tzone+"` = "+Tcheck+" WHERE DocName = '"+docName+"';";
        
        PreparedStatement code ;
        String sql = "select * from login_info.docs WHERE DocName = '"+docName+"'";
        
        PreparedStatement ps;
        String query = "INSERT INTO `login_info`.`appointment_table` (`Username`, `DocClass`, `DocName`, `Time`,`Tzone`,`Price`) VALUES (?,?,?,?,?,?);";
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(line);  
            
            code = dbConnection.getConnection().prepareStatement(sql);
            ResultSet rs = code.executeQuery();
            
            while(rs.next())
                {   
                docPrice =Integer.parseInt(rs.getString("Price")) ;
                }
            
            docPrice = docPrice+800;
            
            ps = dbConnection.getConnection().prepareStatement(query);
            ps.setString(1, Username);
            ps.setString(2, docClass);
            ps.setString(3, docName);
            ps.setString(4, Time); 
            ps.setString(5, Tzone);
            ps.setString(6, String.valueOf(docPrice));
                        
            if (ps.executeUpdate()>0 && stmt.executeUpdate()>0)
            {
                buttonGroup1.clearSelection();
                jComboBox2.setSelectedIndex(0);
                bill();
                JOptionPane.showMessageDialog(null, "Appointment Added Succesfully");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed To Add Appointment");
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    String item;
    String zoneT;
    String Dname;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(item!=null && zoneT!=null && Dname!=null)
        {
        int input = JOptionPane.showConfirmDialog(null, "Do You want To Continue ? ");
        if(input==0)
        {
        String sql = "DELETE FROM login_info.appointment_table WHERE AppointID = '"+item+"';";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            int rs = stmt.executeUpdate();
        }
        catch (SQLException ex) 
        {
        Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        String code ="UPDATE login_info.docs SET `"+zoneT+"` = '0' WHERE DocName = '"+Dname+"';";
        PreparedStatement pass ;
        try 
            {
            pass = dbConnection.getConnection().prepareStatement(code);
            int rslt = pass.executeUpdate();
            updateTable();
            item = null;
            }
        catch (SQLException ex) 
            {
            Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
            }
        buttonGroup1.clearSelection();
        jComboBox2.setSelectedIndex(0);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Appointment ID");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void appointTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)appointTable.getModel();
        int selectedRowIndex = appointTable.getSelectedRow();
        
        item = model.getValueAt(selectedRowIndex, 0).toString();
        Dname= model.getValueAt(selectedRowIndex, 2).toString();
        String sql = "select Tzone from login_info.appointment_table WHERE AppointID = '"+item+"'";
        PreparedStatement stmt ;
            try 
            {
                stmt = dbConnection.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next())
                {   
                zoneT =rs.getString("Tzone") ;
                }
            } 
                catch (SQLException ex) 
            {
                Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }//GEN-LAST:event_appointTableMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        int input = JOptionPane.showConfirmDialog(null, "Do You want To Log Out ? ");
        if(input==0)
        {
            log_in log = new log_in();
            log.setVisible(true);
            log.pack();
            log.setLocationRelativeTo(null);
            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        about.setVisible(true);
        appointment.setVisible(false);
        newappoint.setVisible(false);
        labtest.setVisible(false);
        docs.setVisible(false);
        tHistory.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        updateDocTable();
        docs.setVisible(true);
        appointment.setVisible(false);
        newappoint.setVisible(false);
        labtest.setVisible(false);
        about.setVisible(false);
        tHistory.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        labtest.setVisible(true);
        Fillcombo3();
        updateLabTable();
        appointment.setVisible(false);
        newappoint.setVisible(false);
        docs.setVisible(false);
        about.setVisible(false);
        tHistory.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        newappoint.setVisible(true);
        appointment.setVisible(false);
        labtest.setVisible(false);
        docs.setVisible(false);
        about.setVisible(false);
        tHistory.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        updateTable();
        item=null;
        Dname=null;
        appointment.setVisible(true);
        newappoint.setVisible(false);
        labtest.setVisible(false);
        docs.setVisible(false);
        about.setVisible(false);
        tHistory.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked
    String selectedItemStr;
    String price;
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if (jComboBox3.getSelectedItem()!=null){
        selectedItemStr = jComboBox3.getSelectedItem().toString();
        }
        String sql = "select * from login_info.labtests WHERE TestName = '"+selectedItemStr+"'";
        PreparedStatement stmt ;
            try 
            {
                stmt = dbConnection.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next())
                {   
                price =rs.getString("TestPrice") ;
                TestPrice.setText(price);
                }
            } 
                catch (SQLException ex) 
            {
                Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PreparedStatement ps;
        String query = "INSERT INTO `login_info`.`labbook` (`Username`, `TestName`, `Price`) VALUES (?,?,?);";
        try 
        {
            
            ps = dbConnection.getConnection().prepareStatement(query);
            ps.setString(1, Username);
            ps.setString(2, selectedItemStr);
            ps.setString(3, price);
                        
            if (ps.executeUpdate()>0)
            {
                jComboBox3.setSelectedIndex(0);
                JOptionPane.showMessageDialog(null, "Lab Test Added Succesfully");
                updateLabTable();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed To Add Lab Test");
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    String testID;
    private void LabTestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabTestTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)LabTestTable.getModel();
        int selectedRowIndex = LabTestTable.getSelectedRow();
        
        testID = model.getValueAt(selectedRowIndex, 0).toString();
    }//GEN-LAST:event_LabTestTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(testID!=null)
        {
        int input = JOptionPane.showConfirmDialog(null, "Do You want To Continue ? ");
        if(input==0)
        {
        String sql = "DELETE FROM login_info.labbook WHERE Bookid = '"+testID+"';";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            int rs = stmt.executeUpdate();
            updateLabTable();
            testID=null;
        }
        catch (SQLException ex) 
        {
        Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Plese Select A Test Number To Remove A Lab Test ");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        newappoint.setVisible(false);
        appointment.setVisible(false);
        labtest.setVisible(false);
        docs.setVisible(false);
        about.setVisible(false);
        apoointHis();
        labHis();
        tHistory.setVisible(true);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void Fillcombo()
    {
        String sql = "select * from login_info.profession";
        PreparedStatement stmt ;
            try {
                stmt = dbConnection.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
            jComboBox1.addItem(rs.getString("DocClass"));
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void Fillcombo2(String Doclass)
    {
        String sql = "select * from login_info.docs WHERE DocClass = '"+Doclass+"'";
        PreparedStatement stmt ;
            try {
                jComboBox2.removeAllItems();
                stmt = dbConnection.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();

            while(rs.next())
            {   
                jComboBox2.addItem(rs.getString("DocName"));
            }
            }
            catch (SQLException ex) {
                Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
 
    private void timestore(String DocName)
    {
        int i=0;
        int data[] = new int[15];
        String sql = "select * from login_info.docs WHERE DocName = '"+DocName+"'";
        PreparedStatement stmt ;
        try {
                stmt = dbConnection.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {   
            for(int x=4;x<19;x++)
            {
                data[i]=rs.getInt(x);
                i++;
            }
            }
            }
            catch (SQLException ex) {
                Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
            }
        timecheck(data);
    }
    
    private void timecheck(int arr[])
    {
    if(arr[0] == 1)
    {jToggleButton1.setEnabled(false);}
    else{jToggleButton1.setEnabled(true);}
    
    if(arr[1] == 1)
    {jToggleButton2.setEnabled(false);}
    else{jToggleButton2.setEnabled(true);}
    
    if(arr[2] == 1)
    {jToggleButton3.setEnabled(false);}
    else{jToggleButton3.setEnabled(true);}
    
    if(arr[3] == 1)
    {jToggleButton4.setEnabled(false);}
    else{jToggleButton4.setEnabled(true);}
    
    if(arr[4] == 1)
    {jToggleButton5.setEnabled(false);}
    else{jToggleButton5.setEnabled(true);}
    
    if(arr[5] == 1)
    {jToggleButton6.setEnabled(false);}
    else{jToggleButton6.setEnabled(true);}
    
    if(arr[6] == 1)
    {jToggleButton7.setEnabled(false);}
    else{jToggleButton7.setEnabled(true);}
    
    if(arr[7] == 1)
    {jToggleButton9.setEnabled(false);}
    else{jToggleButton9.setEnabled(true);}
    
    if(arr[8] == 1)
    {jToggleButton10.setEnabled(false);}
    else{jToggleButton10.setEnabled(true);}
    
    if(arr[9] == 1)
    {jToggleButton11.setEnabled(false);}
    else{jToggleButton11.setEnabled(true);}
    
    if(arr[10] == 1)
    {jToggleButton12.setEnabled(false);}
    else{jToggleButton12.setEnabled(true);}
    
    if(arr[11] == 1)
    {jToggleButton13.setEnabled(false);}
    else{jToggleButton13.setEnabled(true);}
    
    if(arr[12] == 1)
    {jToggleButton14.setEnabled(false);}
    else{jToggleButton14.setEnabled(true);}
    
    if(arr[13] == 1)
    {jToggleButton15.setEnabled(false);}
    else{jToggleButton15.setEnabled(true);}
    
    if(arr[14] == 1)
    {jToggleButton16.setEnabled(false);}
    else{jToggleButton16.setEnabled(true);}
    }
    
    private void updateTable()
    {
        String sql = "select AppointID,DocClass,DocName,Time,Price from login_info.appointment_table WHERE Username = '"+Username+"' AND confirm = 0 ORDER BY AppointID DESC";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            appointTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            TableColumnModel columnModel = appointTable.getColumnModel();
            
            appointTable.setShowHorizontalLines(false);
            appointTable.setShowVerticalLines(false);
            appointTable.setShowGrid(false);
            columnModel.getColumn(0).setPreferredWidth(50);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(250);
            columnModel.getColumn(3).setPreferredWidth(50);
            columnModel.getColumn(4).setPreferredWidth(50);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }
    
    private void updateLabTable()
    {
        String sql = "select Bookid, Username, TestName, Price from login_info.labbook WHERE Username = '"+Username+"' AND confirm = 0 ORDER BY Bookid DESC";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            LabTestTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            TableColumnModel columnModel = LabTestTable.getColumnModel();
            
            LabTestTable.setShowHorizontalLines(false);
            LabTestTable.setShowVerticalLines(false);
            LabTestTable.setShowGrid(false);
            columnModel.getColumn(0).setPreferredWidth(100);
            columnModel.getColumn(1).setPreferredWidth(230);
            columnModel.getColumn(2).setPreferredWidth(220);
            columnModel.getColumn(3).setPreferredWidth(50);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }
    
        private void updateDocTable()
    {
        String sql = "select Docid,DocName,DocClass,Price from login_info.docs;";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DocTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            TableColumnModel columnModel = DocTable.getColumnModel();
            
            DocTable.setShowHorizontalLines(false);
            DocTable.setShowVerticalLines(false);
            DocTable.setShowGrid(false);
            columnModel.getColumn(0).setPreferredWidth(100);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(200);
            columnModel.getColumn(3).setPreferredWidth(100);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }
    
        private void Fillcombo3()
    {
        String sql = "SELECT * FROM login_info.labtests;";
        PreparedStatement stmt ;
            try {
                jComboBox3.removeAllItems();
                stmt = dbConnection.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();

            while(rs.next())
            {   
                jComboBox3.addItem(rs.getString("TestName"));
            }
            }
            catch (SQLException ex) {
                Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
                  
    private void apoointHis()
    {
        String sql = "select AppointID,DocName,DocClass,Price from login_info.appointment_table WHERE Username = '"+Username+"' AND confirm = 1 ORDER BY AppointID DESC";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            apoointHis.setModel(DbUtils.resultSetToTableModel(rs));
            
            TableColumnModel columnModel = apoointHis.getColumnModel();
            
            apoointHis.setShowHorizontalLines(false);
            apoointHis.setShowVerticalLines(false);
            apoointHis.setShowGrid(false);
            columnModel.getColumn(0).setPreferredWidth(50);
            columnModel.getColumn(1).setPreferredWidth(250);
            columnModel.getColumn(2).setPreferredWidth(250);
            columnModel.getColumn(3).setPreferredWidth(50);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }
    
        private void labHis()
    {
        String sql = "select Bookid,TestName,Price from login_info.labbook WHERE Username = '"+Username+"' AND confirm = 1 ORDER BY Bookid DESC";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            labHis.setModel(DbUtils.resultSetToTableModel(rs));
            
            TableColumnModel columnModel = labHis.getColumnModel();
            
            labHis.setShowHorizontalLines(false);
            labHis.setShowVerticalLines(false);
            labHis.setShowGrid(false);
            columnModel.getColumn(0).setPreferredWidth(100);
            columnModel.getColumn(1).setPreferredWidth(400);
            columnModel.getColumn(2).setPreferredWidth(100);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }
        
        public void bill()
    {
        if (jComboBox2.getSelectedItem()!=null){
        String docName = jComboBox2.getSelectedItem().toString();
        String Fname=null;
        String Lname=null;
        String dcPrice=null;
        String sql = "select Firstname, Lastname from login_info.login_info WHERE Username = '"+Username+"'";
        PreparedStatement stmt ;
        
        String query = "select Price from login_info.docs WHERE DocName = '"+docName+"'";
        PreparedStatement state ;
            try 
            {
                stmt = dbConnection.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                
                state = dbConnection.getConnection().prepareStatement(query);
                ResultSet results = state.executeQuery();
                
                while(rs.next())
                {   
                Fname =rs.getString("Firstname") ;
                Lname =rs.getString("Lastname") ;
                }
                
                while(results.next())
                {   
                dcPrice =results.getString("Price") ;
                }
            } 
                catch (SQLException ex) 
            {
                Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            int i=Integer.parseInt(dcPrice);
            int Total= i+800;
        
        billtxt.setText(billtxt.getText() +"****************************Bill*******************************\n");
        billtxt.setText(billtxt.getText() +"**************************************************************\n");
        billtxt.setText(billtxt.getText() +"Customer "+"\t: "+ Fname +" "+Lname+"\n");
        billtxt.setText(billtxt.getText() +"Doctors Name "+"\t: "+ docName +"\n");
        billtxt.setText(billtxt.getText() +"Time Period "+"\t: "+ Time +"\n");
        billtxt.setText(billtxt.getText() +"Price "+"\t: "+ dcPrice +"\n");
        billtxt.setText(billtxt.getText() +"Center Fee "+"\t: 800\n");
        billtxt.setText(billtxt.getText() +"Total "+"\t: "+ Total +"\n");
        billtxt.setText(billtxt.getText() +"**************************************************************\n");
        billtxt.setText(billtxt.getText() +"***********************Thank You****************************\n");
        billtxt.setText(billtxt.getText() +"\n");
        } 
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustMM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustMM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustMM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustMM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustMM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DocTable;
    private javax.swing.JTable LabTestTable;
    private javax.swing.JLabel TestPrice;
    public javax.swing.JLabel Welcome;
    private javax.swing.JPanel about;
    private javax.swing.JTable apoointHis;
    private javax.swing.JTable appointTable;
    private javax.swing.JPanel appointment;
    private javax.swing.JTextArea billtxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel docs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JTable labHis;
    private javax.swing.JPanel labtest;
    private javax.swing.JPanel newappoint;
    private javax.swing.JPanel tHistory;
    // End of variables declaration//GEN-END:variables
}
