/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Luqmaan
 */
public class Voting {

    /**
     * @param args the command line arguments
     */
    static File file = new File("").getAbsoluteFile();
    static File res = new File(file + "\\Resources\\final_Image3.png");
    static File res1 = new File(file + "\\Resources\\final_Image2.png");

    static Image BIG = new ImageIcon(res1.toString()).getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
    static Image BIG1 = new ImageIcon(res.toString()).getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
    static Image MED = new ImageIcon(res.toString()).getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
    static Image SMALL = new ImageIcon(res.toString()).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    static Image VSMALL = new ImageIcon(res.toString()).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);

    static ImageIcon big = new ImageIcon(BIG);
    static ImageIcon big1 = new ImageIcon(BIG1);
    static ImageIcon med = new ImageIcon(MED);
    static ImageIcon small = new ImageIcon(SMALL);
    static ImageIcon vsmall = new ImageIcon(VSMALL);

    public static void main(String[] args) throws InterruptedException {

        Splash splash = new Splash();
        splash.setVisible(true);
        boolean flag = true;

        for (int i = 0; i <= 100; i++) {
            Thread.sleep(20);
            splash.bar.setValue(i);
            String Key = ".";

            if (i >= 1 && i < 10) {
                splash.error.setText("Starting Application");
                if (i == 5) {
                    try {
                        File DefDirec = new File("");
                        String SDefDirec = DefDirec.getCanonicalPath();

                        String Sfile = SDefDirec + "\\Archive\\MAIN_DO_NOT_DELETE";
                        File file = new File(Sfile);

                        String Sfile1 = SDefDirec + "\\Archive";
                        File file1 = new File(Sfile1);

                        String path = file.toString();

                        if (file1.exists()) {
                            if (file.exists()) {
                                continue;
                            } else {
                                //String Key = "";
                                while (!Key.equals("20092000")) {
                                    Key = JOptionPane.showInputDialog(null, "Enter your Secret Key");

                                    if (Key.equals("20092000")) {
                                        try {
                                            BufferedImage res = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                                            ImageIO.write(res, "jpeg", new File(path));
                                        } catch (AWTException | IOException ex) {
                                            JOptionPane.showMessageDialog(null, ex.getMessage());
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Wrong Secret Key");
                                    }
                                }
                            }
                        } else {
                            file1.mkdir();
                            //String Key = "";
                            while (!Key.equals("20092000")) {
                                Key = JOptionPane.showInputDialog(null, "Enter your Secret Key");

                                System.out.print(Key);

                                if (Key.equals("20092000")) {
                                    try {
                                        BufferedImage res = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                                        ImageIO.write(res, "jpeg", new File(path));
                                    } catch (AWTException | IOException ex) {
                                        JOptionPane.showMessageDialog(null, ex.getMessage());
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Wrong Secret Key");
                                }
                            }

                        }
                    } catch (Exception w) {

                        if (w.toString().equals("java.lang.NullPointerException")) {
                            JOptionPane.showMessageDialog(null, "You Haven't Entered the Secret Key\nContact the Developer Or try again", "Error", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                    }
                }
            }

            if (i >= 20 && i <= 30) {

                splash.error.setText("Checking the Database");

                File file = new File("").getAbsoluteFile();
                
                File database = new File(file + "\\Database");

                File databaseFile = new File(database + "\\furqaan.db");

                flag = databaseFile.exists();

                Thread.sleep(20);

                if (i == 30) {
                    try {

                        if (flag == false) {

                            if (!database.exists()) {
                                database.mkdir();
                            }
                            String link = "jdbc:sqlite:" + databaseFile;
                            System.out.println(link);

                            Connection con = DriverManager.getConnection(link);

                            con.close();

                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        break;
                    }
                }
            }
            if (i > 30 && i < 40) {
                if (flag == true) {
                    splash.error.setText("Checking the Database");
                } else {
                    splash.error.setText("Building the Database");
                }

            }
            if (i >= 40 && i < 46) {

                splash.error.setText("Scanning Archive");
                Thread.sleep(20);

            }
            if (i >= 46 && i < 60) {
                if (flag == false) {
                    splash.error.setText("Creating Archive");
                }
            }

            if (i >= 60 && i < 80) {

                if (flag == true) {

                    splash.error.setText("Checking for the Directory");

                } else {

                    if (i == 65) {
                        splash.error.setText("Archives created");
                        Thread.sleep(500);
                    }
                }
                if (i > 65 && i < 80) {
                    splash.error.setText("Welcome to the World of Electronic Voting");
                    Thread.sleep(100);
                }
            }

            if (i >= 80 && i < 100) {

                splash.error.setText("Starting Application");
            }

            if (i == 100) {
                Thread.sleep(100);
                Splash1 s = new Splash1(flag);
                s.setVisible(true);
                splash.dispose();

                /*if (flag == true) {

                    Login login = new Login();
                    Thread.sleep(100);
                    login.setVisible(true);
                    splash.dispose();
                } else {
                    Thread.sleep(100);
                    Splash1 s = new Splash1();
                    s.setVisible(true);
                    splash.dispose();
                }*/
            }
        }
    }
}

//To check for Default Directory :)

/*try {

                            File file = new File("").getAbsoluteFile();
                            File database = new File(file + "\\Database");

                            File databaseFile = new File(database + "\\furqaan.db");

                            Class.forName("java.sql.Driver");
                            Connection con = DriverManager.getConnection("jdbc:sqlite:" + databaseFile);
                            Statement stmt = con.createStatement();

                            String query = "select *from Location";

                            ResultSet rs = stmt.executeQuery(query);

                            if (rs.next() != true) {
                                JOptionPane.showMessageDialog(null, "Default Path does not exist \nPlease add the Path now");

                                JFileChooser browse = new JFileChooser();
                                browse.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                                int a = browse.showDialog(null, "Save Directory");
                                if (a == JFileChooser.APPROVE_OPTION) {
                                    File files = browse.getSelectedFile();

                                    String path = files.getAbsoluteFile().toString().replace("\\", "/");
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
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }*/
