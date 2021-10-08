/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JForms.ListsAndUpdates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class UpdateBloodInfo extends javax.swing.JFrame {

    /**
     * Creates new form UpdateBloodInfo
     */
    public UpdateBloodInfo() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_DonorID = new javax.swing.JTextField();
        txt_BagNumber = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        txt_RBC = new javax.swing.JTextField();
        txt_WBC = new javax.swing.JTextField();
        txt_Platelets = new javax.swing.JTextField();
        txt_Plasma = new javax.swing.JTextField();
        txt_Heamoglobin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DONOR ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 34, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BAG NUMBER:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 82, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUANTITY AVAILABLE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RED BLOOD CELLS:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 178, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WHITE BLOOD CELLS:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 226, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PLATELETS:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 274, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PLASMA:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 322, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HEAMOGLOBIN:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        txt_DonorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DonorIDActionPerformed(evt);
            }
        });
        jPanel1.add(txt_DonorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 34, 161, -1));
        jPanel1.add(txt_BagNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 90, 161, -1));
        jPanel1.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 130, 161, -1));
        jPanel1.add(txt_RBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 178, 161, -1));
        jPanel1.add(txt_WBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 226, 161, -1));
        jPanel1.add(txt_Platelets, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 274, 161, -1));
        jPanel1.add(txt_Plasma, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 330, 161, -1));
        jPanel1.add(txt_Heamoglobin, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 378, 161, -1));

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 428, -1, -1));

        jButton2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update details.png"))); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 428, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UpdateBG.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -3, 700, 500));

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DonorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DonorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DonorIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BloodInfoList window;
        window = new BloodInfoList();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;user=sa;password=123456;" +
            "databaseName=BloodBankMS;");
            
            Statement statement = connection.createStatement();  
            String ID = txt_BagNumber.getText().toString();
            int iDnumber = Integer.parseInt(ID);
            String heamoglobin = txt_Heamoglobin.getText().toString();
            int hNum = Integer.parseInt(heamoglobin);
            String query1="update BloodInventory set QuantityAvailable='"+txt_quantity.getText().toString()+"',RedBloodCells='"+txt_RBC.getText().toString()+"', WhiteBloodCells='"+txt_WBC.getText().toString()+"', Platelets= '"+txt_Platelets.getText().toString()+"' ,Plasma='"+txt_Plasma.getText().toString()+"',Heamoglobin='"+hNum+"' where BagNumber="+iDnumber+";";
            statement.execute(query1);
              JOptionPane.showMessageDialog(null, "Update Successful!");
              
              BloodInfoList window;
              window = new BloodInfoList();
             window.setVisible(true);
             this.setVisible(false);
              
        }catch (Exception e) {  
             e.printStackTrace();
             JOptionPane.showMessageDialog(null, "exception");
         }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateBloodInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBloodInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBloodInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBloodInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBloodInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_BagNumber;
    private javax.swing.JTextField txt_DonorID;
    private javax.swing.JTextField txt_Heamoglobin;
    private javax.swing.JTextField txt_Plasma;
    private javax.swing.JTextField txt_Platelets;
    private javax.swing.JTextField txt_RBC;
    private javax.swing.JTextField txt_WBC;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}