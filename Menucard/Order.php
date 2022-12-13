
    <?php
    $servername="localhost";
    $username="root";
    $password="";
    $dbname="orders";
    $Quantity=$_REQUEST['Quantity'];
    $Food="Veg_Pullaw";
    $conn=new mysqli($servername,$username,$password,$dbname);
    $sql="INSERT INTO tabel_1 VALUES('$Quantity','$Food')";
   echo"Data";
    ?>
