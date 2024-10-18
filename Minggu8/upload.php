<?php
if(isset($_POST["submit"])){
    $targetdir = "Gambar/";
    $targetfile = $targetdir . basename($_FILES["myfile"]["name"]);
    $filetype = strtolower(pathinfo($targetfile, PATHINFO_EXTENSION));

    $allowedImageExtensions = array("jpg", "jpeg", "png", "gif");
    $allowedDocExtensions = array("txt", "pdf", "doc", "docx");

    $imageMaxSize = 5 * 1024 * 1024; // 5 MB untuk gambar
    $docMaxSize = 3 * 1024 * 1024;   // 3 MB untuk dokumen

    if(in_array($filetype, $allowedImageExtensions) && $_FILES["myfile"]["size"] <= $imageMaxSize){
        if(move_uploaded_file($_FILES["myfile"]["tmp_name"], $targetfile)){
            echo "File gambar berhasil diunggah<br>";
            echo "<img src='$targetfile' width='200' alt='Thumbnail Gambar'><br>";
        }else{
            echo "Gagal mengunggah gambar";
        }
    }elseif(in_array($filetype, $allowedDocExtensions) && $_FILES["myfile"]["size"] <= $docMaxSize){
        if(move_uploaded_file($_FILES["myfile"]["tmp_name"], $targetfile)){
            echo "File dokumen berhasil diunggah<br>";
        }else{
            echo "Gagal mengunggah dokumen";
        }
    }else{
        echo "File tidak valid atau melebihi ukuran maksimum yang diizinkan";
    }
}
?>
