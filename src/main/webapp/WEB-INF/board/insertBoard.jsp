<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Write Board</title>
</head>
<body>
	<h3>Write new content</h3>
	<hr>
	<form action = "insertBoard" method = "post">
		<table border = 1 cellpadding = 0 cellspacing = 0>
			<tr>
				<td bgcolor = orange width = 70> title </td>
				<td align = left><input type = text name = "title"> </td>
			</tr>
			<tr>
				<td bgcolor = orange width = 70> writer </td> 
				<td align = left> <input type = text name = "writer"> </td>
			</tr>
			<tr>
				<td bgcolor = orange width = 70> content </td>
				<td align = left><textarea name = content cols = 40 rows = 10></textarea> </td>
			</tr>
			<tr>
				<td colspan = 2 align = center > <input type = submit value = "submit"> </td>
			</tr>
		</table>
	</form>
</body>
</html>