package view;

  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Model.*;
import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WINDOWS 10
 */
public class Menunew extends javax.swing.JFrame {

     private DefaultTableModel mdl = new DefaultTableModel();
    /**
     * Creates new form Menu
     */
     
     int totalHarga =0;
    public Menunew() {
        initComponents();
        mdl.addColumn("Nama");
        mdl.addColumn("Harga");
        mdl.addColumn("jumlah");
        mdl.addColumn("total");
        //Proses SetModel
        TableOrder.setModel(mdl);
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
        Kubistxt = new javax.swing.JButton();
        Kangkungtxt = new javax.swing.JButton();
        Cabaitxt = new javax.swing.JButton();
        KacangPanjangtxt = new javax.swing.JButton();
        Terongtxt = new javax.swing.JButton();
        Tomattxt = new javax.swing.JButton();
        Buncistxt = new javax.swing.JButton();
        Worteltxt = new javax.swing.JButton();
        Timuntxt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableOrder = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        hargaKubis = new javax.swing.JLabel();
        hargaKangkung = new javax.swing.JLabel();
        hargaCabai = new javax.swing.JLabel();
        hargaKacangPanjang = new javax.swing.JLabel();
        hargaTerong = new javax.swing.JLabel();
        hargaTomat = new javax.swing.JLabel();
        hargaBuncis = new javax.swing.JLabel();
        hargaWortel = new javax.swing.JLabel();
        hargaTimun = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        totalsemua = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        Kubistxt.setText("Kubis");
        Kubistxt.setPreferredSize(new java.awt.Dimension(50, 50));
        Kubistxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KubistxtActionPerformed(evt);
            }
        });

        Kangkungtxt.setText("Kangkung");
        Kangkungtxt.setPreferredSize(new java.awt.Dimension(50, 50));
        Kangkungtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KangkungtxtActionPerformed(evt);
            }
        });

        Cabaitxt.setText("Cabai");
        Cabaitxt.setPreferredSize(new java.awt.Dimension(50, 50));
        Cabaitxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CabaitxtActionPerformed(evt);
            }
        });

        KacangPanjangtxt.setText("Kacang Panjang");
        KacangPanjangtxt.setPreferredSize(new java.awt.Dimension(50, 50));
        KacangPanjangtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KacangPanjangtxtActionPerformed(evt);
            }
        });

        Terongtxt.setText("Terong");
        Terongtxt.setPreferredSize(new java.awt.Dimension(50, 50));
        Terongtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerongtxtActionPerformed(evt);
            }
        });

        Tomattxt.setText("Tomat");
        Tomattxt.setPreferredSize(new java.awt.Dimension(50, 50));
        Tomattxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomattxtActionPerformed(evt);
            }
        });

        Buncistxt.setText("Buncis");
        Buncistxt.setPreferredSize(new java.awt.Dimension(50, 50));
        Buncistxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuncistxtActionPerformed(evt);
            }
        });

        Worteltxt.setText("Wortel");
        Worteltxt.setPreferredSize(new java.awt.Dimension(50, 50));

        Timuntxt.setText("Timun");
        Timuntxt.setPreferredSize(new java.awt.Dimension(50, 50));
        Timuntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimuntxtActionPerformed(evt);
            }
        });

        TableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Harga", "Jumlah", "Total"
            }
        ));
        jScrollPane1.setViewportView(TableOrder);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hargaKubis.setText("3000");

        hargaKangkung.setText("3000");

        hargaCabai.setText("12000");

        hargaKacangPanjang.setText("2000");

        hargaTerong.setText("2500");

        hargaTomat.setText("6000");

        hargaBuncis.setText("7000");

        hargaWortel.setText("7500");

        hargaTimun.setText("2500");

        jLabel1.setText("Total Belanjaan : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalsemua, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Buncistxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(Worteltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(Timuntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(KacangPanjangtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(Terongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(Tomattxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Kubistxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(Kangkungtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(Cabaitxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(hargaKubis)
                                .addGap(117, 117, 117)
                                .addComponent(hargaKangkung)
                                .addGap(103, 103, 103)
                                .addComponent(hargaCabai))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(hargaKacangPanjang)
                                .addGap(114, 114, 114)
                                .addComponent(hargaTerong)
                                .addGap(104, 104, 104)
                                .addComponent(hargaTomat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(hargaBuncis)
                                .addGap(124, 124, 124)
                                .addComponent(hargaWortel)
                                .addGap(105, 105, 105)
                                .addComponent(hargaTimun)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Kubistxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kangkungtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cabaitxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaKubis)
                            .addComponent(hargaKangkung)
                            .addComponent(hargaCabai))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KacangPanjangtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Terongtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tomattxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaKacangPanjang)
                            .addComponent(hargaTerong)
                            .addComponent(hargaTomat))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buncistxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Worteltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Timuntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaBuncis)
                            .addComponent(hargaWortel)
                            .addComponent(hargaTimun)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(totalsemua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TimuntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimuntxtActionPerformed
       Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();

        order_model or = new order_model();
        or.setNamaSayur(Timuntxt.getText());
        or.setHargaSayur(hargaTimun.getText());

        String a = Timuntxt.getText();
        String b = hargaTimun.getText();
        int jumlah;
        String input;
        input = JOptionPane.showInputDialog("Masukkan jumlah : ");
        jumlah = Integer.parseInt(input);
        int total;
        int namasayur = Integer.parseInt(b);
        total = jumlah * namasayur;

        Date c = dateOne;
        Object[] x = {a, b, jumlah, total};
        mdl.addRow(x);

        try {
            String sql = "INSERT INTO `data sayur` (`Nama`, `Harga`, `Waktu`, `jumlah`, `total`) VALUES ('" + or.getNamaSayur() 
                    + "','" + or.getHargaSayur() + "','" + dateOne + "','" + jumlah + "','" + total + "')";
            java.sql.Connection conn = (Connection) koneksi.connectDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
           

        } catch (Exception e) {

        }

        totalHarga += 2500;
        total = totalHarga * jumlah;
        totalsemua.setText("" + total);


    }                                        

    private void WorteltxtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();

        order_model or = new order_model();
        or.setNamaSayur(Worteltxt.getText());
        or.setHargaSayur(hargaWortel.getText());

        String a = Worteltxt.getText();
        String b = hargaWortel.getText();

        int jumlah;
        String input;
        input = JOptionPane.showInputDialog("Masukkan jumlah : ");
        jumlah = Integer.parseInt(input);

        int total;
        int namasayur = Integer.parseInt(b);
        total = jumlah * namasayur;

        Date c = dateOne;
        Object[] x = {a, b, jumlah, total};
        mdl.addRow(x);

        try {
            String sql = "INSERT INTO `data sayur` (`Nama`, `Harga`, `Waktu`, `jumlah`, `total`) VALUES ('" + or.getNamaSayur() + "','" + or.getHargaSayur() + "','" + dateOne + "','" + jumlah + "','" + total + "')";
            java.sql.Connection conn = (Connection) koneksi.connectDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            
        } catch (Exception e) {
            
        }
        totalHarga += 7500;
        total = totalHarga * jumlah;
        totalsemua.setText("" + total); 
    }//GEN-LAST:event_TimuntxtActionPerformed

    private void BuncistxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuncistxtActionPerformed
       Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();

        order_model or = new order_model();
        or.setNamaSayur(Buncistxt.getText());
        or.setHargaSayur(hargaBuncis.getText());

        String a = Buncistxt.getText();
        String b = hargaBuncis.getText();

        int jumlah;
        String input;
        input = JOptionPane.showInputDialog("Masukkan jumlah : ");
        jumlah = Integer.parseInt(input);

        int namasayur = Integer.parseInt(b);
        int total = jumlah * namasayur;

        Date c = dateOne;
        Object[] x = {a, b, jumlah, total};
        mdl.addRow(x);

        try {
            String sql = "INSERT INTO `data sayur` (`Nama`, `Harga`, `Waktu`, `jumlah`, `total`) VALUES ('" + or.getNamaSayur() + "','" + or.getHargaSayur() + "','" + dateOne + "','" + jumlah + "','" + total + "')";
            java.sql.Connection conn = (Connection) koneksi.connectDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            
        } catch (Exception e) {

        }
        
        totalHarga += 7000;
        total = totalHarga * jumlah;
        totalsemua.setText("" + total);
    }//GEN-LAST:event_BuncistxtActionPerformed

    private void TomattxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomattxtActionPerformed
        
       Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();

        order_model or = new order_model();
        or.setNamaSayur(Tomattxt.getText());
        or.setHargaSayur(hargaTomat.getText());

        String a = Tomattxt.getText();
        String b = hargaTomat.getText();

        int jumlah;
        String input;
        input = JOptionPane.showInputDialog("Masukkan jumlah : ");
        jumlah = Integer.parseInt(input);

        int namasayur = Integer.parseInt(b);
        int total = jumlah * namasayur;

        Date c = dateOne;
        Object[] x = {a, b, jumlah, total};
        mdl.addRow(x);

        try {
            String sql = "INSERT INTO `data sayur` (`Nama`, `Harga`, `Waktu`, `jumlah`, `total`) VALUES ('" + or.getNamaSayur() + "','" + or.getHargaSayur() + "','" + dateOne + "','" + jumlah + "','" + total + "')";
            java.sql.Connection conn = (Connection) koneksi.connectDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            
        } catch (Exception e) {

        }
        totalHarga += 6000;
        total = totalHarga * jumlah;
        totalsemua.setText("" + total);
    }//GEN-LAST:event_TomattxtActionPerformed

    private void TerongtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerongtxtActionPerformed
      Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();

        order_model or = new order_model();
        or.setNamaSayur(Terongtxt.getText());
        or.setHargaSayur(hargaTerong.getText());

        String a = Terongtxt.getText();
        String b = hargaTerong.getText();

        int jumlah;
        String input;
        input = JOptionPane.showInputDialog("Masukkan jumlah : ");
        jumlah = Integer.parseInt(input);

        int namasayur = Integer.parseInt(b);
        int total = jumlah * namasayur;

        Date c = dateOne;
        Object[] x = {a, b, jumlah, total};
        mdl.addRow(x);

        try {
            String sql = "INSERT INTO `data sayur` (`Nama`, `Harga`, `Waktu`, `jumlah`, `total`) VALUES ('" + or.getNamaSayur() + "','" + or.getHargaSayur() + "','" + dateOne + "','" + jumlah + "','" + total + "')";
            java.sql.Connection conn = (Connection) koneksi.connectDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            
        } catch (Exception e) {

        }
        totalHarga += 2500;
        total = totalHarga * jumlah;
        totalsemua.setText("" + total);
    }//GEN-LAST:event_TerongtxtActionPerformed

    private void KacangPanjangtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KacangPanjangtxtActionPerformed
    Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();

        order_model or = new order_model();
        or.setNamaSayur(KacangPanjangtxt.getText());
        or.setHargaSayur(hargaKacangPanjang.getText());

        String a = KacangPanjangtxt.getText();
        String b = hargaKacangPanjang.getText();

        int jumlah;
        String input;
        input = JOptionPane.showInputDialog("Masukkan jumlah : ");
        jumlah = Integer.parseInt(input);

        int namasayur = Integer.parseInt(b);
        int total = jumlah * namasayur;

        Date c = dateOne;
        Object[] x = {a, b, jumlah, total};
        mdl.addRow(x);

        try {
            String sql = "INSERT INTO `data sayur` (`Nama`, `Harga`, `Waktu`, `jumlah`, `total`) VALUES ('" + or.getNamaSayur() + "','" + or.getHargaSayur() + "','" + dateOne + "','" + jumlah + "','" + total + "')";
            java.sql.Connection conn = (Connection) koneksi.connectDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            
        } catch (Exception e) {

        }
        totalHarga += 2000;
        total = totalHarga * jumlah;
        totalsemua.setText("" + total);
    }//GEN-LAST:event_KacangPanjangtxtActionPerformed

    private void CabaitxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CabaitxtActionPerformed
        
        Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();

        order_model or = new order_model();
        or.setNamaSayur(Cabaitxt.getText());
        or.setHargaSayur(hargaCabai.getText());

        String a = Cabaitxt.getText();
        String b = hargaCabai.getText();

        int jumlah;
        String input;
        input = JOptionPane.showInputDialog("Masukkan jumlah : ");
        jumlah = Integer.parseInt(input);

        int namasayur = Integer.parseInt(b);
        int total = jumlah * namasayur;

        Date c = dateOne;
        Object[] x = {a, b, jumlah, total};
        mdl.addRow(x);

        try {
            String sql = "INSERT INTO `data sayur` (`Nama`, `Harga`, `Waktu`, `jumlah`, `total`) VALUES ('" + or.getNamaSayur() + "','" + or.getHargaSayur() + "','" + dateOne + "','" + jumlah + "','" + total + "')";
            java.sql.Connection conn = (Connection) koneksi.connectDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            
        } catch (Exception e) {

        }
        totalHarga += 12000;
        total = totalHarga * jumlah;
        totalsemua.setText("" + total);
    }//GEN-LAST:event_CabaitxtActionPerformed

    private void KangkungtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KangkungtxtActionPerformed
        Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();

        order_model or = new order_model();
        or.setNamaSayur(Kangkungtxt.getText());
        or.setHargaSayur(hargaKangkung.getText());

        String a = Kangkungtxt.getText();
        String b = hargaKangkung.getText();

        int jumlah;
        String input;
        input = JOptionPane.showInputDialog("Masukkan jumlah : ");
        jumlah = Integer.parseInt(input);

        int namasayur = Integer.parseInt(b);
        int total = jumlah * namasayur;

        Date c = dateOne;
        Object[] x = {a, b, jumlah, total};
        mdl.addRow(x);

        try {
            String sql = "INSERT INTO `data sayur` (`Nama`, `Harga`, `Waktu`, `jumlah`, `total`) VALUES ('" + or.getNamaSayur() + "','" + or.getHargaSayur() + "','" + dateOne + "','" + jumlah + "','" + total + "')";
            java.sql.Connection conn = (Connection) koneksi.connectDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            
        } catch (Exception e) {

        }
        totalHarga += 3000;
        total = totalHarga * jumlah;
        totalsemua.setText("" + total);
    }//GEN-LAST:event_KangkungtxtActionPerformed

    private void KubistxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KubistxtActionPerformed
       Calendar c1 = Calendar.getInstance();
        Date dateOne = c1.getTime();

        order_model or = new order_model();
        or.setNamaSayur(Kubistxt.getText());
        or.setHargaSayur(hargaKubis.getText());

        String a = Kubistxt.getText();
        String b = hargaKubis.getText();

        int jumlah;
        String input;
        input = JOptionPane.showInputDialog("Masukkan jumlah : ");
        jumlah = Integer.parseInt(input);

        int namasayur = Integer.parseInt(b);
        int total = jumlah * namasayur;

        Date c = dateOne;
        Object[] x = {a, b, jumlah, total};
        mdl.addRow(x);

        try {
            String sql = "INSERT INTO `data sayur` (`Nama`, `Harga`, `Waktu`, `jumlah`, `total`) VALUES ('" + or.getNamaSayur() + "','" + or.getHargaSayur() + "','" + dateOne + "','" + jumlah + "','" + total + "')";
            java.sql.Connection conn = (Connection) koneksi.connectDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            
        } catch (Exception e) {

        }
        totalHarga += total;
        totalsemua.setText("" + totalHarga);
    }//GEN-LAST:event_KubistxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Pesanan telah dikirim. Mohon menunggu :)");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menunew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menunew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menunew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menunew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menunew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buncistxt;
    private javax.swing.JButton Cabaitxt;
    private javax.swing.JButton KacangPanjangtxt;
    private javax.swing.JButton Kangkungtxt;
    private javax.swing.JButton Kubistxt;
    private javax.swing.JTable TableOrder;
    private javax.swing.JButton Terongtxt;
    private javax.swing.JButton Timuntxt;
    private javax.swing.JButton Tomattxt;
    private javax.swing.JButton Worteltxt;
    private javax.swing.JLabel hargaBuncis;
    private javax.swing.JLabel hargaCabai;
    private javax.swing.JLabel hargaKacangPanjang;
    private javax.swing.JLabel hargaKangkung;
    private javax.swing.JLabel hargaKubis;
    private javax.swing.JLabel hargaTerong;
    private javax.swing.JLabel hargaTimun;
    private javax.swing.JLabel hargaTomat;
    private javax.swing.JLabel hargaWortel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField totalsemua;
    // End of variables declaration//GEN-END:variables
}
