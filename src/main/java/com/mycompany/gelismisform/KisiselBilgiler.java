/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gelismisform;

/**
 *
 * @author ASUS PC
 */
public class KisiselBilgiler extends javax.swing.JFrame {

   public String isim,soyIsim,yas,cinsiyet,medeniHal;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getMedeniHal() {
        return medeniHal;
    }

    public void setMedeniHal(String medeniHal) {
        this.medeniHal = medeniHal;
    }
   
    public KisiselBilgiler() {
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

        isimLbl = new javax.swing.JLabel();
        soyIsimLbl = new javax.swing.JLabel();
        isimTxt = new javax.swing.JTextField();
        soyIsimTxt = new javax.swing.JTextField();
        yasLbl = new javax.swing.JLabel();
        yasTxt = new javax.swing.JTextField();
        gonderBtn = new javax.swing.JButton();
        medeniHalLbl = new javax.swing.JLabel();
        medeniHalCbx = new javax.swing.JComboBox<>();
        cinsiyetLbl = new javax.swing.JLabel();
        cinsiyetCbx = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        isimLbl.setText("İsim");

        soyIsimLbl.setText("Soyisim");

        yasLbl.setText("Yaş");

        gonderBtn.setText("İLERLE");
        gonderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderBtnActionPerformed(evt);
            }
        });

        medeniHalLbl.setText("Medeni hal");

        medeniHalCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seç", "Evli", "Bekar", " " }));
        medeniHalCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medeniHalCbxActionPerformed(evt);
            }
        });

        cinsiyetLbl.setText("Cinsiyet");

        cinsiyetCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seç", "Kadın", "Erkek" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isimLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyIsimLbl)
                    .addComponent(medeniHalLbl)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cinsiyetLbl)
                        .addComponent(yasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gonderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(soyIsimTxt)
                    .addComponent(yasTxt)
                    .addComponent(cinsiyetCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medeniHalCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isimTxt))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(isimLbl)
                    .addComponent(isimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyIsimLbl)
                    .addComponent(soyIsimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yasLbl)
                    .addComponent(yasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cinsiyetLbl)
                    .addComponent(cinsiyetCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medeniHalLbl)
                    .addComponent(medeniHalCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(gonderBtn)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medeniHalCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medeniHalCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medeniHalCbxActionPerformed

    private void gonderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderBtnActionPerformed
         isim=isimTxt.getText();
         soyIsim=soyIsimTxt.getText();
         yas=yasTxt.getText();
         cinsiyet=cinsiyetCbx.getSelectedItem().toString();
         medeniHal=medeniHalCbx.getSelectedItem().toString();

        KisiselBilgilerFormu bilgiForm= new KisiselBilgilerFormu(isim,soyIsim,yas,cinsiyet,medeniHal);
        bilgiForm.setVisible(true);

    }//GEN-LAST:event_gonderBtnActionPerformed

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
            java.util.logging.Logger.getLogger(KisiselBilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KisiselBilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KisiselBilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KisiselBilgiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KisiselBilgiler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cinsiyetCbx;
    private javax.swing.JLabel cinsiyetLbl;
    private javax.swing.JButton gonderBtn;
    private javax.swing.JLabel isimLbl;
    private javax.swing.JTextField isimTxt;
    private javax.swing.JComboBox<String> medeniHalCbx;
    private javax.swing.JLabel medeniHalLbl;
    private javax.swing.JLabel soyIsimLbl;
    private javax.swing.JTextField soyIsimTxt;
    private javax.swing.JLabel yasLbl;
    private javax.swing.JTextField yasTxt;
    // End of variables declaration//GEN-END:variables
}
