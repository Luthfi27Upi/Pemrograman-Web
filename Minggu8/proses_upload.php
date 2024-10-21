<?php
$targetDirectory = "documents/";
if(!file_exists($targetDirectory)){
    mkdir($targetDirectory, 0777, true);
}
if($_FILES['files']['name'][0]){
    $totalfiles = count(($_FILES)['files']['name']);

    for ($i = 0; $i<$totalfiles; $i++){
        $filename = $_FILES['files']['name'][$i];
        $targetfile = $targetDirectory . $filename;

        if (move_uploaded_file($_FILES['files']['tmp_name'][$i], $targetfile)){
            echo "File $filename berhasil diunggah. <br>";
        }else{
            echo "Gagal menggunggah file $filename. <br>";
        }
    }
}else{
    echo "Tidak ada file yang diunggah";
}