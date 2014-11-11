<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Servlet task</title>
<script src="js/jquery.min.js"></script>
<script src="js/script.js"></script>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<form action="index.html" method="post" name="Data Input" >
            Enter your name:
            <input type="text" name="name" />
            Enter your sirname:
            <input type="text" name="sirname" />
            Enter your email:
            <input type="text" name="email" />
            <input type="submit" value="OK" />
        </form>
      <div class="errMsg">
		<c:out value="${errMsg}" />
	</div>
	<div class="empTable">
		<c:choose>
			<c:when test="${empty employees}">
				<!-- Inform user that there's no employee yet -->
				Any employee have been entered 	
				
			</c:when>
			<c:otherwise>
				<!--  Display table with employees
					For example, you can use jstl foreach loop: -->				
					<c:forEach var="employee" items="${employees}">
						<table>
						<tr>
							<td> <c:out value="${employee.name}" /></td> 
							<td> <c:out value="${employee.sirname }"/></td>
							<td> <c:out value="${employee.email }"/></td>
						</tr>
						</table>
					</c:forEach>
				
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>