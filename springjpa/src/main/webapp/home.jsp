<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="addEmp">
Enter employee id:   <input type="text" name="eid"><br>
Enter employee name: <input type="text" name="ename">
<input type="submit" value="Submit">
</form>

<form action="deleteEmp">
Enter the id to be deleted:   <input type="text" name="eid"><br>
<input type="submit" value="Submit">
</form>

<form action="readEmp">
Enter the id to be displayed:   <input type="text" name="eid"><br>
<input type="submit" value="Submit">
</form>

<form action="updateEmp" method="post">
Enter id to be updated: <input type="text" name="eid"><br>
Enter new ename to be updated: <input type="text" name="ename"><br>
<input type="submit" value="Submit"> 
</form>
</body>
</html>