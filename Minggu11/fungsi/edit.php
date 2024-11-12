<?php
session_start();
if (!empty($_SESSION['username'])) {
    require '../config/koneksi.php';
    require '../fungsi/pesan_kilat.php';
    require '../fungsi/anti_injection.php';

    if (!empty($_GET['anggota'])) {
        $user_id = antiinjection($koneksi, $_POST['id']);
        $name = antiinjection($koneksi, $_POST['nama']);
        $jabatan = antiinjection($koneksi, $_POST['jabatan']);
        $alamat = antiinjection($koneksi, $_POST['alamat']);
        $jenis_kelamin = antiinjection($koneksi, $_POST['jenis_kelamin']);
        $no_telp = antiinjection($koneksi, $_POST['no_telp']);
        
        $query_anggota = "UPDATE anggota SET nama = '$name', jenis_kelamin = '$jenis_kelamin', alamat = '$alamat', no_telp = '$no_telp', jabatan_id = '$jabatan' WHERE user_id = '$user_id'";
        
        if (mysqli_query($koneksi, $query_anggota)) {
            if (!empty($_POST['password'])) {
                $password = $_POST['password'];
                $salt = bin2hex(random_bytes(16)); // Generate random salt
                $combined_password = $salt . $password; // Combine salt with password
                $hashed_password = password_hash($combined_password, PASSWORD_BCRYPT); // Hash password

                $query_user = "UPDATE user SET username = '{$_POST['username']}', password = '$hashed_password', salt = '$salt' WHERE id = '$user_id'";
                if (mysqli_query($koneksi, $query_user)) {
                    pesan('success', "Anggota Telah Diubah.");
                } else {
                    pesan('warning', "Data Anggota Berhasil Diubah, Tetapi Password Gagal Diubah Karena: " . mysqli_error($koneksi));
                }
            } else {
                $query_user = "UPDATE user SET username = '{$_POST['username']}' WHERE id = '$user_id'";
                if (mysqli_query($koneksi, $query_user)) {
                    pesan('success', "Anggota Telah Diubah.");
                } else {
                    pesan('warning', "Data Anggota Berhasil Diubah, Tetapi Username Gagal Diubah Karena: " . mysqli_error($koneksi));
                }
            }
            header("Location: ../index.php?page=anggota");
            exit();
        } else {
            pesan('danger', "Mengubah Anggota Karena: " . mysqli_error($koneksi));
            header("Location: ../index.php?page=anggota");
            exit();
        }
    }
}
?>