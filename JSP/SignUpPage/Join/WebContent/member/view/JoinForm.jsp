<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-Type" content="text/html"; charset =UTF-8">
<link rel="stylesheet" type="text/css" href="../../css/custom.css">
<title>Sign Up</title>
</head>
<body>
	<!-- div margin auto -->
	<div id="wrap"><br><br>
		<b><font size="6" color="gray">Sign up page</b></font> <br> <br>
		<br>

		<form method="post" action="../pro/JoinPro.jsp">
			<table>
				<tr>
					<td id = title>ID</td>
					<td><input type="text" name="id" maxlength="20"> 
						<input type="button" value="check"></td>
				</tr>
				<tr>
					<td id = title>Password</td>
					<td><input type="text" name="pw" maxlength="15"></td>						
				</tr>
				<tr>
					<td id = title>Confirm <br>Password</td>
					<td><input type="text" name="checkpw" maxlength="15"></td> 						
				</tr>
				<tr>
					<td id = title>First Name</td>
					<td><input type="text" name="firstName" maxlength="40"></td> 						
				</tr>
				<tr>
					<td id = title>Last Name</td>
					<td><input type="text" name="lastName" maxlength="40"></td> 						
				</tr>
				<tr>
					<td id = title>Your Birthday</td>
					<td>
					<input type="text" name="birthyy" maxlength="4" placeholder="year" size ="6" style="width: 50px;" > 		
					<select name ="birthmm">
						<option value="">month</option>
						<option value="01">1</option>
						<option value="02">2</option>
						<option value="03">3</option>
						<option value="04">4</option>
						<option value="05">5</option>
						<option value="06">6</option>
						<option value="07">7</option>
						<option value="08">8</option>
						<option value="09">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
					</select>	
					<input type="text" name="birthdd" maxlength="4" placeholder="day" size ="4" style="width: 45px;"> 	
					</td>	
				</tr>
				<tr>
					<td id = title>Email</td>
					<td><input type="text" name="mail" maxlength="30"> </td>						
				</tr>
				<tr>
					<td id = title>* Subscribe?</td>
					<td>
						<input type="radio" name="consent" value="y" checked>Yes
						<input type="radio" name="consent" value="n" checked>No
					</td>
				</tr>
				
				<tr>
					<td id = title>Phone Number</td>
					<td><input type="text" name="phone"></td> 						
				</tr>
				<tr>
					<td id = title>Address</td>
					<td><input type="text" name="address" maxlength="50"> 						
				</tr>
				
			</table>
			<br>
			<input type="submit" value="Sign up"/>
			<input type="submit" value="Cancel" />
			<br><br>
		</form>
	</div>

</body>
</html>