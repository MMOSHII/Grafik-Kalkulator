package grafikkalkulator;

public class TampilanGrafik extends javax.swing.JFrame {
    protected java.awt.image.BufferedImage offScreenImage;
    protected double startX = -10;
    protected double endX = 10;

    public TampilanGrafik() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputFungsiEkuasi = new javax.swing.JTextField();
        panelGrafik = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                if (offScreenImage!= null) {
                    g.drawImage(offScreenImage, 0, 0, null);
                }
            }
        };
        MenuBar = new javax.swing.JMenuBar();
        optionsMenu = new javax.swing.JMenu();
        RangedX = new javax.swing.JMenuItem();
        SwitchKalkulator = new javax.swing.JMenuItem();
        Menu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grafik Kalkulator Sederhana");
        setResizable(false);

        inputFungsiEkuasi.setPreferredSize(new java.awt.Dimension(250, 30));

        panelGrafik.setPreferredSize(new java.awt.Dimension(500, 500));

        add(panelGrafik, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelGrafikLayout = new javax.swing.GroupLayout(panelGrafik);
        panelGrafik.setLayout(panelGrafikLayout);
        panelGrafikLayout.setHorizontalGroup(
            panelGrafikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        panelGrafikLayout.setVerticalGroup(
            panelGrafikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        optionsMenu.setText("Options");

        RangedX.setText("Ranged X ");
        RangedX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangedXActionPerformed(evt);
            }
        });
        optionsMenu.add(RangedX);

        SwitchKalkulator.setText("Kalkulator");
        SwitchKalkulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwitchKalkulatorActionPerformed(evt);
            }
        });
        optionsMenu.add(SwitchKalkulator);

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        optionsMenu.add(Menu);

        MenuBar.add(optionsMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(inputFungsiEkuasi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGrafik, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputFungsiEkuasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGrafik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(inputFungsiEkuasi, java.awt.BorderLayout.NORTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RangedXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangedXActionPerformed
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setResizable(false);
        frame.setTitle("Range X");

        javax.swing.JPanel rangePanel = new javax.swing.JPanel(new java.awt.FlowLayout());
        javax.swing.JLabel startXLabel = new javax.swing.JLabel("X Start:");
        javax.swing.JTextField startXField = new javax.swing.JTextField(Double.toString(startX), 3);
        javax.swing.JLabel endXLabel = new javax.swing.JLabel("X End:");
        javax.swing.JTextField endXField = new javax.swing.JTextField(Double.toString(endX), 3);
        javax.swing.JButton updateButton = new javax.swing.JButton("Update Grafik");

        rangePanel.add(startXLabel);
        rangePanel.add(startXField);
        rangePanel.add(endXLabel);
        rangePanel.add(endXField);
        rangePanel.add(updateButton);
        
        updateButton.addActionListener((var e) -> {
            String startXText = startXField.getText();
            String endXText = endXField.getText();
            
            startX = Double.parseDouble(startXText);
            endX = Double.parseDouble(endXText);
            
            frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            frame.dispose();
        });

        frame.add(rangePanel, java.awt.BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_RangedXActionPerformed

    private void SwitchKalkulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwitchKalkulatorActionPerformed
        setVisible(false);
        new TampilanKalkulator().setVisible(true);
    }//GEN-LAST:event_SwitchKalkulatorActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        setVisible(false);
        new TampilanAwal().setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu;
    private javax.swing.JMenuBar MenuBar;
    protected javax.swing.JMenuItem RangedX;
    private javax.swing.JMenuItem SwitchKalkulator;
    protected javax.swing.JTextField inputFungsiEkuasi;
    protected javax.swing.JMenu optionsMenu;
    protected javax.swing.JPanel panelGrafik;
    // End of variables declaration//GEN-END:variables
}
