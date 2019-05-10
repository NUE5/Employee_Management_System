/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author nanon
 */

public class EditTraineeForm extends javax.swing.JFrame {

    /**
     * Creates new form EditTraineeForm
     */
 
    public EditTraineeForm() {
        initComponents();
        this .setExtendedState(MAXIMIZED_BOTH);
        //photo.setSize(1980, 1080);
        this.setSize(1980, 1080);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        university = new javax.swing.JTextField();
        gpa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        acayear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText(" Trainee ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(920, 10, 430, 60);

        id.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(id);
        id.setBounds(1480, 50, 220, 22);

        search.setBackground(new java.awt.Color(204, 204, 255));
        search.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        search.setForeground(new java.awt.Color(0, 51, 51));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(1120, 770, 240, 40);

        update.setBackground(new java.awt.Color(204, 204, 255));
        update.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        update.setForeground(new java.awt.Color(0, 51, 51));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(1430, 770, 240, 40);

        lname.setBackground(new java.awt.Color(204, 204, 255));
        lname.setText(" ");
        getContentPane().add(lname);
        lname.setBounds(1480, 180, 220, 22);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 80)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 0));
        jLabel9.setText("GPA");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(930, 380, 180, 80);

        university.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(university);
        university.setBounds(1480, 330, 220, 22);

        gpa.setBackground(new java.awt.Color(204, 204, 255));
        gpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaActionPerformed(evt);
            }
        });
        getContentPane().add(gpa);
        gpa.setBounds(1480, 410, 220, 22);

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 80)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 0));
        jLabel10.setText("Academic Year");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(910, 470, 560, 60);

        acayear.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(acayear);
        acayear.setBounds(1480, 490, 220, 22);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(930, 210, 310, 90);

        age.setBackground(new java.awt.Color(204, 204, 255));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age);
        age.setBounds(1480, 260, 220, 22);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 80)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 0));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(920, 550, 240, 60);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 80)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 0));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(930, 620, 380, 70);

        fname.setBackground(new java.awt.Color(204, 204, 255));
        fname.setText(" ");
        getContentPane().add(fname);
        fname.setBounds(1480, 110, 220, 22);

        password.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(password);
        password.setBounds(1480, 650, 220, 22);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("Sur name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(940, 150, 370, 70);

        email.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(email);
        email.setBounds(1480, 570, 220, 22);

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 80)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 0));
        jLabel7.setText("University");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(930, 300, 410, 90);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 80)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setText("First name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(940, 80, 400, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_management_system/addpic/anaa.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1920, 1200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       boolean found=false;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=employee_system;integratedSecurity=true";
            Connection con = DriverManager.getConnection(url);
            int i=Integer.valueOf(id.getText());
            String query="Select * FROM trainee WhERE ID="+i;
            PreparedStatement pst=con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while(rs.next())
            {
                fname.setText(rs.getString("fname"));
                lname.setText(rs.getString("lname"));
                age.setText(rs.getString("Age"));
                email.setText(rs.getString("email"));
                password.setText(rs.getString("password"));
                university.setText(rs.getString("university"));
                gpa.setText(rs.getString("GPA"));
               acayear.setText(rs.getString("academicyear"));
               found =true;
            }
             if(!found)
           {
               JOptionPane.showMessageDialog(null, "ID NOT FOUND!");
           }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=employee_system;integratedSecurity=true";
            Connection con = DriverManager.getConnection(url);
            int i=Integer.valueOf(id.getText());
            String fun="update trainee SET fname=?,lname=?,age=?,email=?,password=?,academicyear=?,GPA=?,university=? where ID="+i ;
            PreparedStatement pst=con.prepareStatement(fun);
            pst.setString(1,fname.getText());
            pst.setString(2,lname.getText());

            pst.setInt(3,Integer.valueOf(age.getText()));
            pst.setString(4,email.getText());
            pst.setString(5,password.getText());
          
            pst.setInt(6,Integer.valueOf(acayear.getText()));
            pst.setFloat(7,Float.valueOf(password.getText()));
            pst.setString(8,university.getText());

         
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated successfully");
            new Admin().setVisible(true);
            this.setVisible(false);
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void gpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaActionPerformed

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
            java.util.logging.Logger.getLogger(EditTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTraineeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acayear;
    private javax.swing.JTextField age;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gpa;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField password;
    private javax.swing.JButton search;
    private javax.swing.JTextField university;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
