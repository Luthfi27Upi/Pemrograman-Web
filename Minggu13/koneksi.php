<?php
$host = "localhost"; // Nama host
$username = "root"; // Nama user
$password = ""; // Password, sesuaikan jika ada
$dbname = "webjs10"; // Nama database

$koneksi = mysqli_connect($host, $username, $password, $dbname);

if ($koneksi) {
    echo "Koneksi berhasil. <br />";
} else {
    echo "Koneksi Gagal.";
    die("Error: " . mysqli_connect_error());
}
 