<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>
<p>
<%--    jsp expression--%>
    <%= new Date() %>
</p>

<%--scriptlets tag--%>
<% for (int i = 0; i<=11; i++) { %>
        <li>Items: <%=i%></li>
    <%}%>

<%--
The differences between scriptlets tag and jsp expression tag is:
    Scriptlets tag use for embeded java code in
    Jsp expression tag just use for java but for expressing its value of the java expression (biểu thức java)
 --%>
</body>
</html>