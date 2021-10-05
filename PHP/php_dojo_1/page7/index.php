<?php
$prices = array(10, 6, 7, 8);
$total = 0;
$max = max($prices);
echo 'Value of $prices: ';
foreach ($prices as $price) {
  echo $price.' ';
  $total += $price;
}
echo '<br>';
echo '-----';
echo '<br>';

// Write your code below
echo "The total price is $". $total;
echo "The highest price is $".$max;
?>