package entidades;

import entidades.Factura;
import entidades.Mascota;
import entidades.Veterinario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-06T10:25:05")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Date> fecha;
    public static volatile SingularAttribute<Cita, String> motivo;
    public static volatile SingularAttribute<Cita, Factura> factura;
    public static volatile SingularAttribute<Cita, Integer> id;
    public static volatile SingularAttribute<Cita, Veterinario> idVeterinario;
    public static volatile SingularAttribute<Cita, Mascota> idMascota;

}