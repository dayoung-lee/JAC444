<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- import MemberBean --%>
<%@ page import="jsp.member.model.MemberBean" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-Type" content="text/html"; charset =UTF-8">
<link rel="stylesheet" type="text/css" href="../../css/custom.css">
<title>Sign Up Result</title>
</head>
<body>
	<jsp:useBean id = "memberBean" class = "jsp.member.model.MemberBean" />
	<jsp:setProperty name="memberBean" property="*" />
	<div id ="wrap">
		<br><br>
		<b><font size="6" color="gray">Welcome</b></font></b>
		<br><br>
		<font color = "blue"><%=memberBean.getFirstName()%> <%=memberBean.getLastName() %></font>! Welcome to our site.
		<br><br>
		<table>
			<tr>
				<td id = "title"> ID </td>
				<td><%=memberBean.getId() %></td>
			</tr>
			
			<tr>
				<td id = "title"> Password </td>
				<td><%=memberBean.getPw() %></td>
			</tr>
			
			<tr>
				<td id = "title"> Name </td>
				<td><%=memberBean.getFirstName() %> <%=memberBean.getLastName() %></td>
			</tr>
			
			<tr>
				<td id = "title"> Birthday </td>
				<td><%=memberBean.getBirthyy() %>.<%=memberBean.getBirthmm() %>.<%=memberBean.getBirthdd() %></td>
			</tr>
			
			<tr>
				<td id = "title"> Email </td>
				<td><%=memberBean.getMail() %></td>
			</tr>
			
			<tr>
				<td id = "title"> Subscribe </td>
				<td><%=memberBean.getConsent() %></td>
			</tr>
			
			<tr>
				<td id = "title"> Phone </td>
				<td><%=memberBean.getPhone() %></td>
			</tr>
			<tr>
				<td id = "title"> Address </td>
				<td><%=memberBean.getAddress() %></td>
			</tr>			
		</table>
		
		<br>
		<input type ="button" value ="Done"><br><br>
	</div>
</body>
</html>