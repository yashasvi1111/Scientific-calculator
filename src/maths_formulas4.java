/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prabhat-PC
 */
public class maths_formulas4 extends javax.swing.JFrame {

    /**
     * Creates new form maths_formulas4
     */
    public maths_formulas4() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><body><h1><CENTER><font color=\"blue\">LIMITS FORMULAS</FONT></CENTER></H1><TABLE BORDER=\"2\" CELL SPACING=\"25\" CELL PADDING=\"25\" ALIGN=\"CENTER\"><tr><td colspan=\"2\"><h2>General formulas</h2></td></tr><TR><TD COLSPAN=\"2\">If lim<sub>x~a</sub>f(x)=l and lim<sub>x~a</sub>g(x)=m</td></tr><tr><td colspan=\"2\">lim<sub>x~a</sub>[f(x)+<sub>-</sub>g(x)]=l+<sub>-</sub>m</td></tr>\n<tr><td colspan=\"2\">lim<sub>x~a</sub>[f(x).g(x)]=l.m</td></tr><tr><td colspan=\"2\">lim<sub>x~a</sub>[f(x)/<sub>g(x)</sub>]=l/<sub>m</sub></td></tr><tr><td>lim<sub>x~a</sub>c.f(x)=c.l</td><td>lim<sub>x~a</sub>1/<sub>f(x)</sub>=1/<sub>l</sub></td></tr><tr><td colspan=\"2\"><H2>COMMON FORMULAS</H2></TD></TR><tr><td>lim<sub>x~0</sub>(1+1/<sub>n</sub>)<sup>n</sup>=e</td><td>lim<sub>x~0</sub>(1+n)<sup>1/<sub>n</sub></sup>=e</td></tr><tr><td>lim<sub>x~0</sub>sin x/<sub>x</sub>=1</td><td>lim<sub>x~0</sub>tan x/<sub>x</sub>=1</td></tr><tr><td>lim<sub>x~0</sub>cos x-1/<sub>x</sub>=0</td><td>lim<sub>x~0</sub>(x<sup>n</sup>-a<sup>n</sup>)/<sub>x-a</sub>=na<sup>n-1</sup></td></tr></table></body></html>\n ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mathematics.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mathematics.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
   MATH frame2=new MATH();
      maths_formulas4.this.setVisible(false);
frame2.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
     maths_formulas frame2=new maths_formulas();
      maths_formulas4.this.setVisible(false);
frame2.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

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
            java.util.logging.Logger.getLogger(maths_formulas4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maths_formulas4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maths_formulas4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maths_formulas4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maths_formulas4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
