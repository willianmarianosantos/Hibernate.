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
            String name = request.getParameter("nome");
            String email = request.getParameter("email");
            request.setAttribute("email", email); /* Vai mostrar o email coletado posteriormente*/
            request.setAttribute("name", name); /* Vai mostrar o nome coletado posteriormente*/
            if (email.equals("willian@hotmail.com") && name.equals("willian")) {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("loginFail.jsp").forward(request, response);
            }
        }
    }
}