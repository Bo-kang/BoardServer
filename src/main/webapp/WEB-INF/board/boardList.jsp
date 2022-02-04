<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Board List</title>
</head>
<body>
<center>
<h1>Board List</h1>
<table boarder = "1" cellpadding = "0" cellspacing = "0" width = "700">
<tr>
	<th bgcolor = "orange" width = "100">number</th>
	<th bgcolor = "orange" width = "100">title</th>
	<th bgcolor = "orange" width = "100">writer</th>
	<th bgcolor = "orange" width = "100">created date</th>
	<th bgcolor = "orange" width = "100">view count</th>
</tr>
<c:forEach var = "board" items = "${boardList}">
<tr>
	<td>${board.seq}</td>
	<td align = "left"><a href = "getBoard?seq=${board.seq}">${board.title}</a></td>
	<td>${board.member.id }</td>
	<td><fmt:formatDate value="${board.createDate }" pattern = "yyyy-MM-dd"></fmt:formatDate></td>
	<td>${board.count}</td>
</tr>
</c:forEach>
</table>
</body>
</html>