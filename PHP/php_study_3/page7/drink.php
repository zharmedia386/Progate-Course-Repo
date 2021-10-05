<?php 
require_once('menu.php');

class Drink extends Menu {
  private $type;
  
  // Copy the __construct method from the Menu class
  public function __construct($name, $price, $image,$type) {
    $this->name = $name;
    $this->price = $price;
    $this->image = $image;
    self::$count++;
    $this->type = $type;
  }
  
  public function getType() {
    return $this->type;
  }
  
  public function setType($type) {
    $this->type = $type;
  }
  
}

?>