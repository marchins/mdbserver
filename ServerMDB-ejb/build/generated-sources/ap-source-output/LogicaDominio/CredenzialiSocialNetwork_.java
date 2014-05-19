package LogicaDominio;

import Enumerations.SocialNetwork;
import LogicaDominio.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-12T10:54:34")
@StaticMetamodel(CredenzialiSocialNetwork.class)
public class CredenzialiSocialNetwork_ { 

    public static volatile SingularAttribute<CredenzialiSocialNetwork, SocialNetwork> socialNetwork;
    public static volatile SingularAttribute<CredenzialiSocialNetwork, String> accessToken;
    public static volatile SingularAttribute<CredenzialiSocialNetwork, String> accessTokenSecret;
    public static volatile SingularAttribute<CredenzialiSocialNetwork, Account> account;

}