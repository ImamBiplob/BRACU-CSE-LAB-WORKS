<?php include("includes/a_config.php");?>

<!DOCTYPE html>
<html>
<head>
    <?php include("includes/a_config.php");?>
	<?php include("includes/head-tag-contents.php");?>
	
</head>
<body>

<?php include("includes/design-top.php");?>
<?php include("includes/navigation.php");?>

<div class="container" id="main-content">
	<h2>Welcome to Blood Bank!</h2>
	<h4>Donate blood, save lives</h4>
	
<img src="the-gallery-for-blood-drops-clip-art.jpg" width="130px"><br/>
</div>
<section id = "section1">
    <div class = "title"><strong> LOGIN HERE TO DONATE OR MAKE REQUEST FOR BLOOD </strong></div>
	<form name="frmregister"action="signin.php" method="post" >
		<table class="form" border="0">

			
			<tr>
				<th><label for="name"><strong>Username:</strong></label></th>
				<td><input class="inp-text" name="fname" id="name" type="text" size="30" /></td>
			</tr>
			<tr>
				<th><label for="name"><strong>Password:</strong></label></th>
				<td><input class="inp-text" name="pass" id="password" type="password" size="30" /></td>
			</tr>
			<tr>
			<td></td>
				<td class="submit-button-right">
				<input class="send_btn" type="submit" value="Login" alt="Submit" title="Submit" />
				
				
			</tr>
		</table>
	</form>

	
	<h5>Not yet registered? </h5> <a href="register.php"> click here to register </a>
<?php include("includes/footer.php");?>

</body>
</html>