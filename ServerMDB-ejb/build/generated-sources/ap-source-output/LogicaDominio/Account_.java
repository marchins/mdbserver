package LogicaDominio;

import LogicaDominio.CopiaUtente;
import LogicaDominio.CredenzialiSocialNetwork;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-12T10:54:34")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile CollectionAttribute<Account, CopiaUtente> copieUtente;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile CollectionAttribute<Account, CredenzialiSocialNetwork> credenzialiSocialNetwork;
    public static volatile SingularAttribute<Account, String> dataNascita;
    public static volatile SingularAttribute<Account, String> cognome;
    public static volatile SingularAttribute<Account, String> nome;
    public static volatile SingularAttribute<Account, Integer> id;
    public static volatile SingularAttribute<Account, String> email;
    public static volatile SingularAttribute<Account, String> username;

}