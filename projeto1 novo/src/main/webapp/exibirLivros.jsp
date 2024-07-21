<%@ page import="projeto1.projeto1.Livros" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exibir Livros</title>
</head>
<body>
<h1>Livros Disponíveis</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Categoria</th>
        <th>Quantidade</th>
    </tr>
    </thead>

    <% for (Livros livro : (List<Livros>) request.getAttribute("livros")) { %>
    <tr>
        <td><%= livro.getId() %></td>
        <td><%= livro.getNome() %></td>
        <td><%= livro.getCategoria() %></td>
        <td><%= livro.getQUANTIDADE() %></td>
    </tr>
    <% } %>

</table>
</body>
</html>
