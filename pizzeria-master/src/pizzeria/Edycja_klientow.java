/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static pizzeria.Edycja_pizzy.zam;

/**
 *
 * @author Wika
 */
public class Edycja_klientow extends javax.swing.JFrame {

    Connection con;
    Statement stmt1, stmt2, stmt3, stmt4, stmt5, stmt6, stmt7, stmt11;
    ResultSet res1, res2, res3, res4, res5, res6;
    DefaultTableModel model;
    float tel = 0;
    boolean czyzamtrwa = true;

    public boolean isCzyzamtrwa() {
        return czyzamtrwa;
    }

    public void setCzyzamtrwa(boolean czyzamtrwa) {
        this.czyzamtrwa = czyzamtrwa;
    }

    public Edycja_klientow() {
        initComponents();
        model = (DefaultTableModel) tabelka.getModel();
        paneledytujdodaj.setVisible(false);
        panel_tabelka.setVisible(false);
    }

    public void pokazpanel() {
        if (czyzamtrwa) {
            paneldostawy.setVisible(true);
        } else {
            paneldostawy.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        przegladaj = new javax.swing.JToggleButton();
        powrot = new javax.swing.JButton();
        paneldostawy = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        adres2 = new javax.swing.JTextField();
        imienazwisko = new javax.swing.JTextField();
        nrtel = new javax.swing.JTextField();
        dalej = new javax.swing.JButton();
        panel_tabelka = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelka = new javax.swing.JTable();
        usun = new javax.swing.JButton();
        edytuj = new javax.swing.JButton();
        dodaj = new javax.swing.JButton();
        paneledytujdodaj = new javax.swing.JPanel();
        wyczysc = new javax.swing.JButton();
        zapisz = new javax.swing.JButton();
        anuluj = new javax.swing.JButton();
        nr = new javax.swing.JLabel();
        imie = new javax.swing.JLabel();
        nazwisko = new javax.swing.JLabel();
        telefon = new javax.swing.JLabel();
        adres = new javax.swing.JLabel();
        POLENR = new javax.swing.JTextField();
        POLEIMIE = new javax.swing.JTextField();
        POLENAZWISKO = new javax.swing.JTextField();
        POLETELEFON = new javax.swing.JTextField();
        POLEADRES = new javax.swing.JTextField();
        komunikat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        przegladaj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        przegladaj.setText("Przeglądaj wszystkich klientów");
        przegladaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przegladajActionPerformed(evt);
            }
        });
        getContentPane().add(przegladaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 264, 64));

        powrot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        powrot.setText("Powrót");
        powrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powrotActionPerformed(evt);
            }
        });
        getContentPane().add(powrot, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 192, 64));

        paneldostawy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dane klienta:");

        adres2.setEditable(false);
        adres2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adres2ActionPerformed(evt);
            }
        });

        imienazwisko.setEditable(false);
        imienazwisko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imienazwiskoActionPerformed(evt);
            }
        });

        nrtel.setEditable(false);
        nrtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrtelActionPerformed(evt);
            }
        });

        dalej.setText("Dalej");
        dalej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dalejActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneldostawyLayout = new javax.swing.GroupLayout(paneldostawy);
        paneldostawy.setLayout(paneldostawyLayout);
        paneldostawyLayout.setHorizontalGroup(
            paneldostawyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldostawyLayout.createSequentialGroup()
                .addGroup(paneldostawyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paneldostawyLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1))
                    .addGroup(paneldostawyLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(imienazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneldostawyLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(nrtel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldostawyLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adres2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneldostawyLayout.createSequentialGroup()
                .addComponent(dalej, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        paneldostawyLayout.setVerticalGroup(
            paneldostawyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldostawyLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(imienazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(nrtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adres2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(dalej, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(paneldostawy, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 320, 340));

        panel_tabelka.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelka.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NR", "Imię Nazwisko", "Telefon", "Adres"
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
        tabelka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelka);
        if (tabelka.getColumnModel().getColumnCount() > 0) {
            tabelka.getColumnModel().getColumn(0).setMinWidth(30);
            tabelka.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelka.getColumnModel().getColumn(0).setMaxWidth(30);
            tabelka.getColumnModel().getColumn(1).setMinWidth(300);
            tabelka.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabelka.getColumnModel().getColumn(1).setMaxWidth(300);
            tabelka.getColumnModel().getColumn(2).setMinWidth(150);
            tabelka.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabelka.getColumnModel().getColumn(2).setMaxWidth(150);
            tabelka.getColumnModel().getColumn(3).setMinWidth(300);
            tabelka.getColumnModel().getColumn(3).setPreferredWidth(300);
            tabelka.getColumnModel().getColumn(3).setMaxWidth(300);
        }

        panel_tabelka.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 780, 210));

        usun.setText("Usuń");
        usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunActionPerformed(evt);
            }
        });
        panel_tabelka.add(usun, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 140, 40));

        edytuj.setText("Edytuj");
        edytuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edytujActionPerformed(evt);
            }
        });
        panel_tabelka.add(edytuj, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 140, 40));

        dodaj.setText("Dodaj");
        dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajActionPerformed(evt);
            }
        });
        panel_tabelka.add(dodaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 130, 40));

        paneledytujdodaj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wyczysc.setText("Wyczyść");
        wyczysc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyczyscActionPerformed(evt);
            }
        });
        paneledytujdodaj.add(wyczysc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 120, 40));

        zapisz.setText("Zapisz");
        zapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zapiszActionPerformed(evt);
            }
        });
        paneledytujdodaj.add(zapisz, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 120, 40));

        anuluj.setText("Anuluj");
        anuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anulujActionPerformed(evt);
            }
        });
        paneledytujdodaj.add(anuluj, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 120, 40));

        nr.setText("Nr");
        paneledytujdodaj.add(nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 50, 20));

        imie.setText("Imię");
        paneledytujdodaj.add(imie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        nazwisko.setText("Nazwisko");
        paneledytujdodaj.add(nazwisko, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        telefon.setText("Telefon");
        paneledytujdodaj.add(telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        adres.setText("Adres");
        paneledytujdodaj.add(adres, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        POLENR.setEnabled(false);
        paneledytujdodaj.add(POLENR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, -1));
        paneledytujdodaj.add(POLEIMIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, -1));
        paneledytujdodaj.add(POLENAZWISKO, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 80, -1));
        paneledytujdodaj.add(POLETELEFON, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 100, -1));
        paneledytujdodaj.add(POLEADRES, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 130, -1));

        komunikat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        komunikat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        paneledytujdodaj.add(komunikat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 440, 50));

        panel_tabelka.add(paneledytujdodaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 770, 250));

        getContentPane().add(panel_tabelka, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 116, 850, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void powrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powrotActionPerformed
        if (!czyzamtrwa) {
            Zamowienia zam = new Zamowienia();
            zam.setVisible(true);
        } else {
            NoweZamLok nzl = new NoweZamLok();
            nzl.setVisible(true);
            try {
                con = DriverManager.getConnection(
                        "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
                );
                stmt7 = con.createStatement();
                stmt7.executeUpdate(
                        "delete from ZAMOWIENIE where id_zam=(select max(id_zam) from ZAMOWIENIE)"
                );
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
            }
        }
        dispose();
    }//GEN-LAST:event_powrotActionPerformed

    private void przegladajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przegladajActionPerformed
        if (przegladaj.isSelected() == true) {
            panel_tabelka.setVisible(true);
            paneledytujdodaj.setVisible(false);
            czysctabelke();
            przegladaj(model);
        } else {
            panel_tabelka.setVisible(false);

        }
    }//GEN-LAST:event_przegladajActionPerformed

    private void usunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunActionPerformed
        int j = tabelka.getRowCount();
        String ostt = tabelka.getValueAt(j - 1, 0).toString();
        int ost = Integer.parseInt(ostt);
        if (tabelka.getSelectedRowCount() > 0) {
            int wiersz = tabelka.getSelectedRow();
            String s = tabelka.getValueAt(wiersz, 0).toString();
            String usunwiersz = "delete from klienci where id_klienta=" + s;
            try {
                con = DriverManager.getConnection(
                        "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
                );
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych"); 
            }
            try {
                stmt5 = con.createStatement();
                stmt5.executeUpdate(usunwiersz);
                int id1 = Integer.parseInt(s);
                id1++;
                for (int i = id1; i <= ost; i++) {
                    String naprawid = "UPDATE klienci SET id_klienta =" + (i - 1) + " WHERE id_klienta =" + i;
                    stmt5.executeUpdate(naprawid);
                }

            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nie wybrano wiersza!");
        }
        czysctabelke();
        przegladaj(model);

    }//GEN-LAST:event_usunActionPerformed

    private void wyczyscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyczyscActionPerformed
        wyczyscdane();
    }//GEN-LAST:event_wyczyscActionPerformed

    private void edytujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edytujActionPerformed
        wyczyscdane();
        if (tabelka.getSelectedRowCount() > 0) {
            paneledytujdodaj.setVisible(true);
            int wybrwiersz = tabelka.getSelectedRow();
            int numer = Integer.parseInt(tabelka.getValueAt(wybrwiersz, 0).toString());
            POLENR.setText(numer + "");
        } else {
            JOptionPane.showMessageDialog(null, "Nie wybrano wiersza!");
        }
    }//GEN-LAST:event_edytujActionPerformed

    private void dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajActionPerformed
        wyczyscdane();
        paneledytujdodaj.setVisible(true);
        int numer = tabelka.getRowCount() + 1;
        POLENR.setText(numer + "");

    }//GEN-LAST:event_dodajActionPerformed

    private void anulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anulujActionPerformed
        wyczyscdane();
        paneledytujdodaj.setVisible(false);
    }//GEN-LAST:event_anulujActionPerformed

    private void zapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zapiszActionPerformed
        komunikat.setText("");
        int numer = tabelka.getRowCount() + 1;
        String imie = POLEIMIE.getText();
        String nazwisko = POLENAZWISKO.getText();
        String TELEFON = POLETELEFON.getText();
        String adres = POLEADRES.getText();
        String imie_nazwisko = imie + " " + nazwisko;
        boolean bledy = false;
        int licznikbledow = 0;
        if (bledy == false) {
            if (imie.equals("") || nazwisko.equals("") || TELEFON.equals("") || adres.equals("")) {
                komunikat.setText("Brak  danych!");
                komunikat.setForeground(Color.red);
                licznikbledow++;
            }
            int j = 0;
            boolean TylkoLiczbyTelefon = true;
            while ((TylkoLiczbyTelefon == true) && (j < TELEFON.length())) {
                if ((TELEFON.charAt(j) < '0') || (TELEFON.charAt(j) > '9')) {
                    TylkoLiczbyTelefon = false;
                    JOptionPane.showMessageDialog(null, "Niepoprawny format telefony!");
                    licznikbledow++;
                }
                j++;
            }
            if ((TELEFON.length() != 0 && TELEFON.length() != 9)) {
                JOptionPane.showMessageDialog(null, "Niepoprawna długość telefony!");
                licznikbledow++;
            }
        }
        if (licznikbledow == 0) {
            try {
                con = DriverManager.getConnection(
                        "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
                );
                stmt3 = con.createStatement();
                String insert = "";
                if (tabelka.getSelectedRow() < 0) {
                    insert = "INSERT INTO klienci VALUES(" + numer + "," + TELEFON + ",'" + adres + "','" + imie_nazwisko + "')";
                    stmt3.executeUpdate(insert);
                    numer++;
                    POLENR.setText(numer + "");
                } else {
                    int wiersz = tabelka.getSelectedRow();
                    String s = tabelka.getValueAt(wiersz, 0).toString();
                    insert = "UPDATE klienci SET nr_tel=" + TELEFON + ", adres='" + adres + "', imie_nazwisko='" + imie_nazwisko + "' WHERE id_klienta=" + s;
                    stmt3.executeUpdate(insert);
                }
                wyczyscdane();
                komunikat.setText("Nowy klient został dodany do bazy systemu");
                komunikat.setForeground(Color.DARK_GRAY);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Błąd zapisu");
            }
            czysctabelke();
            przegladaj(model);
        }
    }//GEN-LAST:event_zapiszActionPerformed

    private void adres2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adres2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adres2ActionPerformed

    private void imienazwiskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imienazwiskoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imienazwiskoActionPerformed

    private void nrtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrtelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrtelActionPerformed

    private void dalejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dalejActionPerformed
        if (tabelka.getSelectedRowCount() > 0) {
            int i = tabelka.getSelectedRow();
            String s = tabelka.getValueAt(i, 0).toString();
            int nr = Integer.parseInt(s);
            try {
                con = DriverManager.getConnection(
                        "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
                );
                stmt11 = con.createStatement();
                stmt11.executeUpdate(
                        "update ZAMOWIENIE set id_klienta=" + nr + " where id_zam=(select max(id_zam) from zamowienie)"
                );
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
            }
            Szczegoly_zamowienia sz = new Szczegoly_zamowienia();
            sz.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Wybierz klienta!");
        }
    }//GEN-LAST:event_dalejActionPerformed

    private void tabelkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkaMouseClicked
        if (tabelka.getSelectedRowCount() > 0) {
            int i = tabelka.getSelectedRow();
            String im = tabelka.getValueAt(i, 1).toString();
            String tel = tabelka.getValueAt(i, 2).toString();
            String adr = tabelka.getValueAt(i, 3).toString();
            imienazwisko.setText(im);
            nrtel.setText(tel);
            adres2.setText(adr);
        }
    }//GEN-LAST:event_tabelkaMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edycja_klientow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Edycja_klientow().setVisible(true);
            }
        });
    }

    void przegladaj(DefaultTableModel model) {

        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt1 = con.createStatement();
            res1 = stmt1.executeQuery(
                    "select * from klienci order by id_klienta"
            );
            stmt2 = con.createStatement();
            res2 = stmt2.executeQuery(
                    "select count(*) from klienci "
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
        }
        try {
            while (res1.next()) {
                int nr = res1.getInt("id_klienta");
                String telefon = res1.getString("nr_tel");
                String adres = res1.getString("adres");
                String imienazwisko = res1.getString("imie_nazwisko");
                Object[] row = {nr, imienazwisko, telefon, adres};
                model.addRow(row);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych");
        }
        tabelka.setModel(model);
    }

    void czysctabelke() {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    void wyczyscdane() {
        POLEADRES.setText("");
        POLEIMIE.setText("");
        POLENAZWISKO.setText("");
        POLETELEFON.setText("");
        komunikat.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField POLEADRES;
    private javax.swing.JTextField POLEIMIE;
    private javax.swing.JTextField POLENAZWISKO;
    private javax.swing.JTextField POLENR;
    private javax.swing.JTextField POLETELEFON;
    private javax.swing.JLabel adres;
    private javax.swing.JTextField adres2;
    private javax.swing.JButton anuluj;
    private javax.swing.JButton dalej;
    private javax.swing.JButton dodaj;
    private javax.swing.JButton edytuj;
    private javax.swing.JLabel imie;
    private javax.swing.JTextField imienazwisko;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel komunikat;
    private javax.swing.JLabel nazwisko;
    private javax.swing.JLabel nr;
    private javax.swing.JTextField nrtel;
    private javax.swing.JPanel panel_tabelka;
    private javax.swing.JPanel paneldostawy;
    private javax.swing.JPanel paneledytujdodaj;
    private javax.swing.JButton powrot;
    private javax.swing.JToggleButton przegladaj;
    private javax.swing.JTable tabelka;
    private javax.swing.JLabel telefon;
    private javax.swing.JButton usun;
    private javax.swing.JButton wyczysc;
    private javax.swing.JButton zapisz;
    // End of variables declaration//GEN-END:variables
}