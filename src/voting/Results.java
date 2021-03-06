/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luqmaan
 */
public class Results extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Results() {
        initComponents();

        jLabel1.setIcon(Voting.vsmall);

        DefaultTableModel model1 = (DefaultTableModel) headBoy.getModel();
        DefaultTableModel model2 = (DefaultTableModel) headGirl.getModel();
        DefaultTableModel model3 = (DefaultTableModel) cultural.getModel();
        DefaultTableModel model4 = (DefaultTableModel) sports.getModel();

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();
            ResultSet rs;

            String query;

            query = "select *from headboy order by (count) desc;";

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString(1);
                int count = rs.getInt(2);

                model1.addRow(new Object[]{name, count});
            }

            query = "select *from headgirl order by (count) desc;";

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString(1);
                int count = rs.getInt(2);

                model2.addRow(new Object[]{name, count});
            }

            query = "select *from cultural order by (count) desc;";

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString(1);
                int count = rs.getInt(2);

                model3.addRow(new Object[]{name, count});
            }

            query = "select *from sports order by (count) desc;";

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString(1);
                int count = rs.getInt(2);

                model4.addRow(new Object[]{name, count});
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        headBoy = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        headGirl = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        cultural = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sports = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RESULTS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 190, 400, 50);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HEAD BOY");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 250, 180, 50);

        headBoy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        headBoy.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        headBoy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "COUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(headBoy);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(20, 310, 280, 230);

        headGirl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        headGirl.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        headGirl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "COUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(headGirl);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(310, 310, 280, 230);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("HEAD GIRL");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(360, 250, 180, 50);

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CULTURAL CAPTAIN");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(630, 250, 220, 50);

        cultural.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        cultural.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        cultural.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "COUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(cultural);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(600, 310, 280, 230);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SPORTS CAPTAIN");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(920, 250, 220, 50);

        sports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sports.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        sports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "COUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(sports);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(890, 310, 280, 230);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("RESET");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 610, 160, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting/res/back.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 10, 60, 60);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SAVE RESULTS");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1010, 610, 160, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 0, 400, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1216, 714));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model1 = (DefaultTableModel) headBoy.getModel();
        DefaultTableModel model2 = (DefaultTableModel) headGirl.getModel();
        DefaultTableModel model3 = (DefaultTableModel) cultural.getModel();
        DefaultTableModel model4 = (DefaultTableModel) sports.getModel();

        model1.setRowCount(0);
        model2.setRowCount(0);
        model3.setRowCount(0);
        model4.setRowCount(0);

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();
            ResultSet rs;

            String query = "update headboy set count = 0 where count is not null;";

            stmt.executeUpdate(query);

            query = "select *from headboy order by (count) desc;";

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString(1);
                int count = rs.getInt(2);

                model1.addRow(new Object[]{name, count});
            }

            query = "update headgirl set count = 0 where count is not null;";

            stmt.executeUpdate(query);

            query = "select *from headgirl order by (count) desc;";

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString(1);
                int count = rs.getInt(2);

                model2.addRow(new Object[]{name, count});
            }

            query = "update cultural set count = 0 where count is not null;";

            stmt.executeUpdate(query);

            query = "select *from cultural order by (count) desc;";

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString(1);
                int count = rs.getInt(2);

                model3.addRow(new Object[]{name, count});
            }

            query = "update sports set count = 0 where count is not null;";

            stmt.executeUpdate(query);

            query = "select *from sports order by (count) desc;";

            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString(1);
                int count = rs.getInt(2);

                model4.addRow(new Object[]{name, count});
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {

            BufferedImage res = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            JFileChooser aa = new JFileChooser();

            int a = aa.showSaveDialog(this);

            if (a == JFileChooser.APPROVE_OPTION) {
                File path = aa.getSelectedFile();
                String path1 = (path + ".jpg");
                System.out.print(path);
                ImageIO.write(res, "jpeg", new File(path1));
            }

        } catch (AWTException | IOException ex) {
            Logger.getLogger(Results.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cultural;
    private javax.swing.JTable headBoy;
    private javax.swing.JTable headGirl;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable sports;
    // End of variables declaration//GEN-END:variables
}
