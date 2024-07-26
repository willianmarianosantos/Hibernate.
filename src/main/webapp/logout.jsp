<%@ page import="projeto1.projeto1.SysUser" %>
<%@ page import="jakarta.websocket.Session" %>
<%
  session.setAttribute("SessionUser",null);
  request.getRequestDispatcher("index.jsp").forward(request, response);
%>

