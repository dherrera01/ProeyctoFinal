package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Helado;
import ec.edu.itq.programacion2.heladeria.modelo.Ingreso;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-15T15:06:48")
@StaticMetamodel(DetalleIngreso.class)
public class DetalleIngreso_ { 

    public static volatile SingularAttribute<DetalleIngreso, Helado> idHelado;
    public static volatile SingularAttribute<DetalleIngreso, String> precio;
    public static volatile SingularAttribute<DetalleIngreso, Ingreso> idIngreso;
    public static volatile SingularAttribute<DetalleIngreso, String> cantidad;
    public static volatile SingularAttribute<DetalleIngreso, String> idDetalleIngreso;

}