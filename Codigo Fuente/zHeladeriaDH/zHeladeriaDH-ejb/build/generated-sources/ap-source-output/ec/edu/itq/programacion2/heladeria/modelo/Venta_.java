package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Cliente;
import ec.edu.itq.programacion2.heladeria.modelo.DetalleVenta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-15T15:06:48")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, String> total;
    public static volatile SingularAttribute<Venta, Cliente> idCliente;
    public static volatile SingularAttribute<Venta, String> iva;
    public static volatile SingularAttribute<Venta, String> descuento;
    public static volatile ListAttribute<Venta, DetalleVenta> detalleVentaList;
    public static volatile SingularAttribute<Venta, String> formaPago;
    public static volatile SingularAttribute<Venta, String> idVenta;
    public static volatile SingularAttribute<Venta, String> fechaVenta;

}