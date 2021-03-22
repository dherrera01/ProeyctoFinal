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
@Table(name = "ingreso")
@NamedQueries({
    @NamedQuery(name = "Ingreso.findAll", query = "SELECT i FROM Ingreso i")})
public class Ingreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Size(min = 1, max = 20)
    @Column(name = "id_ingreso")
    private String idIngreso;
    @Size(max = 20)
    @Column(name = "proveedor")
    private String proveedor;
    @Size(max = 20)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 50)
    @Column(name = "total")
    private String total;
    @Size(max = 20)
    @Column(name = "comprobante")
    private String comprobante;
    @OneToMany(mappedBy = "idIngreso", fetch = FetchType.LAZY)
    private List<DetalleIngreso> detalleIngresoList;

    public Ingreso() {
    }

    public Ingreso(String idIngreso) {
        this.idIngreso = idIngreso;
    }

    public String getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(String idIngreso) {
        this.idIngreso = idIngreso;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
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
        hash += (idIngreso != null ? idIngreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingreso)) {
            return false;
        }
        Ingreso other = (Ingreso) object;
        if ((this.idIngreso == null && other.idIngreso != null) || (this.idIngreso != null && !this.idIngreso.equals(other.idIngreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.heladeria.modelo.Ingreso[ idIngreso=" + idIngreso + " ]";
    }
    
}
