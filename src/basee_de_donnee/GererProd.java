package basee_de_donnee;


import Appllication.BDD;
import Appllication.ResultSetTableModel;
import Appllication.parameter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valtsua
 */
public class GererProd extends javax.swing.JFrame {

    ResultSet rs;
    BDD db;
       
    public GererProd() {
        db = new BDD(new parameter().HOST_DB, new parameter().USERNAME_DB, new parameter().PASSWORD_DB, 
                 new parameter().IPHOST, new parameter().PORT);
        initComponents();
        table();
       
    }
    public void table() {
        String a[] = {"CodeProduit", "Designation", "Conditionnement", "Prix_d_achat","Prix_de_vente","Quantite" };
        rs = db.querySelect(a, "produit");
        listeProduit.setModel(new ResultSetTableModel(rs));
    }
     void actualiser() {
        jTextFieldCode.setText("");
        jTextFieldDes.setText("");
        jComboBox1.setSelectedItem("Conditionnement");
        jTextFieldPu.setText("");
        jTextFieldPv.setText("");
        jTextFieldQ.setText("");
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCode = new javax.swing.JTextField();
        jTextFieldDes = new javax.swing.JTextField();
        jTextFieldPu = new javax.swing.JTextField();
        jTextFieldQ = new javax.swing.JTextField();
        jTextFieldPv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonAjout = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonAnnuller = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeProduit = new javax.swing.JTable();
        txt_rech = new javax.swing.JTextField();
        jButtonRecherche = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        com_rech = new javax.swing.JComboBox();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("GESTION DES PRODUIT");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Designation : ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Code :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Prix d'achat : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Quantite :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Litre", "biddon PM", "biddon GM" }));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Conditionnement :");

        jTextFieldPu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPuKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Prix de vente : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, 0, 101, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDes, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldQ)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPv, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPu, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel3)
                    .addContainerGap(436, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldPv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel3)
                    .addContainerGap(96, Short.MAX_VALUE)))
        );

        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonAjout.setText("Ajouter");
        jButtonAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutActionPerformed(evt);
            }
        });

        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Actualliser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonAnnuller.setText("Annuller");
        jButtonAnnuller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullerActionPerformed(evt);
            }
        });

        listeProduit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        listeProduit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Designation", "Conditionnement", "Prix  d'achat", "Prix de vente", "Quantite"
            }
        ));
        listeProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeProduitMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listeProduit);

        jButtonRecherche.setText("Rechercher");
        jButtonRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercheActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Recherche par categorie");

        com_rech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CodeProduit", "Designation", "Conditionnement", "prix_d_achat", "prix_de_vente", "Quantite" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAjout)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1)
                                .addGap(35, 35, 35)
                                .addComponent(jButton3)
                                .addGap(32, 32, 32)
                                .addComponent(jButton4)
                                .addGap(30, 30, 30)
                                .addComponent(jButtonAnnuller)))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButtonAnnuller)
                    .addComponent(jButtonAjout))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_rech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRecherche)
                    .addComponent(jLabel8)
                    .addComponent(com_rech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      
       
      
     
    private void listeProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeProduitMouseClicked
               // deplace vers le text feld
        jTextFieldCode.setText(String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(),0)));
        jTextFieldDes.setText(String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(),1)));
        jComboBox1.setSelectedItem(String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(),2)));
        jTextFieldPu.setText(String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(),3)));
        jTextFieldPv.setText(String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(),4)));
        jTextFieldQ.setText(String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(),5)));
               
    }//GEN-LAST:event_listeProduitMouseClicked

    private void jButtonAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutActionPerformed
       //Ajouter
         if ( jTextFieldCode.getText().equals("") ||  jTextFieldDes.getText().equals("") || jComboBox1.getSelectedItem().equals("Conditionnement") 
                  || jTextFieldPu.getText().equals("")|| jTextFieldPv.getText().equals("")|| jTextFieldQ.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
            String[] colon = {"CodeProduit", "Designation", "Conditionnement", "Prix_d_achat","Prix_de_vente","Quantite" };
            String[] inf = {jTextFieldCode.getText(), jTextFieldDes.getText(), jComboBox1.getSelectedItem().toString(), jTextFieldPu.getText(), 
                jTextFieldPv.getText(), jTextFieldQ.getText()};
            System.out.println(db.queryInsert("produit", colon, inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButtonAjoutActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         
            actualiser();
            table();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // Modification
           if ( jTextFieldCode.getText().equals("") ||  jTextFieldDes.getText().equals("") || jComboBox1.getSelectedItem().equals("Conditionnement") 
                  || jTextFieldPu.getText().equals("")|| jTextFieldPv.getText().equals("")|| jTextFieldQ.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete");
        } else {
             String[] colon = {"CodeProduit", "Designation", "Conditionnement", "Prix_d_achat","Prix_de_vente","Quantite" };
              String[] inf = {jTextFieldCode.getText(), jTextFieldDes.getText(), jComboBox1.getSelectedItem().toString(), jTextFieldPu.getText(),
                  jTextFieldPv.getText(), jTextFieldQ.getText()};
              String CodeProduit = String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(), 0));
            System.out.println(db.queryUpdate("produit", colon, inf, "CodeProduit='" + CodeProduit + "'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          // Suppression 
          String CodeProduit = String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux suuprimer", "attention!!!",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("produit", "CodeProduit=" + CodeProduit);
        } else {
            return;
        }
        table();       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonAnnullerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullerActionPerformed
         jTextFieldCode.setText("");
        jTextFieldDes.setText("");
       jComboBox1.setSelectedItem("");
        jTextFieldPu.setText("");
        jTextFieldQ.setText("");
    }//GEN-LAST:event_jButtonAnnullerActionPerformed

    private void jButtonRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercheActionPerformed
           // recherche
         if (txt_rech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
        } else {
            if (com_rech.getSelectedItem().equals("CodeProduit")) {
                rs = db.querySelectAll("produit", "CodeProduit LIKE '%" + txt_rech.getText() + "%' ");
                listeProduit.setModel(new ResultSetTableModel(rs));
            } else if (com_rech.getSelectedItem().equals("Designation")) {
                rs = db.querySelectAll("produit", "Designation LIKE '%" + txt_rech.getText() + "%' ");
                listeProduit.setModel(new ResultSetTableModel(rs));         
            } else if (com_rech.getSelectedItem().equals("Conditionnement")) {
                rs = db.querySelectAll("produit", "Conditionnement LIKE '%" + txt_rech.getText() + "%' ");
                listeProduit.setModel(new ResultSetTableModel(rs));
            } else if (com_rech.getSelectedItem().equals("prix_d_achat")) {
                rs = db.querySelectAll("produit", "prix_d_achat LIKE '%" + txt_rech.getText() + "%' ");
                listeProduit.setModel(new ResultSetTableModel(rs));
            } else if (com_rech.getSelectedItem().equals("prix_de_vente")) {
                rs = db.querySelectAll("produit", "prix_de_vente LIKE '%" + txt_rech.getText() + "%' ");
                listeProduit.setModel(new ResultSetTableModel(rs));
            }else if (com_rech.getSelectedItem().equals("Quantite")) {
                rs = db.querySelectAll("produit", "Quantite LIKE '%" + txt_rech.getText() + "%' ");
                listeProduit.setModel(new ResultSetTableModel(rs));
            }
        } 
    }//GEN-LAST:event_jButtonRechercheActionPerformed

    private void jTextFieldPuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPuKeyPressed

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
            java.util.logging.Logger.getLogger(GererProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GererProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GererProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GererProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GererProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox com_rech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAjout;
    private javax.swing.JButton jButtonAnnuller;
    private javax.swing.JButton jButtonRecherche;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JTextField jTextFieldCode;
    private javax.swing.JTextField jTextFieldDes;
    private javax.swing.JTextField jTextFieldPu;
    private javax.swing.JTextField jTextFieldPv;
    private javax.swing.JTextField jTextFieldQ;
    private javax.swing.JTable listeProduit;
    private javax.swing.JTextField txt_rech;
    // End of variables declaration//GEN-END:variables
}
