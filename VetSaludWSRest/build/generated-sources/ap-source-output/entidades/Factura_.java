package entidades;

import entidades.Cita;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-06T14:09:13")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2025-06-06T10:25:05")
>>>>>>> origin/main
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, String> metodoPago;
    public static volatile SingularAttribute<Factura, Cita> idCita;
    public static volatile SingularAttribute<Factura, BigDecimal> total;
    public static volatile SingularAttribute<Factura, Date> fechaEmision;
    public static volatile SingularAttribute<Factura, Integer> id;

}