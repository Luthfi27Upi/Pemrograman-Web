package backend;

import java.util.ArrayList;
import java.sql.*;

public class Buku {
    private int idBuku;
    private Kategori kategori = new Kategori(); // Inisialisasi default
    private String judul;
    private String penerbit;
    private String penulis;

    // Konstruktor tanpa parameter
    public Buku() {
    }

    // Konstruktor dengan parameter
    public Buku(Kategori kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    // Getter dan Setter
    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Metode untuk mendapatkan buku berdasarkan ID
    public Buku getById(int id) {
        Buku buku = new Buku();
        ResultSet rs = DBHelper.selectQuery("SELECT " +
                "b.idbuku AS idbuku, " +
                "b.judul AS judul, " +
                "b.penerbit AS penerbit, " +
                "b.penulis AS penulis, " +
                "k.idkategori AS idkategori, " +
                "k.nama AS nama, " +
                "k.keterangan AS keterangan " +
                "FROM buku b " +
                "LEFT JOIN kategori k ON b.idkategori = k.idkategori " +
                "WHERE b.idbuku = " + id + ";");

        try {
            while (rs.next()) {
                buku.setIdBuku(rs.getInt("idbuku"));
                Kategori kategori = new Kategori();
                kategori.setIdKategori(rs.getInt("idkategori"));
                kategori.setNama(rs.getString("nama"));
                kategori.setKeterangan(rs.getString("keterangan"));
                buku.setKategori(kategori);
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return buku;
    }

    // Metode untuk mendapatkan semua buku
    public ArrayList<Buku> getAll() {
        ArrayList<Buku> ListBuku = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT " +
                "b.idbuku AS idbuku, " +
                "b.judul AS judul, " +
                "b.penerbit AS penerbit, " +
                "b.penulis AS penulis, " +
                "k.idkategori AS idkategori, " +
                "k.nama AS nama, " +
                "k.keterangan AS keterangan " +
                "FROM buku b " +
                "LEFT JOIN kategori k ON b.idkategori = k.idkategori");

        try {
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setIdBuku(rs.getInt("idbuku"));
                Kategori kategori = new Kategori();
                kategori.setIdKategori(rs.getInt("idkategori"));
                kategori.setNama(rs.getString("nama"));
                kategori.setKeterangan(rs.getString("keterangan"));
                buku.setKategori(kategori);
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListBuku;
    }

    // Metode untuk mencari buku berdasarkan keyword
    public ArrayList<Buku> search(String keyword) {
        ArrayList<Buku> ListBuku = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT " +
                "b.idbuku AS idbuku, " +
                "b.judul AS judul, " +
                "b.penerbit AS penerbit, " +
                "b.penulis AS penulis, " +
                "k.idkategori AS idkategori, " +
                "k.nama AS nama, " +
                "k.keterangan AS keterangan " +
                "FROM buku b " +
                "LEFT JOIN kategori k ON b.idkategori = k.idkategori " +
                "WHERE b.judul LIKE '%" + keyword + "%' " +
                "OR b.penerbit LIKE '%" + keyword + "%' " +
                "OR b.penulis LIKE '%" + keyword + "%'");

        try {
            while (rs.next()) {
                Buku buku = new Buku();
                buku.setIdBuku(rs.getInt("idbuku"));
                Kategori kategori = new Kategori();
                kategori.setIdKategori(rs.getInt("idkategori"));
                kategori.setNama(rs.getString("nama"));
                kategori.setKeterangan(rs.getString("keterangan"));
                buku.setKategori(kategori);
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListBuku;
    }

    // Metode untuk menyimpan buku
    public void save() {
        if (getById(idBuku).getIdBuku() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES (" +
                    "'" + this.judul + "', " +
                    "'" + this.getKategori().getIdKategori() + "', " +
                    "'" + this.penulis + "', " +
                    "'" + this.penerbit + "')";
            this.idBuku = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE buku SET " +
                    "judul = '" + this.judul + "', " +
                    "idkategori = '" + this.getKategori().getIdKategori() + "', " +
                    "penulis = '" + this.penulis + "', " +
                    "penerbit = '" + this.penerbit + "' " +
                    "WHERE idbuku = " + this.idBuku;
            DBHelper.executeQuery(SQL);
        }
    }

    // Metode untuk menghapus buku
    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = " + this.idBuku;
        DBHelper.executeQuery(SQL);
    }
}
