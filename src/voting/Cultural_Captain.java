/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Luqmaan
 */
public class Cultural_Captain extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Cultural_Captain() {
        initComponents();
        jLabel1.setIcon(Voting.small);
    }

    ArrayList ls = new ArrayList();
    ArrayList ls2 = new ArrayList();

    String path = "";

    int times = 0;

    File file = new File("").getAbsoluteFile();
    File database = new File(file + "\\Database");
    File databaseFile = new File(database + "\\furqaan.db");

    public ImageIcon image(File file) {
        Image img = new ImageIcon(file.toString()).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);

        return icon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pic3 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pic1 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pic2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pic4 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel4.setMinimumSize(new java.awt.Dimension(280, 280));
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(null);

        pic3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        pic3.setForeground(new java.awt.Color(204, 204, 204));
        pic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic3.setText("CULTURAL CAPTAIN 3");
        jPanel4.add(pic3);
        pic3.setBounds(13, 14, 254, 252);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 350, 280, 280);

        name1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        name1.setForeground(new java.awt.Color(0, 51, 51));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("Cultural Captain 1");
        jPanel1.add(name1);
        name1.setBounds(10, 290, 280, 30);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel2.setMinimumSize(new java.awt.Dimension(280, 280));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(null);

        pic1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        pic1.setForeground(new java.awt.Color(204, 204, 204));
        pic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic1.setText("CULTURAL CAPTAIN 1");
        jPanel2.add(pic1);
        pic1.setBounds(13, 14, 254, 252);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 280, 280);

        name3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        name3.setForeground(new java.awt.Color(0, 51, 51));
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText("Cultural Captain 3");
        jPanel1.add(name3);
        name3.setBounds(10, 630, 280, 30);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 280));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(null);

        pic2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        pic2.setForeground(new java.awt.Color(204, 204, 204));
        pic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic2.setText("CULTURAL CAPTAIN 2");
        jPanel3.add(pic2);
        pic2.setBounds(13, 14, 254, 252);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(910, 10, 280, 280);

        name2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        name2.setForeground(new java.awt.Color(0, 51, 51));
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("Cultural Captain 2");
        jPanel1.add(name2);
        name2.setBounds(910, 290, 280, 30);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel5.setMinimumSize(new java.awt.Dimension(280, 280));
        jPanel5.setRequestFocusEnabled(false);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(null);

        pic4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        pic4.setForeground(new java.awt.Color(204, 204, 204));
        pic4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic4.setText("CULTURAL CAPTAIN 4");
        jPanel5.add(pic4);
        pic4.setBounds(13, 14, 254, 252);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(910, 350, 280, 280);

        name4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        name4.setForeground(new java.awt.Color(0, 51, 51));
        name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name4.setText("Cultural Captain 4");
        jPanel1.add(name4);
        name4.setBounds(910, 630, 280, 30);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" + Furqaan Developments +");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 640, 310, 30);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HAPPY VOTING");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(440, 610, 310, 40);

        jButton8.setBackground(new java.awt.Color(51, 51, 51));
        jButton8.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("VOTING PAGE");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(520, 470, 150, 40);

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("BACK TO MENU");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(520, 520, 150, 40);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VOTE FOR");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 230, 480, 80);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CULTURAL CAPTAIN");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 310, 600, 80);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 0, 400, 230);

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

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        String name = name3.getText();

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query = "update cultural set count = count + 1 where name = '" + name + "';";

            stmt.executeUpdate(query);

            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
        JOptionPane.showMessageDialog(this, "Congratulations! \nYou voted for " + name, "CONGRATULATIONS", JOptionPane.WIDTH);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        String name = name1.getText();

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query = "update cultural set count = count + 1 where name = '" + name + "';";

            stmt.executeUpdate(query);

            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
        JOptionPane.showMessageDialog(this, "Congratulations! \nYou voted for " + name, "CONGRATULATIONS", JOptionPane.WIDTH);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        String name = name2.getText();

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query = "update cultural set count = count + 1 where name = '" + name + "';";

            stmt.executeUpdate(query);

            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
        JOptionPane.showMessageDialog(this, "Congratulations! \nYou voted for " + name, "CONGRATULATIONS", JOptionPane.WIDTH);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        String name = name4.getText();

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query = "update cultural set count = count + 1 where name = '" + name + "';";

            stmt.executeUpdate(query);

            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        JOptionPane.showMessageDialog(this, "Congratulations! \nYou voted for " + name, "CONGRATULATIONS", JOptionPane.WIDTH);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        if (times == 0) {
            jLabel1.setIcon(Voting.small);

            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);

            name1.setVisible(false);
            name2.setVisible(false);
            name3.setVisible(false);
            name4.setVisible(false);

            try {

                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                String query = "Select * from cultural order by(name);";

                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    if (rs.getString(1) != null) {
                        String name = rs.getString(1).toUpperCase();
                        ls.add(name);
                    }
                    if (rs.getString(3) != null) {
                        String image = rs.getString(3).toUpperCase();
                        ls2.add(image);
                    }
                }

                rs.close();
                stmt.close();
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            }

            switch (ls.size()) {

                case 1:
                    jPanel2.setVisible(true);

                    pic1.setText(ls.get(0).toString());

                    name1.setVisible(true);

                    name1.setText(ls.get(0).toString().toUpperCase());

                    break;

                case 2:
                    jPanel2.setVisible(true);
                    jPanel3.setVisible(true);

                    pic1.setText(ls.get(0).toString());
                    pic2.setText(ls.get(1).toString());

                    name1.setVisible(true);
                    name2.setVisible(true);

                    name1.setText(ls.get(0).toString().toUpperCase());
                    name2.setText(ls.get(1).toString().toUpperCase());

                    break;

                case 3:
                    jPanel2.setVisible(true);
                    jPanel3.setVisible(true);
                    jPanel4.setVisible(true);

                    pic1.setText(ls.get(0).toString());
                    pic2.setText(ls.get(1).toString());
                    pic3.setText(ls.get(2).toString());

                    name1.setVisible(true);
                    name2.setVisible(true);
                    name3.setVisible(true);

                    name1.setText(ls.get(0).toString().toUpperCase());
                    name2.setText(ls.get(1).toString().toUpperCase());
                    name3.setText(ls.get(2).toString().toUpperCase());

                    break;

                case 4:
                    jPanel2.setVisible(true);
                    jPanel3.setVisible(true);
                    jPanel4.setVisible(true);
                    jPanel5.setVisible(true);

                    pic1.setText(ls.get(0).toString());
                    pic2.setText(ls.get(1).toString());
                    pic3.setText(ls.get(2).toString());
                    pic4.setText(ls.get(3).toString());

                    name1.setVisible(true);
                    name2.setVisible(true);
                    name3.setVisible(true);
                    name4.setVisible(true);

                    name1.setText(ls.get(0).toString().toUpperCase());
                    name2.setText(ls.get(1).toString().toUpperCase());
                    name3.setText(ls.get(2).toString().toUpperCase());
                    name4.setText(ls.get(3).toString().toUpperCase());

                    break;
            }

            switch (ls2.size()) {
                case 4:
                    jPanel2.setVisible(true);
                    jPanel3.setVisible(true);
                    jPanel4.setVisible(true);
                    jPanel5.setVisible(true);

                    //name1.setVisible(true);
                    //name2.setVisible(true);
                    //name3.setVisible(true);
                    //name4.setVisible(true);
                    pic1.setText("");
                    pic1.setIcon(image(new File(ls2.get(0).toString())));

                    pic2.setText("");
                    pic2.setIcon(image(new File(ls2.get(1).toString())));

                    pic3.setText("");
                    pic3.setIcon(image(new File(ls2.get(2).toString())));

                    pic4.setText("");
                    pic4.setIcon(image(new File(ls2.get(3).toString())));

                    break;

                case 3:
                    jPanel2.setVisible(true);
                    jPanel3.setVisible(true);
                    jPanel4.setVisible(true);

                    //name1.setVisible(true);
                    //name2.setVisible(true);
                    //name3.setVisible(true);
                    pic1.setText("");
                    pic1.setIcon(image(new File(ls2.get(0).toString())));

                    pic2.setText("");
                    pic2.setIcon(image(new File(ls2.get(1).toString())));

                    pic3.setText("");
                    pic3.setIcon(image(new File(ls2.get(2).toString())));

                    break;

                case 2:
                    jPanel2.setVisible(true);
                    jPanel3.setVisible(true);

                    //name1.setVisible(true);
                    //name2.setVisible(true);
                    pic1.setText("");
                    pic1.setIcon(image(new File(ls2.get(0).toString())));

                    pic2.setText("");
                    pic2.setIcon(image(new File(ls2.get(1).toString())));

                    break;

                case 1:
                    jPanel2.setVisible(true);

                    //name1.setVisible(true);
                    pic1.setText("");
                    pic1.setIcon(image(new File(ls2.get(0).toString())));

                    break;

            }

            times += 1;
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Vote_Frame vote = new Vote_Frame();
        vote.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Cultural_Captain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cultural_Captain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cultural_Captain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cultural_Captain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cultural_Captain head = new Cultural_Captain();
                head.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    // End of variables declaration//GEN-END:variables
}
