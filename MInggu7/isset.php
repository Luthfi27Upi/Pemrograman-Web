<?php
$data = array("nama" => "Jane", "usia" => 25);
if (isset($data["nama"])) {
    echo "Nama: <br>" . $data["nama"] . "<br>";
} else {
    echo "Anda belum dewasa atau variabel 'umur' tidak ditemukan." . "<br>";
}
?>
