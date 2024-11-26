<?php
$host = "localhost"; 
$username = "root"; 
$password = ""; 
$dbname = "webjs10"; 

$koneksi = mysqli_connect($host, $username, $password, $dbname);

if ($koneksi) {
    echo "Koneksi berhasil. <br />";
} else {
    echo "Koneksi Gagal.";
    die("Error: " . mysqli_connect_error());
}