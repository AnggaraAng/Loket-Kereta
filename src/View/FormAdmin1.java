package View;

import Model.DataAdmin;
import Model.DataDiri;
import controler.Connector;
import controler.DAOAdmin;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAdmin1 extends javax.swing.JFrame {
    
    Connection conn;
    List<DataAdmin> listDataAdmin = new ArrayList<>();
    String pilihid;
    DataAdmin data;
    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "NAMA KERETA", "TUJUAN", "STASIUN ASAL", "STASIUN TUJUAN", "KEBERANGKATAN", "KEDATANGAN", "KELAS", "HARGA"}, 0);
    List<Model.DataAdmin> lps = new ArrayList<>();
    
    public FormAdmin1() {
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        bindingDAOAdmin(null);
    }
    
    public FormAdmin1(List<Model.DataAdmin> ls) throws SQLException {
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        conn = new Connector().getConn();
        lps = ls;
        this.data = data;
        for (Model.DataAdmin x : ls) {
            
            String id_kereta = x.getId_kereta();
            String Nama_kereta = x.getNama_kereta();
            String Tujuan = x.getTujuan();
            String Stasiun_asal = x.getStasal();
            String Stasiun_tujuan = x.getSttujuan();
            String Keberangkatan = x.getKeberangkatan();
            String Kedatangan = x.getKedatangan();
            String Kelas = x.getKelas();
            int harga = x.getHarga();
            model.addRow(new Object[]{id_kereta, Nama_kereta, Tujuan, Stasiun_asal, Stasiun_tujuan, Keberangkatan, Kedatangan, Kelas, harga});
            tbl_kereta.setModel(model);
        }
    }
    
    public void bindingDAOAdmin(String cari) {
        if (cari == null) {
            cari = "";
        }
        lps = new DAOAdmin().getAllDataAdmin();
        Object[][] o = new Object[lps.size()][10];
        for (int i = 0; i < lps.size(); i++) {
            
            o[i][0] = lps.get(i).getId_kereta();
            o[i][1] = lps.get(i).getNama_kereta();
            o[i][2] = lps.get(i).getTujuan();
            o[i][3] = lps.get(i).getStasal();
            o[i][4] = lps.get(i).getSttujuan();
            o[i][5] = lps.get(i).getKeberangkatan();
            o[i][6] = lps.get(i).getKedatangan();
            o[i][7] = lps.get(i).getKelas();
            o[i][8] = lps.get(i).getHarga();
            
        }
        tbl_kereta.setModel(new javax.swing.table.DefaultTableModel(
                o,
                new String[]{
                    "id kereta", "Nama kereta", "Tujuan", "Stasiun Asal", "Stasiun Tujuan", "Keberangkatan", "Kedatangan", "Kelas", "Harga"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }
    
    public void resetForm() {
        txt_idkereta.setText("ID KERETA");
        txt_namakereta.setText("NAMA KERETA");
        txt_tujuan.setText("TUJUAN");
        txt_stasal.setText("STASIUS ASAL");
        txt_sttujuan.setText("STASIUN TUJUAN");
        txt_berangkat.setText("BERANGKAT");
        txt_datang.setText("DATANG");
        cb_kelas.setSelectedIndex(0);
        txt_harga.setText("HARGA");
        btn_insert.setEnabled(true);
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_namakereta = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_tujuan = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txt_stasal = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txt_sttujuan = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txt_berangkat = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txt_datang = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        cb_kelas = new javax.swing.JComboBox<String>();
        jSeparator10 = new javax.swing.JSeparator();
        txt_harga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kereta = new javax.swing.JTable();
        txt_idkereta = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_insert = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_update = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(62, 82, 96));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATA ADMIN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 310, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 310, 10));

        txt_namakereta.setBackground(new java.awt.Color(62, 82, 96));
        txt_namakereta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namakereta.setForeground(new java.awt.Color(255, 255, 255));
        txt_namakereta.setText("NAMA KERETA");
        txt_namakereta.setBorder(null);
        txt_namakereta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_namakeretaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_namakeretaFocusLost(evt);
            }
        });
        jPanel2.add(txt_namakereta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 310, 40));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 310, 10));

        txt_tujuan.setBackground(new java.awt.Color(62, 82, 96));
        txt_tujuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tujuan.setForeground(new java.awt.Color(255, 255, 255));
        txt_tujuan.setText("TUJUAN");
        txt_tujuan.setBorder(null);
        txt_tujuan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_tujuanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_tujuanFocusLost(evt);
            }
        });
        jPanel2.add(txt_tujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 310, 40));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 310, 10));

        txt_stasal.setBackground(new java.awt.Color(62, 82, 96));
        txt_stasal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_stasal.setForeground(new java.awt.Color(255, 255, 255));
        txt_stasal.setText("STASIUN ASAL");
        txt_stasal.setBorder(null);
        txt_stasal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_stasalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_stasalFocusLost(evt);
            }
        });
        jPanel2.add(txt_stasal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 310, 40));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 310, 10));

        txt_sttujuan.setBackground(new java.awt.Color(62, 82, 96));
        txt_sttujuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_sttujuan.setForeground(new java.awt.Color(255, 255, 255));
        txt_sttujuan.setText("STASIUN TUJUAN");
        txt_sttujuan.setBorder(null);
        txt_sttujuan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_sttujuanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_sttujuanFocusLost(evt);
            }
        });
        jPanel2.add(txt_sttujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 310, 40));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 310, 10));

        txt_berangkat.setBackground(new java.awt.Color(62, 82, 96));
        txt_berangkat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_berangkat.setForeground(new java.awt.Color(255, 255, 255));
        txt_berangkat.setText("KEBERANGKATAN");
        txt_berangkat.setBorder(null);
        txt_berangkat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_berangkatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_berangkatFocusLost(evt);
            }
        });
        jPanel2.add(txt_berangkat, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 310, 40));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 310, 10));

        txt_datang.setBackground(new java.awt.Color(62, 82, 96));
        txt_datang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_datang.setForeground(new java.awt.Color(255, 255, 255));
        txt_datang.setText("KEDATANGAN");
        txt_datang.setBorder(null);
        txt_datang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_datangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_datangFocusLost(evt);
            }
        });
        jPanel2.add(txt_datang, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 310, 40));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 310, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("KELAS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 60, 40));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 50, 10));

        cb_kelas.setBackground(new java.awt.Color(28, 38, 45));
        cb_kelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_kelas.setForeground(new java.awt.Color(255, 255, 255));
        cb_kelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ekonomi", "Bisnis", "Eksekutif" }));
        cb_kelas.setBorder(null);
        jPanel2.add(cb_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 210, 30));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 310, 10));

        txt_harga.setBackground(new java.awt.Color(62, 82, 96));
        txt_harga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_harga.setForeground(new java.awt.Color(255, 255, 255));
        txt_harga.setText("HARGA");
        txt_harga.setBorder(null);
        txt_harga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_hargaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_hargaFocusLost(evt);
            }
        });
        jPanel2.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 310, 40));

        tbl_kereta.setBackground(new java.awt.Color(28, 38, 45));
        tbl_kereta.setForeground(new java.awt.Color(255, 255, 255));
        tbl_kereta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_kereta.setToolTipText("");
        tbl_kereta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tbl_kereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_keretaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_kereta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 1300, 310));

        txt_idkereta.setBackground(new java.awt.Color(62, 82, 96));
        txt_idkereta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idkereta.setForeground(new java.awt.Color(255, 255, 255));
        txt_idkereta.setText("ID KERETA");
        txt_idkereta.setBorder(null);
        txt_idkereta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_idkeretaFocusLost(evt);
            }
        });
        txt_idkereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_idkeretaMouseClicked(evt);
            }
        });
        jPanel2.add(txt_idkereta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 310, 40));

        jPanel3.setBackground(new java.awt.Color(28, 38, 45));

        btn_insert.setBackground(new java.awt.Color(28, 38, 45));
        btn_insert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_insert.setForeground(new java.awt.Color(255, 255, 255));
        btn_insert.setText("INSERT");
        btn_insert.setBorder(null);
        btn_insert.setBorderPainted(false);
        btn_insert.setContentAreaFilled(false);
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 90, 30));

        jPanel4.setBackground(new java.awt.Color(28, 38, 45));

        btn_update.setBackground(new java.awt.Color(28, 38, 45));
        btn_update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("UPDATE");
        btn_update.setBorder(null);
        btn_update.setBorderPainted(false);
        btn_update.setContentAreaFilled(false);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, -1, -1));

        jPanel5.setBackground(new java.awt.Color(28, 38, 45));

        btn_delete.setBackground(new java.awt.Color(28, 38, 45));
        btn_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("DELETE");
        btn_delete.setBorder(null);
        btn_delete.setBorderPainted(false);
        btn_delete.setContentAreaFilled(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DELY EXPRESS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Satisfaction is My Wealth");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/struck.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        DataAdmin data = new DataAdmin();
        data.setId_kereta(txt_idkereta.getText());
        data.setNama_kereta(txt_namakereta.getText());
        data.setTujuan(txt_tujuan.getText());
        data.setStasal(txt_stasal.getText());
        data.setSttujuan(txt_sttujuan.getText());
        data.setKeberangkatan(txt_berangkat.getText());
        data.setKedatangan(txt_datang.getText());
        data.setKelas(cb_kelas.getSelectedItem().toString());
        data.setHarga(Integer.parseInt(txt_harga.getText()));
        
        if (new DAOAdmin().insertDataAdmin(data)) {
            JOptionPane.showMessageDialog(this, "Data Jadwal berhasil disimpan");
            resetForm();
            bindingDAOAdmin(null);
        } else {
            JOptionPane.showMessageDialog(this, "Data Jadwal gagal disimpan !");
        }
    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Apakah Anda akan update jadwal ini ?", "Update Jadwal", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            DataAdmin data = new DataAdmin();
            data.setId_kereta(txt_idkereta.getText());
            data.setNama_kereta(txt_namakereta.getText());
            data.setTujuan(txt_tujuan.getText());
            data.setStasal(txt_stasal.getText());
            data.setSttujuan(txt_sttujuan.getText());
            data.setKeberangkatan(txt_berangkat.getText());
            data.setKedatangan(txt_datang.getText());
            data.setKelas(cb_kelas.getSelectedItem().toString());
            data.setHarga(Integer.parseInt(txt_harga.getText()));
            
            if (new DAOAdmin().updateDataAdmin(data, pilihid)) {
                JOptionPane.showMessageDialog(this, "Data jadwal berhasil diupdate");
                resetForm();
                bindingDAOAdmin(null);
            } else {
                JOptionPane.showMessageDialog(this, "Data jadwal gagal disimpan !");
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Apakah Anda akan delete jadwal ini ?", "Delete Jadwal", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (new DAOAdmin().deleteDataAdmin(pilihid)) {
                JOptionPane.showMessageDialog(this, "Data Jadwal berhasil didelete");
                resetForm();
                bindingDAOAdmin(null);
            } else {
                JOptionPane.showMessageDialog(this, "Data Jadwal gagal didelete");
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tbl_keretaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_keretaMouseClicked
        int row = tbl_kereta.getSelectedRow();
        pilihid = lps.get(row).getId_kereta();
        if (row >= 0) {
            txt_idkereta.setText(lps.get(row).getId_kereta());
            txt_namakereta.setText(lps.get(row).getNama_kereta());
            txt_tujuan.setText(lps.get(row).getTujuan());
            txt_stasal.setText(lps.get(row).getStasal());
            txt_sttujuan.setText(lps.get(row).getSttujuan());
            txt_berangkat.setText(lps.get(row).getKeberangkatan());
            txt_datang.setText(lps.get(row).getKedatangan());
            cb_kelas.setSelectedItem(lps.get(row).getKelas());
            txt_harga.setText(lps.get(row).getHarga() + "");
            
            btn_insert.setEnabled(false);
            btn_update.setEnabled(true);
            btn_delete.setEnabled(true);
        }
    }//GEN-LAST:event_tbl_keretaMouseClicked

    private void txt_idkeretaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_idkeretaMouseClicked
        txt_idkereta.setText(null);
    }//GEN-LAST:event_txt_idkeretaMouseClicked

    private void txt_idkeretaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_idkeretaFocusLost
        if (txt_idkereta.getText().equals("")) {
            txt_idkereta.setText("ID KERETA");
        } else {
            
        }

    }//GEN-LAST:event_txt_idkeretaFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "Anda Sudah Keluar");
        new Choice().show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_namakeretaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_namakeretaFocusGained
        txt_namakereta.setText(null);
    }//GEN-LAST:event_txt_namakeretaFocusGained

    private void txt_namakeretaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_namakeretaFocusLost
        if (txt_namakereta.getText().equals("")) {
            txt_namakereta.setText("NAMA KERETA");
        } else {
            
        }
    }//GEN-LAST:event_txt_namakeretaFocusLost

    private void txt_tujuanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tujuanFocusGained
        txt_tujuan.setText(null);
    }//GEN-LAST:event_txt_tujuanFocusGained

    private void txt_tujuanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_tujuanFocusLost
        if (txt_tujuan.getText().equals("")) {
            txt_tujuan.setText("TUJUAN");
        } else {
            
        }
    }//GEN-LAST:event_txt_tujuanFocusLost

    private void txt_stasalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_stasalFocusGained
        txt_stasal.setText(null);
    }//GEN-LAST:event_txt_stasalFocusGained

    private void txt_stasalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_stasalFocusLost
        if (txt_stasal.getText().equals("")) {
            txt_stasal.setText("STASIUN ASAL");
        } else {
            
        }
    }//GEN-LAST:event_txt_stasalFocusLost

    private void txt_sttujuanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_sttujuanFocusGained
        txt_sttujuan.setText(null);
    }//GEN-LAST:event_txt_sttujuanFocusGained

    private void txt_sttujuanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_sttujuanFocusLost
        if (txt_sttujuan.getText().equals("")) {
            txt_sttujuan.setText("STASIUN TUJUAN");
        } else {
            
        }
    }//GEN-LAST:event_txt_sttujuanFocusLost

    private void txt_berangkatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_berangkatFocusGained
        txt_berangkat.setText(null);
    }//GEN-LAST:event_txt_berangkatFocusGained

    private void txt_berangkatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_berangkatFocusLost
        if (txt_berangkat.getText().equals("")) {
            txt_berangkat.setText("KEBERANGKAT");
        } else {
            
        }
    }//GEN-LAST:event_txt_berangkatFocusLost

    private void txt_datangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_datangFocusGained
        txt_datang.setText(null);
    }//GEN-LAST:event_txt_datangFocusGained

    private void txt_datangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_datangFocusLost
        if (txt_datang.getText().equals("")) {
            txt_datang.setText("KEDATANGAN");
        } else {
            
        }
    }//GEN-LAST:event_txt_datangFocusLost

    private void txt_hargaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_hargaFocusGained
      txt_harga.setText(null);
    }//GEN-LAST:event_txt_hargaFocusGained

    private void txt_hargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_hargaFocusLost
        if (txt_harga.getText().equals("")) {
            txt_harga.setText("HARGA");
        } else {
            
        }
    }//GEN-LAST:event_txt_hargaFocusLost

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
            java.util.logging.Logger.getLogger(FormAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdmin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdmin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_kelas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tbl_kereta;
    private javax.swing.JTextField txt_berangkat;
    private javax.swing.JTextField txt_datang;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_idkereta;
    private javax.swing.JTextField txt_namakereta;
    private javax.swing.JTextField txt_stasal;
    private javax.swing.JTextField txt_sttujuan;
    private javax.swing.JTextField txt_tujuan;
    // End of variables declaration//GEN-END:variables

}
