<?php
session_start();

$lantai = $type = $jumlahHari = $diskon = "";
$totalTransaksi = $totalDiskon = $totalBayar = 0;
$typeError = $diskonError = "";

$hargaTipeKamar = [
    "standard" => 300000,
    "superior" => 400000,
    "deluxe" => 500000
];
$lantaiError = "";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $lantai = $_POST['lantai'];
    $type = $_POST['type'];
    $jumlahHari = $_POST['jumlahHari'];
    $diskon = $_POST['diskon'];
    
    if ($lantai < 1) {
        $lantaiError = "Tolong pilih dimulai dari lantai 1";
    }
    
    if (empty($type)) {
        $typeError = "Tipe kamar harus dipilih";
    }
    if (empty($diskon)) {
        $diskonError = "Diskon harus dipilih";
    }
    if (!empty($type) && isset($hargaTipeKamar[$type]) && $lantai >= 1) {
        $hargaSewa = $hargaTipeKamar[$type] * $jumlahHari;
        if ($lantai > 5) {
            $hargaSewa += 50000;
        }
        if ($diskon == "Member") {
            $totalDiskon = 0.1 * $hargaSewa;
        } elseif ($diskon == "Promo HUT") {
            $totalDiskon = 100000;
        } else {
            $totalDiskon = 0;
        }
        $totalTransaksi = $hargaSewa;
        $totalBayar = $hargaSewa - $totalDiskon;
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    <link rel="stylesheet" type="text/css" href="CekHarga.css">
    <link href="bootstrap/css/bootstrap.css">
    <title>Cek Harga</title>
</head>
<body>
<header>
    <h1>UTS Hotel</h1>
    <nav>
        <ul>
            <li><a href="Home.php">Home</a></li>
            <li><a href="CekHarga.php">Cek Harga</a></li>
            <li><a href="Login.php">Logout</a></li>
        </ul>
    </nav>
</header>
<div class="login-container">
    <div class="login-form">
        <h2>Cek Harga</h2>
        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
        <label for="lantai">Lantai:</label>
        <input type="number" id="lantai" name="lantai" value="<?php echo $lantai; ?>" min="1" required>
            <label for="type">Type:</label>
            <select id="type" name="type">
                <option value="">Pilih Tipe</option>
                <option value="standard" <?php if ($type == "standard") echo "selected"; ?>>Standard</option>
                <option value="superior" <?php if ($type == "superior") echo "selected"; ?>>Superior</option>
                <option value="deluxe" <?php if ($type == "deluxe") echo "selected"; ?>>Deluxe</option>
            </select>
            <span class="error"><?php echo $typeError; ?></span>

            <label for="jumlahHari">Jumlah Hari:</label>
            <input type="number" id="jumlahHari" name="jumlahHari" value="<?php echo $jumlahHari; ?>" required>

            <label for="diskon">Diskon:</label>
            <select id="diskon" name="diskon">
                <option value="">Pilih Diskon</option>
                <option value="Tidak Ada" <?php if ($diskon == "Tidak Ada") echo "selected"; ?>>Tidak Ada</option>
                <option value="Member" <?php if ($diskon == "Member") echo "selected"; ?>>Member</option>
                <option value="Promo HUT" <?php if ($diskon == "Promo HUT") echo "selected"; ?>>Promo HUT</option>
            </select>
            <span class="error"><?php echo $diskonError; ?></span>

            <button type="submit">CHECK</button>
        </form>

        <?php if ($_SERVER["REQUEST_METHOD"] == "POST" && !empty($type) && !empty($diskon)): ?>
        <div class="result">
            <p>Total transaksi adalah Rp <?php echo number_format($totalTransaksi, 0, ',', '.'); ?></p>
            <p>Total diskon adalah Rp <?php echo number_format($totalDiskon, 0, ',', '.'); ?></p>
            <p><strong>Yang harus dibayarkan adalah Rp <?php echo number_format($totalBayar, 0, ',', '.'); ?></strong></p>
        </div>
        <?php endif; ?>
    </div>
</div>
<footer>
        <h3>Luthfi Triaswangga</h3>        
        <p>&copy; 2341720208 - TI 2E / 18</p>
</footer>
</body>
</html>