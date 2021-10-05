<?php
$menus = array(
  array('name' => 'CURRY', 'price' => 9),
  array('name' => 'PASTA', 'price' => 12),
  array('name' => 'COFFEE', 'price' => 6)
);

$totalPrice = 0;
// Write your code below
foreach ($menus as $menu) {
  echo $menu['name']." is $".$menu['price'];
  echo '<br>';
  $totalPrice += $menu['price'];
}
echo "The total price is $".$totalPrice;
?>