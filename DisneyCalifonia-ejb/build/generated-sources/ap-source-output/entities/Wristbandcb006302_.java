package entities;

import entities.Elockercb006302;
import entities.Ticketcb006302;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-08-25T15:30:35")
@StaticMetamodel(Wristbandcb006302.class)
public class Wristbandcb006302_ { 

    public static volatile SingularAttribute<Wristbandcb006302, String> wristId;
    public static volatile CollectionAttribute<Wristbandcb006302, Elockercb006302> elockercb006302Collection;
    public static volatile SingularAttribute<Wristbandcb006302, Integer> creditLimit;
    public static volatile CollectionAttribute<Wristbandcb006302, Ticketcb006302> ticketcb006302Collection;
    public static volatile SingularAttribute<Wristbandcb006302, Integer> expence;

}