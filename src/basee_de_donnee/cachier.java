/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basee_de_donnee;
import Appllication.parameter;
import Appllication.ResultSetTableModel;
import Appllication.BDD;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public final class cachier extends javax.swing.JFrame {

    Connecter conn=new Connecter();
    Statement stm;
    ResultSet rs;
    ResultSet Rs;
    BDD db;
    int old, dec, now;
    public cachier() {
        db = new BDD(new parameter().HOST_DB, new parameter().USERNAME_DB, new parameter().PASSWORD_DB, 
                 new parameter().IPHOST, new parameter().PORT);
        initComponents();
        table();
        jam();
        recupCli();
        importerN();
    }
    //liste des produit
    public void table() {
        String colon[] = {"CodeProduit", "Designation", "Conditionnement","Prix_de_vente","Quantite" };
        rs = db.querySelect(colon, "produit");
        listeProduit.setModel(new ResultSetTableModel(rs));
    }
     
    //liste commande
    public void importer() {
        String colon[] = {"num_vente","CodeProduit","Designation", "prixUnique","date","qqt","subtotal"};
        rs = db.fcSelectCommand(colon, "ventes", "num_vente= '" + txtfac.getText() + "'");
        tbl_ven.setModel(new ResultSetTableModel(rs));
    }
    
    //date et heure de jour
      public void jam() {
        Date s = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        jLabel22.setText(jam.format(s));
        jLabel23.setText(tgl.format(s));}
      
      public void importerN() {
       txtsto.setText(login.txt_username.getText());
        
               
    }
      
      public void recupCli(){
     try{
          stm=conn.obtenirconnexion().createStatement();
          ResultSet Rs=stm.executeQuery("Select * from caisser where type='caissier' group by NumCaisse");
          while(Rs.next()){
           String id=Rs.getString("Nom");
           //jComboBox1.addItem(id);
          }
        } catch(Exception e){
            System.err.println(e);
        }
 }        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeProduit = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        actualiser = new javax.swing.JButton();
        txtsto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtfac = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ven = new javax.swing.JTable();
        lbltot2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtcas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        comrech = new javax.swing.JComboBox();
        txtrech = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtref = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtran = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpri = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lbltot1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("             LISTES DES PRODUIT DISPONIBLE");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        listeProduit.setBackground(new java.awt.Color(204, 204, 204));
        listeProduit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Code", "Designation", "Conditionnement", "prix unique", "quantite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        listeProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeProduitMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listeProduit);

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        actualiser.setText("Actualiser");
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserActionPerformed(evt);
            }
        });

        txtsto.setBackground(new java.awt.Color(0, 102, 255));
        txtsto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtsto.setForeground(new java.awt.Color(255, 255, 255));
        txtsto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstoActionPerformed(evt);
            }
        });
        txtsto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(actualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtsto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualiser)
                            .addComponent(txtsto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Num de facture :");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 130, 100, 17);

        txtfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfacActionPerformed(evt);
            }
        });
        jPanel3.add(txtfac);
        txtfac.setBounds(140, 120, 160, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton3.setText("recherche ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(310, 120, 120, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(440, 120, 110, 30);

        tbl_ven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "num_facture", "code produit", "Designation", "Prix unique", "Nom caisse", "date", "Quantite", "total "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_ven);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 170, 550, 110);

        lbltot2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltot2.setText("0");
        jPanel3.add(lbltot2);
        lbltot2.setBounds(370, 300, 190, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Montant a rendre");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(180, 410, 160, 30);
        jPanel3.add(txtpay);
        txtpay.setBounds(360, 410, 130, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Montant a caisse");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(190, 350, 140, 30);

        txtcas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcasKeyReleased(evt);
            }
        });
        jPanel3.add(txtcas);
        txtcas.setBounds(360, 350, 130, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("imprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(200, 470, 140, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Total ");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(230, 300, 110, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton6.setText("annuler");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(370, 470, 140, 30);

        jPanel4.setBackground(new java.awt.Color(253, 230, 250));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setText("COMMANDE");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(40, 20, 490, 70);

        jButton9.setBackground(new java.awt.Color(0, 0, 153));
        jButton9.setFont(new java.awt.Font("Tw Cen MT Condensed", 2, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Deconnection");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(30, 470, 120, 30);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("recherche par catégorie :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 0, 250, 20);

        comrech.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CodeProduit", "Designation", "Conditionnement", " " }));
        jPanel2.add(comrech);
        comrech.setBounds(20, 30, 130, 30);
        jPanel2.add(txtrech);
        txtrech.setBounds(150, 70, 160, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("code_produit :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 130, 100, 17);

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        jPanel2.add(txtcod);
        txtcod.setBounds(150, 120, 160, 30);

        txtref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrefActionPerformed(evt);
            }
        });
        jPanel2.add(txtref);
        txtref.setBounds(150, 160, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Designation :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 170, 100, 17);

        txtran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtranActionPerformed(evt);
            }
        });
        jPanel2.add(txtran);
        txtran.setBounds(150, 200, 160, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Prix        :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 260, 100, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Conditionnement :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 210, 110, 17);

        txtpri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriActionPerformed(evt);
            }
        });
        jPanel2.add(txtpri);
        txtpri.setBounds(150, 250, 160, 30);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(150, 310, 160, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Nouvelle client");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(180, 480, 160, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setText("RP : ");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(50, 390, 50, 30);

        lbltot1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltot1.setText("0");
        jPanel2.add(lbltot1);
        lbltot1.setBounds(130, 390, 170, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton5.setText("recherche ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(10, 70, 131, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Quantite  :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 310, 100, 17);

        jButton7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton7.setText("Ajouter au vente");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(10, 480, 160, 30);

        jButton8.setText("Annuler");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(180, 30, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfacActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //rechercher
        importer();
        total();      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       //supprimer commande
       String id = String.valueOf(tbl_ven.getValueAt(tbl_ven.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "est ce que tu es sure que tu veux supprimer ", "Attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("ventes", "num_vente=" + id);
        } else {
            return;
        }
        importer();
        total();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtcasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcasKeyReleased
         payaprés();                 // TODO add your handling code here: 
    }//GEN-LAST:event_txtcasKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //afficher jframe recu
        Recu p=new Recu();
        p.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
             //Annuller
       String invoice = txtfac.getText();
        if (JOptionPane.showConfirmDialog(this,"est ce que tu es sure que tu veux supprimer ","attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("ventes", "num_vente=" + invoice);
        } else {
            return;
        }
        importer();
        total();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
  // recherche
        if (txtrech.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP complete le champ de recherche");
        } else {
            if (comrech.getSelectedItem().equals("CodeProduit")) {
                String colon[] = {"CodeProduit","Designation","Conditionnement","prix_de_vente","Quantite"};
                rs = db.fcSelectCommand(colon, "produit", "CodeProduit LIKE '" + txtrech.getText() + "' ");
                listeProduit.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Designation")) {
                String colon[] = {"CodeProduit","Designation","Conditionnement","prix_de_vente","Quantite"};
                rs = db.fcSelectCommand(colon, "produit", "Designation LIKE '" + txtrech.getText() + "' ");
               listeProduit.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("Conditionnement")) {
                String colon[] = {"CodeProduit","Designation","Conditionnement","prix_de_vente","Quantite"};
                rs = db.fcSelectCommand(colon, "produit", "Conditionnement LIKE '" + txtrech.getText() + "' ");
                listeProduit.setModel(new ResultSetTableModel(rs));
                }            
        
        }                            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //fenetre client
        Client c=new Client();
        c.setVisible(true);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
               // evenement pour le quantite il faut quantite<qtt
        subtotal();  
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtpriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriActionPerformed

    private void txtranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtranActionPerformed

    private void txtrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrefActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void listeProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeProduitMouseClicked
        txtcod.setText(String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(), 0)));
        txtref.setText(String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(), 1)));
        txtran.setText(String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(), 2)));
        txtpri.setText(String.valueOf(listeProduit.getValueAt(listeProduit.getSelectedRow(), 3)));  
       
               // TODO add your handling code here:
    }//GEN-LAST:event_listeProduitMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       //ajout commande
         if (txtcod.getText().equals("") || txtref.getText().equals("") || txtran.getText().equals("")
                || txtpri.getText().equals("") || txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer vos donneé");
        } else if (txtfac.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer le num de facture");
        } else {
           
            try {
                if (!test_stock()) { 
                    JOptionPane.showMessageDialog(this, "le qauntite stocke est insuffisant");
                } else {
                     String[] colon = {"num_vente","CodeProduit","Designation","prixUnique","NomCaisse","date","qqt","subtotal",};
            String[] isi = {txtfac.getText(), txtcod.getText(), txtref.getText(),txtpri.getText() , txtsto.getText(),jLabel23.getText(), txtName.getText(), lbltot1.getText()};
            System.out.println(db.queryInsert("ventes", colon, isi));
                    def(); //true
                    table(); //true
                }
            } catch (SQLException ex) {
                Logger.getLogger(cachier.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("\n"+ex);
            }
            subtotal();
            importer();
            total();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Annulle
        txtcod.setText("");
        txtref.setText("");
        txtran.setText("");
        txtpri.setText("");
        txtName.setText("");
        txtrech.setText("");
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserActionPerformed
        // TODO add your handling code here:
         table();
    }//GEN-LAST:event_actualiserActionPerformed

    private void txtstoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstoActionPerformed

    private void txtstoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstoKeyReleased

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
         char car= evt.getKeyChar();
            if((car<'0' || car>'9' ) && txtName.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE))
            {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP entrer seulement des numero","message de confirmation d'ecrire seulement des numero"
            ,JOptionPane.INFORMATION_MESSAGE);
            } else if ((car < '0' || car >'9' ) && (car!='.') && (car!=(char)KeyEvent.VK_BACK_SPACE)){
                evt.consume();
                JOptionPane.showMessageDialog(null, "Entrez numero seulement","message de confirmation",JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtcasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcasKeyPressed
        // TODO add your handling code here:
          char car= evt.getKeyChar();
            if((car<'0' || car>'9' ) && txtcas.getText().contains(".") && (car!=(char)KeyEvent.VK_BACK_SPACE))
            {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SVP entrer seulement des numero","message de confirmation d'ecrire seulement des numero"
            ,JOptionPane.INFORMATION_MESSAGE);
            } else if ((car < '0' || car >'9' ) && (car!='.') && (car!=(char)KeyEvent.VK_BACK_SPACE)){
                evt.consume();
                JOptionPane.showMessageDialog(null, "Entrez numero seulement","message de confirmation",JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_txtcasKeyPressed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        login g=new login();
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

          //fonction
    /* public void cout() {
        double a = Double.parseDouble(txtpri.getText());
        double b = Double.parseDouble(txtrem.getText());
        double c = a - a * (b / 100);
        txtpri.setText(String.valueOf(c));
    }*/
    
        //fonction quantite*pu
       public void subtotal() {
        double a = Double.parseDouble(txtpri.getText());
        double b = Double.parseDouble(txtName.getText());
        double c = a * b;
        lbltot1.setText(String.valueOf(c));
       }
       
       //fontion test quantite
        public boolean test_stock() throws SQLException {
        boolean teststock;
        rs = db.querySelectAll("produit","CodeProduit='" + txtcod.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("Quantite");
        }
        dec = Integer.parseInt(txtName.getText());
        if (old < dec) {
            teststock = false;
        } else {
            teststock = true;
        }
        return teststock;
    }
        
        //fonction mcalcul quantiteStocke-qttcomande
        public void def() throws SQLException {
        rs = db.querySelectAll("produit", "CodeProduit='" + txtcod.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("Quantite");
        }
        dec = Integer.parseInt(txtName.getText());
        now = old - dec;
         String nvstock = Integer.toString(now);

        String a = String.valueOf(nvstock);
        String[] colon = {"Quantite"};
        String[] isi = {a};
        System.out.println(db.queryUpdate("produit", colon, isi, "CodeProduit='" + txtcod.getText() + "'"));
       }
        
       public void total() {
        rs = db.exécutionQuery("SELECT SUM(subtotal) as subtotal FROM ventes WHERE num_vente = '" +txtfac.getText() + "'");
        try {
            rs.next();
            lbltot2.setText(rs.getString("subtotal"));
        } catch (SQLException ex) {
            Logger.getLogger(cachier.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
       
       //reste
     public void payaprés() {
        int a = Integer.parseInt(lbltot2.getText());
        int b = Integer.parseInt(txtcas.getText());
        int c = b - a;
        txtpay.setText(Integer.toString(c));
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
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cachier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualiser;
    public static javax.swing.JComboBox comrech;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lbltot1;
    public static javax.swing.JLabel lbltot2;
    private javax.swing.JTable listeProduit;
    public static javax.swing.JTable tbl_ven;
    public static javax.swing.JTextField txtName;
    public static javax.swing.JTextField txtcas;
    public static javax.swing.JTextField txtcod;
    public static javax.swing.JTextField txtfac;
    public static javax.swing.JTextField txtpay;
    public static javax.swing.JTextField txtpri;
    public static javax.swing.JTextField txtran;
    public static javax.swing.JTextField txtrech;
    public static javax.swing.JTextField txtref;
    public static javax.swing.JTextField txtsto;
    // End of variables declaration//GEN-END:variables
}
