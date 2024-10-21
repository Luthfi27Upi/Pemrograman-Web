<?php
    $username = $_POST['username'];
    $password = $_POST['password'];

    if($username == 'admiin' && $password == '12345'){
        session_start();
        $_SESSION['username'] = $username;
        $_SESSION['status'] = 'login';
        echo 'Anda berhasil login. Silahkan menuju <a href="homeSession.php">Halaman Home</a>';
    } else {
        echo 'Gagal login. Silahkan login lagi <a href="sessionLoginForm.html">Halaman Login</a>';
    }
?>