/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author karim
 */
public class paymentPage extends javax.swing.JFrame {
    
    //delcare variables and constructors
    private String userEmail;
    private String password;
    private int checker;
    private String usersFirstName;
    private String usersLastName;
    /**
     * Creates new form paymentPage
     */
    public paymentPage() {
        initComponents();
    }
    
    public paymentPage(String username, String passwordd, int x) {
        userEmail = username;
        password = passwordd;
        checker = x;
        initComponents();
    }
    
    public paymentPage(String username, String passwordd, int x, String userFIRSTNAME, String userLASTNAME) {
        userEmail = username;
        password = passwordd;
        usersFirstName = userFIRSTNAME;
        usersLastName = userLASTNAME;
        checker = x;
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
        cardNumberInput = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        postalCodeInput = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        experationDateInput = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        CVVInput = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        lastNameInput = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JFormattedTextField();
        submitPaymentInfo = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(525, 525));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel1.setText("Card Number");

        cardNumberInput.setText("e.g. 9028719265028432");
        cardNumberInput.setToolTipText("e.g. movieTheatre@gmail.com");
        cardNumberInput.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        cardNumberInput.setName(""); // NOI18N
        cardNumberInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cardNumberInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cardNumberInputFocusLost(evt);
            }
        });
        cardNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberInputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setText("CVV");

        postalCodeInput.setText("e.g. Y8G9K6");
        postalCodeInput.setToolTipText("e.g. movieTheatre@gmail.com");
        postalCodeInput.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        postalCodeInput.setName(""); // NOI18N
        postalCodeInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                postalCodeInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                postalCodeInputFocusLost(evt);
            }
        });
        postalCodeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postalCodeInputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setText("Expiration Date");

        experationDateInput.setText("e.g. 0522");
        experationDateInput.setToolTipText("e.g. movieTheatre@gmail.com");
        experationDateInput.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        experationDateInput.setName(""); // NOI18N
        experationDateInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                experationDateInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                experationDateInputFocusLost(evt);
            }
        });
        experationDateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experationDateInputActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel4.setText("Postal Code");

        CVVInput.setToolTipText("e.g. movieTheatre@gmail.com");
        CVVInput.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        CVVInput.setName(""); // NOI18N
        CVVInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVVInputActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel5.setText("First Name");

        lastNameInput.setToolTipText("e.g. movieTheatre@gmail.com");
        lastNameInput.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        lastNameInput.setName(""); // NOI18N
        lastNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameInputActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel6.setText("Last Name");

        firstNameInput.setToolTipText("e.g. movieTheatre@gmail.com");
        firstNameInput.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        firstNameInput.setName(""); // NOI18N
        firstNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameInputActionPerformed(evt);
            }
        });

        submitPaymentInfo.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        submitPaymentInfo.setText("Submit");
        submitPaymentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitPaymentInfoActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("(16 digits)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(submitPaymentInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton))
                    .addComponent(experationDateInput)
                    .addComponent(cardNumberInput)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(CVVInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(postalCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(experationDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CVVInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postalCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitPaymentInfo)
                    .addComponent(backButton))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cardNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberInputActionPerformed

    private void postalCodeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postalCodeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postalCodeInputActionPerformed

    private void experationDateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experationDateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_experationDateInputActionPerformed

    private void CVVInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVVInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CVVInputActionPerformed

    private void lastNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameInputActionPerformed

    private void firstNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameInputActionPerformed

    private void submitPaymentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitPaymentInfoActionPerformed
        //get all inputs
        String firstName = firstNameInput.getText();
        String lastName = lastNameInput.getText();
        String cardNumber = cardNumberInput.getText();
        String experationDate = experationDateInput.getText();
        String CVV = CVVInput.getText();
        String postalCode = postalCodeInput.getText();
        boolean logIN = true;
        
        //verify all inputs are valid
        if (cardNumber.length() != 16) {
            JOptionPane.showMessageDialog(this, "Card Number inputed isn't valid");
            logIN = false;
        } else if (experationDate.length() != 4 && logIN) {
            JOptionPane.showMessageDialog(this, "experation date isn't valid");
            logIN = false;
        } else if (CVV.length() != 3 && logIN) {
            JOptionPane.showMessageDialog(this, "CVV isn't valid");
            logIN = false;
        } else if (logIN) {
            for (char c : CVV.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(this, "CVV isn't valid");
                    logIN = false;
                }
            }
            
            char[] x = postalCode.toCharArray();
            for (int i = 0; i < postalCode.length(); i++) {
                if (!logIN) {
                    break;
                } else if((i%2) == 0 && Character.isDigit(x[i])) {
                    JOptionPane.showMessageDialog(this, "postalCode isn't valid");
                    logIN = false;
                } else if ((i%2) != 0 && !Character.isDigit(x[i])) {
                    JOptionPane.showMessageDialog(this, "postalCode isn't valid");
                    logIN = false;
                }
            }
        }
        
        //save payment info to SQL
        try {
            if (logIN && checker == 1) { //resiter
                DBConnection connection = new DBConnection("jdbc:mysql://localhost/MovieTheater","root","password");
                connection.initializeConnection();
                connection.insertUser(firstName, lastName, userEmail, password, postalCode, cardNumber, CVV, experationDate, "30");
                JOptionPane.showMessageDialog(this, "Success");
                mainPage m = new mainPage(userEmail);
                m.setLocationRelativeTo(null);
                m.setVisible(true);
                dispose();
            } else if (logIN && checker == 10) {    //user
                DBConnection connection = new DBConnection("jdbc:mysql://localhost/MovieTheater","root","password");
                connection.initializeConnection();
                connection.deleteUser(userEmail);
                connection.insertUser(firstName, lastName, userEmail, password, postalCode, cardNumber, CVV, experationDate, "30");
                JOptionPane.showMessageDialog(this, "Success");
                userInfoPage u = new userInfoPage(userEmail, firstName, lastName, password);
                u.setLocationRelativeTo(null);
                u.setVisible(true);
                dispose();
            }
        } catch(SQLException e){e.printStackTrace();}
    }//GEN-LAST:event_submitPaymentInfoActionPerformed

    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //check if coming from register page or user info and go back to page 
        if (checker == 1) {
            RegisterPage r = new RegisterPage();
            r.setLocationRelativeTo(null);
            r.setVisible(true);
            dispose();
        } else {
            userInfoPage u = new userInfoPage(userEmail, usersFirstName, usersLastName, password);
            u.setLocationRelativeTo(null);
            u.setVisible(true);
            dispose();
        }
       
    }//GEN-LAST:event_backButtonActionPerformed

    private void experationDateInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_experationDateInputFocusGained
        //show example of experation date
        if (experationDateInput.getText().equals("e.g. 0522")) {
            experationDateInput.setText("");
            experationDateInput.setForeground(Color.gray);
        }
    }//GEN-LAST:event_experationDateInputFocusGained

    private void experationDateInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_experationDateInputFocusLost
        if (experationDateInput.getText().equals("")) {
            experationDateInput.setText("e.g. 0522");
            experationDateInput.setForeground(Color.gray);
        }
    }//GEN-LAST:event_experationDateInputFocusLost

    private void postalCodeInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_postalCodeInputFocusGained
        //show example of postal code
        if (postalCodeInput.getText().equals("e.g. Y8G9K6")) {
            postalCodeInput.setText("");
            postalCodeInput.setForeground(Color.gray);
        }
    }//GEN-LAST:event_postalCodeInputFocusGained

    private void postalCodeInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_postalCodeInputFocusLost
        if (postalCodeInput.getText().equals("")) {
            postalCodeInput.setText("e.g. Y8G9K6");
            postalCodeInput.setForeground(Color.gray);
        }
    }//GEN-LAST:event_postalCodeInputFocusLost

    private void cardNumberInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardNumberInputFocusGained
        //show example of card input
        if (cardNumberInput.getText().equals("e.g. 9028719265028432")) {
            cardNumberInput.setText("");
            cardNumberInput.setForeground(Color.gray);
        }
    }//GEN-LAST:event_cardNumberInputFocusGained

    private void cardNumberInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardNumberInputFocusLost
        if (cardNumberInput.getText().equals("")) {
            cardNumberInput.setText("e.g. 9028719265028432");
            cardNumberInput.setForeground(Color.gray);
        }
    }//GEN-LAST:event_cardNumberInputFocusLost

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
            java.util.logging.Logger.getLogger(paymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paymentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CVVInput;
    private javax.swing.JButton backButton;
    private javax.swing.JFormattedTextField cardNumberInput;
    private javax.swing.JFormattedTextField experationDateInput;
    private javax.swing.JFormattedTextField firstNameInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField lastNameInput;
    private javax.swing.JFormattedTextField postalCodeInput;
    private javax.swing.JButton submitPaymentInfo;
    // End of variables declaration//GEN-END:variables
}
