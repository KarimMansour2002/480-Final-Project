/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Karim
 */
public class changeEmailPage extends javax.swing.JFrame {

    //delcare variables and constructors
    private String userEmail;
    private String usersFirstName;
    private String usersLastName;
    private String usersPassword;
    
    public changeEmailPage() {
        initComponents();
    }
    
    public changeEmailPage(String userEMAIL, String usersFIRSTNAME, String usersLASTNAME, String usersPASSWORD) {
        userEmail = userEMAIL;
        usersFirstName = usersFIRSTNAME;
        usersLastName = usersLASTNAME;
        usersPassword = usersPASSWORD;
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
        saveButton = new javax.swing.JButton();
        newEmailInput = new javax.swing.JFormattedTextField();
        passInput = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        forgotPassBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        oldEmailInput = new javax.swing.JFormattedTextField();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(525, 525));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setText("Your new Email");

        saveButton.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveButtonMousePressed(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        newEmailInput.setToolTipText("e.g. movieTheatre@gmail.com");
        newEmailInput.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        newEmailInput.setName(""); // NOI18N
        newEmailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEmailInputActionPerformed(evt);
            }
        });

        passInput.setToolTipText("e.g. jah2hgal.");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setText("Your Password");

        forgotPassBtn.setText("Forgot Password?");
        forgotPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setText("Your old Email");

        oldEmailInput.setToolTipText("e.g. movieTheatre@gmail.com");
        oldEmailInput.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        oldEmailInput.setName(""); // NOI18N
        oldEmailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldEmailInputActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(oldEmailInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newEmailInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 112, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(backButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(forgotPassBtn))
                                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(112, 112, 112)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oldEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgotPassBtn)
                    .addComponent(backButton))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void newEmailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newEmailInputActionPerformed

    private void forgotPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassBtnActionPerformed
        //take to forgot password page
        forgotPassPage f = new forgotPassPage(userEmail, usersFirstName, usersLastName, usersPassword, 10);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_forgotPassBtnActionPerformed

    private void saveButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMousePressed
        //change email after verifying user exists and user input
        String newEmail = newEmailInput.getText();
        String oldEmail = oldEmailInput.getText();
        String password = passInput.getText();
        boolean logIN = true;
        if (newEmail.length() <= 10 || oldEmail.length() <= 10) {
            JOptionPane.showMessageDialog(this, "Email isn't a valid email");
            logIN = false;
        } else if (password.length() < 4 && logIN){
            JOptionPane.showMessageDialog(this, "Password is to short");
            logIN = false;
        } else if (logIN) {
            String checkNewEmail = newEmail.substring(newEmail.length() - 10);
            String checkOldEmail = oldEmail.substring(oldEmail.length() - 10);
            if (!checkNewEmail.equals("@gmail.com") || !checkOldEmail.equals("@gmail.com")){
                JOptionPane.showMessageDialog(this,"Email isn't a valid email");
                logIN = false;
            } else if (logIN) {
                boolean passNum = true;
                logIN = false;
                for (char c : password.toCharArray()) {
                    if (Character.isDigit(c)) {
                        passNum = false;
                        logIN = true;
                        break;
                    }
                }
                if (passNum && logIN) {
                    JOptionPane.showMessageDialog(this, "Password doesn't have a number in it");
                }
            }
        }
        
        String y;
        String pass;
        try {
            if (logIN) {
                DBConnection connection = new DBConnection("jdbc:mysql://localhost/MovieTheater","root","password");
                connection.initializeConnection();
                y = connection.checkUserEmail(newEmail);
                pass = connection.getUserPass(oldEmail);
                if (y.equals("NONE") && pass.equals(password)) {
                    connection.changeUserEmail(oldEmail, newEmail, password);
                    JOptionPane.showMessageDialog(this, "Success");
                    logIN = true;
                } else {
                    JOptionPane.showMessageDialog(this, "Email already exists or incorrect password");
                    logIN = false;
                }
            }
        } catch(SQLException e){e.printStackTrace();}
        
        if (logIN) {
            userInfoPage u = new userInfoPage(newEmail, usersFirstName, usersLastName, usersPassword);
            u.setLocationRelativeTo(null);
            u.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_saveButtonMousePressed

    private void oldEmailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldEmailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldEmailInputActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userInfoPage u = new userInfoPage(userEmail, usersFirstName, usersLastName, usersPassword);
        u.setLocationRelativeTo(null);
        u.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(changeEmailPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changeEmailPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changeEmailPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changeEmailPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                changeEmailPage l = new changeEmailPage();
                l.setLocationRelativeTo(null);
                l.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton forgotPassBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField newEmailInput;
    private javax.swing.JFormattedTextField oldEmailInput;
    private javax.swing.JPasswordField passInput;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
