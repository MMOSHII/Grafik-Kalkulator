package grafikkalkulator;

public class TampilanAwal extends javax.swing.JFrame {
    public TampilanAwal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        KalkulatorGrafik = new javax.swing.JButton();
        KalkulatorSci = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KalkulatorGrafik.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        KalkulatorGrafik.setText("Kalkulator Grafik");
        KalkulatorGrafik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KalkulatorGrafikActionPerformed(evt);
            }
        });
        jPanel1.add(KalkulatorGrafik, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 214, 180, 55));

        KalkulatorSci.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        KalkulatorSci.setText("Kalkulator");
        KalkulatorSci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KalkulatorSciActionPerformed(evt);
            }
        });
        jPanel1.add(KalkulatorSci, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 342, 180, 55));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Kalkulator");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Background.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 540));

        jMenu1.setText("Author : ");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("MMOSHII");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KalkulatorSciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KalkulatorSciActionPerformed
        setVisible(false);
        new TampilanKalkulator().setVisible(true);
    }//GEN-LAST:event_KalkulatorSciActionPerformed

    private void KalkulatorGrafikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KalkulatorGrafikActionPerformed
        setVisible(false);
        new KalkulatorGrafik().setVisible(true);
    }//GEN-LAST:event_KalkulatorGrafikActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KalkulatorGrafik;
    private javax.swing.JButton KalkulatorSci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
