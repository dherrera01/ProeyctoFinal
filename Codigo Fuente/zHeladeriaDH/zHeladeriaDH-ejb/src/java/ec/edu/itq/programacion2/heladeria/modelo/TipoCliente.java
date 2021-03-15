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
@Table(name = "tipo_cliente")
@NamedQueries({
    @NamedQuery(name = "TipoCliente.findAll", query = "SELECT t FROM TipoCliente t")})
public class TipoCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipocliente")
    private Long idTipocliente;
    @Size(max = 50)
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(mappedBy = "idTipocliente", fetch = FetchType.LAZY)
    private List<Cliente> clienteList;

    public TipoCliente() {
    }

    public TipoCliente(Long idTipocliente) {
        this.idTipocliente = idTipocliente;
    }

    public Long getIdTipocliente() {
        return idTipocliente;
    }

    public void setIdTipocliente(Long idTipocliente) {
        this.idTipocliente = idTipocliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipocliente != null ? idTipocliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCliente)) {
            return false;
        }
        TipoCliente other = (TipoCliente) object;
        if ((this.idTipocliente == null && other.idTipocliente != null) || (this.idTipocliente != null && !this.idTipocliente.equals(other.idTipocliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.heladeria.modelo.TipoCliente[ idTipocliente=" + idTipocliente + " ]";
    }
    
}
