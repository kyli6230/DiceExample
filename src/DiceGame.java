
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JColorChooser;

public class DiceGame extends javax.swing.JFrame {
    
    Dice d1, d2;
    
    //constructor of the JFrame
    public DiceGame() {
        initComponents(); //auto-generated to create the frame
        //construct our own objects here too
        d1 = new Dice(dicePanel1.getGraphics());
        d2 = new Dice(dicePanel2.getGraphics(),5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rollButton = new javax.swing.JButton();
        dicePanel1 = new javax.swing.JPanel();
        dicePanel2 = new javax.swing.JPanel();
        totalLabel = new javax.swing.JLabel();
        colorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rollButton.setText("Roll");
        rollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        dicePanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout dicePanel1Layout = new javax.swing.GroupLayout(dicePanel1);
        dicePanel1.setLayout(dicePanel1Layout);
        dicePanel1Layout.setHorizontalGroup(
            dicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        dicePanel1Layout.setVerticalGroup(
            dicePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        dicePanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout dicePanel2Layout = new javax.swing.GroupLayout(dicePanel2);
        dicePanel2.setLayout(dicePanel2Layout);
        dicePanel2Layout.setHorizontalGroup(
            dicePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        dicePanel2Layout.setVerticalGroup(
            dicePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        totalLabel.setBackground(new java.awt.Color(51, 51, 51));
        totalLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setOpaque(true);

        colorButton.setText("Set Dice Colour");
        colorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dicePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(rollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colorButton)
                            .addComponent(dicePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollButton)
                    .addComponent(colorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dicePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dicePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollButtonActionPerformed
        d1.roll();
        d2.roll();
        d1.draw();
        d2.draw();
        int total = d1.getNumber() + d2.getNumber(); 
        totalLabel.setText(String.format("You rolled %d + %d = %d", d1.getNumber(), d2.getNumber(), total));
    }//GEN-LAST:event_rollButtonActionPerformed

    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed
        Color newColor = JColorChooser.showDialog(this, "Pick New Dice Color", Color.red);
        d1.setColor(newColor);
        d2.setColor(newColor);
        newColor = JColorChooser.showDialog(this, "Choose Dot Color", Color.black);
        d1.setDotColor(newColor);
        d2.setDotColor(newColor);
        d1.draw();
        d2.draw();
    }//GEN-LAST:event_colorButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colorButton;
    private javax.swing.JPanel dicePanel1;
    private javax.swing.JPanel dicePanel2;
    private javax.swing.JButton rollButton;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
