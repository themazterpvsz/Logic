<style media="screen">
  span {
    display: inline-block;
    min-width: 15 px;
  }
</style>

<?php
$n = 50;


for ($bar=1; $bar < $n ; $bar++) {
  $b = 1;
  for ($kol=1; $kol < $n; $kol++) {
    if ($kol == $n - $bar - ($n / 2 - 1) && $bar <= $n - $bar || $bar == $kol - ($n / 2 - 1)
          || $kol == $bar - ($n / 2 - 1) ||$kol == $n - $bar + ($n / 2 -1) ) {
      echo "<span>*</span>";
    } else {
      echo "<span>&nbsp</span>";
    }
  }
  echo "<br/>";
}

 ?>
