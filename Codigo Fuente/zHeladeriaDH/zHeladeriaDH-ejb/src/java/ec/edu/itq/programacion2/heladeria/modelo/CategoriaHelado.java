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
 * @author jdherrera
 */
@Entity
@Table(name = "categoria_helado")
@NamedQueries({
    @NamedQuery(name = "CategoriaHelado.findAll", query = "SELECT c FROM CategoriaHelado c")})
public class CategoriaHelado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Size(min = 1, max = 20)
    @Column(name = "id_categoria")
    private String idCategoria;
    @Size(max = 100)
    @Column(name = "\tnombre_categoria")
    private String nombreCategoria;
    @Size(max = 250)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idCategoria", fetch = FetchType.LAZY)
    private List<Helado> heladoList;

    public CategoriaHelado() {
    }

    public CategoriaHelado(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Helado> getHeladoList() {
        return heladoList;
    }

    public void setHeladoList(List<Helado> heladoList) {
        this.heladoList = heladoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoria != null ? idCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaHelado)) {
            return false;
        }
        CategoriaHelado other = (CategoriaHelado) object;
        if ((this.idCategoria == null && other.idCategoria != null) || (this.idCategoria != null && !this.idCategoria.equals(other.idCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.heladeria.modelo.CategoriaHelado[ idCategoria=" + idCategoria + " ]";
    }
    
}
