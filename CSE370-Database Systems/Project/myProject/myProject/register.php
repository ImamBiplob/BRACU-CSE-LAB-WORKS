<?php include("includes/a_config.php");?>
<!DOCTYPE html>
<html>
<head>
	<?php include("includes/head-tag-contents.php");?>
	
</head>
<body>

<?php include("includes/design-top.php");?>
<?php include("includes/navigation.php");?>

<div class="container" id="main-content">
	<h2>Register Here</h2><br/>
	
</div>
<form name="frmregister"action="registration.php" method="post" >
		<table class="form" border="0">

			
			<tr>
				<th><label for="name"><strong>Username(not more than 10 characters):</strong></label></th>
				<td><input class="inp-text" name="fname" id="name" type="text" size="30" /></td>
			</tr>
			<tr>
				<th><label for="name"><strong>Name:</strong></label></th>
				<td><input class="inp-text" name="name" id="name" type="text" size="30" /></td>
			</tr>
			<tr>
				<th><label for="name"><strong>Email:</strong></label></th>
				<td><input class="inp-text" name="email" id="name" type="text" size="30" /></td>
			</tr>
			<tr>
				<th><label for="name"><strong>Contact No.:</strong></label></th>
				<td><input class="inp-text" name="con_no" id="name" type="text" size="30" /></td>
			</tr>
			<tr>
				<th><label for="name"><strong>Address:</strong></label></th>
				<td><input class="inp-text" name="address" id="name" type="text" size="30" /></td>
			</tr>
			<tr>
				<th><label for="name"><strong>Blood Group:</strong></label></th>
				<td><input class="inp-text" name="bg" id="name" type="text" size="30" /></td>
			</tr>
			<tr>
				<th><label for="name"><strong>Age:</strong></label></th>
				<td><input class="inp-text" name="age" id="name" type="text" size="30" /></td>
			</tr>
			<tr>
				<th><label for="name"><strong>Password:</strong></label></th>
				<td><input class="inp-text" name="pass" id="password" type="password" size="30" /></td>
			</tr>
			<tr>
			<td></td>
				<td class="submit-button-middle">
				<input type="submit" value="Register"/>
				
				
			</tr>
		</table>
	</form>
	
<?php include("includes/footer.php");?>

</body>
</html>