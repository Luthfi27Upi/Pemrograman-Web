<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <h2>Data Anggota</h2>
        <a href="create.php" class="btn-tambah">Tambah Anggota</a>
        <?php
        include('koneksi.php');
        $query = "SELECT * FROM anggota order by id desc";
        $result = mysqli_query($koneksi, $query);

        if (mysqli_num_rows($result)>0){
            $no = 1;
            echo "<table>";
            echo "<tr><th>NO</th><th>Nama</th><th>Jenis Kelamin</th>
            <th>Alamat</th><th>NO.Telp</th><th>Aksi</th></tr>";
            while($row = mysqli_fetch_array($result)){
                $kelamin = ($row["JK_Anggota"] === 'M'   'Male' : 'Female');
                echo "<tr>         )?
                    <td>" . $no++ . "</td><td>" . $row["Nama_Anggota"] . "</td>
                    <td>" . $kelamin . "</td><td>" . $row["Alamat_Anggota"] . "</td>
                    <td>" . $row["NTelp_Anggota"] . "</td>
                    <td><a href='edit.php?id=" . $row["ID_Anggota"] . "'>Edit</a |
                    <a href='#' onclick='konfirmasiHapus(" . $row["ID_Anggota"] . ", \"" . $row["Nama_Anggota"] . "\")'>Hapus</a></td>
                    </tr>";
            }
            echo "</table>";
        }else{
            echo "Tidak ada data.";
        }
        mysqli_close($koneksi);
        ?>
    </div>
    <script
</body>
</html>