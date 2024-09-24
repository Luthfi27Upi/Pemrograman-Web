<?php
$a = 60;
$b = 30;

$hasilTambah = $a + $b;
$hasilKurang = $a - $b;
$hasilKali = $a * $b;
$hasilBagi = $a / $b;
$sisaBagi = $a % $b;
$pangkat = $a ** $b;

$hasilSama = $a == $b;
$hasilTidakSama = $a != $b;
$hasilLebihKecil = $a < $b;
$hasilLebihBesar = $a > $b;
$hasilLebihKecilSama = $a <= $b;
$hasilLebihBesarSama = $a >= $b;

$hasilAnd = $a && $b;
$hasilOr = $a || $b;
$hasilNotA = !$a;
$hasilNotB = !$b;

$a += $b; 
$hasilTambahAssign = $a;

$a -= $b; 
$a -= $b; 
$hasilKurangAssign = $a;

$a += $b; 
$a *= $b; 
$hasilKaliAssign = $a;

$a /= $b; 
$hasilBagiAssign = $a;

$a %= $b; 
$hasilModAssign = $a;

$hasilIdentik =$a === $b;
$hasilTidakIdentik =$a !== $b;

echo "Hasil Penambahan : $hasilTambah <br>";
echo "Hasil Pengurangan : $hasilKurang <br>";
echo "Hasil Perkalian : $hasilKali <br>";
echo "Hasil Pembagian : $hasilBagi <br>";
echo "Sisa Bagi : $sisaBagi <br>";
echo "Hasil Perpangkatan : $pangkat <br>";

echo "Hasil Sama Dengan : $hasilSama <br>";
echo "Hasil Tidak Sama Dengan : $hasilTidakSama <br>";
echo "Hasil Lebih Kecil : $hasilLebihKecil <br>";
echo "Hasil Lebih Besar : $hasilLebihBesar <br>";
echo "Hasil Lebih Kecil Sama Dengan : $hasilLebihKecilSama <br>";
echo "Hasil Lebih Besar Sama Dengan : $hasilLebihBesarSama <br>";

echo "Hasil AND : $hasilAnd <br>";
echo "Hasil OR : $hasilOr <br>";
echo "Hasil NOT A : $hasilNotA <br>";
echo "Hasil NOT B : $hasilNotB <br>";

echo "Hasil Penambahan dan Penugasan (+=) : $hasilTambahAssign <br>";
echo "Hasil Pengurangan dan Penugasan (-=) : $hasilKurangAssign <br>";
echo "Hasil Perkalian dan Penugasan (*=) : $hasilKaliAssign <br>";
echo "Hasil Pembagian dan Penugasan (/=) : $hasilBagiAssign <br>";
echo "Hasil Modulo dan Penugasan (%=) : $hasilModAssign <br>";

echo "Hasil Identik (===) : $hasilIdentik <br>";
echo "Hasil Tidak Identik (!==) : $hasilTidakIdentik <br>";
?>
