package projeto1.projeto1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import projeto1.projeto1.DAO.LivrosDAO;

import java.util.List;


public class teste {

    /* Cria a conexao entre a perssistencia  de dados e o banco */

     public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Postgres");
     private static final EntityManager entityManager = entityManagerFactory.createEntityManager();


    public static void main(String[] args) {


        LivrosDAO dao = new LivrosDAO(entityManager);

        Livros livros2 = new Livros();
        livros2.setNome("Silmariolon");
        livros2.setCategoria("Fantasia");
        livros2.setQUANTIDADE(10);
        dao.salvar(livros2);


        List<Livros> listaLivros = dao.ListarTodos();
        for (Livros livro : listaLivros) {
            System.out.println( "ID : " + livro.getId() + " Nome do livro : " + livro.getNome() + " Categoria : " + livro.getCategoria() +" Quantidade :" + livro.getQUANTIDADE());

        }

    }

}
