<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<%-- Debugging para verificar se a lista de livros está presente --%>
<% if (request.getAttribute("livros") == null) { %>
<h2>Não há livros disponíveis</h2>
<% } else { %>
<h2>Livros estão presentes na lista</h2>
<% } %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exibir Livros</title>
</head>
<body>
<jsp:include page="menubar.jsp" />
<h1>Livros Disponíveis</h1>
<table border="1">
    <thead>
    <tr>
        <th>id</th>
        <th>nome</th>
        <th>categoria</th>
        <th>QUANTIDADE</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="livro" items="${livros}">
        <tr>
            <td>${livro.id}</td>
            <td>${livro.nome}</td>
            <td>${livro.categoria}</td>
            <td>${livro.QUANTIDADE}</td>
            <td><a href="editarLivro?id=${livro.id}">Editar</a></td>
            <td><a href="deletarLivro?id=${livro.id}">Deletar</a></td>
        </tr>
    </c:forEach>
    </tbody>




</table>
</body>
</html>
