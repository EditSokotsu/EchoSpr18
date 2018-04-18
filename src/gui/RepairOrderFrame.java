/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.List;
import core.RepairOrder;
import dao.RepairOrderDAO;
import dao.DBConnection;

/**
 *
 * @author Jesse Houk
 */
public class RepairOrderFrame extends javax.swing.JFrame {
    private DBConnection conn;
    private RepairOrderDAO RODAO;
    private List<RepairOrder> repairOrders;
    RepairOrderTableModel model;
    /**
     * Creates new form RepairOrderFrame
     */
    public RepairOrderFrame(DBConnection myConn) {
        initComponents();
        conn = myConn;
        RODAO = new RepairOrderDAO(conn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableRepairOrders = new javax.swing.JTable();
        receivingEIDLabel = new javax.swing.JLabel();
        CIDLabel = new javax.swing.JLabel();
        shipOut_CIDLabel = new javax.swing.JLabel();
        shipTypeLabel = new javax.swing.JLabel();
        dateShippedLabel = new javax.swing.JLabel();
        dateRecdLabel = new javax.swing.JLabel();
        SerialNum1Label = new javax.swing.JLabel();
        SerialNum2Label = new javax.swing.JLabel();
        SerialNum3Label = new javax.swing.JLabel();
        SerialNum4Label = new javax.swing.JLabel();
        workingEID1Label = new javax.swing.JLabel();
        workingEID2Label = new javax.swing.JLabel();
        workingEID3Label = new javax.swing.JLabel();
        workingEID4Label = new javax.swing.JLabel();
        dateShippedTextField = new javax.swing.JTextField();
        dateRecdTextField = new javax.swing.JTextField();
        ROAddButton = new javax.swing.JButton();
        ROUpdateButton = new javax.swing.JButton();
        RORemoveButton = new javax.swing.JButton();
        ROResetButton = new javax.swing.JButton();
        receivingEIDComboBox = new javax.swing.JComboBox<>();
        CIDComboBox = new javax.swing.JComboBox<>();
        shipOut_CIDComboBox = new javax.swing.JComboBox<>();
        shipTypeComboBox = new javax.swing.JComboBox<>();
        SN1ComboBox = new javax.swing.JComboBox<>();
        SN2ComboBox = new javax.swing.JComboBox<>();
        SN3ComboBox = new javax.swing.JComboBox<>();
        SN4ComboBox = new javax.swing.JComboBox<>();
        workEID1ComboBox = new javax.swing.JComboBox<>();
        workEID2ComboBox = new javax.swing.JComboBox<>();
        workEID3ComboBox = new javax.swing.JComboBox<>();
        workEID4ComboBox = new javax.swing.JComboBox<>();
        SN1FormattedTextField = new javax.swing.JFormattedTextField();
        SN2FormattedTextField = new javax.swing.JFormattedTextField();
        SN3FormattedTextField = new javax.swing.JFormattedTextField();
        SN4FormattedTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableRepairOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RID", "receivingEID", "CID", "shipOut_CID", "shipType", "dateShipped", "dateRecd", "Serial_Number1", "Serial_Number2", "Serial_Number3", "Serial_Number4", "workingEID1", "workingEID2", "workingEID3", "workingEID4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableRepairOrders);

        receivingEIDLabel.setText("receivingEID");

        CIDLabel.setText("CID");

        shipOut_CIDLabel.setText("shipOut_CID");

        shipTypeLabel.setText("shipType");

        dateShippedLabel.setText("dateShipped");

        dateRecdLabel.setText("dateReceived");

        SerialNum1Label.setText("Serial_Number1");

        SerialNum2Label.setText("Serial_Number2");

        SerialNum3Label.setText("Serial_Number3");

        SerialNum4Label.setText("Serial_Number4");

        workingEID1Label.setText("workingEID1");

        workingEID2Label.setText("workingEID2");

        workingEID3Label.setText("workingEID3");

        workingEID4Label.setText("workingEID4");

        dateShippedTextField.setText("Date shipped*");
        dateShippedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateShippedTextFieldActionPerformed(evt);
            }
        });

        dateRecdTextField.setText("Date received*");

        ROAddButton.setText("Add");

        ROUpdateButton.setText("Update");

        RORemoveButton.setText("Remove");

        ROResetButton.setText("Reset");

        receivingEIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        shipOut_CIDComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        shipTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SN1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SN2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SN3ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SN4ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        workEID1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        workEID2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        workEID3ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        workEID4ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SN1FormattedTextField.setText("Part 1 Name");

        SN2FormattedTextField.setText("Part 2 Name");

        SN3FormattedTextField.setText("Part 3 Name");

        SN4FormattedTextField.setText("Part 4 Name");
        SN4FormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SN4FormattedTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SerialNum3Label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(workingEID3Label)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SerialNum1Label)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ROAddButton)
                                            .addComponent(SN1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(270, 270, 270)
                                        .addComponent(workingEID4Label))
                                    .addComponent(workingEID2Label)
                                    .addComponent(workingEID1Label))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(419, 419, 419)
                                    .addComponent(SerialNum4Label)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(receivingEIDLabel)
                                .addGap(33, 33, 33)
                                .addComponent(receivingEIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SerialNum2Label)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SN2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SN3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CIDLabel)
                    .addComponent(shipOut_CIDLabel)
                    .addComponent(shipTypeLabel)
                    .addComponent(dateShippedLabel)
                    .addComponent(dateRecdLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CIDComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shipOut_CIDComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shipTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateShippedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateRecdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ROUpdateButton)
                                .addComponent(SN1FormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RORemoveButton)
                        .addGap(40, 40, 40)
                        .addComponent(ROResetButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SN4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workEID1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workEID2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workEID3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workEID4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SN4FormattedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(SN3FormattedTextField))
                            .addComponent(SN2FormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(695, 695, 695))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SerialNum2Label)
                        .addComponent(receivingEIDLabel)
                        .addComponent(SN2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SN2FormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(receivingEIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CIDLabel)
                    .addComponent(CIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SerialNum3Label)
                    .addComponent(SN3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SN3FormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shipOut_CIDLabel)
                    .addComponent(shipOut_CIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SerialNum4Label)
                    .addComponent(SN4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SN4FormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shipTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shipTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workingEID1Label)
                    .addComponent(workEID1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateShippedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateShippedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workingEID2Label)
                    .addComponent(workEID2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateRecdLabel)
                    .addComponent(dateRecdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workingEID3Label)
                    .addComponent(workEID3ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SerialNum1Label)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SN1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SN1FormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(workingEID4Label)
                        .addComponent(workEID4ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ROAddButton)
                    .addComponent(ROUpdateButton)
                    .addComponent(RORemoveButton)
                    .addComponent(ROResetButton))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateShippedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateShippedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateShippedTextFieldActionPerformed

    private void SN4FormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SN4FormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SN4FormattedTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RepairOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepairOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepairOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepairOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepairOrderFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CIDComboBox;
    private javax.swing.JLabel CIDLabel;
    private javax.swing.JButton ROAddButton;
    private javax.swing.JButton RORemoveButton;
    private javax.swing.JButton ROResetButton;
    private javax.swing.JButton ROUpdateButton;
    private javax.swing.JComboBox<String> SN1ComboBox;
    private javax.swing.JFormattedTextField SN1FormattedTextField;
    private javax.swing.JComboBox<String> SN2ComboBox;
    private javax.swing.JFormattedTextField SN2FormattedTextField;
    private javax.swing.JComboBox<String> SN3ComboBox;
    private javax.swing.JFormattedTextField SN3FormattedTextField;
    private javax.swing.JComboBox<String> SN4ComboBox;
    private javax.swing.JFormattedTextField SN4FormattedTextField;
    private javax.swing.JLabel SerialNum1Label;
    private javax.swing.JLabel SerialNum2Label;
    private javax.swing.JLabel SerialNum3Label;
    private javax.swing.JLabel SerialNum4Label;
    private javax.swing.JTable TableRepairOrders;
    private javax.swing.JLabel dateRecdLabel;
    private javax.swing.JTextField dateRecdTextField;
    private javax.swing.JLabel dateShippedLabel;
    private javax.swing.JTextField dateShippedTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> receivingEIDComboBox;
    private javax.swing.JLabel receivingEIDLabel;
    private javax.swing.JComboBox<String> shipOut_CIDComboBox;
    private javax.swing.JLabel shipOut_CIDLabel;
    private javax.swing.JComboBox<String> shipTypeComboBox;
    private javax.swing.JLabel shipTypeLabel;
    private javax.swing.JComboBox<String> workEID1ComboBox;
    private javax.swing.JComboBox<String> workEID2ComboBox;
    private javax.swing.JComboBox<String> workEID3ComboBox;
    private javax.swing.JComboBox<String> workEID4ComboBox;
    private javax.swing.JLabel workingEID1Label;
    private javax.swing.JLabel workingEID2Label;
    private javax.swing.JLabel workingEID3Label;
    private javax.swing.JLabel workingEID4Label;
    // End of variables declaration//GEN-END:variables
}
