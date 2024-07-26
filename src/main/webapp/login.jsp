<%--
  Created by IntelliJ IDEA.
  User: Will
  Date: 18/07/2024
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login</title>
    <link rel="stylesheet" href="style.css" />


</head>
<body>


<!-- Navbar -->
<jsp:include page="menubar.jsp" />

<div class="containerformulario">
    <h2>Faça login</h2>
    <form action="login" method="post">

        <label for="nome">Nome completo:</label>
        <input type="text" id="nome" name="nome" required />
        <!-- required para obrigar a preencher um campo  -->

        <label for="email">Email:</label>
        <input type="text" id="email" name="email" required />

        <button type="submit">Login</button>
    </form>
</div>

</body>
</html>
