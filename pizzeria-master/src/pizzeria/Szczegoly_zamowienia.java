/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SK
 */
public class Szczegoly_zamowienia extends javax.swing.JFrame {

    Connection con;
    Statement stmt1, stmt2, stmt3, stmt4;
    ResultSet res2, res3, res4;
    DefaultListModel<String> model = new DefaultListModel<>();

    public Szczegoly_zamowienia() {
        initComponents();
        setLocationRelativeTo(null);
        pobierzdane();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        szczegoly = new javax.swing.JLabel();
        prac = new javax.swing.JLabel();
        pracownik = new javax.swing.JTextField();
        prac1 = new javax.swing.JLabel();
        datazam = new javax.swing.JTextField();
        panel_klient = new javax.swing.JPanel();
        imie_nazwisko = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        poleadres = new javax.swing.JTextField();
        imnazw = new javax.swing.JLabel();
        fo = new javax.swing.JLabel();
        fz = new javax.swing.JLabel();
        forma_zamowienia = new javax.swing.JTextField();
        forma_oplaty = new javax.swing.JTextField();
        fo1 = new javax.swing.JLabel();
        wartosc = new javax.swing.JTextField();
        potwierdz = new javax.swing.JButton();
        anuluj = new javax.swing.JButton();
        panelszczeg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listazamowionych = new javax.swing.JList<>();
        imnazw1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        szczegoly.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        szczegoly.setText("Szczegóły zamówienia");
        szczegoly.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(szczegoly, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 183, 36));

