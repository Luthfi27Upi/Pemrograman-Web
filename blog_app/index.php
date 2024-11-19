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
            <h2><?php echo htmlspecialchars($post['title']); ?></h2>
            <p><?php echo
                nl2br(htmlspecialchars($post['content'])); ?></p>
            <a href="edit.php?id=<?php echo $post['_id']; ?>">Edit</a>
            <a href="delete.php?id=<?php echo $post['_id']; ?>">Hapus</a>
        </div>
        <hr>
    <?php endforeach; ?>
</body>

</html>