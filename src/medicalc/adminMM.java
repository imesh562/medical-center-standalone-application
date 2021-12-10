package medicalc;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

public class adminMM extends javax.swing.JFrame {

    public adminMM() {
        initComponents();
        viewappoint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        appointmnts = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminappoint = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        regCust = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Regcust = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        addDoc = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        DocName = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        MoNum = new javax.swing.JTextField();
        DocCombo = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        labtests = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AdminLabtest = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        viewDoc = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Docs = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        payments = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        docPayment = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        labT = new javax.swing.JTextField();
        docT = new javax.swing.JTextField();
        tProfit = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        Welcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View/Confirm Appointments");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Registered Customers");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add a New Doctor");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("View/Remove Doctors");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Receipts And Payments");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Log Out");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("View/Confirm Lab Tests");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 270, 630));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(new java.awt.CardLayout());

        appointmnts.setBackground(new java.awt.Color(44, 62, 80));
        appointmnts.setPreferredSize(new java.awt.Dimension(732, 636));

        adminappoint.setBackground(new java.awt.Color(44, 62, 80));
        adminappoint.setForeground(new java.awt.Color(255, 255, 255));
        adminappoint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Username", "Doctor Specialty", "Doctors Name", "Time", "Price"
            }
        ));
        adminappoint.setFillsViewportHeight(true);
        adminappoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminappointMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adminappoint);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Booked Appointments");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("To Confirm The Customers Attendence Select The Appointment ID And Press Confirm.");

        jButton3.setBackground(new java.awt.Color(34, 167, 240));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Confirm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(248, 148, 6));
        jLabel29.setText("Click Here To Reset All The Not confirmed Appointments");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout appointmntsLayout = new javax.swing.GroupLayout(appointmnts);
        appointmnts.setLayout(appointmntsLayout);
        appointmntsLayout.setHorizontalGroup(
            appointmntsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmntsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appointmntsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(appointmntsLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addGroup(appointmntsLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appointmntsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(174, 174, 174))
        );
        appointmntsLayout.setVerticalGroup(
            appointmntsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmntsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        jPanel2.add(appointmnts, "card2");

        regCust.setBackground(new java.awt.Color(44, 62, 80));

        Regcust.setBackground(new java.awt.Color(44, 62, 80));
        Regcust.setForeground(new java.awt.Color(255, 255, 255));
        Regcust.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "First Name", "Last Name", "Username", "D.O.B", "Address", "Mobilel Number"
            }
        ));
        Regcust.setFillsViewportHeight(true);
        jScrollPane2.setViewportView(Regcust);
        if (Regcust.getColumnModel().getColumnCount() > 0) {
            Regcust.getColumnModel().getColumn(3).setHeaderValue("Username");
            Regcust.getColumnModel().getColumn(4).setHeaderValue("D.O.B");
            Regcust.getColumnModel().getColumn(5).setHeaderValue("Address");
            Regcust.getColumnModel().getColumn(6).setHeaderValue("Mobilel Number");
        }

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Registered Customers");

        javax.swing.GroupLayout regCustLayout = new javax.swing.GroupLayout(regCust);
        regCust.setLayout(regCustLayout);
        regCustLayout.setHorizontalGroup(
            regCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regCustLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(regCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addGroup(regCustLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        regCustLayout.setVerticalGroup(
            regCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regCustLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(regCust, "card5");

        addDoc.setBackground(new java.awt.Color(44, 62, 80));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Doctors Name :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Doctors Specielity :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Age :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Address :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Mobile Number :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Add A New Doctor");

        DocName.setBackground(new java.awt.Color(108, 122, 137));
        DocName.setForeground(new java.awt.Color(228, 241, 254));

        Age.setBackground(new java.awt.Color(108, 122, 137));
        Age.setForeground(new java.awt.Color(228, 241, 254));
        Age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeKeyPressed(evt);
            }
        });

        MoNum.setBackground(new java.awt.Color(108, 122, 137));
        MoNum.setForeground(new java.awt.Color(228, 241, 254));
        MoNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MoNumKeyPressed(evt);
            }
        });

        DocCombo.setBackground(new java.awt.Color(108, 122, 137));
        DocCombo.setForeground(new java.awt.Color(228, 241, 254));
        DocCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocComboActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(34, 167, 240));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Confirm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Address.setBackground(new java.awt.Color(108, 122, 137));
        Address.setColumns(20);
        Address.setForeground(new java.awt.Color(228, 241, 254));
        Address.setRows(5);
        jScrollPane5.setViewportView(Address);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Price :");

        price.setBackground(new java.awt.Color(108, 122, 137));
        price.setForeground(new java.awt.Color(228, 241, 254));

        javax.swing.GroupLayout addDocLayout = new javax.swing.GroupLayout(addDoc);
        addDoc.setLayout(addDocLayout);
        addDocLayout.setHorizontalGroup(
            addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDocLayout.createSequentialGroup()
                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addDocLayout.createSequentialGroup()
                        .addGap(198, 312, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addDocLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addDocLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addDocLayout.createSequentialGroup()
                                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(35, 35, 35)
                                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DocName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Age, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DocCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5)))
                            .addGroup(addDocLayout.createSequentialGroup()
                                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel23))
                                .addGap(53, 53, 53)
                                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MoNum)
                                    .addComponent(price))))))
                .addGap(137, 137, 137))
        );
        addDocLayout.setVerticalGroup(
            addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDocLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel21)
                .addGap(54, 54, 54)
                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(DocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(DocCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(addDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(MoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(addDoc, "card6");

        labtests.setBackground(new java.awt.Color(44, 62, 80));

        AdminLabtest.setBackground(new java.awt.Color(44, 62, 80));
        AdminLabtest.setForeground(new java.awt.Color(255, 255, 255));
        AdminLabtest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Username", "Testname", "Price"
            }
        ));
        AdminLabtest.setFillsViewportHeight(true);
        AdminLabtest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminLabtestMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(AdminLabtest);

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("To Confirm The Customers Attendence Select The Booking ID And Press Confirm.");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Booked Lab Tests");

        javax.swing.GroupLayout labtestsLayout = new javax.swing.GroupLayout(labtests);
        labtests.setLayout(labtestsLayout);
        labtestsLayout.setHorizontalGroup(
            labtestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labtestsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labtestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, labtestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(labtestsLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        labtestsLayout.setVerticalGroup(
            labtestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labtestsLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.add(labtests, "card8");

        viewDoc.setBackground(new java.awt.Color(44, 62, 80));

        Docs.setBackground(new java.awt.Color(44, 62, 80));
        Docs.setForeground(new java.awt.Color(255, 255, 255));
        Docs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctors ID", "Doctors Specielity", "Doctors Name", "Age", "Address", "Mo Number"
            }
        ));
        Docs.setFillsViewportHeight(true);
        Docs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Docs);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registered Doctors");

        jButton2.setBackground(new java.awt.Color(242, 38, 19));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("To Remove A Doctor Select The Doctors ID That You Want To Remove and Press Remove.");

        javax.swing.GroupLayout viewDocLayout = new javax.swing.GroupLayout(viewDoc);
        viewDoc.setLayout(viewDocLayout);
        viewDocLayout.setHorizontalGroup(
            viewDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(viewDocLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        viewDocLayout.setVerticalGroup(
            viewDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDocLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.add(viewDoc, "card7");

        payments.setBackground(new java.awt.Color(44, 62, 80));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Total  Receipts By Doctor Appointments :");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Total  Receipts By Lab Tests :");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Total Payment That Should Give To The Doctors :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Total Profit :");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Total  Receipts :");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Receipts And Payments");

        docPayment.setBackground(new java.awt.Color(108, 122, 137));
        docPayment.setForeground(new java.awt.Color(228, 241, 254));

        total.setBackground(new java.awt.Color(108, 122, 137));
        total.setForeground(new java.awt.Color(228, 241, 254));

        labT.setBackground(new java.awt.Color(108, 122, 137));
        labT.setForeground(new java.awt.Color(228, 241, 254));

        docT.setBackground(new java.awt.Color(108, 122, 137));
        docT.setForeground(new java.awt.Color(228, 241, 254));

        tProfit.setBackground(new java.awt.Color(108, 122, 137));
        tProfit.setForeground(new java.awt.Color(228, 241, 254));

        javax.swing.GroupLayout paymentsLayout = new javax.swing.GroupLayout(payments);
        payments.setLayout(paymentsLayout);
        paymentsLayout.setHorizontalGroup(
            paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(paymentsLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27)
                    .addComponent(jLabel24)
                    .addComponent(jLabel22)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(docT)
                    .addComponent(labT)
                    .addComponent(total)
                    .addComponent(docPayment)
                    .addComponent(tProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );
        paymentsLayout.setVerticalGroup(
            paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel28)
                .addGap(46, 46, 46)
                .addGroup(paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(docT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(labT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(docPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tProfit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(359, Short.MAX_VALUE))
        );

        jPanel2.add(payments, "card7");

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
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 659, Short.MAX_VALUE)
                .addComponent(jLabelMin1)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose1)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelClose1)
                    .addComponent(jLabelMin1))
                .addGap(20, 20, 20))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        viewappoint();
        appointmnts.setVisible(true);
        regCust.setVisible(false);
        addDoc.setVisible(false);
        viewDoc.setVisible(false);
        payments.setVisible(false);
        labtests.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        appointmnts.setVisible(false);
        viewregcust();
        regCust.setVisible(true);
        addDoc.setVisible(false);
        viewDoc.setVisible(false);
        payments.setVisible(false);
        labtests.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        appointmnts.setVisible(false);
        regCust.setVisible(false);
        fillDocCombo();
        addDoc.setVisible(true);
        viewDoc.setVisible(false);
        payments.setVisible(false);
        labtests.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        appointmnts.setVisible(false);
        regCust.setVisible(false);
        addDoc.setVisible(false);
        Doclist();
        viewDoc.setVisible(true);
        payments.setVisible(false);
        labtests.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int input = JOptionPane.showConfirmDialog(null, "Do You want To Log Out ? ");
        if(input==0)
        {
            Admin log = new Admin();
            log.setVisible(true);
            log.pack();
            log.setLocationRelativeTo(null);
            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        appointmnts.setVisible(false);
        regCust.setVisible(false);
        addDoc.setVisible(false);
        viewDoc.setVisible(false);
        Payments();
        payments.setVisible(true);
        labtests.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(docID!=null)
        {
            int input = JOptionPane.showConfirmDialog(null, "Do You want To Continue ? ");
            if(input==0)
            {
                String sql = "DELETE FROM login_info.docs WHERE Docid = '"+docID+"';";
                PreparedStatement stmt ;

                try
                {
                    stmt = dbConnection.getConnection().prepareStatement(sql);
                    int rs = stmt.executeUpdate();
                    Doclist();
                    docID=null;
                }
                catch (SQLException ex)
                {
                    Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Doctor ID");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    String docID;
    private void DocsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocsMouseClicked
        DefaultTableModel model = (DefaultTableModel)Docs.getModel();
        int selectedRowIndex = Docs.getSelectedRow();
        
        docID = model.getValueAt(selectedRowIndex, 0).toString();
    }//GEN-LAST:event_DocsMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        appointmnts.setVisible(false);
        regCust.setVisible(false);
        addDoc.setVisible(false);
        viewDoc.setVisible(false);
        payments.setVisible(false);
        labtest();
        labtests.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(testID!=null)
        {
        String sql = "UPDATE login_info.labbook SET confirm = 1 WHERE Bookid = '"+testID+"';";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            int rs = stmt.executeUpdate();
            labtest();
            testID=null;
        }
        catch (SQLException ex) 
        {
        Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Plese Select A Test Number To Confirm A Lab Test ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    String testID;
    private void AdminLabtestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminLabtestMouseClicked
        DefaultTableModel model = (DefaultTableModel)AdminLabtest.getModel();
        int selectedRowIndex = AdminLabtest.getSelectedRow();
        
        testID = model.getValueAt(selectedRowIndex, 0).toString();
    }//GEN-LAST:event_AdminLabtestMouseClicked
    
    String appointID;
    private void adminappointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminappointMouseClicked
        DefaultTableModel model = (DefaultTableModel)adminappoint.getModel();
        int selectedRowIndex = adminappoint.getSelectedRow();
        
        appointID = model.getValueAt(selectedRowIndex, 0).toString();
    }//GEN-LAST:event_adminappointMouseClicked

    private void updatetzone()
    {
        String DocName=null;
        String Tzone=null;
        
        String query = "SELECT DocName, Tzone FROM login_info.appointment_table WHERE AppointID = '"+appointID+"';";
        PreparedStatement stmt ;
        
        try 
            {
                stmt = dbConnection.getConnection().prepareStatement(query);
                ResultSet rs = stmt.executeQuery(); 
                
                while(rs.next())
                {
                    DocName=rs.getString("DocName") ;
                    Tzone=rs.getString("Tzone") ;
                }  
            } 
                catch (SQLException ex) 
            {
                Logger.getLogger(CustMM.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        String code = "UPDATE login_info.docs SET `"+Tzone+"` = 0 WHERE DocName = '"+DocName+"';";
        PreparedStatement line ;
        
            try 
            {
                line = dbConnection.getConnection().prepareStatement(code);
                line.executeUpdate();
            }
            catch (SQLException ex) 
            {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(appointID!=null)
        {
        String sql = "UPDATE login_info.appointment_table SET confirm = 1 WHERE AppointID = '"+appointID+"';";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            int rs = stmt.executeUpdate();
            updatetzone();
            viewappoint();
            appointID=null;
        }
        catch (SQLException ex) 
        {
        Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Plese Select A Appointment ID To Confirm A Appointment ");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String docName = DocName.getText();
        String age = Age.getText();
        String address = Address.getText();
        String number = MoNum.getText();
        String Price = price.getText();
        
        //This Code is used to check if docName is null when registering.
        if(docName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Doctors Name.");
        }
        
        //This Code is used to check if age is null when registering.
        else if(age.equals("")|| age.length()!=2)
        {
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Doctors Age.");
        }
        
        //This Code is used to check if address is null when registering.
        else if(address.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Doctors Address.");
        }
        
        //This Code is used to check if Price is null when registering.
        else if(Price.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Price.");
        }
        
        //This Code is used to check if Username is null when registering.
        else if(number.equals("")|| number.length()<10)
        {
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Mobile Number.");
        }
        
        else
        {
        PreparedStatement ps;
        String query = "INSERT INTO `login_info`.`docs` (`DocName`, `DocClass`, `Age`, `Address`, `Mo_Number`, `Price`) VALUES (?,?,?,?,?,?);";
        
        try {
            ps = dbConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, docName);
            ps.setString(2, selectedItemStr1);
            ps.setString(3, age);
            ps.setString(4, address);
            ps.setString(5, number);
            ps.setString(6, Price);
            
            if (ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null, "Doctor Added Successfully");
                DocName.setText("");
                Age.setText("");
                Address.setText("");
                MoNum.setText("");
                price.setText("");
                DocCombo.setSelectedIndex(0);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MoNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MoNumKeyPressed
        String phoneNumber = MoNum.getText();
        int length = phoneNumber.length();
        char c= evt.getKeyChar();
        //checking for number 0 to 9.
        if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
        //checking for number of digits more than 10.
        if(length<10){
            //can edit.
            MoNum.setEditable(true);
            } 
        
        else{
            //cannot edit if length is more than 10.
            MoNum.setEditable(false);
            }
        }
        else{//allowing backspace key and space key.
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
            MoNum.setEditable(true);}
            else{
                    MoNum.setEditable(false);}
            
        }
    }//GEN-LAST:event_MoNumKeyPressed
    String selectedItemStr1;
    private void DocComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocComboActionPerformed
        Object selectedItem = DocCombo.getSelectedItem();
        selectedItemStr1 = selectedItem.toString();
    }//GEN-LAST:event_DocComboActionPerformed

    private void AgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeKeyPressed
        String age = Age.getText();
        int length = age.length();
        char c= evt.getKeyChar();
        //checking for number 0 to 9.
        if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9'){
        //checking for number of digits more than 2.
        if(length<2){
            //can edit.
            Age.setEditable(true);
            } 
        
        else{
            //cannot edit if length is more than 2.
            Age.setEditable(false);
            }
        }
        else{//allowing backspace key and space key.
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
            Age.setEditable(true);}
            else{
                    Age.setEditable(false);}
            
        }
    }//GEN-LAST:event_AgeKeyPressed

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        List docName = new ArrayList();
        List Tzone = new ArrayList();
        int count=0;
        
        int input = JOptionPane.showConfirmDialog(null, "Do You want To Continue ? ");
        if(input==0)
        {
        String rowq = "SELECT COUNT(*) FROM `appointment_table` WHERE confirm = 0;";
        PreparedStatement state ;
        
        try
        {
            state = dbConnection.getConnection().prepareStatement(rowq);
            ResultSet reciv = state.executeQuery();

                while(reciv.next())
                {   
                    count =Integer.parseInt(reciv.getString("COUNT(*)")) ;
                }
        }
        catch (SQLException ex) 
            {
                Logger.getLogger(adminMM.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        if(count!=0)
        {
        String query = "SELECT DocName, Tzone FROM login_info.appointment_table WHERE confirm = 0;";
        PreparedStatement stmt ;
        
        try 
            {
                stmt = dbConnection.getConnection().prepareStatement(query);
                ResultSet rs = stmt.executeQuery();  
                
                while(rs.next())
                {
                    docName.add(rs.getString("DocName"));
                    Tzone.add(rs.getString("Tzone"));
                }
            } 
                catch (SQLException ex) 
            {
                Logger.getLogger(adminMM.class.getName()).log(Level.SEVERE, null, ex);
            }
        for(int i=0;i<count;i++)
        {
        String code = "UPDATE login_info.docs SET `"+Tzone.get(i)+"` = 0 WHERE DocName = '"+docName.get(i)+"';";
        PreparedStatement line ;
        
        String qCode = "DELETE FROM login_info.appointment_table WHERE confirm = '0'";
        PreparedStatement stmnt ;
        
            try 
            {
                line = dbConnection.getConnection().prepareStatement(code);
                line.executeUpdate();
                
                stmnt = dbConnection.getConnection().prepareStatement(qCode);
                stmnt.executeUpdate();

            }
            catch (SQLException ex) 
            {
            Logger.getLogger(adminMM.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        viewappoint();
        JOptionPane.showMessageDialog(null, "Successfull..");
        }else
        {JOptionPane.showMessageDialog(null, "There is no Appointments That Have Been Not Confirmed");}
        
        }
    }//GEN-LAST:event_jLabel29MouseClicked

    private void viewappoint()
    {
        
        String sql = "select AppointID,Username,DocClass,DocName,Time,Price from login_info.appointment_table WHERE confirm = 0 ORDER BY AppointID DESC";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            adminappoint.setModel(DbUtils.resultSetToTableModel(rs));
            
            TableColumnModel columnModel = adminappoint.getColumnModel();
            
            adminappoint.setShowHorizontalLines(false);
            adminappoint.setShowVerticalLines(false);
            adminappoint.setShowGrid(false);
            columnModel.getColumn(0).setPreferredWidth(40);
            columnModel.getColumn(1).setPreferredWidth(60);
            columnModel.getColumn(2).setPreferredWidth(190);
            columnModel.getColumn(3).setPreferredWidth(220);
            columnModel.getColumn(4).setPreferredWidth(50);
            columnModel.getColumn(5).setPreferredWidth(30);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(adminMM.class.getName()).log(Level.SEVERE, null, ex);     
        }
    
    }
    
    private void fillDocCombo()
    {
        String sql = "select * from login_info.profession";
        PreparedStatement stmt ;
            try {
                stmt = dbConnection.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
            DocCombo.addItem(rs.getString("DocClass"));
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(adminMM.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private void viewregcust()
    {
        {
        String sql = "SELECT UserID,Firstname,Lastname,Username,DOB,Address,MoNumber FROM login_info.login_info;";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Regcust.setModel(DbUtils.resultSetToTableModel(rs));
            
            TableColumnModel columnModel = Regcust.getColumnModel();
            
            Regcust.setShowHorizontalLines(false);
            Regcust.setShowVerticalLines(false);
            Regcust.setShowGrid(false);
            columnModel.getColumn(0).setPreferredWidth(40);
            columnModel.getColumn(1).setPreferredWidth(60);
            columnModel.getColumn(2).setPreferredWidth(60);
            columnModel.getColumn(3).setPreferredWidth(60);
            columnModel.getColumn(4).setPreferredWidth(70);
            columnModel.getColumn(5).setPreferredWidth(240);
            columnModel.getColumn(6).setPreferredWidth(70);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(adminMM.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }
    }
        
    private void Doclist()
    {
        {
        String sql = "SELECT Docid,DocName,DocClass,Age,Address,Mo_Number FROM login_info.docs;";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Docs.setModel(DbUtils.resultSetToTableModel(rs));
            
            TableColumnModel columnModel = Docs.getColumnModel();
            
            Docs.setShowHorizontalLines(false);
            Docs.setShowVerticalLines(false);
            Docs.setShowGrid(false);
            columnModel.getColumn(0).setPreferredWidth(20);
            columnModel.getColumn(1).setPreferredWidth(180);
            columnModel.getColumn(2).setPreferredWidth(140);
            columnModel.getColumn(3).setPreferredWidth(10);
            columnModel.getColumn(4).setPreferredWidth(170);
            columnModel.getColumn(5).setPreferredWidth(60);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(adminMM.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }
    }
    
        private void labtest()
    {
        {
        String sql = "SELECT Bookid,Username,TestName,Price FROM login_info.labbook WHERE confirm = 0 ORDER BY Bookid DESC;";
        PreparedStatement stmt ;
        
        try 
        {
            stmt = dbConnection.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            AdminLabtest.setModel(DbUtils.resultSetToTableModel(rs));
            
            TableColumnModel columnModel = AdminLabtest.getColumnModel();
            
            AdminLabtest.setShowHorizontalLines(false);
            AdminLabtest.setShowVerticalLines(false);
            AdminLabtest.setShowGrid(false);
            columnModel.getColumn(0).setPreferredWidth(100);
            columnModel.getColumn(1).setPreferredWidth(230);
            columnModel.getColumn(2).setPreferredWidth(220);
            columnModel.getColumn(3).setPreferredWidth(50);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(adminMM.class.getName()).log(Level.SEVERE, null, ex);     
        }
    }
    }
        
    private void Payments()
    {
        int docTotal=0;
        int labTotal=0;
        int rows = 0;
        
        String sql = "SELECT sum(Price) FROM login_info.appointment_table WHERE confirm = 1 ;";
        PreparedStatement stmt ;
        
        String query = "SELECT sum(Price) FROM login_info.labbook WHERE confirm = 1 ;";
        PreparedStatement state ;
        
        String rowq = "SELECT COUNT(*) FROM `appointment_table` WHERE confirm = 1;";
        PreparedStatement line ;
            try 
            {
                stmt = dbConnection.getConnection().prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                
                state = dbConnection.getConnection().prepareStatement(query);
                ResultSet results = state.executeQuery();
                
                line = dbConnection.getConnection().prepareStatement(rowq);
                ResultSet reciv = line.executeQuery();
                
                while(rs.next())
                {
                    if(rs.getString("sum(Price)")!= null)
                    {
                    docTotal =Integer.parseInt(rs.getString("sum(Price)")) ;
                    }
                }
                
                while(results.next())
                    if(results.getString("sum(Price)")!= null)
                    {
                        {   
                        labTotal =Integer.parseInt(results.getString("sum(Price)")) ;
                        }
                    }
                
                while(reciv.next())
                    if(reciv.getString("COUNT(*)")!= null)
                    {
                        {   
                        rows =Integer.parseInt(reciv.getString("COUNT(*)")) ;
                        }
                    }
            } 
                catch (SQLException ex) 
            {
                Logger.getLogger(adminMM.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            docT.setText("Rs."+docTotal);
            labT.setText("Rs."+labTotal);
            
            int Total = docTotal+labTotal;
            total.setText("Rs."+Total);
            
            int mFee = 800 * rows;
            int docP = docTotal-mFee;
            docPayment.setText("Rs."+docP);
            
            int profit = Total-docP;
            tProfit.setText("Rs."+profit);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminMM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JTable AdminLabtest;
    private javax.swing.JTextField Age;
    private javax.swing.JComboBox<String> DocCombo;
    private javax.swing.JTextField DocName;
    private javax.swing.JTable Docs;
    private javax.swing.JTextField MoNum;
    private javax.swing.JTable Regcust;
    public javax.swing.JLabel Welcome;
    private javax.swing.JPanel addDoc;
    private javax.swing.JTable adminappoint;
    private javax.swing.JPanel appointmnts;
    private javax.swing.JTextField docPayment;
    private javax.swing.JTextField docT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField labT;
    private javax.swing.JPanel labtests;
    private javax.swing.JPanel payments;
    private javax.swing.JTextField price;
    private javax.swing.JPanel regCust;
    private javax.swing.JTextField tProfit;
    private javax.swing.JTextField total;
    private javax.swing.JPanel viewDoc;
    // End of variables declaration//GEN-END:variables
}
