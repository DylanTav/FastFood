/*
This program is made by Dylan T
It was made March 9, 2018
This program calculates a bill for how many burgers, fries, and drinks s
omeone orders and how much change to give back to them
*/
import java.text.*;
public class FastFoodForm extends javax.swing.JFrame {

    DecimalFormat x = new DecimalFormat("##.00");
    public FastFoodForm() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelHeader = new javax.swing.JLabel();
        labelNumOfBurgers = new javax.swing.JLabel();
        labelNumOfFries = new javax.swing.JLabel();
        labelNumOfDrinks = new javax.swing.JLabel();
        labelTotalBeforeTax = new javax.swing.JLabel();
        labelTax = new javax.swing.JLabel();
        labelFinalTotal = new javax.swing.JLabel();
        textInputBurger = new javax.swing.JTextField();
        textInputFries = new javax.swing.JTextField();
        textInputDrinks = new javax.swing.JTextField();
        labelNumTax = new javax.swing.JLabel();
        labelNumTotalBeforeTax = new javax.swing.JLabel();
        labelNumFinalTotal = new javax.swing.JLabel();
        buttonCalculate = new javax.swing.JButton();
        labelAmountTendered = new javax.swing.JLabel();
        labelChange = new javax.swing.JLabel();
        labelNumChange = new javax.swing.JLabel();
        textAmountInput = new javax.swing.JTextField();
        buttonCalculateChange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelHeader.setText("Fast Food Order");

        labelNumOfBurgers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumOfBurgers.setText("Enter the number of Burgers:");

        labelNumOfFries.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumOfFries.setText("Enter the number of Fries:");

        labelNumOfDrinks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumOfDrinks.setText("Enter the Number of Drinks:");

        labelTotalBeforeTax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTotalBeforeTax.setText("Total Before Tax:");

        labelTax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTax.setText("Tax:");

        labelFinalTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFinalTotal.setText("Final Total:");

