<?php
$pattern = '/[a-z]/'; 
$text = 'This is a Sample Text.';

echo "<h3>Pemeriksaan Huruf Kecil</h3>";
if (preg_match($pattern, $text)) {
    echo "<p>Huruf kecil ditemukan.</p>";
} else {
    echo "<p>Tidak ada huruf kecil!</p>";
}

echo "<hr>"; 

$pattern = '/[0-9]+/'; 
$text = 'There are 123 apples.';

echo "<h3>Pemeriksaan Angka</h3>";
if (preg_match($pattern, $text, $matches)) {
    echo "<p>Cocokkan: " . $matches[0] . "</p>";
} else {
    echo "<p>Tidak ada yang cocok!</p>";
}

echo "<hr>"; 

$pattern = '/apple/'; 
$replacement = 'banana'; 
$text = 'I like apple pie.'; 
$new_text = preg_replace($pattern, $replacement, $text); 

echo "<h3>Pemeriksaan Penggantian Teks</h3>";
echo "<p>Hasil penggantian: " . $new_text . "</p>"; 

echo "<hr>"; 

$pattern = '/[o]{1,3}/'; 
$text = 'god is good.';

echo "<h3>Pemeriksaan Pola '/[o]{1,3}/'</h3>";
if (preg_match($pattern, $text, $matches)) {
    echo "<p>Cocokkan: " . $matches[0] . "</p>";
} else {
    echo "<p>Tidak ada yang cocok!</p>";
}