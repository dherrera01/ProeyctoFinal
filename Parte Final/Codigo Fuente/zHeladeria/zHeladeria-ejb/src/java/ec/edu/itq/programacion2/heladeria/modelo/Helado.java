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
 * @author UserPC
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
    @Size(max = 200)
    @Column(name = "nombre_helado")
    private String nombreHelado;
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
    @Column(name = "estado")
    private Boolean estado;
    @OneToMany(mappedBy = "idHelado", fetch = FetchType.LAZY)
    private List<DetalleVenta> detalleVentaList;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaHelado idCategoria;
    @OneToMany(mappedBy = "idHelado", fetch = FetchType.LAZY)
    private List<DetalleIngreso> detalleIngresoList;

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

    public String getNombreHelado() {
        return nombreHelado;
    }

    public void setNombreHelado(String nombreHelado) {
        this.nombreHelado = nombreHelado;
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
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
