<?php
require_once('DBconnect.php');

if (isset($_POST['fname']) && !empty($_POST['fname']) and isset($_POST['pass']) && !empty($_POST['pass'])){
	
	$u = $_POST['fname'];
    $p = $_POST['pass'];
	$sql = "select * from users where username = '$u' AND password = '$p'";
	
	$result = mysqli_query($conn, $sql);
	
	if(mysqli_num_rows($result) !=0 ){
		$_SESSION['username'] = $username;
        $_SESSION['password'] = $password;
        
		echo "login successful";
		header('Location: login_successful.php');
	}
	else{
		echo "username or password is incorrect";
		echo "<a href=\"javascript:history.go(-1)\">GO BACK</a>";
	}
}
else{
	echo "You must fill up both boxes";
	echo "<a href=\"javascript:history.go(-1)\">GO BACK</a>";
}
?>