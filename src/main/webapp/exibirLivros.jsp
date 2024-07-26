<%@ page import="projeto1.projeto1.DAO.LivrosDAO" %>
<%@ page import="jakarta.persistence.EntityManager" %>
<%@ page import="jakarta.persistence.EntityManagerFactory" %>
<%@ page import="jakarta.persistence.Persistence" %>
<%@ page import="java.util.List" %>
<%@ page import="projeto1.projeto1.Livros" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Postgres");
    EntityManager em = emf.createEntityManager();
    LivrosDAO tmp_dao = new LivrosDAO(em);
    List<Livros> tmp_list = tmp_dao.ListarTodos();
    request.setAttribute("livros", tmp_list);
    em.close();
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exibir Livros</title>
</head>
<body>
<jsp:include page="menubar.jsp" />
<div class="grid" style="grid-template-columns: repeat(${not empty SessionUser ? 6 : 4}, 1fr);">
    <div class="grid-item header">id</div>
    <div class="grid-item header">nome</div>
    <div class="grid-item header">categoria</div>
    <div class="grid-item header">QUANTIDADE</div>
    <c:if test="${not empty SessionUser}">
        <div class="grid-item header"></div>
        <div class="grid-item header"></div>
    </c:if>
    <c:forEach var="livro" items="${livros}">
        <div class="grid-item">${livro.id}</div>
        <div class="grid-item">${livro.nome}</div>
        <div class="grid-item">${livro.categoria}</div>
        <div class="grid-item">${livro.QUANTIDADE}</div>
        <c:if test="${not empty SessionUser}">
            <div class="grid-item">
                <a href="editarLivro?id=${livro.id}" class="button ">Editar</a>
            </div>
            <div class="grid-item">
                <a href="deletarLivro?id=${livro.id}" class="button ">Deletar</a>
            </div>
        </c:if>
    </c:forEach>
</div>
</body>
<footer>
    <jsp:include page="footer.jsp" />
</footer>
</html>
