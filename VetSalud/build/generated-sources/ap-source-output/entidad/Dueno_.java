package entidad;

import entidad.Mascota;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-06T13:42:13")
@StaticMetamodel(Dueno.class)
public class Dueno_ { 

    public static volatile CollectionAttribute<Dueno, Mascota> mascotaCollection;
    public static volatile SingularAttribute<Dueno, Integer> id;
    public static volatile SingularAttribute<Dueno, String> telefono;
    public static volatile SingularAttribute<Dueno, String> nombre;
    public static volatile SingularAttribute<Dueno, String> email;

}