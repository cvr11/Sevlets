<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:include page="header.jsp"></jsp:include>

	<%
	String message = (String)request.getAttribute("ERRORMESSAGE");
	if(message !=null){
		out.println(message);
	}
	%>
	
	
	<form action="Registation" method="post">
	
	<br>
	<br>
	<table border="50">
	<tr>
	<td>First Name :</td>
    <td><input type="text" name="firstName"></td>
	</tr>
	
	<tr>
	<td>LAst Name :</td>
    <td><input type="text" name="lastName"></td>
	</tr>
	
	<tr>
	<td>Gender :</td>
    <td><select name="gender">
	  <option value ="Male">Male</option>
	  <option value ="Female">Female</option>
			</select></td>
	</tr>
	
	<tr>
	<td>City :</td>
    <td><input type="text" name="city"></td>
	</tr>
	
	<tr>
	<td>Hobbies:</td>
    <td><textarea rows ="5" cols ="20" name="hobbies"></textarea></td>
	</tr>
	
	</table>

	<input type ="submit" value="register"/> &ndsp;<input type="button" value="Cancle">
	
   </form>
</body>
</html>