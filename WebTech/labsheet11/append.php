<?php
$file = fopen("example.txt", "a"); // a = append mode
fwrite($file, "This line is appended.\n");
fclose($file);

echo "Data appended and file closed.";
?>