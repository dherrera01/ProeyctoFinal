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
 * @author jdherrera
 */
@Entity
@Table(name = "especificacion_helado")
@NamedQueries({
    @NamedQuery(name = "EspecificacionHelado.findAll", query = "SELECT e FROM EspecificacionHelado e")})
public class EspecificacionHelado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_especificacionhelado")
    private Long idEspecificacionhelado;
    @Size(max = 300)
    @Column(name = "especificacion")
    private String especificacion;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_helado", referencedColumnName = "id_helado")
    @ManyToOne(fetch = FetchType.LAZY)
    private Helado idHelado;

    public EspecificacionHelado() {
    }

    public EspecificacionHelado(Long idEspecificacionhelado) {
        this.idEspecificacionhelado = idEspecificacionhelado;
    }

    public Long getIdEspecificacionhelado() {
        return idEspecificacionhelado;
    }

    public void setIdEspecificacionhelado(Long idEspecificacionhelado) {
        this.idEspecificacionhelado = idEspecificacionhelado;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Helado getIdHelado() {
        return idHelado;
    }

    public void setIdHelado(Helado idHelado) {
        this.idHelado = idHelado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEspecificacionhelado != null ? idEspecificacionhelado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspecificacionHelado)) {
            return false;
        }
        EspecificacionHelado other = (EspecificacionHelado) object;
        if ((this.idEspecificacionhelado == null && other.idEspecificacionhelado != null) || (this.idEspecificacionhelado != null && !this.idEspecificacionhelado.equals(other.idEspecificacionhelado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.heladeria.modelo.EspecificacionHelado[ idEspecificacionhelado=" + idEspecificacionhelado + " ]";
    }
    
}
