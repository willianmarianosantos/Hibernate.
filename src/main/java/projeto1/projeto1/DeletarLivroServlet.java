package projeto1.projeto1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import projeto1.projeto1.DAO.LivrosDAO;

import java.io.IOException;


@WebServlet("/deletarLivro")
public class DeletarLivroServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int livroId = Integer.parseInt(request.getParameter("id"));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Postgres");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        LivrosDAO livrosDAO = new LivrosDAO(entityManager);

        livrosDAO.deletarPorId(livroId);

        entityManager.close();

        response.sendRedirect("exibirLivros");
    }
}
