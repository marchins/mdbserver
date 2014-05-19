package LogicaDominio;

import Enumerations.Formato;
import Enumerations.StatoLettura;
import Enumerations.Valutazione;
import LogicaDominio.Account;
import LogicaDominio.Categoria;
import LogicaDominio.Libro;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-12T10:54:34")
@StaticMetamodel(CopiaUtente.class)
public class CopiaUtente_ { 

    public static volatile SingularAttribute<CopiaUtente, Libro> libro;
    public static volatile SingularAttribute<CopiaUtente, StatoLettura> statoLettura;
    public static volatile SingularAttribute<CopiaUtente, Integer> numeroCopia;
    public static volatile SingularAttribute<CopiaUtente, String> copertinaLocale;
    public static volatile SingularAttribute<CopiaUtente, Formato> formato;
    public static volatile SingularAttribute<CopiaUtente, String> posizioneNellaLibreria;
    public static volatile SingularAttribute<CopiaUtente, String> nomelibreria;
    public static volatile SingularAttribute<CopiaUtente, String> id;
    public static volatile CollectionAttribute<CopiaUtente, Categoria> categorieAssegnate;
    public static volatile SingularAttribute<CopiaUtente, Account> account;
    public static volatile SingularAttribute<CopiaUtente, Valutazione> valutazione;

}