package entidad;

import entidad.Factura;
import entidad.Mascota;
import entidad.Veterinario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-06T13:42:13")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Date> fecha;
    public static volatile SingularAttribute<Cita, String> motivo;
    public static volatile SingularAttribute<Cita, Factura> factura;
    public static volatile SingularAttribute<Cita, Integer> id;
    public static volatile SingularAttribute<Cita, Veterinario> idVeterinario;
    public static volatile SingularAttribute<Cita, Mascota> idMascota;

}