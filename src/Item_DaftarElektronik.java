/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apin9
 */
public class Item_DaftarElektronik extends javax.swing.JFrame {

    /**
     * Creates new form Item_DaftarElektronik
     */
    public Item_DaftarElektronik() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Item_Daftar = new javax.swing.JComboBox<>();
        Item_DaftarOK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Item_TeksBarang = new javax.swing.JTextField();
        BackElektronik = new javax.swing.JButton();
        lbJenisBarang = new javax.swing.JLabel();
        lbNamaBarang = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Barang_Nama = new javax.swing.JLabel();
        Barang_Jenis = new javax.swing.JLabel();
        Barang_Jumlah = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Barang Elektronika");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Item_Daftar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - Daftar Barang - - -", "Oven", "Kipas Angin", "Kulkas", "Dispenser" }));
        Item_Daftar.setToolTipText("");
        Item_Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_DaftarActionPerformed(evt);
            }
        });

        Item_DaftarOK.setText("OK");
        Item_DaftarOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_DaftarOKActionPerformed(evt);
            }
        });

        Item_TeksBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_TeksBarangActionPerformed(evt);
            }
        });

        BackElektronik.setText("Kembali");
        BackElektronik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackElektronikActionPerformed(evt);
            }
        });

        lbJenisBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-648446306-1024x1024.jpg"))); // NOI18N
        lbJenisBarang.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbJenisBarangPropertyChange(evt);
            }
        });

        lbNamaBarang.setText("Nama Barang ");

        jLabel4.setText("Jenis Barang");

        jLabel3.setText("Jumlah Tersedia");

        Barang_Nama.setText("-");

        Barang_Jenis.setText("-");

        Barang_Jumlah.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Item_Daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Item_DaftarOK)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BackElektronik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(Item_TeksBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNamaBarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Barang_Jenis)
                            .addComponent(Barang_Nama)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Barang_Jumlah)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item_Daftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item_DaftarOK)
                    .addComponent(BackElektronik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNamaBarang)
                    .addComponent(Barang_Nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Barang_Jenis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Barang_Jumlah))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Item_TeksBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 384, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Item_DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_DaftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Item_DaftarActionPerformed

    private void BackElektronikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackElektronikActionPerformed
        // TODO add your handling code here:
            this.setVisible(false);
            new Item_MainMenu().setVisible(true);
    }//GEN-LAST:event_BackElektronikActionPerformed

    private void Item_DaftarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_DaftarOKActionPerformed
        // TODO add your handling code here:
        if (Item_Daftar.getSelectedItem()=="- - - Daftar Barang - - -"){;}
        else if (Item_Daftar.getSelectedItem()=="Oven"){;}
        else if (Item_Daftar.getSelectedItem()=="Kipas Angin"){;}
        else if (Item_Daftar.getSelectedItem()=="Kulkas"){;}
        else if (Item_Daftar.getSelectedItem()=="Dispenser"){;}
        
    }//GEN-LAST:event_Item_DaftarOKActionPerformed

    private void Item_TeksBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_TeksBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Item_TeksBarangActionPerformed

    private void lbJenisBarangPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbJenisBarangPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lbJenisBarangPropertyChange

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
            java.util.logging.Logger.getLogger(Item_DaftarElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item_DaftarElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item_DaftarElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item_DaftarElektronik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item_DaftarElektronik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackElektronik;
    private javax.swing.JLabel Barang_Jenis;
    private javax.swing.JLabel Barang_Jumlah;
    private javax.swing.JLabel Barang_Nama;
    private javax.swing.JComboBox<String> Item_Daftar;
    private javax.swing.JButton Item_DaftarOK;
    private javax.swing.JTextField Item_TeksBarang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbJenisBarang;
    private javax.swing.JLabel lbNamaBarang;
    // End of variables declaration//GEN-END:variables
}
