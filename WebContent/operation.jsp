<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>operation</title>
</head>
<body>
<form action="operationprocess.jsp">  
Enter Amount:<input type="text" name="amount"/><br>  
  
Choose Operation:  
Deposit<input type="radio" name="operation" value="deposit"/>  
Withdraw<input type="radio" name="operation" value="withdraw"/>  
Check balance<input type="radio" name="operation" value="checkbalance"/>  
<br>  
<input type="submit" value="submit">  
</form>  
</body>
</html>