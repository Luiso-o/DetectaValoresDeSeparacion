package Clases;

import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        txtExpresion.setText("{3*(7-6)-(3*7)-[6-3]}");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtExpresion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtExpresion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtExpresion.setText("jTextField1");

        jButton1.setText("Validar expresion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validarExpresion()) {
              JOptionPane.showMessageDialog(null, ""
                      + "La formula esta escrita correctamente.");
            } else {
            
            JOptionPane.showMessageDialog(null, ""
                      + "Error!! La formula NO esta escrita correctamente.");
            
            }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField txtExpresion;
    // End of variables declaration//GEN-END:variables

    public boolean validarExpresion() {
        Pila pila = new Pila();
        String cadena = txtExpresion.getText();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                pila.Insertar(cadena.charAt(i));
            } else {

                if (cadena.charAt(i) == ')') {

                    if (pila.extraer() != '(') {
                        return false;
                    }

                } else {

                    if (cadena.charAt(i) == ']') {

                        if (pila.extraer() != '[') {
                            return false;
                        }

                    } else {

                        if (cadena.charAt(i) == '}') {

                            if (pila.extraer() != '{') {
                                return false;

                            }

                        }
                    }
                }

            }
        }
            
        return pila.pilaVacia();
        
    }
}
