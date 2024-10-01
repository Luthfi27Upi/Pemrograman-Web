<?php

function perkenalan($nama, $salam="Assalamualaikum"){
    echo $salam. ", ";
    echo "Perkenalkan, nama saya ".$nama. "<br/>";
    echo "Senang berkenalan dengan anda <br/>";
}
Perkenalan("Luthfi", "Hallo");
echo"<br><br>";

$saya = "Afifah";
$ucapanSalam = "Selamat Pagi";
Perkenalan($saya, );
?>