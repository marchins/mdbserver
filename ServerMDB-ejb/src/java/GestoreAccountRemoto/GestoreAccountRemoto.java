package GestoreAccountRemoto;
import LogicaDominio.Account;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Stateless
public class GestoreAccountRemoto implements GestoreAccountRemotoRemote {

    @Override
    public Boolean verificaDatiAccount(String username, String password, String nome, String cognome, String email, String dataNascita) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("ServerMDBPU");
        EntityManager em = emf.createEntityManager();
        Account account = new Account();
        List<Account> accounts = (List<Account>) em.createQuery("SELECT a FROM Account a WHERE a.username = '" + username + "'", Account.class).getResultList();
      
        if (accounts.size() > 0) {
            em.close();
            return false;
        }
        
        account.setNome(nome);
        account.setCognome(cognome);
        account.setUsername(username);
        account.setPassword(password);
        account.setEmail(email);
        account.setDataNascita(dataNascita);
        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public Account verificaDatiLogin(String username, String password) {
        EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("ServerMDBPU");
        EntityManager em = emf.createEntityManager();
        List<Account> accounts = (List<Account>) em.createQuery(
                "SELECT a "
                        + "FROM Account a "
                        + "WHERE a.username = '" + username + "' AND a.password = '" + password + "'",
                Account.class).getResultList();
        if (accounts.size() == 1) {
            return accounts.get(0);
        }
        
        
     return null;   
    }

    
    

}
