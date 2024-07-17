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


        //    Livros livros2 = new Livros();
        //    livros2.setNome("Silmariolon");
        //    livros2.setCategoria("Fantasia");
        //    livros2.setQUANTIDADE(10);
        //    dao.salvar(livros2);


        //    dao.deletarPorId(5);

        // int idLivro = 8; // Substitua 1 pelo ID do livro que deseja atualizar
        // Livros livroAtualizado = new Livros();
        // livroAtualizado.setId(idLivro); // Setar o ID do livro que quer atualizar
        // livroAtualizado.setNome(" Teste de atualização");
        // livroAtualizado.setCategoria("Magico");
        // livroAtualizado.setQUANTIDADE(10);
        // dao.atualizarPorid(idLivro, livroAtualizado);


        //    int idLivro = 6; // Substitua 1 pelo ID do livro que deseja buscar, quando usar no front usar esta função
        //    Livros livroEncontrado = dao.buscaPorId(idLivro);
        //    if (livroEncontrado != null) {
        //        System.out.println("Livro encontrado:");
        //        System.out.println("ID : " + livroEncontrado.getId() + " Nome do livro : " + livroEncontrado.getNome() + " Categoria : " + livroEncontrado.getCategoria() + " Quantidade :" + livroEncontrado.getQUANTIDADE());
        //    } else {
        //        System.out.println("Livro com ID " + idLivro + " não encontrado.");
        //    }


        List<Livros> listaLivros = dao.ListarTodos();
        for (Livros livro : listaLivros) {
            System.out.println("ID : " + livro.getId() + " Nome do livro : " + livro.getNome() + " Categoria : " + livro.getCategoria() + " Quantidade :" + livro.getQUANTIDADE());

        }


    }

}
