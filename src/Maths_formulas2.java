/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prabhat-PC
 */
public class Maths_formulas2 extends javax.swing.JFrame {

    /**
     * Creates new form Maths_formulas2
     */
    public Maths_formulas2() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        B = new javax.swing.JButton();
        A = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("<html><body><h1><font color=\"blue\">COORDINATE GEOMETRY</font></h1>\n<table boader=\"0\" cell spacing=\"20%\" cell padding=\"10\" align=\"center\"><tr><td>Distance Formula</td><td>((x)<sup>2</sup>+(y)<sup>2</sup>)<sup>1/2</sup></td><td>where x is x<sub>2</sub>-x<sub>1</sub> and y is y<sub>2</sub>-y<sub>1</sub></td></tr>\n<tr><td>Midpoint Formula</td><td>(x<sub>2</sub>+x<sub>1</sub>)/<sub>2</sub>,(y<sub>2</sub>+y<sub>1</sub>)/<sub>2</sub></td><td>where is the coordinate pair</td></tr><tr><td>Slope</td><td>m=(x<sub>2</sub>-x<sub>1</sub>)/<sub>(y<sub>2</sub>-y<sub>1</sub>)</sub></td><td>where m is the slope</td></tr>\n<tr><td>Slope-intercept form of line</td><td>y=mx+b</td><td>where m is slope and b its y-intercept</td></tr><tr><td>Standard form of line</td><td>ax+by=c</td><td>where a and b both not zero</td></tr>\n<tr><td>Point-Slope form of line</td><td>(y-y<sub>1</sub>)=m(x-x<sub>1</sub>)</td><td>where m is the slope and (x<sub>1</sub>,y<sub>1</sub>) is point on line</td></tr>\n</table><h1><font color=\"blue\">GEOMETRY OF SHAPES AND SOLIDS</font></h1><table boader=\"0\" cell spacing=\"20%\" cell padding=\"10\" align=\"center\"><tr><td>Circumference of circle</td><td>C=piD</td><td>where D is diameter equal to 2r</td></tr><tr><td>Area of circle</td><td>A=piR<sub>2</sub></td><td>where R is radius of circle </td></tr>\n<tr><td>Perimeter of rectangle</td><td>P=2l+2w</td><td>where l is length and w is breadth</td></tr><tr><td>Area of rectangle</td><td>A=lw</td><td>where l is length and w is breadth</td></tr><tr><td>Area of triangle</td><td>A=1/<sub>2</sub>bh</td><td>where b is base and h is height</td></tr><tr><td>Area of parallelogram</td><td>A=bh</td>\n<td>where b is base and h is height</td></tr><tr><td>Surface area of sphere</td><td>SA=4pir<sub>2</sub></td><td>where r is radius</td></tr><tr><td>Volume of sphere</td><td>V=4/<sub>3</sub>pir<sup>3</sup></td><td>where r is radius</td></tr><tr><td>Surface area of cylinder</td><td>SA=2pir<sup>2</sup>+2pirh</td><td>where r is radius and h is height</td></tr><tr><td>Volume of cylinder</td><td>V=pir<sup>2</sup>h</td><td>where r is radius and h is height</td></tr><tr><td>Volume of rectangular prism</td><td>V=lwh</td><td>where l is length,w is width,h is height</td></tr></table></body></html>");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mathematics.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mathematics.jpg"))); // NOI18N

        B.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        B.setText("BACK");
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BMousePressed(evt);
            }
        });
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        A.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        A.setText("HOME");
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AMousePressed(evt);
            }
        });
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B)
                    .addComponent(A))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void AMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMousePressed
      
     MATH frame2=new MATH();
 Maths_formulas2.this.setVisible(false);
 frame2.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_AMousePressed

    private void BMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMousePressed
     maths_formulas frame2=new maths_formulas();
      Maths_formulas2.this.setVisible(false);
      frame2.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_BMousePressed

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
            java.util.logging.Logger.getLogger(Maths_formulas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maths_formulas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maths_formulas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maths_formulas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maths_formulas2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
