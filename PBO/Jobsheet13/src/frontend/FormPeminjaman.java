package frontend;

/**
 *
 */
import backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FormPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FrmPeminjaman
     */
    public FormPeminjaman() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }

    public void kosongkanForm() {
        txtIdPeminjaman.setText("0");
        txtIdAnggota.setText("");
        txtIdBuku.setText("");
        txtTanggalPinjam.setText("");
        txtTanggalKembali.setText("");
        lblNamaAnggota.setText("-");
        lblJudulBuku.setText("-");
    }

    public void tampilkanData() {
        String[] kolom = {"ID", "Nama Anggota", "Judul Buku", "Tgl Pinjam", "Tgl Kembali"};
        ArrayList<Peminjaman> list = new Peminjaman().getAll();
        Object rowData[] = new Object[5];

        tblPeminjaman.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (Peminjaman pem : list) {
            rowData[0] = pem.getIdpeminjaman();
            rowData[1] = pem.getAnggota().getNama();
            rowData[2] = pem.getBuku().getJudul();
            rowData[3] = pem.getTanggalPinjam();
            rowData[4] = pem.getTanggalKembali();

            ((DefaultTableModel) tblPeminjaman.getModel()).addRow(rowData);
        }
    }    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdPeminjaman = new javax.swing.JTextField();
        txtIdAnggota = new javax.swing.JTextField();
        txtIdBuku = new javax.swing.JTextField();
        txtTanggalPinjam = new javax.swing.JTextField();
        txtTanggalKembali = new javax.swing.JTextField();
        btnCariAnggota = new javax.swing.JButton();
        btnCariBuku = new javax.swing.JButton();
        lblNamaAnggota = new javax.swing.JLabel();
        lblJudulBuku = new javax.swing.JLabel();
        lblPinjam = new javax.swing.JLabel();
        lblKembali = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Peminjaman");

        jLabel2.setText("ID Anggota");

        jLabel3.setText("ID Buku");

        jLabel4.setText("Tanggal Pinjam");

        jLabel5.setText("Tanggal Kembali");

        txtIdPeminjaman.setEditable(false);

        btnCariAnggota.setText("Cari");
        btnCariAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariAnggotaActionPerformed(evt);
            }
        });

        btnCariBuku.setText("Cari");
        btnCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariBukuActionPerformed(evt);
            }
        });

        lblNamaAnggota.setText("Nama Anggota");

        lblJudulBuku.setText("Judul Buku");

        lblPinjam.setText("YYYY/MM/DD");

        lblKembali.setText("YYYY/MM/DD");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTanggalPinjam)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtIdPeminjaman)
                                            .addComponent(txtIdAnggota)
                                            .addComponent(txtIdBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCariAnggota)
                                            .addComponent(btnCariBuku)))
                                    .addComponent(txtTanggalKembali))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNamaAnggota)
                                    .addComponent(lblJudulBuku)
                                    .addComponent(lblPinjam)
                                    .addComponent(lblKembali)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambahBaru)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariAnggota)
                    .addComponent(lblNamaAnggota))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariBuku)
                    .addComponent(lblJudulBuku))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPinjam))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKembali))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnTambahBaru)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblPeminjaman.getModel();
        int row = tblPeminjaman.getSelectedRow();

        Peminjaman pem = new Peminjaman().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        pem.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariAnggotaActionPerformed
        if (!txtIdAnggota.getText().isEmpty()) {
            Anggota anggota = new Anggota().getById(Integer.parseInt(txtIdAnggota.getText()));
            if (anggota != null && anggota.getIdanggota() != 0) {
                lblNamaAnggota.setText(anggota.getNama());
            }
        }
    }//GEN-LAST:event_btnCariAnggotaActionPerformed

    private void btnCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariBukuActionPerformed
        if (!txtIdBuku.getText().isEmpty()) {
            Buku buku = new Buku().getById(Integer.parseInt(txtIdBuku.getText()));
            if (buku != null && buku.getIdBuku() != 0) {
                lblJudulBuku.setText(buku.getJudul());
            }
        }
    }//GEN-LAST:event_btnCariBukuActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            // Validasi input
            if (txtIdAnggota.getText().trim().isEmpty()
                    || txtIdBuku.getText().trim().isEmpty()
                    || txtTanggalPinjam.getText().trim().isEmpty()
                    || txtTanggalKembali.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Semua field harus diisi!");
                return;
            }

            Peminjaman pem = new Peminjaman();
            pem.setIdpeminjaman(Integer.parseInt(txtIdPeminjaman.getText()));

            Anggota anggota = new Anggota().getById(Integer.parseInt(txtIdAnggota.getText()));
            if (anggota.getIdanggota()== 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Anggota tidak ditemukan!");
                return;
            }
            pem.setAnggota(anggota);

            Buku buku = new Buku().getById(Integer.parseInt(txtIdBuku.getText()));
            if (buku.getIdBuku() == 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Buku tidak ditemukan!");
                return;
            }
            pem.setBuku(buku);

            pem.setTanggalPinjam(txtTanggalPinjam.getText());
            pem.setTanggalKembali(txtTanggalKembali.getText());

            pem.save();
            txtIdPeminjaman.setText(Integer.toString(pem.getIdpeminjaman()));
            tampilkanData();
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "ID harus berupa angka!");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Terjadi error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblPeminjaman.getModel();
        int row = tblPeminjaman.getSelectedRow();

        if (row >= 0) {
            Peminjaman pem = new Peminjaman().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));

            txtIdPeminjaman.setText(String.valueOf(pem.getIdpeminjaman()));
            txtIdAnggota.setText(String.valueOf(pem.getAnggota().getIdanggota()));
            txtIdBuku.setText(String.valueOf(pem.getBuku().getIdBuku()));
            txtTanggalPinjam.setText(pem.getTanggalPinjam());
            txtTanggalKembali.setText(pem.getTanggalKembali());
            lblNamaAnggota.setText(pem.getAnggota().getNama());
            lblJudulBuku.setText(pem.getBuku().getJudul());
        }
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    /**
     * @param args the command line arguments
     */
    /**
 * @param args the command line arguments
 */
        public static void main(String[] args) {
        // Mengatur Look and Feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.err.println("Gagal mengatur Look and Feel. Error: " + ex.getMessage());
        }

        // Membuat dan menampilkan form
        java.awt.EventQueue.invokeLater(() -> {
            try {
                System.out.println("Aplikasi sedang berjalan...");
                new FormPeminjaman().setVisible(true);
            } catch (Exception ex) {
                System.err.println("Terjadi kesalahan saat menjalankan aplikasi: " + ex.getMessage());
                ex.printStackTrace();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariAnggota;
    private javax.swing.JButton btnCariBuku;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJudulBuku;
    private javax.swing.JLabel lblKembali;
    private javax.swing.JLabel lblNamaAnggota;
    private javax.swing.JLabel lblPinjam;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtIdPeminjaman;
    private javax.swing.JTextField txtTanggalKembali;
    private javax.swing.JTextField txtTanggalPinjam;
    // End of variables declaration//GEN-END:variables
}
