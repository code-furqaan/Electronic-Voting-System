/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luqmaan
 */
public class Add_Cand extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Add_Cand() {
        initComponents();

        jLabel2.setIcon(Voting.small);
    }

    File file = new File("").getAbsoluteFile();
    File database = new File(file + "\\Database");
    File databaseFile = new File(database + "\\furqaan.db");

    public Add_Cand(String check) {
        initComponents();

        jLabel2.setIcon(Voting.small);

        back = check;
    }

    String back = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        count1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        count2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        count3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        count4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        info3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        info1 = new javax.swing.JLabel();
        info4 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();

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

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ADD CANDIDATES");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(370, 260, 460, 50);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("HEAD BOY");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(490, 330, 220, 46);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HEAD GIRL");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(490, 380, 220, 46);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CULTURAL CAPTAIN");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(490, 430, 220, 46);

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SPORTS CAPTAIN");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(490, 480, 220, 46);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting/res/back.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 60, 60);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 0, 260, 250);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SPORTS CAPTAIN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(910, 560, 290, 30);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("No. of Candidates:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(900, 600, 140, 30);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HEAD GIRL");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 560, 290, 30);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CULTURAL CAPTAIN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(610, 560, 290, 30);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("HEAD BOY");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 560, 300, 30);

        count1.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        count1.setForeground(new java.awt.Color(51, 51, 51));
        count1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count1.setText("0");
        jPanel1.add(count1);
        count1.setBounds(130, 590, 50, 40);

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("No. of Candidates:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(310, 600, 140, 30);

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("No. of Candidates:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(610, 600, 140, 30);

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("/4");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(160, 600, 50, 30);

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("No. of Candidates:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 600, 140, 30);

        count2.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        count2.setForeground(new java.awt.Color(51, 51, 51));
        count2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count2.setText("0");
        jPanel1.add(count2);
        count2.setBounds(440, 590, 50, 40);

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("/4");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(470, 600, 50, 30);

        count3.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        count3.setForeground(new java.awt.Color(51, 51, 51));
        count3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count3.setText("0");
        jPanel1.add(count3);
        count3.setBounds(740, 590, 50, 40);

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("/4");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(770, 600, 50, 30);

        count4.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        count4.setForeground(new java.awt.Color(51, 51, 51));
        count4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count4.setText("0");
        jPanel1.add(count4);
        count4.setBounds(1030, 590, 50, 40);

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("/4");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(1060, 600, 50, 30);

        info3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        info3.setForeground(new java.awt.Color(102, 102, 102));
        info3.setText("No Candidates");
        info3.setToolTipText("");
        jPanel1.add(info3);
        info3.setBounds(730, 640, 170, 30);

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Additional Info:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(310, 640, 120, 30);

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Additional Info:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(610, 640, 120, 30);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Additional Info:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(900, 640, 120, 30);

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Additional Info:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(0, 640, 120, 30);

        info1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        info1.setForeground(new java.awt.Color(102, 102, 102));
        info1.setText("No Candidates");
        info1.setToolTipText("");
        jPanel1.add(info1);
        info1.setBounds(120, 640, 180, 30);

        info4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        info4.setForeground(new java.awt.Color(102, 102, 102));
        info4.setText("No Candidates");
        info4.setToolTipText("");
        jPanel1.add(info4);
        info4.setBounds(1020, 640, 180, 30);

        info2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        info2.setForeground(new java.awt.Color(102, 102, 102));
        info2.setText("No Candidates");
        info2.setToolTipText("");
        jPanel1.add(info2);
        info2.setBounds(430, 640, 180, 30);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Cand_Blank(back).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Cand_HeadGirl(back).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Cand_Cultural(back).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Cand_Sports(back).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel4MouseReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        ArrayList HBname = new ArrayList();
        ArrayList HBpic = new ArrayList();

        ArrayList HGname = new ArrayList();
        ArrayList HGpic = new ArrayList();

        ArrayList Cname = new ArrayList();
        ArrayList Cpic = new ArrayList();

        ArrayList Sname = new ArrayList();
        ArrayList Spic = new ArrayList();

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query = "Select * from headboy order by(name);";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                if (rs.getString(1) != null) {
                    String name = rs.getString(1).toUpperCase();
                    HBname.add(name);
                }
                if (rs.getString(3) != null) {
                    String image = rs.getString(3).toUpperCase();
                    HBpic.add(image);
                }

            }

            if (HBname.isEmpty() && HBpic.isEmpty()) {
                count1.setText("0");
                info1.setText("No Candidates");

            } else {

                int name = HBname.size();
                int pic = HBpic.size();

                if (name == pic) {
                    count1.setText("" + name);
                    switch (name) {
                        case 1:
                            info1.setText(name + " Candidate to Vote");
                            break;
                        case 4:
                            info1.setText("Ready to Vote");
                            break;
                        default:
                            info1.setText(name + " Candidates to Vote");
                            break;
                    }
                } else {
                    info1.setText("Check Names & Images");

                    if (name > pic) {
                        count1.setText("" + name);
                    } else {
                        count1.setText("" + pic);
                    }
                }

            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query = "Select * from headgirl order by(name);";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                if (rs.getString(1) != null) {
                    String name = rs.getString(1).toUpperCase();
                    HGname.add(name);
                }
                if (rs.getString(3) != null) {
                    String image = rs.getString(3).toUpperCase();
                    HGpic.add(image);
                }

            }

            if (HGname.isEmpty() && HGpic.isEmpty()) {
                count2.setText("0");
                info2.setText("No Candidates");

            } else {

                int name = HGname.size();
                int pic = HGpic.size();

                if (name == pic) {
                    count2.setText("" + name);
                    switch (name) {
                        case 1:
                            info2.setText(name + " Candidate to Vote");
                            break;
                        case 4:
                            info2.setText("Ready to Vote");
                            break;
                        default:
                            info2.setText(name + " Candidates to Vote");
                            break;
                    }
                } else {
                    info2.setText("Check Names & Images");

                    if (name > pic) {
                        count2.setText("" + name);
                    } else {
                        count2.setText("" + pic);
                    }
                }

            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query = "Select * from cultural order by(name);";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                if (rs.getString(1) != null) {
                    String name = rs.getString(1).toUpperCase();
                    Cname.add(name);
                }
                if (rs.getString(3) != null) {
                    String image = rs.getString(3).toUpperCase();
                    Cpic.add(image);
                }

            }

            if (Cname.isEmpty() && Cpic.isEmpty()) {
                count3.setText("0");
                info3.setText("No Candidates");

            } else {

                int name = Cname.size();
                int pic = Cpic.size();

                if (name == pic) {
                    count3.setText("" + name);
                    switch (name) {
                        case 1:
                            info3.setText(name + " Candidate to Vote");
                            break;
                        case 4:
                            info3.setText("Ready to Vote");
                            break;
                        default:
                            info3.setText(name + " Candidates to Vote");
                            break;
                    }
                } else {
                    info3.setText("Check Names & Images");

                    if (name > pic) {
                        count3.setText("" + name);
                    } else {
                        count3.setText("" + pic);
                    }
                }

            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query = "Select * from sports order by(name);";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                if (rs.getString(1) != null) {
                    String name = rs.getString(1).toUpperCase();
                    Sname.add(name);
                }
                if (rs.getString(3) != null) {
                    String image = rs.getString(3).toUpperCase();
                    Spic.add(image);
                }

            }

            if (Sname.isEmpty() && Spic.isEmpty()) {
                count4.setText("0");
                info4.setText("No Candidates");

            } else {

                int name = Sname.size();
                int pic = Spic.size();

                if (name == pic) {
                    count4.setText("" + name);
                    switch (name) {
                        case 1:
                            info4.setText(name + " Candidate to Vote");
                            break;
                        case 4:
                            info4.setText("Ready to Vote");
                            break;
                        default:
                            info4.setText(name + " Candidates to Vote");
                            break;
                    }
                } else {
                    info4.setText("Check Names & Images");

                    if (name > pic) {
                        count4.setText("" + name);
                    } else {
                        count4.setText("" + pic);
                    }
                }

            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_formWindowGainedFocus

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        switch (back) {
            case "vote":
                new Vote_Frame().setVisible(true);
                this.dispose();
                break;

            case "tools":
                new Tools().setVisible(true);
                this.dispose();
                break;

            default:
                new Tools().setVisible(true);
                this.dispose();

        }
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Add_Cand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Cand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Cand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Cand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Add_Cand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel count1;
    private javax.swing.JLabel count2;
    private javax.swing.JLabel count3;
    private javax.swing.JLabel count4;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info2;
    private javax.swing.JLabel info3;
    private javax.swing.JLabel info4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
