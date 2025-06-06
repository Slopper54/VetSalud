package entidades;

import entidades.Mascota;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-06T14:09:13")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-06T10:25:05")
>>>>>>> origin/main
@StaticMetamodel(Vacunacion.class)
public class Vacunacion_ { 

    public static volatile SingularAttribute<Vacunacion, Date> fecha;
    public static volatile SingularAttribute<Vacunacion, String> tipoVacuna;
    public static volatile SingularAttribute<Vacunacion, String> dosis;
    public static volatile SingularAttribute<Vacunacion, Integer> id;
    public static volatile SingularAttribute<Vacunacion, Mascota> idMascota;

}