<%--
  Created by IntelliJ IDEA.
  User: Will
  Date: 18/07/2024
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Cadastro</title>
    <link rel="stylesheet" href="style.css" />


</head>
<body>


<div class="navbar">
    <a href="index.jsp">Home</a>
    <a href="sobre.jsp">Sobre</a>
    <a href="livros.jsp">Livros</a>
    <a href="cadastro.jsp">Cadastro</a>
    <a href="login.jsp">Login</a>
</div>

<div class="containerformulario">
    <h2>Formulário de Cadastro</h2>
    <form action="#">

        <label for="nome">Nome completo:</label>
        <input type="text" id="nome" name="nome" required />
        <!-- required para obrigar a preencher um campo  -->

        <label for="idade">Idade:</label>
        <input type="number" id="idade" name="idade" required />

        <label for="cidade">Cidade:</label>
        <input type="text" id="cidade" name="cidade" required />

        <label for="telefone">Telefone:</label>
        <input type="text" id="telefone" name="telefone" required />

        <label for="email">Email:</label>
        <input type="text" id="email" name="email" required />

        <button type="submit">Enviar</button>
    </form>
</div>

</body>
</html>
