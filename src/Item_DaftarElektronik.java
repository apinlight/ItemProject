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
        lbNamaBarang = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Barang_Nama = new javax.swing.JLabel();
        Barang_Jenis = new javax.swing.JLabel();
        Barang_Jumlah = new javax.swing.JLabel();
        lbJenisBarang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(447, 302));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Barang Elektronika");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        Item_Daftar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - - Daftar Barang - - -", "Oven", "Kipas Angin", "Kulkas", "Dispenser" }));
        Item_Daftar.setToolTipText("");
        Item_Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_DaftarActionPerformed(evt);
            }
        });
        getContentPane().add(Item_Daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 279, -1));

        Item_DaftarOK.setText("OK");
        Item_DaftarOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_DaftarOKActionPerformed(evt);
            }
        });
        getContentPane().add(Item_DaftarOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        Item_TeksBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_TeksBarangActionPerformed(evt);
            }
        });
        getContentPane().add(Item_TeksBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 420, 370));

        BackElektronik.setText("Kembali");
        BackElektronik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackElektronikActionPerformed(evt);
            }
        });
        getContentPane().add(BackElektronik, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        lbNamaBarang.setText("Nama Barang ");
        getContentPane().add(lbNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jLabel4.setText("Jenis Barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jLabel3.setText("Jumlah Tersedia");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        Barang_Nama.setText("-");
        getContentPane().add(Barang_Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 310, -1));

        Barang_Jenis.setText("-");
        getContentPane().add(Barang_Jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 310, -1));

        Barang_Jumlah.setText("-");
        getContentPane().add(Barang_Jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 310, -1));

        lbJenisBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-648446306-1024x1024.jpg"))); // NOI18N
        lbJenisBarang.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbJenisBarangPropertyChange(evt);
            }
        });
        getContentPane().add(lbJenisBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Item_DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_DaftarActionPerformed
        // TODO add your handling code here:
        if (Item_Daftar.getSelectedItem()=="- - - Daftar Barang - - -"){
            Barang_Nama.setText("-");
            Barang_Jenis.setText("-");
            Barang_Jumlah.setText("-");
        }
        else if (Item_Daftar.getSelectedItem()=="Oven"){
            Barang_Nama.setText("Oven Elsadiriti");
            Barang_Jenis.setText("Elektronik Dapur");
            Barang_Jumlah.setText("5");
        }
        else if (Item_Daftar.getSelectedItem()=="Kipas Angin"){
            Barang_Nama.setText("Kipas Angin Sinshu");
            Barang_Jenis.setText("Elektronik Keluarga");
            Barang_Jumlah.setText("1");
        }
        else if (Item_Daftar.getSelectedItem()=="Kulkas"){
            Barang_Nama.setText("Kulkas Freezering");
            Barang_Jenis.setText("Elektronik Dapur");
            Barang_Jumlah.setText("2");            
        }
        else if (Item_Daftar.getSelectedItem()=="Dispenser"){
            Barang_Nama.setText("Dispenser Tirta");
            Barang_Jenis.setText("Elektronik Dapur");
            Barang_Jumlah.setText("3");
        }
        
    }//GEN-LAST:event_Item_DaftarActionPerformed

    private void BackElektronikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackElektronikActionPerformed
        // TODO add your handling code here:
            this.setVisible(false);
            new Item_MainMenu().setVisible(true);
    }//GEN-LAST:event_BackElektronikActionPerformed

    private void Item_DaftarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_DaftarOKActionPerformed
        // TODO add your handling code here:
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
