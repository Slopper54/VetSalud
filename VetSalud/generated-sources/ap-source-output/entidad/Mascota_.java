package entidad;

import entidad.Cita;
import entidad.Dueno;
import entidad.Historiaclinica;
import entidad.Tratamiento;
import entidad.Vacunacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-08T13:00:07")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, String> especie;
    public static volatile CollectionAttribute<Mascota, Tratamiento> tratamientoCollection;
    public static volatile CollectionAttribute<Mascota, Cita> citaCollection;
    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, Date> fechaNacimiento;
    public static volatile CollectionAttribute<Mascota, Vacunacion> vacunacionCollection;
    public static volatile SingularAttribute<Mascota, Integer> id;
    public static volatile SingularAttribute<Mascota, String> nombre;
    public static volatile SingularAttribute<Mascota, Dueno> idDueno;
    public static volatile CollectionAttribute<Mascota, Historiaclinica> historiaclinicaCollection;

}