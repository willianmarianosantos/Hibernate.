package projeto1.projeto1.DAO;

import jakarta.persistence.EntityManager;
import projeto1.projeto1.Livros;

import javax.xml.namespace.QName;
import java.util.List;

public class LivrosDAO {

    public LivrosDAO(EntityManager entityManager){
       this.entityManager = entityManager;
    }

    private final EntityManager entityManager;

    public void salvar(Livros livro) {
        // Inicia uma transação com o banco de dados.
        entityManager.getTransaction().begin();
        entityManager.persist(livro);
        entityManager.getTransaction().commit();

    }

    public void atualizarPorid(int id, Livros livroAtualizado) {
        entityManager.getTransaction().begin();
        Livros livro = entityManager.find(Livros.class, id);
        if (livro != null) {
            livro.setNome(livroAtualizado.getNome());
            livro.setCategoria(livroAtualizado.getCategoria());
            livro.setQUANTIDADE(livroAtualizado.getQUANTIDADE());
            entityManager.merge(livro);
        }
        entityManager.getTransaction().commit();
    }


    public void deletarPorId(int id) {
        entityManager.getTransaction().begin();
        Livros livro = entityManager.find(Livros.class, id);
        if (livro != null) {
            entityManager.remove(livro);
        }
        entityManager.getTransaction().commit();
    }


    public Livros buscaPorId(int id) {
        return entityManager.find(Livros.class, id);
    }


    public List<Livros> ListarTodos() {
        return entityManager.createQuery("select l from Livros l", Livros.class).getResultList();

    }

}