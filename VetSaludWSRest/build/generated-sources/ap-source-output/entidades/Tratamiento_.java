package entidades;

import entidades.Mascota;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-06T10:25:05")
@StaticMetamodel(Tratamiento.class)
public class Tratamiento_ { 

    public static volatile SingularAttribute<Tratamiento, String> descripcion;
    public static volatile SingularAttribute<Tratamiento, Date> fechaInicio;
    public static volatile SingularAttribute<Tratamiento, String> medicamento;
    public static volatile SingularAttribute<Tratamiento, Integer> id;
    public static volatile SingularAttribute<Tratamiento, Date> fechaFin;
    public static volatile SingularAttribute<Tratamiento, Mascota> idMascota;

}