/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_modeGraphique_roque_dehaynin;

/**
 *
 * @author daphn
 */
public class fenetreDejeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetreDejeu
     */
    public fenetreDejeu() {
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

        jLabel2 = new javax.swing.JLabel();
        panneau_grille = new javax.swing.JPanel();
        panneau_info_joueur = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nom_joueur_1 = new javax.swing.JTextField();
        nom_joueur_2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 672, 576));

        panneau_info_joueur.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nom joueur 1 :");
        panneau_info_joueur.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nom joueur 2 : ");
        panneau_info_joueur.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 30));

        nom_joueur_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur_1ActionPerformed(evt);
            }
        });
        panneau_info_joueur.add(nom_joueur_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 60, 20));

        nom_joueur_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur_2ActionPerformed(evt);
            }
        });
        panneau_info_joueur.add(nom_joueur_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 60, 20));

        btn_start.setText("Démarrer partie");
        panneau_info_joueur.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 40));

        getContentPane().add(panneau_info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 290, 140));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("joueur 1 : ");
        panneau_creation_partie.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("couleur :");
        panneau_creation_partie.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("désintégrateurs : ");
        panneau_creation_partie.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lbl_j1_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j1_nom.setText("nomjoueur1");
        panneau_creation_partie.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        lbl_j1_couleur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j1_couleur.setText("couleurjoueur1");
        panneau_creation_partie.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        lbl_j1_desint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j1_desint.setText("nbdesintjoueur1");
        panneau_creation_partie.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));
        panneau_creation_partie.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 162, 260, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("joueur 2 : ");
        panneau_creation_partie.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("couleur :");
        panneau_creation_partie.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("désintégrateurs : ");
        panneau_creation_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lbl_j2_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j2_nom.setText("nomjoueur2");
        panneau_creation_partie.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        lbl_j2_couleur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j2_couleur.setText("couleurjoueur1");
        panneau_creation_partie.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        lbl_j2_desint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_j2_desint.setText("nbdesintjoueur1");
        panneau_creation_partie.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("infos joueurs : ");
        panneau_creation_partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 30));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 290, 290));

        panneau_info_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("infos jeu : ");
        panneau_info_partie.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 40));

        lbl_jcourant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_jcourant.setText("nomjoueur");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 90, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("joueur courant");
        panneau_info_partie.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneau_info_partie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 50));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 290, 120));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 30, -1, -1));

        btn_col_2.setText("3");
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 30, -1, -1));

        btn_col_3.setText("4");
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 30, -1, -1));

        btn_col_4.setText("5");
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 30, -1, -1));

        btn_col_5.setText("6");
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        btn_col_6.setText("7");
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur_1ActionPerformed

    private void nom_joueur_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur_2ActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_1ActionPerformed

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
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDejeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nom_joueur_1;
    private javax.swing.JTextField nom_joueur_2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueur;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}
