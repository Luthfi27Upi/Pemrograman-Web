<?php
if (isset($_POST['input']) && isset($_POST['email'])) {
    // Ambil input dari form
    $input = $_POST['input'];
    $email = $_POST['email'];

    // Memeriksa apakah input adalah email yang valid
    if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
        // Lanjutkan dengan pengolahan email yang aman
        echo "<h2>Hasil Input:</h2>";
        echo "<p>Input Teks: " . $input . "</p>";
        echo "<p>Email Valid: " . $email . "</p>";
    } else {
        // Tangani input yang tidak valid
        echo "<h2>Email tidak valid. Silakan masukkan alamat email yang benar.</h2>";
    }
} else {
    echo "<h2>Tidak ada input yang diterima.</h2>";
}
?>