/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Luqmaan
 */
public class Vote_all extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    String path = "";

    public Vote_all() {
        initComponents();

        Lheadboy.clear();
        Lheadgirl.clear();
        Lcultural.clear();
        Lsports.clear();

        HeadBoy1.setBorder(def);
        HeadBoy2.setBorder(def);
        HeadBoy3.setBorder(def);
        HeadBoy4.setBorder(def);

        HeadGirl1.setBorder(def);
        HeadGirl2.setBorder(def);
        HeadGirl3.setBorder(def);
        HeadGirl4.setBorder(def);

        Cultural1.setBorder(def);
        Cultural2.setBorder(def);
        Cultural3.setBorder(def);
        Cultural4.setBorder(def);

        Sports1.setBorder(def);
        Sports2.setBorder(def);
        Sports3.setBorder(def);
        Sports4.setBorder(def);

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query1 = "Select *from Location;";

            ResultSet rs = stmt.executeQuery(query1);

            if (rs.next() == true) {
                path = rs.getString(1);
            } else {
                int b = JOptionPane.showConfirmDialog(null, "Directory does not exist \nAdd the path now", "Error", JOptionPane.DEFAULT_OPTION);
                if (b == 0) {
                    JFileChooser browse = new JFileChooser();
                    browse.showDialog(null, "Save Directory");
                    File file = browse.getSelectedFile();

                    File ParentFolder = file.getParentFile();

                    path = ParentFolder.getPath().replace("\\", "/");

                    stmt.executeUpdate("insert into location values ('" + path + "');");

                    JOptionPane.showMessageDialog(null, "Path Added", "Info", WIDTH);
                }
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {

        }

        //FOR THE HEAD BOY
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query1 = "Select UPPER(Name) from headboy order by(name);;";

            ResultSet rs = stmt.executeQuery(query1);

            while (rs.next()) {
                String name = rs.getString(1);

                Lheadboy.add(name);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            if (Lheadboy.isEmpty()) {

            } else {
                Bname1.setText(Lheadboy.get(0).toString());
                Bname2.setText(Lheadboy.get(1).toString());
                Bname3.setText(Lheadboy.get(2).toString());
                Bname4.setText(Lheadboy.get(3).toString());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nInsufficient Candidates");
        }

        try {
            ImageIcon headboy1 = new ImageIcon(path + "/S" + Lheadboy.get(0) + ".jpeg");

            Bpic1.setText("");
            Bpic1.setIcon(headboy1);
        } catch (Exception e) {

        }

        try {
            ImageIcon headboy2 = new ImageIcon(path + "/S" + Lheadboy.get(1) + ".jpeg");

            Bpic2.setText("");
            Bpic2.setIcon(headboy2);
        } catch (Exception e) {

        }

        try {
            ImageIcon headboy3 = new ImageIcon(path + "/S" + Lheadboy.get(2) + ".jpeg");

            Bpic3.setText("");
            Bpic3.setIcon(headboy3);
        } catch (Exception e) {

        }

        try {
            ImageIcon headboy4 = new ImageIcon(path + "/S" + Lheadboy.get(3) + ".jpeg");

            Bpic4.setText("");
            Bpic4.setIcon(headboy4);
        } catch (Exception e) {

        }

        //FOR THE HEAD GIRL
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query1 = "Select UPPER(Name) from headgirl order by(name);";

            ResultSet rs = stmt.executeQuery(query1);

            while (rs.next()) {
                String name = rs.getString(1);

                Lheadgirl.add(name);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            if (Lheadgirl.isEmpty()) {

            } else {
                Gname1.setText(Lheadgirl.get(0).toString());
                Gname2.setText(Lheadgirl.get(1).toString());
                Gname3.setText(Lheadgirl.get(2).toString());
                Gname4.setText(Lheadgirl.get(3).toString());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nInsufficient Candidates");
        }

        try {
            ImageIcon headgirl1 = new ImageIcon(path + "/S" + Lheadgirl.get(0) + ".jpeg");

            Gpic1.setText("");
            Gpic1.setIcon(headgirl1);
        } catch (Exception e) {

        }

        try {
            ImageIcon headgirl2 = new ImageIcon(path + "/S" + Lheadgirl.get(1) + ".jpeg");

            Gpic2.setText("");
            Gpic2.setIcon(headgirl2);
        } catch (Exception e) {

        }

        try {
            ImageIcon headgirl3 = new ImageIcon(path + "/S" + Lheadgirl.get(2) + ".jpeg");

            Gpic3.setText("");
            Gpic3.setIcon(headgirl3);
        } catch (Exception e) {

        }

        try {
            ImageIcon headgirl4 = new ImageIcon(path + "/S" + Lheadgirl.get(3) + ".jpeg");

            Gpic4.setText("");
            Gpic4.setIcon(headgirl4);
        } catch (Exception e) {

        }

        // FOR CULTURAL CAPTAIN
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query1 = "Select UPPER(Name) from cultural order by(name);";

            ResultSet rs = stmt.executeQuery(query1);

            while (rs.next()) {
                String name = rs.getString(1);

                Lcultural.add(name);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            if (Lcultural.isEmpty()) {

            } else {
                Cname1.setText(Lcultural.get(0).toString());
                Cname2.setText(Lcultural.get(1).toString());
                Cname3.setText(Lcultural.get(2).toString());
                Cname4.setText(Lcultural.get(3).toString());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nInsufficient Candidates");
        }

        try {
            ImageIcon cultural1 = new ImageIcon(path + "/S" + Lcultural.get(0) + ".jpeg");

            Cpic1.setText("");
            Cpic1.setIcon(cultural1);
        } catch (Exception e) {

        }

        try {
            ImageIcon cultural2 = new ImageIcon(path + "/S" + Lcultural.get(1) + ".jpeg");

            Cpic2.setText("");
            Cpic2.setIcon(cultural2);
        } catch (Exception e) {

        }

        try {
            ImageIcon cultural3 = new ImageIcon(path + "/S" + Lcultural.get(2) + ".jpeg");

            Cpic3.setText("");
            Cpic3.setIcon(cultural3);
        } catch (Exception e) {

        }

        try {
            ImageIcon cultural4 = new ImageIcon(path + "/S" + Lcultural.get(3) + ".jpeg");

            Cpic4.setText("");
            Cpic4.setIcon(cultural4);
        } catch (Exception e) {

        }

        // FOR SPORS CAPTAIN
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
            Statement stmt = con.createStatement();

            String query1 = "Select UPPER(Name) from sports order by(name);";

            ResultSet rs = stmt.executeQuery(query1);

            while (rs.next()) {
                String name = rs.getString(1);

                Lsports.add(name);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            if (Lsports.isEmpty()) {

            } else {
                Sname1.setText(Lsports.get(0).toString());
                Sname2.setText(Lsports.get(1).toString());
                Sname3.setText(Lsports.get(2).toString());
                Sname4.setText(Lsports.get(3).toString());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nInsufficient Candidates");
        }

        try {
            ImageIcon sports1 = new ImageIcon(path + "/S" + Lsports.get(0) + ".jpeg");

            Spic1.setText("");
            Spic1.setIcon(sports1);
        } catch (Exception e) {

        }

        try {
            ImageIcon sports2 = new ImageIcon(path + "/S" + Lsports.get(1) + ".jpeg");

            Spic2.setText("");
            Spic2.setIcon(sports2);
        } catch (Exception e) {

        }

        try {
            ImageIcon sports3 = new ImageIcon(path + "/S" + Lsports.get(2) + ".jpeg");

            Spic3.setText("");
            Spic3.setIcon(sports3);
        } catch (Exception e) {

        }

        try {
            ImageIcon sports4 = new ImageIcon(path + "/S" + Lsports.get(3) + ".jpeg");

            Spic4.setText("");
            Spic4.setIcon(sports4);
        } catch (Exception e) {

        }

    }

    public static ArrayList Lheadboy = new ArrayList();
    public static ArrayList Lheadgirl = new ArrayList();
    public static ArrayList Lcultural = new ArrayList();
    public static ArrayList Lsports = new ArrayList();

    Color defC = new Color(102, 102, 102);
    Color finalC = new Color(51, 153, 0);
    Border border = new LineBorder(finalC, 4);
    Border def = new LineBorder(defC, 3);

    String HeadBoy = "";
    String HeadGirl = "";
    String Cultural = "";
    String Sports = "";
    String query = "";

    int times = 0;

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
        Bname4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Sports4 = new javax.swing.JPanel();
        Spic4 = new javax.swing.JLabel();
        Sports3 = new javax.swing.JPanel();
        Spic3 = new javax.swing.JLabel();
        Sports1 = new javax.swing.JPanel();
        Spic1 = new javax.swing.JLabel();
        Sports2 = new javax.swing.JPanel();
        Spic2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        HeadGirl1 = new javax.swing.JPanel();
        Gpic1 = new javax.swing.JLabel();
        HeadGirl2 = new javax.swing.JPanel();
        Gpic2 = new javax.swing.JLabel();
        Cultural1 = new javax.swing.JPanel();
        Cpic1 = new javax.swing.JLabel();
        Cultural2 = new javax.swing.JPanel();
        Cpic2 = new javax.swing.JLabel();
        Cultural4 = new javax.swing.JPanel();
        Cpic4 = new javax.swing.JLabel();
        HeadGirl4 = new javax.swing.JPanel();
        Gpic4 = new javax.swing.JLabel();
        HeadGirl3 = new javax.swing.JPanel();
        Gpic3 = new javax.swing.JLabel();
        HeadBoy4 = new javax.swing.JPanel();
        Bpic4 = new javax.swing.JLabel();
        HeadBoy3 = new javax.swing.JPanel();
        Bpic3 = new javax.swing.JLabel();
        HeadBoy1 = new javax.swing.JPanel();
        Bpic1 = new javax.swing.JLabel();
        HeadBoy2 = new javax.swing.JPanel();
        Bpic2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Sname1 = new javax.swing.JLabel();
        Sname3 = new javax.swing.JLabel();
        Bname3 = new javax.swing.JLabel();
        Cultural3 = new javax.swing.JPanel();
        Cpic3 = new javax.swing.JLabel();
        Bname1 = new javax.swing.JLabel();
        Gname1 = new javax.swing.JLabel();
        Cname1 = new javax.swing.JLabel();
        Bname2 = new javax.swing.JLabel();
        Gname4 = new javax.swing.JLabel();
        Cname3 = new javax.swing.JLabel();
        Gname2 = new javax.swing.JLabel();
        Gname3 = new javax.swing.JLabel();
        Cname4 = new javax.swing.JLabel();
        Cname2 = new javax.swing.JLabel();
        Sname4 = new javax.swing.JLabel();
        Sname2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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

        Bname4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Bname4.setForeground(new java.awt.Color(51, 51, 51));
        Bname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bname4.setText("Head Boy 4");
        jPanel1.add(Bname4);
        Bname4.setBounds(150, 580, 120, 20);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CAST VOTE");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1010, 620, 160, 40);

        Sports4.setBackground(new java.awt.Color(51, 51, 51));
        Sports4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        Sports4.setMinimumSize(new java.awt.Dimension(100, 100));
        Sports4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sports4MouseClicked(evt);
            }
        });
        Sports4.setLayout(null);

        Spic4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spic4.setText("SPORTS 4");
        Sports4.add(Spic4);
        Spic4.setBounds(3, 3, 114, 114);

        jPanel1.add(Sports4);
        Sports4.setBounds(1050, 460, 120, 120);

        Sports3.setBackground(new java.awt.Color(51, 51, 51));
        Sports3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        Sports3.setMinimumSize(new java.awt.Dimension(100, 100));
        Sports3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sports3MouseClicked(evt);
            }
        });
        Sports3.setLayout(null);

        Spic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spic3.setText("SPORTS 3");
        Sports3.add(Spic3);
        Spic3.setBounds(3, 3, 114, 114);

        jPanel1.add(Sports3);
        Sports3.setBounds(920, 460, 120, 120);

        Sports1.setBackground(new java.awt.Color(51, 51, 51));
        Sports1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        Sports1.setMinimumSize(new java.awt.Dimension(100, 100));
        Sports1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sports1MouseClicked(evt);
            }
        });
        Sports1.setLayout(null);

        Spic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spic1.setText("SPORTS 1");
        Sports1.add(Spic1);
        Spic1.setBounds(3, 3, 114, 114);

        jPanel1.add(Sports1);
        Sports1.setBounds(920, 290, 120, 120);

        Sports2.setBackground(new java.awt.Color(51, 51, 51));
        Sports2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        Sports2.setMinimumSize(new java.awt.Dimension(100, 100));
        Sports2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sports2MouseClicked(evt);
            }
        });
        Sports2.setLayout(null);

        Spic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spic2.setText("SPORTS 2");
        Sports2.add(Spic2);
        Spic2.setBounds(3, 3, 114, 114);

        jPanel1.add(Sports2);
        Sports2.setBounds(1050, 290, 120, 120);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SPORTS CAPTAIN");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(920, 240, 200, 50);

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CULTURAL CAPTAIN");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(620, 240, 250, 50);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VOTE FOR CAPTAINS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 180, 580, 70);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("HEAD GIRL");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(360, 240, 170, 50);

        HeadGirl1.setBackground(new java.awt.Color(51, 51, 51));
        HeadGirl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        HeadGirl1.setMinimumSize(new java.awt.Dimension(100, 100));
        HeadGirl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadGirl1MouseClicked(evt);
            }
        });
        HeadGirl1.setLayout(null);

        Gpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gpic1.setText("HEAD GIRL 1");
        HeadGirl1.add(Gpic1);
        Gpic1.setBounds(3, 3, 114, 114);

        jPanel1.add(HeadGirl1);
        HeadGirl1.setBounds(320, 290, 120, 120);

        HeadGirl2.setBackground(new java.awt.Color(51, 51, 51));
        HeadGirl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        HeadGirl2.setMinimumSize(new java.awt.Dimension(100, 100));
        HeadGirl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadGirl2MouseClicked(evt);
            }
        });
        HeadGirl2.setLayout(null);

        Gpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gpic2.setText("HEAD GIRL 2");
        HeadGirl2.add(Gpic2);
        Gpic2.setBounds(3, 3, 114, 114);

        jPanel1.add(HeadGirl2);
        HeadGirl2.setBounds(450, 290, 120, 120);

        Cultural1.setBackground(new java.awt.Color(51, 51, 51));
        Cultural1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        Cultural1.setMinimumSize(new java.awt.Dimension(100, 100));
        Cultural1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cultural1MouseClicked(evt);
            }
        });
        Cultural1.setLayout(null);

        Cpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cpic1.setText("CULTURAL 1");
        Cpic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cpic1MouseClicked(evt);
            }
        });
        Cultural1.add(Cpic1);
        Cpic1.setBounds(3, 3, 114, 114);

        jPanel1.add(Cultural1);
        Cultural1.setBounds(620, 290, 120, 120);

        Cultural2.setBackground(new java.awt.Color(51, 51, 51));
        Cultural2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        Cultural2.setMinimumSize(new java.awt.Dimension(100, 100));
        Cultural2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cultural2MouseClicked(evt);
            }
        });
        Cultural2.setLayout(null);

        Cpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cpic2.setText("CULTURAL 2");
        Cultural2.add(Cpic2);
        Cpic2.setBounds(3, 3, 114, 114);

        jPanel1.add(Cultural2);
        Cultural2.setBounds(750, 290, 120, 120);

        Cultural4.setBackground(new java.awt.Color(51, 51, 51));
        Cultural4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        Cultural4.setMinimumSize(new java.awt.Dimension(100, 100));
        Cultural4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cultural4MouseClicked(evt);
            }
        });
        Cultural4.setLayout(null);

        Cpic4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cpic4.setText("CULTURAL 4");
        Cultural4.add(Cpic4);
        Cpic4.setBounds(3, 3, 114, 114);

        jPanel1.add(Cultural4);
        Cultural4.setBounds(750, 460, 120, 120);

        HeadGirl4.setBackground(new java.awt.Color(51, 51, 51));
        HeadGirl4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        HeadGirl4.setMinimumSize(new java.awt.Dimension(100, 100));
        HeadGirl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadGirl4MouseClicked(evt);
            }
        });
        HeadGirl4.setLayout(null);

        Gpic4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gpic4.setText("HEAD GIRL 4");
        HeadGirl4.add(Gpic4);
        Gpic4.setBounds(3, 3, 114, 114);

        jPanel1.add(HeadGirl4);
        HeadGirl4.setBounds(450, 460, 120, 120);

        HeadGirl3.setBackground(new java.awt.Color(51, 51, 51));
        HeadGirl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        HeadGirl3.setMinimumSize(new java.awt.Dimension(100, 100));
        HeadGirl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadGirl3MouseClicked(evt);
            }
        });
        HeadGirl3.setLayout(null);

        Gpic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gpic3.setText("HEAD GIRL 3");
        HeadGirl3.add(Gpic3);
        Gpic3.setBounds(3, 3, 114, 114);

        jPanel1.add(HeadGirl3);
        HeadGirl3.setBounds(320, 460, 120, 120);

        HeadBoy4.setBackground(new java.awt.Color(51, 51, 51));
        HeadBoy4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        HeadBoy4.setMinimumSize(new java.awt.Dimension(100, 100));
        HeadBoy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadBoy4MouseClicked(evt);
            }
        });
        HeadBoy4.setLayout(null);

        Bpic4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bpic4.setText("HEAD BOY 4");
        HeadBoy4.add(Bpic4);
        Bpic4.setBounds(3, 3, 114, 114);

        jPanel1.add(HeadBoy4);
        HeadBoy4.setBounds(150, 460, 120, 120);

        HeadBoy3.setBackground(new java.awt.Color(51, 51, 51));
        HeadBoy3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        HeadBoy3.setMinimumSize(new java.awt.Dimension(100, 100));
        HeadBoy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadBoy3MouseClicked(evt);
            }
        });
        HeadBoy3.setLayout(null);

        Bpic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bpic3.setText("HEAD BOY 3");
        HeadBoy3.add(Bpic3);
        Bpic3.setBounds(3, 3, 114, 114);

        jPanel1.add(HeadBoy3);
        HeadBoy3.setBounds(20, 460, 120, 120);

        HeadBoy1.setBackground(new java.awt.Color(51, 51, 51));
        HeadBoy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        HeadBoy1.setMinimumSize(new java.awt.Dimension(100, 100));
        HeadBoy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadBoy1MouseClicked(evt);
            }
        });
        HeadBoy1.setLayout(null);

        Bpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bpic1.setText("HEAD BOY 1");
        HeadBoy1.add(Bpic1);
        Bpic1.setBounds(3, 3, 114, 114);

        jPanel1.add(HeadBoy1);
        HeadBoy1.setBounds(20, 290, 120, 120);

        HeadBoy2.setBackground(new java.awt.Color(51, 51, 51));
        HeadBoy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        HeadBoy2.setMinimumSize(new java.awt.Dimension(100, 100));
        HeadBoy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadBoy2MouseClicked(evt);
            }
        });
        HeadBoy2.setLayout(null);

        Bpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bpic2.setText("HEAD BOY 2");
        HeadBoy2.add(Bpic2);
        Bpic2.setBounds(3, 3, 114, 114);

        jPanel1.add(HeadBoy2);
        HeadBoy2.setBounds(150, 290, 120, 120);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HEAD BOY");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 240, 170, 50);

        Sname1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Sname1.setForeground(new java.awt.Color(51, 51, 51));
        Sname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sname1.setText("Sports 1");
        jPanel1.add(Sname1);
        Sname1.setBounds(920, 410, 120, 20);

        Sname3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Sname3.setForeground(new java.awt.Color(51, 51, 51));
        Sname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sname3.setText("Sports 3");
        jPanel1.add(Sname3);
        Sname3.setBounds(920, 580, 120, 20);

        Bname3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Bname3.setForeground(new java.awt.Color(51, 51, 51));
        Bname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bname3.setText("Head Boy 3");
        jPanel1.add(Bname3);
        Bname3.setBounds(20, 580, 120, 20);

        Cultural3.setBackground(new java.awt.Color(51, 51, 51));
        Cultural3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        Cultural3.setMinimumSize(new java.awt.Dimension(100, 100));
        Cultural3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cultural3MouseClicked(evt);
            }
        });
        Cultural3.setLayout(null);

        Cpic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cpic3.setText("CULTURAL 3");
        Cultural3.add(Cpic3);
        Cpic3.setBounds(3, 3, 114, 114);

        jPanel1.add(Cultural3);
        Cultural3.setBounds(620, 460, 120, 120);

        Bname1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Bname1.setForeground(new java.awt.Color(51, 51, 51));
        Bname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bname1.setText("Head Boy 1");
        jPanel1.add(Bname1);
        Bname1.setBounds(20, 410, 120, 20);

        Gname1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Gname1.setForeground(new java.awt.Color(51, 51, 51));
        Gname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gname1.setText("Head Girl 1");
        jPanel1.add(Gname1);
        Gname1.setBounds(320, 410, 120, 20);

        Cname1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Cname1.setForeground(new java.awt.Color(51, 51, 51));
        Cname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cname1.setText("Cultural 1");
        jPanel1.add(Cname1);
        Cname1.setBounds(620, 410, 120, 20);

        Bname2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Bname2.setForeground(new java.awt.Color(51, 51, 51));
        Bname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bname2.setText("Head Boy 2");
        jPanel1.add(Bname2);
        Bname2.setBounds(150, 410, 120, 20);

        Gname4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Gname4.setForeground(new java.awt.Color(51, 51, 51));
        Gname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gname4.setText("Head Girl 4");
        jPanel1.add(Gname4);
        Gname4.setBounds(450, 580, 120, 20);

        Cname3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Cname3.setForeground(new java.awt.Color(51, 51, 51));
        Cname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cname3.setText("Cultural 3");
        jPanel1.add(Cname3);
        Cname3.setBounds(620, 580, 120, 20);

        Gname2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Gname2.setForeground(new java.awt.Color(51, 51, 51));
        Gname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gname2.setText("Head Girl 2");
        jPanel1.add(Gname2);
        Gname2.setBounds(450, 410, 120, 20);

        Gname3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Gname3.setForeground(new java.awt.Color(51, 51, 51));
        Gname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Gname3.setText("Head Girl 3");
        jPanel1.add(Gname3);
        Gname3.setBounds(320, 580, 120, 20);

        Cname4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Cname4.setForeground(new java.awt.Color(51, 51, 51));
        Cname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cname4.setText("Cultural 4");
        jPanel1.add(Cname4);
        Cname4.setBounds(750, 580, 120, 20);

        Cname2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Cname2.setForeground(new java.awt.Color(51, 51, 51));
        Cname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cname2.setText("Cultural 2");
        jPanel1.add(Cname2);
        Cname2.setBounds(750, 410, 120, 20);

        Sname4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Sname4.setForeground(new java.awt.Color(51, 51, 51));
        Sname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sname4.setText("Sports 4");
        jPanel1.add(Sname4);
        Sname4.setBounds(1050, 580, 120, 20);

        Sname2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        Sname2.setForeground(new java.awt.Color(51, 51, 51));
        Sname2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sname2.setText("Sports 2");
        jPanel1.add(Sname2);
        Sname2.setBounds(1050, 410, 120, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting/res/back.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 10, 60, 60);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HAPPY VOTING");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(440, 610, 310, 40);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" + Furqaan Developments +");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 640, 310, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 0, 400, 190);

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        if (!HeadBoy.equals("")
                && !HeadGirl.equals("")
                && !Cultural.equals("")
                && !Sports.equals("")) {
            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                query = "update headboy set count = count + 1 where name = '" + HeadBoy + "';";

                stmt.execute(query);

                stmt.close();
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "SQL ERROR", WIDTH);
            }

            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                query = "update headgirl set count = count + 1 where name = '" + HeadGirl + "';";

                stmt.execute(query);

                stmt.close();
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "SQL ERROR", WIDTH);
            }

            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                query = "update cultural set count = count + 1 where name = '" + Cultural + "';";

                stmt.execute(query);

                stmt.close();
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "SQL ERROR", WIDTH);
            }

            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                Statement stmt = con.createStatement();

                query = "update sports set count = count + 1 where name = '" + Sports + "';";

                stmt.execute(query);

                stmt.close();
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "SQL ERROR", WIDTH);
            }

            JOptionPane.showMessageDialog(this, "Your Vote has been Saved\nYou Voted for\nHead Boy              - "
                    + HeadBoy + "\nHead Girl               - " + HeadGirl + "\nCultural Captain  - " + Cultural
                    + "\nSports Captain    - " + Sports + "\nThank You", "Info", JOptionPane.WIDTH);

            Sports = "";
            Cultural = "";
            HeadBoy = "";
            HeadGirl = "";

            HeadBoy1.setBorder(def);
            HeadBoy2.setBorder(def);
            HeadBoy3.setBorder(def);
            HeadBoy4.setBorder(def);

            HeadGirl1.setBorder(def);
            HeadGirl2.setBorder(def);
            HeadGirl3.setBorder(def);
            HeadGirl4.setBorder(def);

            Cultural1.setBorder(def);
            Cultural2.setBorder(def);
            Cultural3.setBorder(def);
            Cultural4.setBorder(def);

            Sports1.setBorder(def);
            Sports2.setBorder(def);
            Sports3.setBorder(def);
            Sports4.setBorder(def);
        } else {
            JOptionPane.showMessageDialog(this, "Make sure you have Selected all the Captians", "Error", WIDTH);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Sports4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sports4MouseClicked
        // TODO add your handling code here:
        if (Sports2.getBorder() == border) {
            Sports2.setBorder(def);
        }

        if (Sports3.getBorder() == border) {
            Sports3.setBorder(def);
        }

        if (Sports1.getBorder() == border) {
            Sports1.setBorder(def);
        }

        if (Sports4.getBorder() == def) {
            Sports4.setBorder(border);
            Sports = Sname4.getText();
        }
    }//GEN-LAST:event_Sports4MouseClicked

    private void Sports3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sports3MouseClicked
        // TODO add your handling code here:
        if (Sports2.getBorder() == border) {
            Sports2.setBorder(def);
        }

        if (Sports1.getBorder() == border) {
            Sports1.setBorder(def);
        }

        if (Sports4.getBorder() == border) {
            Sports4.setBorder(def);
        }

        if (Sports3.getBorder() == def) {
            Sports3.setBorder(border);
            Sports = Sname3.getText();
        }
    }//GEN-LAST:event_Sports3MouseClicked

    private void Sports1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sports1MouseClicked
        // TODO add your handling code here:
        if (Sports2.getBorder() == border) {
            Sports2.setBorder(def);
        }

        if (Sports3.getBorder() == border) {
            Sports3.setBorder(def);
        }

        if (Sports4.getBorder() == border) {
            Sports4.setBorder(def);
        }

        if (Sports1.getBorder() == def) {
            Sports1.setBorder(border);
            Sports = Sname1.getText();
        }
    }//GEN-LAST:event_Sports1MouseClicked

    private void Sports2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sports2MouseClicked
        // TODO add your handling code here:
        if (Sports1.getBorder() == border) {
            Sports1.setBorder(def);
        }

        if (Sports3.getBorder() == border) {
            Sports3.setBorder(def);
        }

        if (Sports4.getBorder() == border) {
            Sports4.setBorder(def);
        }

        if (Sports2.getBorder() == def) {
            Sports2.setBorder(border);
            Sports = Sname2.getText();
        }
    }//GEN-LAST:event_Sports2MouseClicked

    private void HeadGirl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadGirl1MouseClicked
        // TODO add your handling code here:
        if (HeadGirl2.getBorder() == border) {
            HeadGirl2.setBorder(def);
        }

        if (HeadGirl3.getBorder() == border) {
            HeadGirl3.setBorder(def);
        }

        if (HeadGirl4.getBorder() == border) {
            HeadGirl4.setBorder(def);
        }

        if (HeadGirl1.getBorder() == def) {
            HeadGirl1.setBorder(border);
            HeadGirl = Gname1.getText();
        }
    }//GEN-LAST:event_HeadGirl1MouseClicked

    private void HeadGirl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadGirl2MouseClicked
        // TODO add your handling code here:
        if (HeadGirl1.getBorder() == border) {
            HeadGirl1.setBorder(def);
        }

        if (HeadGirl3.getBorder() == border) {
            HeadGirl3.setBorder(def);
        }

        if (HeadGirl4.getBorder() == border) {
            HeadGirl4.setBorder(def);
        }

        if (HeadGirl2.getBorder() == def) {
            HeadGirl2.setBorder(border);
            HeadGirl = Gname2.getText();
        }
    }//GEN-LAST:event_HeadGirl2MouseClicked

    private void Cultural1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cultural1MouseClicked
        // TODO add your handling code here:
        if (Cultural2.getBorder() == border) {
            Cultural2.setBorder(def);
        }

        if (Cultural3.getBorder() == border) {
            Cultural3.setBorder(def);
        }

        if (Cultural4.getBorder() == border) {
            Cultural4.setBorder(def);
        }

        if (Cultural1.getBorder() == def) {
            Cultural1.setBorder(border);
            Cultural = Cname1.getText();
        }
    }//GEN-LAST:event_Cultural1MouseClicked

    private void Cultural4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cultural4MouseClicked
        // TODO add your handling code here:
        if (Cultural2.getBorder() == border) {
            Cultural2.setBorder(def);
        }

        if (Cultural3.getBorder() == border) {
            Cultural3.setBorder(def);
        }

        if (Cultural1.getBorder() == border) {
            Cultural1.setBorder(def);
        }

        if (Cultural4.getBorder() == def) {
            Cultural4.setBorder(border);
            Cultural = Cname4.getText();
        }
    }//GEN-LAST:event_Cultural4MouseClicked

    private void HeadGirl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadGirl4MouseClicked
        // TODO add your handling code here:
        if (HeadGirl2.getBorder() == border) {
            HeadGirl2.setBorder(def);
        }

        if (HeadGirl3.getBorder() == border) {
            HeadGirl3.setBorder(def);
        }

        if (HeadGirl1.getBorder() == border) {
            HeadGirl1.setBorder(def);
        }

        if (HeadGirl4.getBorder() == def) {
            HeadGirl4.setBorder(border);
            HeadGirl = Gname4.getText();
        }
    }//GEN-LAST:event_HeadGirl4MouseClicked

    private void HeadGirl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadGirl3MouseClicked
        // TODO add your handling code here:
        if (HeadGirl2.getBorder() == border) {
            HeadGirl2.setBorder(def);
        }

        if (HeadGirl1.getBorder() == border) {
            HeadGirl1.setBorder(def);
        }

        if (HeadGirl4.getBorder() == border) {
            HeadGirl4.setBorder(def);
        }

        if (HeadGirl3.getBorder() == def) {
            HeadGirl3.setBorder(border);
            HeadGirl = Gname3.getText();
        }
    }//GEN-LAST:event_HeadGirl3MouseClicked

    private void HeadBoy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadBoy4MouseClicked
        // TODO add your handling code here:
        if (HeadBoy2.getBorder() == border) {
            HeadBoy2.setBorder(def);
        }

        if (HeadBoy3.getBorder() == border) {
            HeadBoy3.setBorder(def);
        }

        if (HeadBoy1.getBorder() == border) {
            HeadBoy1.setBorder(def);
        }

        if (HeadBoy4.getBorder() == def) {
            HeadBoy4.setBorder(border);
            HeadBoy = Bname4.getText();
        }
    }//GEN-LAST:event_HeadBoy4MouseClicked

    private void HeadBoy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadBoy3MouseClicked
        // TODO add your handling code here:
        if (HeadBoy2.getBorder() == border) {
            HeadBoy2.setBorder(def);
        }

        if (HeadBoy1.getBorder() == border) {
            HeadBoy1.setBorder(def);
        }

        if (HeadBoy4.getBorder() == border) {
            HeadBoy4.setBorder(def);
        }

        if (HeadBoy3.getBorder() == def) {
            HeadBoy3.setBorder(border);
            HeadBoy = Bname3.getText();
        }
    }//GEN-LAST:event_HeadBoy3MouseClicked

    private void HeadBoy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadBoy1MouseClicked
        // TODO add your handling code here:
        if (HeadBoy2.getBorder() == border) {
            HeadBoy2.setBorder(def);
        }

        if (HeadBoy3.getBorder() == border) {
            HeadBoy3.setBorder(def);
        }

        if (HeadBoy4.getBorder() == border) {
            HeadBoy4.setBorder(def);
        }

        if (HeadBoy1.getBorder() == def) {
            HeadBoy1.setBorder(border);
            HeadBoy = Bname1.getText();
        }

    }//GEN-LAST:event_HeadBoy1MouseClicked

    private void HeadBoy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadBoy2MouseClicked
        // TODO add your handling code here:

        if (HeadBoy1.getBorder() == border) {
            HeadBoy1.setBorder(def);
        }

        if (HeadBoy3.getBorder() == border) {
            HeadBoy3.setBorder(def);
        }

        if (HeadBoy4.getBorder() == border) {
            HeadBoy4.setBorder(def);
        }

        if (HeadBoy2.getBorder() == def) {
            HeadBoy2.setBorder(border);
            HeadBoy = Bname2.getText();

        }
    }//GEN-LAST:event_HeadBoy2MouseClicked

    private void Cultural2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cultural2MouseClicked
        // TODO add your handling code here:
        if (Cultural1.getBorder() == border) {
            Cultural1.setBorder(def);
        }

        if (Cultural3.getBorder() == border) {
            Cultural3.setBorder(def);
        }

        if (Cultural4.getBorder() == border) {
            Cultural4.setBorder(def);
        }

        if (Cultural2.getBorder() == def) {
            Cultural2.setBorder(border);
            Cultural = Cname2.getText();
        }
    }//GEN-LAST:event_Cultural2MouseClicked

    private void Cultural3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cultural3MouseClicked
        // TODO add your handling code here:
        if (Cultural2.getBorder() == border) {
            Cultural2.setBorder(def);
        }

        if (Cultural1.getBorder() == border) {
            Cultural1.setBorder(def);
        }

        if (Cultural4.getBorder() == border) {
            Cultural4.setBorder(def);
        }

        if (Cultural3.getBorder() == def) {
            Cultural3.setBorder(border);
            Cultural = Cname3.getText();
        }
    }//GEN-LAST:event_Cultural3MouseClicked

    private void Cpic1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cpic1MouseClicked
        // TODO add your handling code here:
        if (Cultural2.getBorder() == border) {
            Cultural2.setBorder(def);
        }

        if (Cultural3.getBorder() == border) {
            Cultural3.setBorder(def);
        }

        if (Cultural4.getBorder() == border) {
            Cultural4.setBorder(def);
        }

        if (Cultural1.getBorder() == def) {
            Cultural1.setBorder(border);
            Cultural = Cname1.getText();
        }
    }//GEN-LAST:event_Cpic1MouseClicked

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
        // TODO add your handling code here:
        new Vote_Frame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        if (times == 0) {
            switch (Lheadboy.size()) {
                case 1:
                    HeadBoy2.setVisible(false);
                    Bname2.setVisible(false);

                    HeadBoy3.setVisible(false);
                    Bname3.setVisible(false);

                    HeadBoy4.setVisible(false);
                    Bname4.setVisible(false);

                    break;

                case 2:
                    HeadBoy3.setVisible(false);
                    Bname3.setVisible(false);

                    HeadBoy4.setVisible(false);
                    Bname4.setVisible(false);

                    break;

                case 3:
                    HeadBoy4.setVisible(false);
                    Bname4.setVisible(false);

                    break;
            }

            switch (Lheadgirl.size()) {
                case 1:
                    HeadGirl2.setVisible(false);
                    Gname2.setVisible(false);

                    HeadGirl3.setVisible(false);
                    Gname3.setVisible(false);

                    HeadGirl4.setVisible(false);
                    Gname4.setVisible(false);

                    break;

                case 2:
                    HeadGirl3.setVisible(false);
                    Gname3.setVisible(false);

                    HeadGirl4.setVisible(false);
                    Gname4.setVisible(false);

                    break;

                case 3:
                    HeadGirl4.setVisible(false);
                    Gname4.setVisible(false);

                    break;
            }

            switch (Lcultural.size()) {
                case 1:
                    Cultural2.setVisible(false);
                    Cname2.setVisible(false);

                    Cultural3.setVisible(false);
                    Cname3.setVisible(false);

                    Cultural4.setVisible(false);
                    Cname4.setVisible(false);

                    break;

                case 2:
                    Cultural3.setVisible(false);
                    Cname3.setVisible(false);

                    Cultural4.setVisible(false);
                    Cname4.setVisible(false);

                    break;

                case 3:
                    Cultural4.setVisible(false);
                    Cname4.setVisible(false);

                    break;
            }

            switch (Lsports.size()) {
                case 1:
                    Sports2.setVisible(false);
                    Sname2.setVisible(false);

                    Sports3.setVisible(false);
                    Sname3.setVisible(false);

                    Sports4.setVisible(false);
                    Sname4.setVisible(false);

                    break;

                case 2:
                    Sports3.setVisible(false);
                    Sname3.setVisible(false);

                    Sports4.setVisible(false);
                    Sname4.setVisible(false);

                    break;

                case 3:
                    Sports4.setVisible(false);
                    Sname4.setVisible(false);

                    break;
            }

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
            java.util.logging.Logger.getLogger(Vote_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vote_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vote_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vote_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Vote_all().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bname1;
    private javax.swing.JLabel Bname2;
    private javax.swing.JLabel Bname3;
    private javax.swing.JLabel Bname4;
    private javax.swing.JLabel Bpic1;
    private javax.swing.JLabel Bpic2;
    private javax.swing.JLabel Bpic3;
    private javax.swing.JLabel Bpic4;
    private javax.swing.JLabel Cname1;
    private javax.swing.JLabel Cname2;
    private javax.swing.JLabel Cname3;
    private javax.swing.JLabel Cname4;
    private javax.swing.JLabel Cpic1;
    private javax.swing.JLabel Cpic2;
    private javax.swing.JLabel Cpic3;
    private javax.swing.JLabel Cpic4;
    private javax.swing.JPanel Cultural1;
    private javax.swing.JPanel Cultural2;
    private javax.swing.JPanel Cultural3;
    private javax.swing.JPanel Cultural4;
    private javax.swing.JLabel Gname1;
    private javax.swing.JLabel Gname2;
    private javax.swing.JLabel Gname3;
    private javax.swing.JLabel Gname4;
    private javax.swing.JLabel Gpic1;
    private javax.swing.JLabel Gpic2;
    private javax.swing.JLabel Gpic3;
    private javax.swing.JLabel Gpic4;
    private javax.swing.JPanel HeadBoy1;
    private javax.swing.JPanel HeadBoy2;
    private javax.swing.JPanel HeadBoy3;
    private javax.swing.JPanel HeadBoy4;
    private javax.swing.JPanel HeadGirl1;
    private javax.swing.JPanel HeadGirl2;
    private javax.swing.JPanel HeadGirl3;
    private javax.swing.JPanel HeadGirl4;
    private javax.swing.JLabel Sname1;
    private javax.swing.JLabel Sname2;
    private javax.swing.JLabel Sname3;
    private javax.swing.JLabel Sname4;
    private javax.swing.JLabel Spic1;
    private javax.swing.JLabel Spic2;
    private javax.swing.JLabel Spic3;
    private javax.swing.JLabel Spic4;
    private javax.swing.JPanel Sports1;
    private javax.swing.JPanel Sports2;
    private javax.swing.JPanel Sports3;
    private javax.swing.JPanel Sports4;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
