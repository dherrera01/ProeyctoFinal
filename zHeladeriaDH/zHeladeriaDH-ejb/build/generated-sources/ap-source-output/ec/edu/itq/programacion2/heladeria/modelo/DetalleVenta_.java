package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Helado;
import ec.edu.itq.programacion2.heladeria.modelo.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-15T15:06:48")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ { 

    public static volatile SingularAttribute<DetalleVenta, Helado> idHelado;
    public static volatile SingularAttribute<DetalleVenta, String> subtotal;
    public static volatile SingularAttribute<DetalleVenta, String> descuento;
    public static volatile SingularAttribute<DetalleVenta, Long> idDetalleVenta;
    public static volatile SingularAttribute<DetalleVenta, String> cantidad;
    public static volatile SingularAttribute<DetalleVenta, Venta> idVenta;

}