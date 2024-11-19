<?php
class Animal {
    protected $name;

    public function __construct($name) {
        $this->name = $name;
    }
    public function eat() {
        echo $this->name . " is eating.<br>";
    }
    public function sleep() {
        echo $this->name . " is sleeping.<br>";
    }
}

class Cat extends Animal {
    public function meow() {
        echo $this->name . " says meow!<br>";
    }
}

class Dog extends Animal {
    public function bark() {
        echo $this->name . " says woof!<br>";
    }
}
$cat = new Cat("Whiskers");
$dog = new Dog("Buddy");

$cat->eat();
$dog->sleep();
$cat->meow();
$dog->bark();


abstract class Shape {
    abstract public function calculateArea();
}

class Circle extends Shape {
    private $radius;

    public function __construct($radius) {
        $this->radius = $radius;
    }

    public function calculateArea() {
        return pi() * pow($this->radius, 2);
    }
}

class Rectangle extends Shape {
    private $width;
    private $height;

    public function __construct($width, $height) {
        $this->width = $width;
        $this->height = $height;
    }

    public function calculateArea() {
        return $this->width * $this->height;
    }
}

$circle = new Circle(5);
$rectangle = new Rectangle(4, 6);

echo "Area of Circle: " . $circle->calculateArea() . "<br>";
echo "Area of Rectangle: " . $rectangle->calculateArea() . "<br>";

class Car {
    private $brand;

    public function __construct($brand) {
        echo "A new car is created.<br>";
        $this->brand = $brand;
    }

    public function getBrand() {
        return $this->brand;
    }

    public function __destruct() {
        echo "The car is destroyed.<br>";
    }
}

$car = new Car("Toyota");

echo "Brand: " . $car->getBrand() . "<br>";

