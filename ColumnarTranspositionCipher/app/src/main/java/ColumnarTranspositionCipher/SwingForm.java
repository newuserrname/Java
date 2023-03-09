package ColumnarTranspositionCipher;

import java.util.Arrays;

public class SwingForm extends javax.swing.JFrame {

    
    public SwingForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_Output = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea_Input = new javax.swing.JTextArea();
        button_Ciphertext = new javax.swing.JButton();
        button_Decrypted = new javax.swing.JButton();
        textField_Input_Ciphertext = new javax.swing.JTextField();
        textField_Input_Decrypted = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea_Output.setColumns(20);
        textArea_Output.setRows(5);
        jScrollPane1.setViewportView(textArea_Output);

        textArea_Input.setColumns(20);
        textArea_Input.setRows(5);
        jScrollPane2.setViewportView(textArea_Input);

        button_Ciphertext.setText("Encrypt ");
        button_Ciphertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CiphertextActionPerformed(evt);
            }
        });

        button_Decrypted.setText("Decrypted");
        button_Decrypted.setBorderPainted(false);
        button_Decrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DecryptedActionPerformed(evt);
            }
        });

        textField_Input_Ciphertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_Input_CiphertextActionPerformed(evt);
            }
        });

        textField_Input_Decrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_Input_DecryptedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Key");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Key");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("INPUT");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("OUTPUT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textField_Input_Ciphertext, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(button_Ciphertext, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_Decrypted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField_Input_Decrypted, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField_Input_Ciphertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(button_Ciphertext)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField_Input_Decrypted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(button_Decrypted)))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void textField_Input_CiphertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_Input_CiphertextActionPerformed
        
    }//GEN-LAST:event_textField_Input_CiphertextActionPerformed

    private void textField_Input_DecryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_Input_DecryptedActionPerformed
        
    }//GEN-LAST:event_textField_Input_DecryptedActionPerformed
    
    
    private void button_CiphertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CiphertextActionPerformed
        // TextArea Input
        String Plain = textArea_Input.getText();
        // Key: TextField Ciphertext
        String textkey = textField_Input_Ciphertext.getText();
        String Cipher = encrypt(Plain, textkey);
        textArea_Output.setText(Cipher);
    }//GEN-LAST:event_button_CiphertextActionPerformed
    
    
    private void button_DecryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DecryptedActionPerformed
        String Cipher = textArea_Input.getText();
        String key = textField_Input_Decrypted.getText();
        String Plain = decrypt(Cipher, key);
        textArea_Output.setText(Plain);
    }//GEN-LAST:event_button_DecryptedActionPerformed

    public static String encrypt(String plain, String key) {
        
    key = key.replaceAll("\\s+", "");

   
    int rows = (int) Math.ceil((double) plain.length() / key.length());

    
    char[][] grid = new char[rows][key.length()];

    
    int index = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < key.length(); j++) {
            if (index < plain.length()) {
                grid[i][j] = plain.charAt(index++);
            } else {
                grid[i][j] = ' ';
            }
        }
    }

    
    char[] sortedKey = key.toCharArray();
    Arrays.sort(sortedKey);

    
    char[][] sortedGrid = new char[rows][key.length()];
    for (int i = 0; i < key.length(); i++) {
        int index2 = key.indexOf(sortedKey[i]);
        for (int j = 0; j < rows; j++) {
            sortedGrid[j][i] = grid[j][index2];
        }
    }

    
    StringBuilder ciphertext = new StringBuilder();
    for (int i = 0; i < key.length(); i++) {
        for (int j = 0; j < rows; j++) {
            ciphertext.append(sortedGrid[j][i]);
        }
    }

    return ciphertext.toString();
}
    
    public static String decrypt(String cipherText, String key) {
        
        key = key.replaceAll("\\s+", "");

        int cols = key.length();
        int rows = (int) Math.ceil((double) cipherText.length() / cols);

        char[][] matrix = new char[rows][cols];

        char[] sortedKey = key.toCharArray();
        Arrays.sort(sortedKey);

        int[] indexes = new int[cols];
        for (int i = 0; i < cols; i++) {
            indexes[i] = key.indexOf(sortedKey[i]);
        }

        int index = 0;
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[j][indexes[i]] = cipherText.charAt(index++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(matrix[i][j]);
            }
        }

        return sb.toString().trim();
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SwingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Ciphertext;
    private javax.swing.JButton button_Decrypted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textArea_Input;
    private javax.swing.JTextArea textArea_Output;
    private javax.swing.JTextField textField_Input_Ciphertext;
    private javax.swing.JTextField textField_Input_Decrypted;
    // End of variables declaration//GEN-END:variables
}
