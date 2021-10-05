<?php
$menus = array(
  array('name' => 'CURRY', 'price' => 9),
  array('name' => 'PASTA', 'price' => 12),
  array('name' => 'COFFEE', 'price' => 6)
);

$totalPrice = 0;
$expensive = 0;
$itemExpensive = '';
// Write your code below
foreach ($menus as $menu) {
  $name = $menu['name'];
  $price = $menu['price'];
  echo $menu['name']." is $".$menu['price'];
  echo '<br>';
  $totalPrice += $menu['price'];
  if($price > $expensive){
    $expensive = $price;
    $itemExpensive = $name;
  }
}
echo "The total price is $".$totalPrice;
echo '<br>';
echo "The most expensive item is ".$itemExpensive." with the price $".$expensive;
?>