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
public class AddTraineeForm extends javax.swing.JFrame {
String gender;
    /**
     * Creates new form AddTraineeForm
     */
    public AddTraineeForm() {
        initComponents();
         this .setExtendedState(MAXIMIZED_BOTH);
        photo.setSize(1980, 1080);
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

        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        university = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        addbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gpa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        acayear = new javax.swing.JTextField();
        photo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 0));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1030, 630, 380, 89);

        fname.setBackground(new java.awt.Color(204, 204, 204));
        fname.setForeground(new java.awt.Color(0, 0, 51));
        fname.setText(" ");
        getContentPane().add(fname);
        fname.setBounds(1520, 50, 340, 22);

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(password);
        password.setBounds(1520, 650, 340, 20);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setText("Sur name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1020, 110, 370, 89);

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 0));
        jLabel7.setText("University");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1030, 280, 390, 89);

        lname.setBackground(new java.awt.Color(204, 204, 204));
        lname.setForeground(new java.awt.Color(0, 0, 51));
        lname.setText(" ");
        getContentPane().add(lname);
        lname.setBounds(1520, 140, 340, 22);

        university.setBackground(new java.awt.Color(204, 204, 204));
        university.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(university);
        university.setBounds(1520, 320, 340, 22);

        Gender.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        Gender.setForeground(new java.awt.Color(0, 51, 0));
        Gender.setText("Gender");
        getContentPane().add(Gender);
        Gender.setBounds(1030, 720, 270, 89);

        male.setBackground(new java.awt.Color(204, 204, 255));
        male.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        male.setForeground(new java.awt.Color(0, 51, 51));
        male.setText("Male");
        male.setContentAreaFilled(false);
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(1820, 750, 100, 30);

        female.setBackground(new java.awt.Color(204, 204, 255));
        female.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        female.setForeground(new java.awt.Color(0, 51, 51));
        female.setText("Female");
        female.setContentAreaFilled(false);
        getContentPane().add(female);
        female.setBounds(1630, 750, 140, 30);

        addbtn.setBackground(new java.awt.Color(204, 204, 255));
        addbtn.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        addbtn.setForeground(new java.awt.Color(0, 51, 51));
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn);
        addbtn.setBounds(1710, 840, 190, 40);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 0));
        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1030, 190, 180, 89);

        age.setBackground(new java.awt.Color(204, 204, 204));
        age.setForeground(new java.awt.Color(0, 0, 51));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age);
        age.setBounds(1520, 230, 340, 22);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 0));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1030, 550, 250, 70);

        email.setBackground(new java.awt.Color(204, 204, 204));
        email.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(email);
        email.setBounds(1520, 560, 340, 22);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("First name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1020, 20, 440, 70);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 0));
        jLabel9.setText("GPA");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1030, 370, 210, 89);

        gpa.setBackground(new java.awt.Color(204, 204, 204));
        gpa.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(gpa);
        gpa.setBounds(1520, 410, 340, 22);

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 0));
        jLabel10.setText("Academic Year");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1020, 460, 580, 89);

        acayear.setBackground(new java.awt.Color(204, 204, 204));
        acayear.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(acayear);
        acayear.setBounds(1520, 490, 340, 22);

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee_management_system/addpic/anaa.jpg"))); // NOI18N
        getContentPane().add(photo);
        photo.setBounds(1, -4, 1940, 1020);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=employee_system;integratedSecurity=true";
            Connection con = DriverManager.getConnection(url);
            String fun="insert into trainee (university,GPA,academicyear,salary,fname,lname,email,age,password,gender) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(fun);
            pst.setString(1,university.getText());
            pst.setFloat(2,Float.valueOf(gpa.getText()));
            
            if(male.isSelected())
            {
                gender="male";
            }
            if(female.isSelected())
            {
                gender="female";
            }
            pst.setString(10,gender);
            pst.setInt(3,Integer.valueOf(acayear.getText()));
            pst.setFloat(4,1000.0f);
            pst.setString(5,fname.getText());
            pst.setString(6,lname.getText());
            pst.setString(7,email.getText());
            pst.setInt(8,Integer.valueOf(age.getText()));
            pst.setString(9,password.getText());
           
            Employee e=new Trainee(Double.valueOf(gpa.getText()),university.getText(),Integer.valueOf(acayear.getText()),fname.getText(),lname.getText(),gender,email.getText(),Integer.valueOf(age.getText()),password.getText(),
              1000 );

     
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Added Trainee successfully");
            new Admin().setVisible(true);
            this.setVisible(false);
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

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
            java.util.logging.Logger.getLogger(AddTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTraineeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTraineeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JTextField acayear;
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField age;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gpa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField password;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField university;
    // End of variables declaration//GEN-END:variables
}
