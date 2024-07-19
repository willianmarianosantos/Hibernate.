package projeto1.projeto1;

import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

@WebServlet("/login")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getServletPath();
        if (action.equals("/login")) {
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            request.setAttribute("email", email); /* Vai mostrar o email coletado posteriormente*/
            if (email.equals("willian_guns@hotmail.com") && password.equals("123")) {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("loginFail.jsp").forward(request, response);
            }
        }
    }
}