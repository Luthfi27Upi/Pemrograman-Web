<?php
define('HOST', 'localhost');
define('USER', 'root');
define('PASS', '');
define('DB1', 'webjs10');

$db1 = new mysqli(HOST, USER, PASS, DB1);
if ($db1->connect_error) {
    die("Connection failed: " . $db1->connect_error);
}
?>
