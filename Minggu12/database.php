<?php
Class Database{
private $host = "localhost";
private $username = "root";
private $password = "";
private $database = "webjs11";
public $conn;
public function __construct() {
    $this->conn = new mysqli($this->host, $this->username, $this->password, $this->database);
    if ($this->conn->connect_error) {
        die("Connection failed: ". $this->conn->connect_error);
    }
}
}