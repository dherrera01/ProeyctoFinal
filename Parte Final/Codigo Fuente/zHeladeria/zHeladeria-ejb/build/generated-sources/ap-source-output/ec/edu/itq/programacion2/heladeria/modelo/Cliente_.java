package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-22T14:33:29")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> emailCliente;
    public static volatile SingularAttribute<Cliente, Boolean> estado;
    public static volatile SingularAttribute<Cliente, String> idCliente;
    public static volatile SingularAttribute<Cliente, String> nombreCliente;
    public static volatile SingularAttribute<Cliente, String> ci;
    public static volatile ListAttribute<Cliente, Venta> ventaList;
    public static volatile SingularAttribute<Cliente, String> apellidoCliente;
    public static volatile SingularAttribute<Cliente, String> direccionCliente;
    public static volatile SingularAttribute<Cliente, String> telefonoCliente;

}