        textInputBurger.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textInputBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textInputBurgerActionPerformed(evt);
            }
        });

        textInputFries.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textInputDrinks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelNumTax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumTax.setText("$00.00");

        labelNumTotalBeforeTax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumTotalBeforeTax.setText("$00.00");

        labelNumFinalTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumFinalTotal.setText("$00.00");

        buttonCalculate.setText("Calculate");
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateActionPerformed(evt);
            }
        });

        labelAmountTendered.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAmountTendered.setText("Enter Amount Tendered:");

        labelChange.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelChange.setText("Change");

        labelNumChange.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumChange.setText("$00.00");

        textAmountInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textAmountInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAmountInputActionPerformed(evt);
            }
        });

        buttonCalculateChange.setText("Calculate Change");
        buttonCalculateChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelFinalTotal)
                        .addGap(35, 35, 35)
                        .addComponent(labelNumFinalTotal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNumOfBurgers)
                                    .addComponent(labelNumOfFries)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelTax)
                                        .addGap(45, 45, 45)
                                        .addComponent(labelNumTax))
                                    .addComponent(labelNumOfDrinks))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textInputBurger, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                        .addComponent(textInputFries)
                                        .addComponent(textInputDrinks))
                                    .addComponent(buttonCalculate, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTotalBeforeTax)
                                .addGap(30, 30, 30)
                                .addComponent(labelNumTotalBeforeTax, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelHeader)
                                .addGap(53, 53, 53)))
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAmountTendered)
                        .addGap(86, 86, 86)
                        .addComponent(textAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelChange)
                        .addGap(42, 42, 42)
                        .addComponent(labelNumChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCalculateChange)
                        .addGap(79, 79, 79))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelHeader)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumOfBurgers)
                    .addComponent(textInputBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumOfFries)
                    .addComponent(textInputFries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumOfDrinks)
                    .addComponent(textInputDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalBeforeTax)
                    .addComponent(labelNumTotalBeforeTax, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTax)
                    .addComponent(labelNumTax)
                    .addComponent(buttonCalculate))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFinalTotal)
                            .addComponent(labelNumFinalTotal))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAmountTendered)
                            .addComponent(textAmountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelChange)
                            .addComponent(labelNumChange)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCalculateChange)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textInputBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textInputBurgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textInputBurgerActionPerformed

    private void textAmountInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAmountInputActionPerformed
        
    }//GEN-LAST:event_textAmountInputActionPerformed

    private void buttonCalculateChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateChangeActionPerformed
        double total; // Declares a double called total
        double amount;// Declares a double called amount
        double displayC; // Declares a double called displayC
        double displayB; // Declares a double called displayB
        double displayF; // Declares a double called displayF 
        double displayD; // Declares a double called displayD
        double fries; // Declares a double called fries
        double drinks; // Declares a double called drinks
        double burgers; // Declares a double called burgers
        
        
        displayC = Double.parseDouble(textAmountInput.getText());
        displayB = Double.parseDouble(textInputBurger.getText());// Changes displayB into a string to get data from textInputBurger
        displayF = Double.parseDouble(textInputFries.getText());// Changes displayF into a string to get data from textInputFries
        displayD = Double.parseDouble(textInputDrinks.getText());// Changes displayd into a string to get data from textInputDrinks
        burgers = 2.49 * displayB;// Assigns 2.49 x displayB to burgers
        fries = 1.89 * displayF;// Assigns 1.89 x displayF to fries
        drinks = 0.99 * displayD;// Assigns 0.99 x displayD to drinks
        total = burgers + fries + drinks;// Assigns burgers + fries + drinks to 
        amount = displayC - total;
       
        
        labelNumChange.setText("$" + x.format(amount));
        
    }//GEN-LAST:event_buttonCalculateChangeActionPerformed

    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
        double burgers; // Declares a double called burgers
        double displayB; // Declares a double called displayB
        double displayF; // Declares a double called displayF 
        double displayD; // Declares a double called displayD
        double fries; // Declares a double called fries
        double drinks; // Declares a double called drinks
        double total; // Declares a double called total
        double totalTax; // Declares a double called total
        double withTax; // Declares a double called withTax
        
        displayB = Double.parseDouble(textInputBurger.getText());// Changes displayB into a string to get data from textInputBurger
        displayF = Double.parseDouble(textInputFries.getText());// Changes displayF into a string to get data from textInputFries
        displayD = Double.parseDouble(textInputDrinks.getText());// Changes displayd into a string to get data from textInputDrinks
        
        burgers = 2.49 * displayB;// Assigns 2.49 x displayB to burgers
        fries = 1.89 * displayF;// Assigns 1.89 x displayF to fries
        drinks = 0.99 * displayD;// Assigns 0.99 x displayD to drinks
        total = burgers + fries + drinks;// Assigns burgers + fries + drinks to total
        totalTax = total * 0.13;// Assigns total x 0.13 to totalTax
        withTax = total + totalTax;// Assigns total + totalTax to withTax
                
        labelNumTotalBeforeTax.setText("$" + total);// Sets text $ and total to labelNumBeforeTax
        labelNumTax.setText("$" + x.format(totalTax));// Sets text $ and a decimal format of totalTax
        labelNumFinalTotal.setText("$" + x.format(withTax));
        
    }//GEN-LAST:event_buttonCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(FastFoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastFoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastFoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastFoodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastFoodForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalculate;
    private javax.swing.JButton buttonCalculateChange;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAmountTendered;
    private javax.swing.JLabel labelChange;
    private javax.swing.JLabel labelFinalTotal;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelNumChange;
    private javax.swing.JLabel labelNumFinalTotal;
    private javax.swing.JLabel labelNumOfBurgers;
    private javax.swing.JLabel labelNumOfDrinks;
    private javax.swing.JLabel labelNumOfFries;
    private javax.swing.JLabel labelNumTax;
    private javax.swing.JLabel labelNumTotalBeforeTax;
    private javax.swing.JLabel labelTax;
    private javax.swing.JLabel labelTotalBeforeTax;
    private javax.swing.JTextField textAmountInput;
    private javax.swing.JTextField textInputBurger;
    private javax.swing.JTextField textInputDrinks;
    private javax.swing.JTextField textInputFries;
    // End of variables declaration//GEN-END:variables
}
