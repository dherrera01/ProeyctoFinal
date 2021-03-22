package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.DetalleIngreso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-22T14:33:29")
@StaticMetamodel(Ingreso.class)
public class Ingreso_ { 

    public static volatile SingularAttribute<Ingreso, String> fecha;
    public static volatile SingularAttribute<Ingreso, String> total;
    public static volatile SingularAttribute<Ingreso, String> idIngreso;
    public static volatile SingularAttribute<Ingreso, String> comprobante;
    public static volatile SingularAttribute<Ingreso, String> proveedor;
    public static volatile ListAttribute<Ingreso, DetalleIngreso> detalleIngresoList;

}