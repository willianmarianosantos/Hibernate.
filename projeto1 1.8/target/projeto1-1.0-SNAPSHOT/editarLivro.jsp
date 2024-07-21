<%--
  Created by IntelliJ IDEA.
  User: Will
  Date: 21/07/2024
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:include page="menubar.jsp" />


<form action="editarLivro" method="post">
    <input type="hidden" name="id" value="${livro.id}">
    Título: <input type="text" name="nome" value="${livro.nome}"><br>
    Categoria: <input type="text" name="categoria" value="${livro.categoria}"><br>
    Quantidade: <input type="text" name="quantidade" value="${livro.QUANTIDADE}"><br>
    <input type="submit" value="Salvar">
</form>

</body>
</html>
