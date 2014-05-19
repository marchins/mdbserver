package LogicaDominio;

import LogicaDominio.CopiaUtente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-12T10:54:34")
@StaticMetamodel(Libro.class)
public class Libro_ { 

    public static volatile SingularAttribute<Libro, String> copertina;
    public static volatile CollectionAttribute<Libro, CopiaUtente> copieUtente;
    public static volatile SingularAttribute<Libro, String> titolo;
    public static volatile SingularAttribute<Libro, String> casaEditrice;
    public static volatile SingularAttribute<Libro, String> isbn;
    public static volatile SingularAttribute<Libro, String> dataPubblicazione;
    public static volatile SingularAttribute<Libro, String> autore;

}