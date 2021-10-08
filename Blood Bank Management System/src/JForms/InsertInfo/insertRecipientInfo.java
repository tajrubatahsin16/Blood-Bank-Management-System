/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JForms.InsertInfo;

import DatabaseFiles.InsertRecipientInfoOperation;
import JForms.Pages.recipientPage;
import JavaFiles.RecipientInfo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ONLINE
 */
public class insertRecipientInfo extends javax.swing.JFrame {
    InsertRecipientInfoOperation ope = new  InsertRecipientInfoOperation();

    /**
     * Creates new form insertRecipientInfo
     */
    public insertRecipientInfo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_RName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbox_BLOODTYPE = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_AGE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbox_GENDER = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_RAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_RArea = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_RPHONE = new javax.swing.JTextField();
        txt_DonationNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_CANCEL = new javax.swing.JButton();
        btn_SUBMIT = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("     RECIPIENTS  INFORMATION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 750, 109));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 169, 105, 44));
        getContentPane().add(txt_RName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 216, 44));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BLOOD TYPE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 266, -1, -1));

        cmbox_BLOODTYPE.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        cmbox_BLOODTYPE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(cmbox_BLOODTYPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 259, 216, 43));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 153, -1));
        getContentPane().add(txt_AGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 216, 44));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GENDER:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        cmbox_GENDER.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        cmbox_GENDER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(cmbox_GENDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 415, 210, 50));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADDRESS:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 152, -1));
        getContentPane().add(txt_RAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 210, 40));

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("AREA:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 120, -1));
        getContentPane().add(txt_RArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 204, 40));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PHONE:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 120, -1));
        getContentPane().add(txt_RPHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, 204, 50));
        getContentPane().add(txt_DonationNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 737, 204, 50));

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DONATION NO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 740, -1, 50));

        btn_CANCEL.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        btn_CANCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        btn_CANCEL.setText("CANCEL");
        btn_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CANCELActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 266, 200, 80));

        btn_SUBMIT.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        btn_SUBMIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Submit.png"))); // NOI18N
        btn_SUBMIT.setText("SUBMIT");
        btn_SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SUBMITActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 461, 194, 81));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InsertInforecipient.jpg"))); // NOI18N
        jLabel11.setText("jLabel10");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SUBMITActionPerformed
        // TODO add your handling code here:
        RecipientInfo aData=new RecipientInfo(txt_RName.getText(),txt_AGE.getText(),cmbox_GENDER.getSelectedItem().toString(), cmbox_BLOODTYPE.getSelectedItem().toString(),
                txt_RAddress.getText(),txt_RArea.getText(),txt_RPHONE.getText(),txt_DonationNo.getText());
        try {
            ope.saveInvoice(aData);
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(InsertEmployeeInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
      
            
        JOptionPane.showMessageDialog(null, "Data Inserted");
    }//GEN-LAST:event_btn_SUBMITActionPerformed

    private void btn_CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CANCELActionPerformed
        // TODO add your handling code here:
        recipientPage window;
        window = new recipientPage();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_CANCELActionPerformed

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
            java.util.logging.Logger.getLogger(insertRecipientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertRecipientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertRecipientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertRecipientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertRecipientInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CANCEL;
    private javax.swing.JButton btn_SUBMIT;
    private javax.swing.JComboBox<String> cmbox_BLOODTYPE;
    private javax.swing.JComboBox<String> cmbox_GENDER;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_AGE;
    private javax.swing.JTextField txt_DonationNo;
    private javax.swing.JTextField txt_RAddress;
    private javax.swing.JTextField txt_RArea;
    private javax.swing.JTextField txt_RName;
    private javax.swing.JTextField txt_RPHONE;
    // End of variables declaration//GEN-END:variables
}