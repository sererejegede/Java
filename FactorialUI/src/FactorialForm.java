//import factorialclass.FactorialClass;
import java.math.BigInteger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
public class FactorialForm extends javax.swing.JFrame {
    
    public FactorialForm() {
        initComponents();
    }
//FactorialClass forFactorial = new FactorialClass();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        number = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        stepslabel = new javax.swing.JLabel();
        factorialCalc = new javax.swing.JButton();
        Answer = new javax.swing.JLabel();
        factorialAnswer = new javax.swing.JTextField();
        scrollpane = new javax.swing.JScrollPane();
        steps = new javax.swing.JTextArea();
        clear = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Factorial Calculator");

        jPanel1.setName("Factorial Calculator"); // NOI18N

        number.setBackground(new java.awt.Color(185, 185, 185));
        number.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel1.setText("Number");

        stepslabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        stepslabel.setText("Steps");

        factorialCalc.setBackground(new java.awt.Color(0, 153, 0));
        factorialCalc.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        factorialCalc.setText("Calculate Factorial");
        factorialCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialCalcActionPerformed(evt);
            }
        });

        Answer.setText("Answer");

        factorialAnswer.setBackground(new java.awt.Color(185, 185, 185));

        steps.setColumns(20);
        steps.setRows(5);
        scrollpane.setViewportView(steps);

        clear.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Answer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stepslabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(factorialAnswer)
                                    .addComponent(number))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(factorialCalc))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(factorialCalc))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factorialAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Answer))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stepslabel)
                    .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear)
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        
    }//GEN-LAST:event_numberActionPerformed

    private void factorialCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialCalcActionPerformed

        if(this.number.getText() == null || this.number.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a value", "Factorial Calculator", JOptionPane.ERROR_MESSAGE);
            return;
        }
           
        
        BigInteger factorial;
        factorial = BigInteger.ONE;
        int num = Integer.parseInt(this.number.getText());
         for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
         //System.out.println(num + "! = " + factorial);
            this.factorialAnswer.setText(String.valueOf(factorial));
             int a = 1;
    BigInteger factNum = BigInteger.ONE;		
    BigInteger factNum2 = BigInteger.ONE;
    String factAnswerTotal = "";
//    System.out.println("The steps for calculating " + num + "! are as follows");
        while (a < num) {
            //System.out.println(a + " x " + factNum2 + " = " + factNum);
            factNum2 = factNum2.multiply(BigInteger.valueOf(a));
            String factAnswer2 = factNum2.toString();
            a++;
            factNum = factNum.multiply(BigInteger.valueOf(a));
            String factAnswer = factNum.toString();
            
        factAnswerTotal = a + " x " + factAnswer2 + " = " + factAnswer + "\n" + "\r";
        this.steps.setText(this.steps.getText()+factAnswerTotal);
        }
    }//GEN-LAST:event_factorialCalcActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        steps.setText(null);
        factorialAnswer.setText(null);
        number.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    
    public static void main(String args[]) {
//        JPanel stepPanel = new JPanel();
//        stepPanel.setBorder(new TitledBorder (new EtchedBorder (), "Display Area"));
//        JTextArea display = new JTextArea(30, 30);
//        display.setEditable (false);
//        JScrollPane scroll =new JScrollPane(display);
//        scroll.setVerticalScrollBarPolicy( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        
//        stepPanel.add(scroll);
//        
//        JFrame frame = new JFrame();
//        frame.add(stepPanel);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
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
            java.util.logging.Logger.getLogger(FactorialForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FactorialForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FactorialForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FactorialForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FactorialForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Answer;
    private javax.swing.JButton clear;
    private javax.swing.JTextField factorialAnswer;
    public javax.swing.JButton factorialCalc;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField number;
    public javax.swing.JScrollPane scrollpane;
    private javax.swing.JTextArea steps;
    public javax.swing.JLabel stepslabel;
    // End of variables declaration//GEN-END:variables
}
