<?php
$file = fopen("example.txt", "w"); // w = write mode
fwrite($file, "Sushmitha ma'am.\n");
fwrite($file, "Writing into the file.");
fclose($file);

echo "File written successfully.";
?>