<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/8/2023
  Time: 8:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>

  <style>
    .flex-column {
      display: flex;
      flex-direction: column;
      width: 15%;
    }
  </style>
</head>
<body>
    <form action="/cc_war_exploded/register" method="POST" class="flex-column">

      <label for="email">Email:</label>
      <input type="email" id="email" name="email">

      <label for="name">Name:</label>
      <input type="text" id="name" name="name">

      <label for="age">Age:</label>
      <input type="number" id="age" name="age">

      <label for="password">Password</label>
      <input type="password" id="password" name="password">

      <label for="repassword">Validate password</label>
      <input type="password" id="repassword" name="repassword">

      <p>${error}</p>

      <button type="submit">Register</button>

    </form>
</body>
</html>
