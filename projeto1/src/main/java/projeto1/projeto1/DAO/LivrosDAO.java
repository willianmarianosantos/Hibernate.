package projeto1.projeto1.DAO;

import jakarta.persistence.EntityManager;
import projeto1.projeto1.Livros;

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
        // Finaliza a transação.
        entityManager.getTransaction().commit();
    }

    public void atualizar(Livros livro) {
        entityManager.getTransaction().begin();
        entityManager.merge(livro);
        entityManager.getTransaction().commit();
    }

    public void deletar(Livros livro) {
        entityManager.getTransaction().begin();
        entityManager.remove(livro);
        entityManager.getTransaction().commit();
    }

    public Livros buscaPorId(int id) {
        return entityManager.find(Livros.class, id);
    }

    public List<Livros> ListarTodos() {
        return entityManager.createQuery("select l from Livros l", Livros.class).getResultList();

    }

}