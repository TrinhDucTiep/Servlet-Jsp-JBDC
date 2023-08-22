<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/8/2023
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload file</title>
</head>
<body>
    <h3>File upload:</h3>
    <form action="UploadServlet" method="post" enctype="multipart/form-data">
        <input type="file" name="file" size="50"/>
        <br/>
        <input type="submit" value="Upload file"/>
    </form>
</body>
</html>
