<?php
require_once('DBconnect.php');

if (isset($_POST['fname']) && (!empty($_POST['fname']) and isset($_POST['name']) && !empty($_POST['name']) and isset($_POST['email']) && !empty($_POST['email']) and isset($_POST['con_no']) && !empty($_POST['con_no']) and isset($_POST['address']) && !empty($_POST['address']) and isset($_POST['bg']) && !empty($_POST['bg']) and isset($_POST['age']) && !empty($_POST['age']) and isset($_POST['pass']) && !empty($_POST['pass'])){
	
	$u = $_POST['fname'];
	$n = $_POST['name'];
	$e = $_POST['email'];
	$cn = $_POST['con_no'];
	$ad = $_POST['address'];
	$bg = $_POST['bg'];
	$age = $_POST['age'];
    $p = $_POST['pass'];
	$sql = "INSERT INTO users (username, name, email, contact_number, address, blood_group, age, password) VALUES ('$u','$n','$e','$cn','$ad','$bg',$age,'$p')";
	
	$result = mysqli_query($conn, $sql);
	
	if(mysqli_affected_rows($conn)>0){
		
		echo "Registration successful, now you can donate or request for blood";
	}
	else{
		echo "Error occured, try again";
		echo "<a href=\"javascript:history.go(-1)\">GO BACK</a>";
	}
}
else{
	echo "You must fill all boxes";
	echo "<a href=\"javascript:history.go(-1)\">GO BACK</a>";
}
?>