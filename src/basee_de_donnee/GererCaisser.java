
package basee_de_donnee;

import Appllication.BDD;
import Appllication.ResultSetTableModel;
import Appllication.parameter;
import static basee_de_donnee.cachier.txtName;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class GererCaisser extends javax.swing.JFrame {
    ResultSet rs;
    BDD db;
    public GererCaisser() {
         db = new BDD(new parameter().HOST_DB, new parameter().USERNAME_DB, new parameter().PASSWORD_DB, 
                 new parameter().IPHOST, new parameter().PORT);
          initComponents();
          table();
          
    } 
    
    //fonction table
    public void table() {
        String a[] = {"NumCaisse", "Nom", "type", "pwd" };
        rs = db.querySelect(a, "caisser");
        tbl_user.setModel(new ResultSetTableModel(rs));
    }
    
    void actualiser() {
        text_Num.setText("");
        Text_Nom.setText("");
        Combo_type.setSelectedItem("type");
        text_pwd.setText("");
     }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_user = new javax.swing.JTable();
        jButtonRecherche = new javax.swing.JButton();
        jButtonAjouter = new javax.swing.JButton();
        jButtonModifier = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtrech = new javax.swing.JTextField();
        text_Num = new javax.swing.JTextField();
        Text_Nom = new javax.swing.JTextField();
        jButtonActualiser = new javax.swing.JButton();
        text_pwd = new javax.swing.JTextField();
        comrech = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        Combo_type = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(559, 473, 265, 36);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setText("GESTION DE CAISSIER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(272, 23, 176, 27);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(103, 368, 452, 111);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel3.setText("GESTION DE CAISSIER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 170, 26));

        tbl_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Nom", "type", "mot de passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_userMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_user);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 530, 92));

        jButtonRecherche.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonRecherche.setText("Recherche");
        jButtonRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercheActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 100, -1));

        jButtonAjouter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonAjouter.setText("Ajouter");
        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 90, -1));

        jButtonModifier.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonModifier.setText("Modifier");
        jButtonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 90, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 100, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Nom :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 60, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("pwd :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 60, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Recherche par categorie");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 150, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Type :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 60, 20));

        txtrech.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtrech, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 130, 30));

        text_Num.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        text_Num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_NumKeyPressed(evt);
            }
        });
        getContentPane().add(text_Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 130, 30));

        Text_Nom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(Text_Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, 30));

        jButtonActualiser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonActualiser.setText("Actualiser");
        jButtonActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualiserActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonActualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 100, -1));

        text_pwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(text_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 130, 30));

        comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NumCaisse", "Nom", "type", "pwd" }));
        getContentPane().add(comrech, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 130, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Numero :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 60, 20));

        Combo_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Directeur", "Caissier", "Plombier" }));
        getContentPane().add(Combo_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 130, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterActionPerformed
        // Ajouter
          if (text_Num.getText().equals("") || Text_Nom.getText().equals("") || Combo_type.getSelectedItem().equals("type") 
                  || text_pwd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = {"NumCaisse", "Nom", "type", "pwd"};
            String[] inf = {text_Num.getText(), Text_Nom.getText(), Combo_type.getSelectedItem().toString(), text_pwd.getText()};
            System.out.println(db.queryInsert("caisser", colon, inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButtonAjouterActionPerformed

    private void jButtonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierActionPerformed
        // Modification
          if (text_Num.getText().equals("") || Text_Nom.getText().equals("") || Combo_type.getSelectedItem().equals("type") 
                  || text_pwd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
              String[] colon = {"NumCaisse", "Nom", "type", "pwd"};
              String[] inf = {text_Num.getText(), Text_Nom.getText(), Combo_type.getSelectedItem().toString(), text_pwd.getText()};
              String NumCaisse = String.valueOf(tbl_user.getValueAt(tbl_user.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("caisser", colon, inf, "NumCaisse='" + NumCaisse + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButtonModifierActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Suppression 
          String NumCaisse = String.valueOf(tbl_user.getValueAt(tbl_user.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux suuprimer", "attention!!!",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("caisser", "NumCaisse=" + NumCaisse);
        } else {
            return;
        }
        table();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualiserActionPerformed
        // pour actualiser
        actualiser();
        table();
    }//GEN-LAST:event_jButtonActualiserActionPerformed

    private void jButtonRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercheActionPerformed
        // recherche
         if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
        } else {
            if (comrech.getSelectedItem().equals("NumCaisse")) {
                rs = db.querySelectAll("caisser", "NumCaisse LIKE '%" + txtrech.getText() + "%' ");
                tbl_user.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Nom")) {
                rs = db.querySelectAll("caisser", "Nom LIKE '%" + txtrech.getText() + "%' ");
                tbl_user.setModel(new ResultSetTableModel(rs));
          
            } else if (comrech.getSelectedItem().equals("type")) {
                rs = db.querySelectAll("caisser", "type LIKE '%" + txtrech.getText() + "%' ");
                tbl_user.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("pwd")) {
                rs = db.querySelectAll("caisser", "pwd LIKE '%" + txtrech.getText() + "%' ");
                tbl_user.setModel(new ResultSetTableModel(rs));
            }
        } 
    }//GEN-LAST:event_jButtonRechercheActionPerformed

    private void tbl_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_userMouseClicked
        // deplace vers le text feld
        text_Num.setText(String.valueOf(tbl_user.getValueAt(tbl_user.getSelectedRow(),0)));
        Text_Nom.setText(String.valueOf(tbl_user.getValueAt(tbl_user.getSelectedRow(),1)));
        Combo_type.setSelectedItem(String.valueOf(tbl_user.getValueAt(tbl_user.getSelectedRow(),2)));
        text_pwd.setText(String.valueOf(tbl_user.getValueAt(tbl_user.getSelectedRow(),3)));
        
    }//GEN-LAST:event_tbl_userMouseClicked

    private void text_NumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_NumKeyPressed
        // TODO add your handling code here:
        char car= evt.getKeyChar();
            if((car<'0' || car>'9' ) && text_Num.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE))
            {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP entrer seulement des numero","message de confirmation d'ecrire seulement des numero"
            ,JOptionPane.INFORMATION_MESSAGE);
            } else if ((car < '0' || car >'9' ) && (car!='.') && (car!=(char)KeyEvent.VK_BACK_SPACE)){
                evt.consume();
                JOptionPane.showMessageDialog(null, "Entrez numero seulement","message de confirmation",JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_text_NumKeyPressed

  
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
            java.util.logging.Logger.getLogger(GererCaisser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GererCaisser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GererCaisser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GererCaisser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GererCaisser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combo_type;
    private javax.swing.JTextField Text_Nom;
    private javax.swing.JComboBox comrech;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonActualiser;
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonModifier;
    private javax.swing.JButton jButtonRecherche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbl_user;
    private javax.swing.JTextField text_Num;
    private javax.swing.JTextField text_pwd;
    private javax.swing.JTextField txtrech;
    // End of variables declaration//GEN-END:variables
}
