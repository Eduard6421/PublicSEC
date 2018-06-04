/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Forms.Controllers.AssignedMeetingsController;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GABY
 */
public class AssignedMeetingsTable extends javax.swing.JFrame {

    static AssignedMeetingsTable form;
    static AssignedMeetingsController parentController;

    public AssignedMeetingsTable() {
        initComponents();
    }
    
    public AssignedMeetingsTable(AssignedMeetingsController controller) {
        initComponents();
        
        parentController = controller;
        
        buttonBack.addActionListener(parentController);
        buttonReassignEmployee.addActionListener(parentController);
        buttonCancelMeeting.addActionListener(parentController);
        buttonMarkAsFinished.addActionListener(parentController);
        buttonMarkAsOpen.addActionListener(parentController);
    }
    
    public void showPopulation(List<Object[]> rows) {
        
        DefaultTableModel tModel = (DefaultTableModel) tableAssignedMeetings.getModel();
        tableAssignedMeetings.setDefaultEditor(Object.class, null);

        while (tModel.getRowCount() > 0) {
            tModel.removeRow(0);
        }
        tModel.setRowCount(0);
       
        for (Object[] row : rows) {
            tModel.addRow(row);
        }
        
    }
    
    public int getSelectedRowIndex() {
        return tableAssignedMeetings.getSelectedRow();     
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAssignedMeetings = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        buttonBack = new javax.swing.JButton();
        buttonCancelMeeting = new javax.swing.JButton();
        buttonReassignEmployee = new javax.swing.JButton();
        labelSelectedMeeting = new javax.swing.JLabel();
        buttonMarkAsFinished = new javax.swing.JButton();
        buttonMarkAsOpen = new javax.swing.JButton();
        labelMeetings = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PublicSEC - Client_Meetings");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PublicSEC");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setAutoscrolls(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(232323, 30));
        jLabel1.setOpaque(true);

        tableAssignedMeetings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Finished", "Client", "Employee", "Date", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAssignedMeetings.setMaximumSize(new java.awt.Dimension(450, 64));
        tableAssignedMeetings.setPreferredSize(new java.awt.Dimension(450, 64));
        jScrollPane1.setViewportView(tableAssignedMeetings);

        buttonBack.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        buttonBack.setText("Back");
        buttonBack.setAlignmentX(0.5F);
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonCancelMeeting.setText("Cancel Meeting");
        buttonCancelMeeting.setToolTipText("");

        buttonReassignEmployee.setText("Reassign Employee");
        buttonReassignEmployee.setToolTipText("");

        labelSelectedMeeting.setText("Selected meeting: ");
        labelSelectedMeeting.setToolTipText("");

        buttonMarkAsFinished.setText("Mark as Finished");
        buttonMarkAsFinished.setToolTipText("");

        buttonMarkAsOpen.setText("Mark as Open");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1171, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(284, 284, 284))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSelectedMeeting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonReassignEmployee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonCancelMeeting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMarkAsFinished)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMarkAsOpen)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBack)
                    .addComponent(buttonReassignEmployee)
                    .addComponent(buttonCancelMeeting)
                    .addComponent(labelSelectedMeeting)
                    .addComponent(buttonMarkAsFinished)
                    .addComponent(buttonMarkAsOpen))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        labelMeetings.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelMeetings.setText("Meetings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(labelMeetings)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMeetings)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(AssignedMeetingsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignedMeetingsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignedMeetingsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignedMeetingsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AssignedMeetingsTable().setVisible(true);
            }
        });
    }

    public JTable getTable() {
        return tableAssignedMeetings;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonCancelMeeting;
    private javax.swing.JButton buttonMarkAsFinished;
    private javax.swing.JButton buttonMarkAsOpen;
    private javax.swing.JButton buttonReassignEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMeetings;
    private javax.swing.JLabel labelSelectedMeeting;
    private javax.swing.JTable tableAssignedMeetings;
    // End of variables declaration//GEN-END:variables
}
