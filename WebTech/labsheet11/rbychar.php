<?php
$file = fopen("example.txt", "r");

while (!feof($file)) {
    echo fgetc($file);
}

fclose($file);
?>