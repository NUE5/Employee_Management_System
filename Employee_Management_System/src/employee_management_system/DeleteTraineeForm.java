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
public class DeleteTraineeForm extends javax.swing.JFrame {

    /**
     * Creates new form DeleteTraineeForm
     */
    public DeleteTraineeForm() {
        initComponents();
         this .setExtendedState(MAXIMIZED_BOTH);
        this.setSize(1920, 1080);
        photo.setSize(1980, 1080);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        acayear = new javax.swing.JTextField();
        gpa = new javax.swing.JTextField();
        university = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        photo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        search.setBackground(new java.awt.Color(204, 204, 255));
        search.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        search.setForeground(new java.awt.Color(0, 51, 51));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(1620, 800, 270, 50);

        Delete.setBackground(new java.awt.Color(204, 204, 255));
        Delete.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 51, 51));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete);
        Delete.setBounds(1270, 800, 270, 50);

        jLabel11.setText("Designed by Code Makers 2019.");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1620, 880, 240, 16);

        jLabel6.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(920, 610, 370, 49);

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(920, 290, 200, 49);

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Sur Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(920, 230, 360, 49);

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(920, 170, 380, 50);

        jLabel10.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Academic Year");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(920, 480, 510, 49);

        jLabel9.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("GPA");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(920, 420, 170, 50);

        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(920, 540, 270, 49);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Engineer ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(910, 110, 420, 49);

        jLabel7.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("University");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(920, 360, 360, 49);

        email.setBackground(new java.awt.Color(204, 204, 255));
        email.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(email);
        email.setBounds(1470, 560, 340, 22);

        password.setBackground(new java.awt.Color(204, 204, 255));
        password.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(password);
        password.setBounds(1470, 640, 340, 22);

        acayear.setBackground(new java.awt.Color(204, 204, 255));
        acayear.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(acayear);
        acayear.setBounds(1470, 500, 340, 22);

        gpa.setBackground(new java.awt.Color(204, 204, 255));
        gpa.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(gpa);
        gpa.setBounds(1470, 440, 340, 22);

        university.setBackground(new java.awt.Color(204, 204, 255));
        university.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(university);
        university.setBounds(1470, 370, 340, 22);

        age.setBackground(new java.awt.Color(204, 204, 255));
        age.setForeground(new java.awt.Color(51, 0, 51));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age);
        age.setBounds(1470, 300, 340, 22);

        lname.setBackground(new java.awt.Color(204, 204, 255));
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setText(" ");
        getContentPane().add(lname);
        lname.setBounds(1470, 240, 340, 22);

        fname.setBackground(new java.awt.Color(204, 204, 255));
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setText(" ");
        getContentPane().add(fname);
        fname.setBounds(1470, 180, 340, 22);

        id.setBackground(new java.awt.Color(204, 204, 255));
        id.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(id);
        id.setBounds(1470, 120, 340, 22);

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_management_system/addpic/anaa.jpg"))); // NOI18N
        getContentPane().add(photo);
        photo.setBounds(0, 0, 1900, 1080);

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
               found=true;
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
    }                                      

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       

   
    }//GEN-LAST:event_searchActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

      try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=employee_system;integratedSecurity=true";
            Connection con = DriverManager.getConnection(url);
            int i=Integer.valueOf(id.getText());
            String query="Delete FROM trainee WhERE ID="+i;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted successfully");
           new Admin().setVisible(true);
            this.setVisible(false);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteTraineeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField acayear;
    private javax.swing.JTextField age;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gpa;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField password;
    private javax.swing.JLabel photo;
    private javax.swing.JButton search;
    private javax.swing.JTextField university;
    // End of variables declaration//GEN-END:variables
}