        prac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prac.setText("Pracownik:");
        getContentPane().add(prac, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 77, 28));

        pracownik.setEditable(false);
        getContentPane().add(pracownik, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 234, 31));

        prac1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prac1.setText("Data zamówienia:");
        getContentPane().add(prac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 117, 28));

        datazam.setEditable(false);
        getContentPane().add(datazam, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 234, 31));

        imie_nazwisko.setEditable(false);

        telefon.setEditable(false);

        poleadres.setEditable(false);

        imnazw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        imnazw.setText("Klient:");

        javax.swing.GroupLayout panel_klientLayout = new javax.swing.GroupLayout(panel_klient);
        panel_klient.setLayout(panel_klientLayout);
        panel_klientLayout.setHorizontalGroup(
            panel_klientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_klientLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(imnazw, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_klientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(poleadres, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(telefon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imie_nazwisko, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panel_klientLayout.setVerticalGroup(
            panel_klientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_klientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_klientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imnazw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imie_nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poleadres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panel_klient, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 330, -1));

        fo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fo.setText("Forma opłaty:");
        getContentPane().add(fo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 117, 28));

        fz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fz.setText("Forma zamówienia:");
        getContentPane().add(fz, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, 28));

        forma_zamowienia.setEditable(false);
        getContentPane().add(forma_zamowienia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 234, 31));

        forma_oplaty.setEditable(false);
        getContentPane().add(forma_oplaty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 234, 31));

        fo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fo1.setText("Wartość:");
        getContentPane().add(fo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 117, 28));

        wartosc.setEditable(false);
        getContentPane().add(wartosc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 234, 31));

        potwierdz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        potwierdz.setText("Zamów");
        potwierdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potwierdzActionPerformed(evt);
            }
        });
        getContentPane().add(potwierdz, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 280, 60));

        anuluj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        anuluj.setText("Zrezygnuj");
        anuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anulujActionPerformed(evt);
            }
        });
        getContentPane().add(anuluj, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 280, 60));

        panelszczeg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listazamowionych.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listazamowionych.setToolTipText("");
        listazamowionych.setEnabled(false);
        jScrollPane1.setViewportView(listazamowionych);

        panelszczeg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 630, -1));

        imnazw1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        imnazw1.setText("Zamówiono:");
        panelszczeg.add(imnazw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 104, 31));

        getContentPane().add(panelszczeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 810, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void potwierdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potwierdzActionPerformed
        JOptionPane.showMessageDialog(null, "Zamówienie zostało przekazane do realizacji");
        Zamowienia zam = new Zamowienia();
        zam.setLocationRelativeTo(null);
        zam.setVisible(true);
        dispose();
    }//GEN-LAST:event_potwierdzActionPerformed

    private void anulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anulujActionPerformed
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt1 = con.createStatement();
            stmt1.executeUpdate(
                    "delete from szcz_o_skl where id_szcz_o_pizzy in "
                    + "(select id_szcz_o_pizzy from szcz_o_pizzy where id_zam=(select max(id_zam) from zamowienie))"
            );
            stmt1.executeUpdate(
                    "delete from szcz_o_pizzy where id_zam=(select max(id_zam) from zamowienie)"
            );
            stmt1.executeUpdate(
                    "delete from szcz_o_napoju where id_zam=(select max(id_zam) from zamowienie)"
            );
            stmt1.executeUpdate(
                    "delete from zamowienie where id_zam=(select max(id_zam) from zamowienie)"
            );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nie udało się!");
        }
        Zamowienia zam = new Zamowienia();
        zam.setLocationRelativeTo(null);
        zam.setVisible(true);
        dispose();
    }//GEN-LAST:event_anulujActionPerformed

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
            java.util.logging.Logger.getLogger(Szczegoly_zamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szczegoly_zamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szczegoly_zamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szczegoly_zamowienia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szczegoly_zamowienia().setVisible(true);
            }
        });
    }

    void pobierzdane() {
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt2 = con.createStatement();
            res2 = stmt2.executeQuery(
                    "select * from ZAMOWIENIE Z join PRACOWNICY  P ON Z.ID_PRAC=P.ID_PRAC where id_zam=(select max(id_zam) from ZAMOWIENIE)"
               );
            while (res2.next()) {

                String login = res2.getString("login");
                pracownik.setText(login);
                String forma = res2.getString("forma");
                String data = res2.getString("data_zam");
                datazam.setText(data);
                String platn = res2.getString("platnosc");
                if (platn.equals("K")) {
                    platn = " karta";
                } else {
                    platn = " gotówka";
                }
                forma_oplaty.setText(platn);
                String wart = res2.getDouble("wartosc") + "";
                wartosc.setText(wart + " zł");
                if (forma.equals("D")) {
                    forma = " w dostawie";
                    panel_klient.setVisible(true);
                    try {
                        con = DriverManager.getConnection(
                                "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
                        );
                        stmt3 = con.createStatement();
                        res3 = stmt3.executeQuery(
                                "select * from ZAMOWIENIE Z join PRACOWNICY  P ON Z.ID_PRAC=P.ID_PRAC join KLIENCI K ON Z.ID_KLIENTA=K.ID_KLIENTA where id_zam=(select max(id_zam) from ZAMOWIENIE)"
                        );
                        while (res3.next()) {
                            String imienazwisko = res3.getString("IMIE_NAZWISKO");
                            imie_nazwisko.setText(imienazwisko);
                            String adres = res3.getString("adres");
                            poleadres.setText(adres);
                            String tel = res3.getInt("nr_tel") + "";
                            telefon.setText(tel);
                        }
                    } catch (SQLException ex) {

                    }
                } else {
                    forma = " w lokalu";
                    panel_klient.setVisible(false);
                }
                forma_zamowienia.setText(forma);
            }
            dodajpizzedozamowienia();
            dodajnapojdozamowienia();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nie udało się!");
        }
    }

    void dodajnapojdozamowienia() {
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt2 = con.createStatement();
            res2 = stmt2.executeQuery(
                    "select * from ZAMOWIENIE Z join SZCZ_O_NAPOJU AS N on Z.ID_ZAM=N.ID_ZAM"
                    + " join MENU_NAPOJE AS M on N.ID_NAPOJU=M.ID_NAPOJU"
                    + " where Z.id_zam=(select max(id_zam) from ZAMOWIENIE)"
            );
            while (res2.next()) {
                int ilenapojow = res2.getInt("ile_sztuk_nap");
                String napoj = ilenapojow + "";
                napoj += "x " + res2.getString("nazwa_napoju");
                if (ilenapojow > 0) {
                    model.addElement(napoj);
                }
            }
            listazamowionych.setModel(model);
        } catch (SQLException ex) {
        }
    }

    void dodajpizzedozamowienia() {
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt2 = con.createStatement();
            res2 = stmt2.executeQuery(
                    "select * from ZAMOWIENIE Z join SZCZ_O_PIZZY AS SP on Z.ID_ZAM=SP.ID_ZAM"
                    + " join MENU_PIZZA AS MP on SP.ID_PIZZY=MP.ID_PIZZY where Z.id_zam=(select max(id_zam) from ZAMOWIENIE)"
            );
            while (res2.next()) {
                int idszcz = res2.getInt("id_szcz_o_pizzy");
                int ilepizzy = res2.getInt("ile_sztuk_p");
                String pizza = ilepizzy + "";
                pizza += "x " + res2.getString("nazwa");
                pizza += " " + res2.getString("rozmiar");
                String ciasto = res2.getString("ciasto");
                if (ciasto.contains("grube")) {
                    pizza += " na grubym cieście";
                } else if (ciasto.contains("cienkie")) {
                    pizza += " na cienkim cieście";
                }
                pizza += " " + dodajskladniki(idszcz);
                if (ilepizzy > 0) {
                    model.addElement(pizza);
                }
            }
            listazamowionych.setModel(model);
        } catch (SQLException ex) {
        }
    }

    String dodajskladniki(int idszcz) {
        String skladnik = "";
        try {
            con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BazaPizzerii", "pizzeria", "pizzeria"
            );
            stmt4 = con.createStatement();
            res4 = stmt4.executeQuery(
                    "select * from ZAMOWIENIE AS Z join SZCZ_O_PIZZY AS SP on Z.ID_ZAM=SP.ID_ZAM"
                    + " join SZCZ_O_SKL AS SS on SP.ID_SZCZ_O_PIZZY=SS.ID_SZCZ_O_PIZZY"
                    + " JOIN SKLADNIKI AS S ON SS.ID_SKLADNIKA=S.ID_SKLADNIKA"
                    + " where Z.id_zam=(select max(id_zam) from ZAMOWIENIE)"
                    + " and sp.id_szcz_o_pizzy=" + idszcz
            );
            while (res4.next()) {
                skladnik += "+ " + res4.getString("nazwa") + ", ";
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Brak połączenia z bazą danych!");
        }
        if (skladnik.length() > 0) {
            return skladnik.substring(0, skladnik.length() - 2);
        } else {
            return "";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anuluj;
    private javax.swing.JTextField datazam;
    private javax.swing.JLabel fo;
    private javax.swing.JLabel fo1;
    private javax.swing.JTextField forma_oplaty;
    private javax.swing.JTextField forma_zamowienia;
    private javax.swing.JLabel fz;
    private javax.swing.JTextField imie_nazwisko;
    private javax.swing.JLabel imnazw;
    private javax.swing.JLabel imnazw1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listazamowionych;
    private javax.swing.JPanel panel_klient;
    private javax.swing.JPanel panelszczeg;
    private javax.swing.JTextField poleadres;
    private javax.swing.JButton potwierdz;
    private javax.swing.JLabel prac;
    private javax.swing.JLabel prac1;
    private javax.swing.JTextField pracownik;
    private javax.swing.JLabel szczegoly;
    private javax.swing.JTextField telefon;
    private javax.swing.JTextField wartosc;
    // End of variables declaration//GEN-END:variables
}
