package entidad;

import entidad.Mascota;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-08T13:00:07")
@StaticMetamodel(Historiaclinica.class)
public class Historiaclinica_ { 

    public static volatile SingularAttribute<Historiaclinica, Date> fecha;
    public static volatile SingularAttribute<Historiaclinica, String> resumen;
    public static volatile SingularAttribute<Historiaclinica, Integer> id;
    public static volatile SingularAttribute<Historiaclinica, Mascota> idMascota;

}