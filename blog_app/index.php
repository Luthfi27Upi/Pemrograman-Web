<?php
// Memuat autoloader Composer untuk mengakses MongoDB
require 'vendor/autoload.php';

// Membuat koneksi ke MongoDB
$client = new MongoDB\Client("mongodb://localhost:27017");
$collection = $client->blog_db->posts; // Mengakses koleksi 'posts' dari database 'blog_db'

// Mengambil semua data dari koleksi posts
$posts = $collection->find()->toArray();

// Debugging: Pastikan data diambil
if (empty($posts)) {
    echo "Tidak ada postingan yang ditemukan.";
}
?>

<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <title>Daftar Postingan Blog</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Daftar Postingan Blog</h1>
    <a href="create.php">Buat Postingan Baru</a>
    <hr>
    <?php foreach ($posts as $post): ?>
        <div class="post">
            <h2><?= htmlspecialchars($post['title']) ?></h2>
            <p>
                <?= nl2br(htmlspecialchars($post['content'])) ?>
            </p>
            <a href="edit.php?id=<?= $post['_id']->__toString() ?>">Edit</a>
            <a href="delete.php?id=<?= $post['_id']->__toString() ?>">Delete</a>
        </div>
        <hr>
    <?php endforeach; ?>
</body>
</html>
