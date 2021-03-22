/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.dao;

import ec.edu.itq.programacion2.heladeria.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author UserPC
 */
@Stateless
public class ClienteDao extends GenericoDao<Cliente> {

    @PersistenceContext(unitName = "zHeladeria-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteDao() {
        super(Cliente.class);
    }
    public List<Cliente> buscarCliente() {
        Query query = getEntityManager().createQuery("SELECT cl FROM Cliente cl WHERE cl.estado=true");
        List<Cliente> listaCliente = query.getResultList();
        return listaCliente;
    } 
}
