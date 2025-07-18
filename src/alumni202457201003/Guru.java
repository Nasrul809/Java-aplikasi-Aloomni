/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package alumni202457201003;
import  java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hype GLK
 */
public class Guru extends javax.swing.JPanel {

    /**
     * Creates new form Guru
     */
    public Guru() {
        initComponents();
        reset();
        load_tabel_guru();
    }
    
    void reset(){
        tNIP.setText(null);
        tNIP.setEditable(true);
        tNamaGuru.setText(null);
        cJenisKelamin.setSelectedItem(null);
        tAlamat.setText(null);
    }
    
    void load_tabel_guru(){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("NIP");
        model.addColumn("Nama Guru");
        model.addColumn("L/P");
        model.addColumn("Alamat");
        
        String sql = "SELECT * FROM guru";
        
        try {
            Connection conn = koneksi.Konek();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                 String NIP = rs.getString("nip");
                 String namaGuru = rs.getString("nama_guru");
                 String jenisKelamin = rs.getString("gender");
                 String alamat = rs.getString("alamat");
                 
                 Object[] baris = {NIP, namaGuru, jenisKelamin, alamat};
                 model.addRow(baris);   
            }
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Gagal mengambil data!");
        }
        tblGuru.setModel(model);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tNIP = new javax.swing.JTextField();
        tNamaGuru = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cJenisKelamin = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tAlamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGuru = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Guru");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201003/icons8-cross-sign-20 (1).png"))); // NOI18N
        jButton1.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 733, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("NIP");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        cJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - laki", "Perempuan" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Alamat");

        tblGuru.setModel(new javax.swing.table.DefaultTableModel(
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
        tblGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGuruMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGuru);

        btnTambah.setBackground(new java.awt.Color(0, 153, 0));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201003/icons8-plus-20.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(255, 51, 0));
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201003/icons8-update-20.png"))); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201003/icons8-full-trash-20.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 0, 255));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alumni202457201003/icons8-reset-20.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tNamaGuru)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cJenisKelamin, javax.swing.GroupLayout.Alignment.LEADING, 0, 269, Short.MAX_VALUE)
                    .addComponent(tAlamat, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(278, 278, 278))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus)
                            .addComponent(btnReset)
                            .addComponent(btnTambah)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNamaGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        String NIP = tNIP.getText();
        String namaGuru = tNamaGuru.getText();
        String jenisKelamin = cJenisKelamin.getSelectedItem().toString();
        String alamat = tAlamat.getText();
        String jk = null;
        
        switch (jenisKelamin) {
            case "Laki-laki":
                jk = "L";
                break;
            case "Perempuan":
                jk = "P";
                break;
            default:
                jk=null;
                break;
        }
        String sql = "UPDATE guru SET nama_guru=?, gender=?, alamat=? WHERE nip=?";
        try {
            Connection conn = koneksi.Konek();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, namaGuru);
            ps.setString(2,jk);
            ps.setString(3, alamat);
            ps.setString(4, NIP);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah!");
        }
        load_tabel_guru();
        reset();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void tblGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGuruMouseClicked
        // TODO add your handling code here:
        int barisYangDipilih = tblGuru.rowAtPoint(evt.getPoint());
        String NIP = tblGuru.getValueAt(barisYangDipilih, 0).toString();
        String namaGuru = tblGuru.getValueAt(barisYangDipilih, 1).toString();
        String jenisKelamin = tblGuru.getValueAt(barisYangDipilih, 2).toString();
        String alamat = tblGuru.getValueAt(barisYangDipilih, 3).toString();
        
        tNIP.setText(NIP);
        tNIP.setEditable(false);
        tNamaGuru.setText(namaGuru);
        tAlamat.setText(alamat);
        
        switch (jenisKelamin) {
            case "L":
                cJenisKelamin.setSelectedItem("Laki - laki");
                break;
            case "P":
                cJenisKelamin.setSelectedItem("Perempuan");
                break;
            default:
                cJenisKelamin.setSelectedItem(null);
                break;
        }
        
    }//GEN-LAST:event_tblGuruMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String NIP = tNIP.getText();
        String namaGuru = tNamaGuru.getText();
        String jenisKelamin = cJenisKelamin.getSelectedItem().toString();
        String alamat = tAlamat.getText();
        String jk = null;
        
        switch (jenisKelamin) {
            case "Laki-laki":
                jk = "L";
                break;
            case "Perempuan":
                jk = "P";
                break;
            default:
                jk=null;
                break;
        }
        String sql = "INSERT INTO guru(nip, nama_guru, gender, alamat) VALUES (?,?,?,?)";
        
        try {
            Connection conn = koneksi.Konek();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, NIP);
            ps.setString(2,namaGuru);
            ps.setString(3, jk);
            ps.setString(4, alamat);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan!");
        }
        load_tabel_guru();
        reset();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        String NIP = tNIP.getText();
        String sql = "DELETE FROM guru WHERE nip=?";
        
        try {
            Connection conn = koneksi.Konek();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, NIP);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        } catch (SQLException sQLException) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus!");
        }
        load_tabel_guru();
        reset();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cJenisKelamin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tAlamat;
    private javax.swing.JTextField tNIP;
    private javax.swing.JTextField tNamaGuru;
    private javax.swing.JTable tblGuru;
    // End of variables declaration//GEN-END:variables
}
