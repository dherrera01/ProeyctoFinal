package ec.edu.itq.programacion2.heladeria.modelo;

import ec.edu.itq.programacion2.heladeria.modelo.Helado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-22T14:33:29")
@StaticMetamodel(CategoriaHelado.class)
public class CategoriaHelado_ { 

    public static volatile SingularAttribute<CategoriaHelado, String> descripcion;
    public static volatile SingularAttribute<CategoriaHelado, Boolean> estado;
    public static volatile SingularAttribute<CategoriaHelado, String> idCategoria;
    public static volatile ListAttribute<CategoriaHelado, Helado> heladoList;
    public static volatile SingularAttribute<CategoriaHelado, String> nombreCategoria;

}