<?php
require __DIR__ . '/vendor/autoload.php';
function getDB()
{
    $client = new MongoDB\Client("mongodb://localhost:27017");
    return $client->blog_database; // Nama database
}
