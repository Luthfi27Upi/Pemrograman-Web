import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Kuis218 extends javax.swing.JFrame {
    public Kuis218() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        NIK = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Alamat = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Hobi = new javax.swing.JLabel();
        NOTelp = new javax.swing.JLabel();
        TglLahir = new javax.swing.JLabel();
        Pendidikan = new javax.swing.JLabel();
        IPK = new javax.swing.JLabel();
        NIKBox = new javax.swing.JTextField();
        NamaBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlamatBox = new javax.swing.JTextArea();
        Laki = new javax.swing.JRadioButton();
        Perempuan = new javax.swing.JRadioButton();
        Badminton = new javax.swing.JCheckBox();
        Berenang = new javax.swing.JCheckBox();
        Basket = new javax.swing.JCheckBox();
        TelpBox = new javax.swing.JTextField();
        TanggalBox = new javax.swing.JFormattedTextField();
        PendidikanBox = new javax.swing.JComboBox<>();
        IPKBox = new javax.swing.JFormattedTextField();
        Daftar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NIK.setText("NIK");

        Nama.setText("Nama");

        Alamat.setText("Alamat");

        Gender.setText("Gender");

        Hobi.setText("Hobi");

        NOTelp.setText("NO Telp");

        TglLahir.setText("Tgl Lahir");

        Pendidikan.setText("Pendidikan");

        IPK.setText("IPK");

        NIKBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIKBoxActionPerformed(evt);
            }
        });

        AlamatBox.setColumns(20);
        AlamatBox.setRows(5);
        jScrollPane1.setViewportView(AlamatBox);

        Laki.setText("Laki Laki");

        Perempuan.setText("Perempuan");

        Badminton.setText("Badminton");

        Berenang.setText("Berenang");

        Basket.setText("Basket");

        TelpBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelpBoxActionPerformed(evt);
            }
        });

        TanggalBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanggalBoxActionPerformed(evt);
            }
        });

        PendidikanBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SD", "SMP", "SMA", "D1", "D2", "D3", "D4 / S1", "S2", "S3" }));
        PendidikanBox.setSelectedIndex(-1);
        PendidikanBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendidikanBoxActionPerformed(evt);
            }
        });

        IPKBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPKBoxActionPerformed(evt);
            }
        });

        Daftar.setText("Daftar");
        Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NIK)
                    .addComponent(Nama)
                    .addComponent(Alamat)
                    .addComponent(Gender)
                    .addComponent(Hobi)
                    .addComponent(IPK)
                    .addComponent(Pendidikan)
                    .addComponent(TglLahir)
                    .addComponent(NOTelp))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IPKBox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PendidikanBox, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(Basket, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Badminton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Berenang, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIKBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaBox, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TelpBox, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Laki)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Perempuan))
                                .addComponent(TanggalBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Daftar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIK)
                    .addComponent(NIKBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama)
                    .addComponent(NamaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alamat))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender)
                    .addComponent(Laki)
                    .addComponent(Perempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hobi)
                    .addComponent(Badminton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Berenang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Basket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOTelp)
                    .addComponent(TelpBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TglLahir)
                    .addComponent(TanggalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pendidikan)
                    .addComponent(PendidikanBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IPK)
                    .addComponent(IPKBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Daftar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void TelpBoxActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String telp = TelpBox.getText();
        if (!telp.matches("\\d+")) {
            TelpBox.setText("");
        }
    }                                       

    private void TanggalBoxActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(TanggalBox.getText(), formatter);
               
        long age = ChronoUnit.YEARS.between(birthDate, LocalDate.now());               
        if (age < 18) { 
            JOptionPane.showMessageDialog(this, "Jika belum 18 tahun anda tidak bisa mendaftar");
            TanggalBox.setText(""); 
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Tanggal tidak valid");
    }
    }                                          

    private void IPKBoxActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            double ipk = Double.parseDouble(IPKBox.getText().replace(",", "."));
            if (ipk < 0.00 || ipk > 4.00) {
                JOptionPane.showMessageDialog(this, "IPK tidak valid");
                IPKBox.setText("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "IPK tidak valid");
            IPKBox.setText("");
        }
    }                                      

    private void DaftarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (NIKBox.getText().isEmpty() || NamaBox.getText().isEmpty() ||
            AlamatBox.getText().isEmpty() ||
            (!Laki.isSelected() && !Perempuan.isSelected()) ||
            (!Badminton.isSelected() && !Berenang.isSelected() && !Basket.isSelected()) ||
            TelpBox.getText().isEmpty() || TanggalBox.getText().isEmpty() ||
            IPKBox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua data harus diisi!");
        } else {
            JOptionPane.showMessageDialog(this, "Anda berhasil mendaftar");
             NIKBox.setText("");
            NamaBox.setText("");
            AlamatBox.setText("");
            Laki.setSelected(false);
            Perempuan.setSelected(false);
            Badminton.setSelected(false);
            Berenang.setSelected(false);
            Basket.setSelected(false);
            TelpBox.setText("");
            TanggalBox.setText("");
            PendidikanBox.setSelectedIndex(0);
            IPKBox.setText("");
        }
    }                                      

    private void PendidikanBoxActionPerformed(java.awt.event.ActionEvent evt) {                                              
         String pendidikan = (String) PendidikanBox.getSelectedItem();
    
    // Peringatan jika pendidikan di bawah D1
    if (pendidikan.equals("SD") || pendidikan.equals("SMP") || pendidikan.equals("SMA")) {
        JOptionPane.showMessageDialog(this, "Minimal Pendidikan harus D1");
        PendidikanBox.setSelectedIndex(3); // Set default ke "D1"
    }
    }                                             

    private void NIKBoxActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      
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
            java.util.logging.Logger.getLogger(Kuis218.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis218.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis218.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis218.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis218().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Alamat;
    private javax.swing.JTextArea AlamatBox;
    private javax.swing.JCheckBox Badminton;
    private javax.swing.JCheckBox Basket;
    private javax.swing.JCheckBox Berenang;
    private javax.swing.JButton Daftar;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Hobi;
    private javax.swing.JLabel IPK;
    private javax.swing.JFormattedTextField IPKBox;
    private javax.swing.JRadioButton Laki;
    private javax.swing.JLabel NIK;
    private javax.swing.JTextField NIKBox;
    private javax.swing.JLabel NOTelp;
    private javax.swing.JLabel Nama;
    private javax.swing.JTextField NamaBox;
    private javax.swing.JLabel Pendidikan;
    private javax.swing.JComboBox<String> PendidikanBox;
    private javax.swing.JRadioButton Perempuan;
    private javax.swing.JFormattedTextField TanggalBox;
    private javax.swing.JTextField TelpBox;
    private javax.swing.JLabel TglLahir;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
