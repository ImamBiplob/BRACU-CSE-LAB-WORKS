<?php
	switch ($_SERVER["SCRIPT_NAME"]) {
		case "/myProject/about.php":
			$CURRENT_PAGE = "About"; 
			$PAGE_TITLE = "About Us";
			break;
		case "/myProject/contact.php":
			$CURRENT_PAGE = "Contact"; 
			$PAGE_TITLE = "Contact Us";
			break;
		case "/myProject/register.php":
			$CURRENT_PAGE = "Register"; 
			$PAGE_TITLE = "Register Here";
			break;	
		default:
			$CURRENT_PAGE = "Index";
			$PAGE_TITLE = "Homepage||Blood Bank";
	}
?>