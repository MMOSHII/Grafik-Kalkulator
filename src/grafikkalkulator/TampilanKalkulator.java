package grafikkalkulator;

public class TampilanKalkulator extends javax.swing.JFrame implements java.awt.event.ActionListener{
    private double number, answer;
    private int calculation;

    public TampilanKalkulator() {
        initComponents();
        addActionEvent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textField = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        buttonZero = new javax.swing.JButton();
        buttonOne = new javax.swing.JButton();
        buttonTwo = new javax.swing.JButton();
        buttonDot = new javax.swing.JButton();
        buttonThree = new javax.swing.JButton();
        buttonEqual = new javax.swing.JButton();
        buttonMul = new javax.swing.JButton();
        buttonFour = new javax.swing.JButton();
        buttonFive = new javax.swing.JButton();
        buttonSix = new javax.swing.JButton();
        buttonSeven = new javax.swing.JButton();
        buttonEight = new javax.swing.JButton();
        buttonNine = new javax.swing.JButton();
        buttonSqrt = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonSquare = new javax.swing.JButton();
        buttonPlus = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonMinus = new javax.swing.JButton();
        buttonDiv = new javax.swing.JButton();
        buttonReciprocal = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SwitchKalkulator = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setResizable(false);

        textField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        buttonZero.setText("0");
        buttonZero.setPreferredSize(new java.awt.Dimension(260, 60));

        buttonOne.setText("1");
        buttonOne.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonTwo.setText("2");
        buttonTwo.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonDot.setText(".");
        buttonDot.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonThree.setText("3");
        buttonThree.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonEqual.setText("=");
        buttonEqual.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonMul.setText("x");
        buttonMul.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonFour.setText("4");
        buttonFour.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonFive.setText("5");
        buttonFive.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonSix.setText("6");
        buttonSix.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonSeven.setText("7");
        buttonSeven.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonEight.setText("8");
        buttonEight.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonNine.setText("9");
        buttonNine.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonSqrt.setText("x^1/2");
        buttonSqrt.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonClear.setText("C");
        buttonClear.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonSquare.setText("x^2");
        buttonSquare.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonPlus.setText("+");
        buttonPlus.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonDelete.setText("DEL");
        buttonDelete.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonMinus.setText("-");
        buttonMinus.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonDiv.setText("/");
        buttonDiv.setPreferredSize(new java.awt.Dimension(120, 60));

        buttonReciprocal.setText("1/x");
        buttonReciprocal.setPreferredSize(new java.awt.Dimension(120, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField)
            .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonZero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEqual, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonReciprocal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonMul, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(buttonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(buttonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSquare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonReciprocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonZero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("Options");

        SwitchKalkulator.setText("Grafik Kalkulator");
        SwitchKalkulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwitchKalkulatorActionPerformed(evt);
            }
        });
        jMenu1.add(SwitchKalkulator);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addActionEvent() {
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }
    
    private void SwitchKalkulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwitchKalkulatorActionPerformed
        setVisible(false);
        new KalkulatorGrafik().setVisible(true);
    }//GEN-LAST:event_SwitchKalkulatorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SwitchKalkulator;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonDiv;
    private javax.swing.JButton buttonDot;
    private javax.swing.JButton buttonEight;
    private javax.swing.JButton buttonEqual;
    private javax.swing.JButton buttonFive;
    private javax.swing.JButton buttonFour;
    private javax.swing.JButton buttonMinus;
    private javax.swing.JButton buttonMul;
    private javax.swing.JButton buttonNine;
    private javax.swing.JButton buttonOne;
    private javax.swing.JButton buttonPlus;
    private javax.swing.JButton buttonReciprocal;
    private javax.swing.JButton buttonSeven;
    private javax.swing.JButton buttonSix;
    private javax.swing.JButton buttonSqrt;
    private javax.swing.JButton buttonSquare;
    private javax.swing.JButton buttonThree;
    private javax.swing.JButton buttonTwo;
    private javax.swing.JButton buttonZero;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        System.out.print("A");
        Object source = e.getSource();
        if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + " X ");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));

        } else if (source == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEqual) {
            switch (calculation) {
                case 1 -> {
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                }
                case 2 -> {
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                }
                case 3 -> {
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                }
                case 4 -> {
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                }
            }
        }
    }
}
