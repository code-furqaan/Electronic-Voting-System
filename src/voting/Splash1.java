/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.awt.Color;
import java.io.File;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luqmaan
 */
public class Splash1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Splash1() {
        initComponents();

        jLabel1.setIcon(Voting.big);
    }

    public Splash1(boolean stat) {
        initComponents();

        flag = stat;

        //jLabel1.setIcon(Voting.big);
    }

    boolean flag;
    File file = new File("").getAbsoluteFile();
    File database = new File(file + "\\Database");
    File databaseFile = new File(database + "\\furqaan.db");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 480, 440, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 979, 460);

        jButton4.setBackground(new java.awt.Color(25, 25, 25));
        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Proceed");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(540, 540, 120, 40);

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

        setSize(new java.awt.Dimension(1216, 714));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        if (flag == true) {
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        } else {
            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                String comments = "create table location(Location varchar(200));";

                stmt.executeUpdate(comments);

                stmt.close();
                con.close();
            } catch (Exception e) {

            }

            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                String admins = "create table admins(name varchar(100), password varchar(100));";

                stmt.executeUpdate(admins);

                stmt.close();
                con.close();
            } catch (Exception e) {

            }

            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                String login_info = "create table login_info(name varchar(50), time varchar(20), access varchar(20));";

                stmt.executeUpdate(login_info);

                stmt.close();
                con.close();
            } catch (Exception e) {

            }

            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                String headgirl = "create table headboy(name varchar(50), count int, path varchar(100), pos int(1));";

                stmt.executeUpdate(headgirl);

                stmt.close();
                con.close();
            } catch (Exception e) {

            }

            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                String headgirl = "create table headgirl(name varchar(50), count int, path varchar(100), pos int(1));";

                stmt.executeUpdate(headgirl);

                stmt.close();
                con.close();
            } catch (Exception e) {

            }
            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                String cultural = "create table cultural(name varchar(50), count int, path varchar(100), pos int(1));";

                stmt.executeUpdate(cultural);

                stmt.close();
                con.close();
            } catch (Exception e) {

            }

            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                String sports = "create table sports(name varchar(50), count int, path varchar(100), pos int(1));";

                stmt.executeUpdate(sports);

                stmt.close();
                con.close();
            } catch (Exception e) {

            }

            /*try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                String query = "select *from Location";

                ResultSet rs = stmt.executeQuery(query);

                if (rs.next() != true) {
                    JOptionPane.showMessageDialog(null, "Default Directory does not exist \nPlease add the Path now");

                    JFileChooser browse = new JFileChooser();
                    browse.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    int a = browse.showDialog(null, "Save Directory");
                    if (a == JFileChooser.APPROVE_OPTION) {
                        File file = browse.getSelectedFile();

                        String path = file.getAbsoluteFile().toString().replace("\\", "/");
                        query = "insert into Location values('" + path + "');";
                        stmt.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Directory Added Successfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "Add the Directory later from Tools Menu");
                    }

                }

                rs.close();
                stmt.close();
                con.close();
            } catch (Exception e) {

            }*/
            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                String SC = "create table SecretCode(Code varchar(17));";

                stmt.executeUpdate(SC);

                stmt.close();
                con.close();
            } catch (Exception e) {

            }

            String a = "Splash1";
            Secret_Code_M s = new Secret_Code_M(a);
            s.setVisible(true);
            this.dispose();

            JOptionPane.showMessageDialog(s, "Archive has been Created");
        }


    }//GEN-LAST:event_jButton4ActionPerformed
    int times = 0;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        // TODO add your handling code here:
        if (times == 0) {
            jPanel1.requestFocus();

            jButton4.setVisible(false);
            jLabel6.setText("");

            Thread t = new Thread() {

                @Override
                public void run() {

                    try {
                        Thread.sleep(100);

                        jLabel1.setIcon(null);

                        Thread.sleep(100);

                        jLabel1.setIcon(Voting.big);

                        Thread.sleep(100);

                        jLabel1.setIcon(null);

                        Thread.sleep(100);

                        jLabel1.setIcon(Voting.big);

                        sleep(100);

                        jLabel6.setText("");

                        sleep(100);

                        jLabel6.setText("A ");

                        sleep(100);

                        jLabel6.setText("A p");

                        sleep(100);

                        jLabel6.setText("A pr");

                        sleep(100);

                        jLabel6.setText("A pro");

                        sleep(100);

                        jLabel6.setText("A prod");

                        sleep(100);

                        jLabel6.setText("A produ");

                        sleep(100);

                        jLabel6.setText("A produc");

                        sleep(100);

                        jLabel6.setText("A product ");

                        sleep(100);

                        jLabel6.setText("A product D");

                        sleep(100);

                        jLabel6.setText("A product De");

                        sleep(100);

                        jLabel6.setText("A product Dev");

                        sleep(100);

                        jLabel6.setText("A product Deve");

                        sleep(100);

                        jLabel6.setText("A product Devel");

                        sleep(100);

                        jLabel6.setText("A product Develo");

                        sleep(100);

                        jLabel6.setText("A product Develop");

                        sleep(100);

                        jLabel6.setText("A product Develope");

                        sleep(100);

                        jLabel6.setText("A product Developed ");

                        sleep(100);

                        jLabel6.setText("A product Developed b");

                        sleep(100);

                        jLabel6.setText("A product Developed by");

                        sleep(100);

                        jLabel6.setText("A product Developed by F");

                        sleep(100);

                        jLabel6.setText("A product Developed by Fu");

                        sleep(100);

                        jLabel6.setText("A product Developed by Fur");

                        sleep(100);

                        jLabel6.setText("A product Developed by Furq");

                        sleep(100);

                        jLabel6.setText("A product Developed by Furqa");

                        sleep(100);

                        jLabel6.setText("A product Developed by Furqaa");

                        sleep(100);

                        jLabel6.setText("A product Developed by Furqaan");

                        sleep(100);

                        jLabel6.setText("");

                        sleep(100);

                        jLabel6.setText("A product Developed by Furqaan");

                        sleep(500);

                        jPanel1.setBackground(Color.WHITE);

                        jLabel1.setIcon(Voting.big1);

                        jLabel6.setForeground(new Color(51, 51, 51));

                        sleep(100);

                        jPanel1.setBackground(new Color(25, 25, 25));

                        jLabel1.setIcon(Voting.big);

                        jLabel6.setForeground(new Color(255, 255, 255));

                        sleep(100);

                        jPanel1.setBackground(Color.WHITE);

                        jLabel1.setIcon(Voting.big1);

                        jLabel6.setForeground(new Color(51, 51, 51));

                        jButton4.setBackground(Color.BLACK);

                        sleep(1500);

                        jButton4.setVisible(true);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash1.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            };
            t.start();

            times += 1;
        }


    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
