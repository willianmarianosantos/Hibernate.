package projeto1.projeto1.DAO;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import projeto1.projeto1.SysUser;

import java.util.List;

public class SysUserDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Postgres");
    private static final EntityManager entityManager = emf.createEntityManager();


    public static void save(SysUser parametro) {
        entityManager.getTransaction().begin();

        SysUser mergedSysUser = entityManager.merge(parametro);
        entityManager.persist(mergedSysUser);

        entityManager.getTransaction().commit();
        entityManager.close();
    }


    public static List<SysUser> findAll() {
        TypedQuery<SysUser> tmp_query = entityManager.createQuery("select alias from SysUser alias", SysUser.class);
        return tmp_query.getResultList();
    }


    public void delete(SysUser parametro) {
        entityManager.getTransaction().begin();
        entityManager.remove(parametro);
        entityManager.getTransaction().commit();
    }


    public void deleteByID(Long idParametro) {
        SysUser Search = entityManager.find(SysUser.class, idParametro);
        entityManager.remove(Search);
    }


    public SysUser findByID(Long id) {
        return entityManager.find(SysUser.class, id);
    }


    public void updateByID(Integer idParameter, SysUser newValueParameter) {
        SysUser oldValue = entityManager.find(SysUser.class, idParameter);

        if (oldValue != null) {
            entityManager.getTransaction().begin();
            oldValue.setName(newValueParameter.getName());
            oldValue.setEmail(newValueParameter.getEmail());
            oldValue.setPassword(newValueParameter.getPassword());
            entityManager.merge(oldValue);
            entityManager.getTransaction().commit();
        }
    }

    public static boolean existsByNameAndEmail(SysUser parameter) {
        SysUser existingClient = entityManager.find(SysUser.class, parameter);
        if (existingClient != null) {   return true;    }
        else return false;
    }


    public SysUser findByNameAndEmail(String name_parameter , String email_parameter ) {
        TypedQuery<SysUser> tmp_query = entityManager.createQuery
                ("select alias from SysUser alias where name = :QrySetName and email = :QrySetEmail"
                        , SysUser.class);
        tmp_query.setParameter("QrySetName" , name_parameter);
        tmp_query.setParameter("QrySetEmail" , email_parameter);
        if(tmp_query.getSingleResult() != null || !tmp_query.getResultList().isEmpty()) {
            return tmp_query.getSingleResult();
        }
        return null;
    }
}


/* /////////////////////////////////////////////////////////////////////////////////////

 EntityManager.find()     DE FORMA MAIS VERBOSA COM QUERY JQPL

TypedQuery<SysUser> tmp_query = entityManager.createQuery("select alias from SysUser " +
        "alias where alias.id = :id",SysUser.class);
//Setando a variável da query com o valor através pelo :id com o valor de parâmetro
        tmp_query.setParameter("id" , idParameter);
/////////////////////////////////////////////////////////////////////////////////////////
//A query retorna um array, com a linha abaixo será convertido para um único objeto
SysUser oldSysUser = tmp_query.getSingleResult();

///////////////////////////////////////////////////////////////////////////////////////*/
