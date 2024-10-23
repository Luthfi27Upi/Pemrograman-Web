<?php
session_start();

// Inisialisasi variabel error
$usernameError = $passwordError = "";

// Mengecek apakah form sudah di-submit
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Mendapatkan nilai username dan password dari form
    $username = $_POST['username'];
    $password = $_POST['password'];

    // Validasi input username dan password
    if (empty($username)) {
        $usernameError = "Harus terisi";
    }
    if (empty($password)) {
        $passwordError = "Harus terisi";
    } elseif (strlen($password) < 5) {
        $passwordError = "Password minimal 5 karakter";
    } elseif (!preg_match("/\d/", $password)) {
        $passwordError = "Password harus terdiri dari huruf dan angka";
    } else {
        // Jika username dan password benar
        if ($username === "admin" && $password === "admin123") {
            // Simpan username dalam session
            $_SESSION['username'] = $username;
            // Redirect ke halaman home.php
            header("Location: home.php");
            exit();
        } else {
            // Jika username atau password salah
            $passwordError = "Username atau password salah";
        }
    }
}
?>

<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="Login.css">
    <link href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">\
    <script src="bootstrap/js/bootstrap.bundle.js"></script>
    <title>Login Form</title>
    <style>
    </style>
</head>
<body>

<!-- Header -->
<header>
    <h1>UTS Hotel</h1>
</header>

<!-- Login Form -->
<div class="login-container">
    <div class="login-image"></div>
    <div class="login-form">
        <h2>SIGN IN</h2>
        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" placeholder="Enter your username" >
            <span class="error"><?php echo $usernameError;?></span>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" >
            <span class="error"><?php echo $passwordError;?></span>

            <button type="submit">Login</button>
        </form>
    </div>
</div>
</body>
</html>