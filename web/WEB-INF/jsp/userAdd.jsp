<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>User SignUp</title>

</head>

<body>
<h1>User SignUp</h1>
<br />
<style>
  .error {color: #ff0000;}
  
  .errorblock{
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding:8px;
	margin:16px;
    }
</style>


<c:url var="saveUserUrl" value="/users/save.html" />
<form:form commandName="users" method="POST" action="${saveUserUrl}">
	<table>
	<tr>
	<td><form:label path="uName">User Name :</form:label></td>
	<td><form:input path="uName"/></td>
	<td><form:errors path="uName" cssClass="error" /></td>
	</tr>
	<tr>
	<td><form:label path="uPWord">Password :</form:label></td>
	<td><form:password path="uPWord"/></td>
	<td><form:errors path="uPWord" cssClass="error" /></td>
	</tr>
	<tr>
	<td><form:label path="uConPWord">Confirm Password :</form:label></td>
	<td><form:password path="uConPWord"/></td>
	<td><form:errors path="uConPWord" cssClass="error" /></td>
	</tr>
	<tr>
	<td><form:label path="uEMail">E-Mail :</form:label></td>
	<td><form:input path="uEMail"/></td>
	<td><form:errors path="uEMail" cssClass="error" /></td>
	</tr>
	<tr>
	<td><input type="submit" value="Sign Up" /></td>
	</tr>
	</table>
</form:form>


</body>
</html>
