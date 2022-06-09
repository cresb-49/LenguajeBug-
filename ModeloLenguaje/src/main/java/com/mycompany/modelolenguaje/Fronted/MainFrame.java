/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.modelolenguaje.Fronted;

import com.mycompany.modelolenguaje.Gramatica.LexerBug;
import com.mycompany.modelolenguaje.Gramatica.ParserBug;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(2);
        jTextArea1.setText("import hola.bug;\nimport hola1.bug;\n\nvoid main(){\n\tstring hola = \"hola como estas\";\n\tint val = 4.3;\n\tint val2 = 4;\n\tchar c = '2';\n\tboolean bandera1 = true;\n\tboolean bandera2 = false;\n}\n\nint funcion1(int h1,int h2,int h3){\n\tprint(\"Valor 1: {0} ,valor 2: {1} ,valor 3: {2}\",h1,h2,h3);\n\tfor(int x=1;x<h1;++){\n\t\tprint(\"Hola como estas {0}\",x);\n\t}\n\treturn 4;\t\n}\n\nvoid funcion2(){\n\tif(true){\n\t\tprint(\"Hola como estas\");\n\t}\n}\n\nvoid funcion3(int val){\n\tint cont = 0;\n\twhile(cont <= val){\n\t\tif(cont == 2){\n\t\t\tbreak;\n\t\t}\n\t}\n}");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("jButton1");
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
                .addGap(237, 237, 237)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LexerBug lexerBug = new LexerBug(new StringReader(this.jTextArea1.getText()));
        ParserBug parserBug = new ParserBug(lexerBug);
        try {
            System.out.println("--------------------------< Inicio >--------------------------");
            parserBug.parse();
            System.out.println("----------------------------<  Fin  >-------------------------");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        NumeroLinea numeroLinea = new NumeroLinea(this.jTextArea1);
        this.jScrollPane1.setRowHeaderView(numeroLinea);
    }
}
