<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Amazon Pay Simulator</title>
</head>
<body>
<style> 
input[type=button], input[type=submit], input[type=reset] {
    background-color: #FFA500;
    border: none;
    color: white;
    padding: 16px 32px;
    text-decoration: none;
    margin: 4px 2px;
    cursor: pointer;
    text-align: center;
}
</style>

	<b>Welcome to Amazon Pay Simulator</b>

	<form action="/redirect" th:action="@{/redirect}" method="get">
		<table>
			<tr>
				<td><a><img src="images/amazon_pay_logo.jpg"
						height="150px" width="350px"></a></td>
			</tr>
		</table>
		<input type="submit" value="pay amount"/>
	</form>



</body>
</html>