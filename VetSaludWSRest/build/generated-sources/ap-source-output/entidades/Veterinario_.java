package entidades;

import entidades.Cita;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-06T14:09:13")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-06T10:25:05")
>>>>>>> origin/main
@StaticMetamodel(Veterinario.class)
public class Veterinario_ { 

    public static volatile CollectionAttribute<Veterinario, Cita> citaCollection;
    public static volatile SingularAttribute<Veterinario, Integer> id;
    public static volatile SingularAttribute<Veterinario, String> nombre;
    public static volatile SingularAttribute<Veterinario, String> especialidad;
    public static volatile SingularAttribute<Veterinario, String> email;

}