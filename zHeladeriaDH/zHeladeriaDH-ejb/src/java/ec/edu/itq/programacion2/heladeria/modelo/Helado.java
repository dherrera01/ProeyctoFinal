/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author jdherrera
 */
@Entity
@Table(name = "helado")
@NamedQueries({
    @NamedQuery(name = "Helado.findAll", query = "SELECT h FROM Helado h")})
public class Helado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Size(min = 1, max = 15)
    @Column(name = "id_helado")
    private String idHelado;
    @Size(max = 100)
    @Column(name = "codigo_articulo")
    private String codigoArticulo;
    @Size(max = 200)
    @Column(name = "nombre_articulo")
    private String nombreArticulo;
    @Size(max = 20)
    @Column(name = "precio_venta")
    private String precioVenta;
    @Size(max = 15)
    @Column(name = "stock")
    private String stock;
    @Size(max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 250)
    @Column(name = "imagen")
    private String imagen;
    @OneToMany(mappedBy = "idHelado", fetch = FetchType.LAZY)
    private List<DetalleVenta> detalleVentaList;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaHelado idCategoria;
    @OneToMany(mappedBy = "idHelado", fetch = FetchType.LAZY)
    private List<DetalleIngreso> detalleIngresoList;
    @OneToMany(mappedBy = "idHelado", fetch = FetchType.LAZY)
    private List<EspecificacionHelado> especificacionHeladoList;

    public Helado() {
    }

    public Helado(String idHelado) {
        this.idHelado = idHelado;
    }

    public String getIdHelado() {
        return idHelado;
    }

    public void setIdHelado(String idHelado) {
        this.idHelado = idHelado;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<DetalleVenta> getDetalleVentaList() {
        return detalleVentaList;
    }

    public void setDetalleVentaList(List<DetalleVenta> detalleVentaList) {
        this.detalleVentaList = detalleVentaList;
    }

    public CategoriaHelado getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CategoriaHelado idCategoria) {
        this.idCategoria = idCategoria;
    }

    public List<DetalleIngreso> getDetalleIngresoList() {
        return detalleIngresoList;
    }

    public void setDetalleIngresoList(List<DetalleIngreso> detalleIngresoList) {
        this.detalleIngresoList = detalleIngresoList;
    }

    public List<EspecificacionHelado> getEspecificacionHeladoList() {
        return especificacionHeladoList;
    }

    public void setEspecificacionHeladoList(List<EspecificacionHelado> especificacionHeladoList) {
        this.especificacionHeladoList = especificacionHeladoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHelado != null ? idHelado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Helado)) {
            return false;
        }
        Helado other = (Helado) object;
        if ((this.idHelado == null && other.idHelado != null) || (this.idHelado != null && !this.idHelado.equals(other.idHelado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.heladeria.modelo.Helado[ idHelado=" + idHelado + " ]";
    }
    
}
