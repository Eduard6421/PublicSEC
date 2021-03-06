/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Forms;

import Forms.Controllers.EmployeesTableController;
import Forms.Controllers.LoginController;
import Models.Employee;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javafx.util.Pair;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.javatuples.Triplet;

/**
 *
 * @author user
 */
public class AddEmployee extends javax.swing.JFrame {

    private EmployeesTableController parentController;
    static AddEmployee form;

    public AddEmployee() {
        initComponents();
    }

    public AddEmployee(EmployeesTableController controller) {
        initComponents();

        parentController = controller;

        buttonExit.addActionListener(parentController);
        buttonAdd.addActionListener(parentController);
    }
    
    public Triplet<Employee, Date, Date>  getNewEmployee() {
        
        Employee employee = null;
   
        try {  
            String password = new String(inputPassword.getPassword());
            String confirmPassword = new String(inputConfirmPassword.getPassword());
            
            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
            
            if (!Arrays.equals(inputPassword.getPassword(), inputConfirmPassword.getPassword())) {
                JOptionPane.showMessageDialog(null, "Passwords do not match.");
                return null;
            }
            Boolean check=true;
            String s1=inputStartDate.getText();
            String s2=inputEndDate.getText();
            Date startDate = dateFormatter.parse(s1);
            String sd=dateFormatter.format(startDate);
            Date endDate = dateFormatter.parse(s2);
            String ed=dateFormatter.format(endDate);
            if(!sd.equals(s1)||!ed.equals(s2)){
              JOptionPane.showMessageDialog(this,"The format of the date is not legal! It should be like this: yyyy-mm-dd");
              check=false;
            }
            if(startDate.after(endDate)){
                JOptionPane.showMessageDialog(this,"The start date is after the end date! Please enter a valid start date");
                check=false;
            }
                
            
            
            String username = inputUsername.getText();
            if(!username.matches("[a-zA-Z0-9]+$")){
                JOptionPane.showMessageDialog(this,"The username contains illegal characters");
                check=false;
            }
            String firstName = inputFirstName.getText();
            if(!firstName.matches("[a-zA-Z0-9]+$")){
                JOptionPane.showMessageDialog(this,"The firstName contains illegal characters!");
                check=false;
            }
            String lastName = inputLastName.getText();
            if(!lastName.matches("[a-zA-Z0-9]+$")){
                JOptionPane.showMessageDialog(this,"The lastName contains illegal characters!");
                check=false;
            }
            String email = inputEmail.getText();
            if(!email.matches("a-zA-Z0-9.")&&(!email.contains("@"))){
                JOptionPane.showMessageDialog(this,"The email is not valid!");
                check=false;
            }
            String phone = inputPhone.getText();
            if(!phone.matches("[0-9]+$")||phone.length()!=10){
                JOptionPane.showMessageDialog(this,"The phone number is not valid!");
                check=false;
            }
            if(check==true)
            
            {employee = new Employee(firstName, lastName, username, password, phone, email, 0);
            
            return new Triplet<>(employee, startDate, endDate);
            }
        
        }
        catch (ParseException e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null,"The format of the date is not legal! It should be like this: yyyy-mm-dd");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAdd = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelFirstName = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelConfirmPassword = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        inputPassword = new javax.swing.JPasswordField();
        inputConfirmPassword = new javax.swing.JPasswordField();
        inputFirstName = new javax.swing.JTextField();
        inputLastName = new javax.swing.JTextField();
        inputPhone = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        buttonExit = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        labelContractDetails = new javax.swing.JLabel();
        labelStartDate = new javax.swing.JLabel();
        labelEndDate = new javax.swing.JLabel();
        inputStartDate = new javax.swing.JTextField();
        inputEndDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PublicSEC");
        setBackground(new java.awt.Color(0, 102, 102));
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelAdd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAdd.setText("Add new employee");

        labelUsername.setText("Username");

        labelPassword.setText("Password");

        labelFirstName.setText("First Name");

        labelLastName.setText("Last Name");

        labelPhone.setText("Phone");

        labelEmail.setText("Email");

        labelConfirmPassword.setText("Confirm password");

        inputPassword.setToolTipText("");

        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonAdd.setText("Insert");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        labelContractDetails.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        labelContractDetails.setText("Contract details");

        labelStartDate.setText("Start Date");
        labelStartDate.setToolTipText("");

        labelEndDate.setText("End Date");
        labelEndDate.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUsername)
                                    .addComponent(labelPassword)
                                    .addComponent(labelConfirmPassword)
                                    .addComponent(labelFirstName)
                                    .addComponent(labelLastName)
                                    .addComponent(labelPhone)
                                    .addComponent(labelEmail))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(inputPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(inputLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(inputFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputUsername)
                                        .addComponent(inputPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(inputConfirmPassword))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelContractDetails)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelStartDate)
                                .addGap(95, 95, 95)
                                .addComponent(inputStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEndDate)
                                .addGap(102, 102, 102)
                                .addComponent(inputEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername)
                    .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelConfirmPassword)
                    .addComponent(inputConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFirstName)
                    .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLastName)
                    .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhone)
                    .addComponent(inputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(labelContractDetails)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStartDate)
                    .addComponent(inputStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndDate)
                    .addComponent(inputEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddActionPerformed


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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form = new AddEmployee();

                form.setVisible(true);
                
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonExit;
    private javax.swing.JPasswordField inputConfirmPassword;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputEndDate;
    private javax.swing.JTextField inputFirstName;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputPhone;
    private javax.swing.JTextField inputStartDate;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel labelAdd;
    private javax.swing.JLabel labelConfirmPassword;
    private javax.swing.JLabel labelContractDetails;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndDate;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelStartDate;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration//GEN-END:variables
}
