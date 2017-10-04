<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${projectTitle}</title>
</head>
<body>
<h2>Modules</h2>
<ul title="Modules">
    <li><a href="${pageContext.request.contextPath}/hello">#1 Hello</a></li>
    <li><a href="${pageContext.request.contextPath}/dice">#2 Dice</a></li>
    <li><a href="${pageContext.request.contextPath}/users">#3 Users from Database</a></li>
    <li><a href="${pageContext.request.contextPath}/getid">#4 Get Unique Id</a></li>
</ul>
</body>
</html>
