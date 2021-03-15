package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.CategoriaHelado;
import ec.edu.itq.programacion2.heladeria.modelo.DetalleIngreso;
import ec.edu.itq.programacion2.heladeria.modelo.DetalleVenta;
import ec.edu.itq.programacion2.heladeria.modelo.EspecificacionHelado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-15T15:06:48")
@StaticMetamodel(Helado.class)
public class Helado_ { 

    public static volatile SingularAttribute<Helado, String> descripcion;
    public static volatile SingularAttribute<Helado, String> idHelado;
    public static volatile ListAttribute<Helado, DetalleVenta> detalleVentaList;
    public static volatile SingularAttribute<Helado, String> imagen;
    public static volatile ListAttribute<Helado, DetalleIngreso> detalleIngresoList;
    public static volatile SingularAttribute<Helado, String> precioVenta;
    public static volatile SingularAttribute<Helado, String> stock;
    public static volatile SingularAttribute<Helado, CategoriaHelado> idCategoria;
    public static volatile ListAttribute<Helado, EspecificacionHelado> especificacionHeladoList;
    public static volatile SingularAttribute<Helado, String> codigoArticulo;
    public static volatile SingularAttribute<Helado, String> nombreArticulo;

}