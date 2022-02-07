<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Detail</title>
</head>
<body>
<form action = updateBoard method = post>
<input name = "seq" type = "hidden" value = ${board.seq} >
<table border = 1 cellpadding = 0 cellspacing = 0>
<tr>
	<td bgcolor = orange width = 70>제목</td>
	<td align = left><input name = title type = text value = ${board.title}></td>
</tr>
<tr>
	<td bgcolor = orange >내용</td>
	<td align = left><textarea name = content cols = 40 rows = 10>${board.content}</textarea></td>
</tr>
<tr>
	<td bgcolor = orange >조회수</td>
	<td align = left> ${board.count} </td>
</tr>
<tr>
	<td colspan = 2 align = center> <input type = submit value = "Update"/> </td>
</tr>

</table>
</form>
<hr>
<a href = "insertBoard">글 등록</a>
<a href = "deleteBoard?seq=${board.seq}">글 삭제</a>
<a href = "boardList">글 목록</a>
</body>
</html>