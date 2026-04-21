<?php
$file = fopen("example.txt", "w"); // w = write mode
fwrite($file, "This is a new line.\n");
fwrite($file, "Writing into the file.");
fclose($file);

echo "File written successfully.";
?>