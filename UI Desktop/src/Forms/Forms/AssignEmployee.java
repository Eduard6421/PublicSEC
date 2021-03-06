/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Forms;

import Forms.Controllers.PendingMeetingsController;
import Models.Employee;
import Models.Meeting;
import java.text.SimpleDateFormat;
import java.util.List;
import javafx.util.Pair;

/**
 *
 * @author Stefan
 */
public class AssignEmployee extends javax.swing.JFrame {

    private PendingMeetingsController parentController;
    private Meeting meeting;
    List<Pair<Integer, String>> availableEmployees;
    
    public AssignEmployee() {
        initComponents();
    }
    
    public AssignEmployee(PendingMeetingsController controller, String clientName, Meeting meeting, List<Pair<Integer, String>> employees) {
        initComponents();
        
        parentController = controller;
        
        buttonExit.addActionListener(controller);
        buttonAssign.addActionListener(controller);
        
        this.meeting = meeting;
        this.availableEmployees = employees;
        fillEmployeesComboBox();
        fillForm(meeting, clientName);
    }
    
    private void fillEmployeesComboBox() {
        
        comboBoxEmployees.removeAllItems();
        
        for (Pair<Integer, String> employee : availableEmployees) {
            comboBoxEmployees.addItem(employee.getValue());
        }
    }
    
    private void fillForm(Meeting meeting, String clientName) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        
        inputClient.setText(clientName);
        inputDate.setText(dateFormatter.format(meeting.getMeetingDate()));
        inputDescription.setText(meeting.getDescription());
    }
    
    private String getSelectedEmployeeName() {
        return comboBoxEmployees.getSelectedItem().toString();
    }
    
    public Pair<String, Meeting> getAssignedMeeting() {
        return new Pair<String, Meeting>(getSelectedEmployeeName(), this.meeting);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonExit = new javax.swing.JButton();
        buttonAssign = new javax.swing.JButton();
        labelAssignEmployee = new javax.swing.JLabel();
        labelClient = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelDescription = new javax.swing.JLabel();
        labelMeetingDetails = new javax.swing.JLabel();
        labelSelectEmployee = new javax.swing.JLabel();
        inputClient = new javax.swing.JTextField();
        inputDate = new javax.swing.JTextField();
        inputDescription = new javax.swing.JTextField();
        comboBoxEmployees = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonExit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buttonExit.setText("Exit");

        buttonAssign.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        buttonAssign.setText("Assign");

        labelAssignEmployee.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAssignEmployee.setText("Assign Employee");
        labelAssignEmployee.setToolTipText("");

        labelClient.setText("Client");
        labelClient.setToolTipText("");

        labelDate.setText("Date");
        labelDate.setToolTipText("");

        labelDescription.setText("Description");
        labelDescription.setToolTipText("");

        labelMeetingDetails.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelMeetingDetails.setText("Meeting Details");

        labelSelectEmployee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelSelectEmployee.setText("Select Employee");
        labelSelectEmployee.setToolTipText("");

        inputClient.setEditable(false);

        inputDate.setEditable(false);

        inputDescription.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(labelAssignEmployee))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelMeetingDetails)
                                .addComponent(labelSelectEmployee)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelDate)
                                        .addComponent(labelDescription)
                                        .addComponent(labelClient))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputDescription)
                                        .addComponent(inputDate)
                                        .addComponent(inputClient, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))))
                            .addComponent(buttonExit)
                            .addComponent(comboBoxEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAssign)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAssignEmployee)
                        .addGap(38, 38, 38)
                        .addComponent(labelMeetingDetails)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelClient)
                            .addComponent(inputClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelDate))
                    .addComponent(inputDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescription)
                    .addComponent(inputDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(labelSelectEmployee)
                .addGap(27, 27, 27)
                .addComponent(comboBoxEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAssign)
                    .addComponent(buttonExit))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AssignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAssign;
    private javax.swing.JButton buttonExit;
    private javax.swing.JComboBox<String> comboBoxEmployees;
    private javax.swing.JTextField inputClient;
    private javax.swing.JTextField inputDate;
    private javax.swing.JTextField inputDescription;
    private javax.swing.JLabel labelAssignEmployee;
    private javax.swing.JLabel labelClient;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelMeetingDetails;
    private javax.swing.JLabel labelSelectEmployee;
    // End of variables declaration//GEN-END:variables
}
