/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.modelo;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author UserPC
 */
@Entity
@Table(name = "detalle_ingreso")
@NamedQueries({
    @NamedQuery(name = "DetalleIngreso.findAll", query = "SELECT d FROM DetalleIngreso d")})
public class DetalleIngreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Size(min = 1, max = 20)
    @Column(name = "id_detalle_ingreso")
    private String idDetalleIngreso;
    @Size(max = 20)
    @Column(name = "cantidad")
    private String cantidad;
    @Size(max = 30)
    @Column(name = "precio")
    private String precio;
    @JoinColumn(name = "id_helado", referencedColumnName = "id_helado")
    @ManyToOne(fetch = FetchType.LAZY)
    private Helado idHelado;
    @JoinColumn(name = "id_ingreso", referencedColumnName = "id_ingreso")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ingreso idIngreso;

    public DetalleIngreso() {
    }

    public DetalleIngreso(String idDetalleIngreso) {
        this.idDetalleIngreso = idDetalleIngreso;
    }

    public String getIdDetalleIngreso() {
        return idDetalleIngreso;
    }

    public void setIdDetalleIngreso(String idDetalleIngreso) {
        this.idDetalleIngreso = idDetalleIngreso;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Helado getIdHelado() {
        return idHelado;
    }

    public void setIdHelado(Helado idHelado) {
        this.idHelado = idHelado;
    }

    public Ingreso getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Ingreso idIngreso) {
        this.idIngreso = idIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleIngreso != null ? idDetalleIngreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleIngreso)) {
            return false;
        }
        DetalleIngreso other = (DetalleIngreso) object;
        if ((this.idDetalleIngreso == null && other.idDetalleIngreso != null) || (this.idDetalleIngreso != null && !this.idDetalleIngreso.equals(other.idDetalleIngreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.heladeria.modelo.DetalleIngreso[ idDetalleIngreso=" + idDetalleIngreso + " ]";
    }
    
}
