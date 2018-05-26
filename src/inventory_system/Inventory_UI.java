package inventory_system;

import javax.swing.*;
import java.awt.*;

public class Inventory_UI extends javax.swing.JFrame {

    /**
     * Creates new form Inventory_UI
     */
    public Inventory_UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jTextField22 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jTextField26 = new javax.swing.JTextField();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jTextField23 = new javax.swing.JTextField();
        jCheckBox22 = new javax.swing.JCheckBox();
        jTextField7 = new javax.swing.JTextField();
        jCheckBox25 = new javax.swing.JCheckBox();
        jTextField28 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jCheckBox17 = new javax.swing.JCheckBox();
        jTextField27 = new javax.swing.JTextField();
        jCheckBox18 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jCheckBox11 = new javax.swing.JCheckBox();
        jTextField17 = new javax.swing.JTextField();
        jCheckBox12 = new javax.swing.JCheckBox();
        jTextField18 = new javax.swing.JTextField();
        jCheckBox13 = new javax.swing.JCheckBox();
        jTextField19 = new javax.swing.JTextField();
        jCheckBox14 = new javax.swing.JCheckBox();
        jTextField20 = new javax.swing.JTextField();
        jCheckBox15 = new javax.swing.JCheckBox();
        jTextField21 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbtnReset = new javax.swing.JButton();
        jbtnTotal = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 8));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Inventory Mgt System");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 8));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1000, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox16.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox16.setText("Tea");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextField22.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 80, -1));

        jTextField29.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 80, -1));

        jCheckBox24.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox24.setText("Bottle Water");
        jPanel2.add(jCheckBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jCheckBox20.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox20.setText("Coffee");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jCheckBox19.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox19.setText("Rum");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jTextField26.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 80, -1));

        jCheckBox21.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox21.setText("Wine");
        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jCheckBox23.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox23.setText("Vodka");
        jPanel2.add(jCheckBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jTextField23.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 80, -1));

        jCheckBox22.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox22.setText("Oranges");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jTextField7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 80, -1));

        jCheckBox25.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox25.setText("Whiskey");
        jPanel2.add(jCheckBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jTextField28.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 80, -1));

        jTextField30.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 80, -1));

        jTextField24.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 80, -1));

        jTextField25.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 80, -1));

        jCheckBox17.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox17.setText("Milk Shake");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jTextField27.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel2.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 80, -1));

        jCheckBox18.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox18.setText("Cola");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 490, 390));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox1.setText("Rice");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 80, -1));

        jCheckBox7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox7.setText("Celery");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jCheckBox8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox8.setText("Carrots");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jCheckBox9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox9.setText("Onions");
        jPanel3.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jCheckBox10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox10.setText("Corriander");
        jPanel3.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jTextField13.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel3.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 80, -1));

        jTextField14.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel3.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, -1));

        jTextField15.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel3.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 80, -1));

        jTextField16.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel3.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 80, -1));

        jCheckBox11.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox11.setText("Gin");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jTextField17.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel3.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 80, -1));

        jCheckBox12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox12.setText("Rum");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jTextField18.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel3.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 80, -1));

        jCheckBox13.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox13.setText("Wine");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jTextField19.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel3.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 80, -1));

        jCheckBox14.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox14.setText("Vodka");
        jPanel3.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jTextField20.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel3.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 80, -1));

        jCheckBox15.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jCheckBox15.setText("Whiskey");
        jPanel3.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jTextField21.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel3.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 80, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 490, 390));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 8));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Total");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jTextField6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 110, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Subtotal");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, 30));

        jTextField10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 110, -1));

        jTextField12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jPanel4.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 110, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setText("Tax");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jbtnReset.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 90, 40));

        jbtnTotal.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jbtnTotal.setText("Total");
        jbtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTotalActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 90, 40));

        jbtnExit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 90, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1000, 140));

        pack();
    }// </editor-fold>

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO 4a: Implement Reset Functionality on TextFields
        JTextField clearText = null;
        for (Component component:jPanel3.getComponents()) {
            if (component.getClass().toString().contains("javax.swing.JTextField")) {
                clearText = (JTextField)component;
                clearText.setText("0");
                clearText.setEnabled(false);
            }
        }
        // ==========================================================================
        for (Component component:jPanel2.getComponents()) {
            if (component.getClass().toString().contains("javax.swing.JTextField")) {
                clearText = (JTextField)component;
                clearText.setText("0");
                clearText.setEnabled(false);
            }
        }

        // ==========================================================================
        // TODO 4b: Implement Reset Functionality on CheckBoxes
        JCheckBox clearBox = null;
        for (Component component:jPanel3.getComponents()) {
            if (component.getClass().toString().contains("javax.swing.JCheckBox")) {
                clearBox = (JCheckBox) component;
                clearBox.setSelected(false);
            }
        }
        // ==========================================================================
        for (Component component:jPanel2.getComponents()) {
            if (component.getClass().toString().contains("javax.swing.JCheckBox")) {
                clearBox = (JCheckBox) component;
                clearBox.setSelected(false);
            }
        }









        // ===========================================================================

    }

    private void jbtnTotalActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: 2 - Implement the Quit Functionality
        Quit exit = new Quit();
        exit.quit();
    }

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
            java.util.logging.Logger.getLogger(Inventory_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTotal;
    // End of variables declaration
}

