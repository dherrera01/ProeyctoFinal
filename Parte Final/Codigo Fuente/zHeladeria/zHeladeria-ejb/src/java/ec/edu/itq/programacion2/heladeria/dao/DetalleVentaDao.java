/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.dao;

import ec.edu.itq.programacion2.heladeria.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.Cliente;
import ec.edu.itq.programacion2.heladeria.modelo.DetalleVenta;
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
public class DetalleVentaDao extends GenericoDao<DetalleVenta> {

    @PersistenceContext(unitName = "zHeladeria-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleVentaDao() {
        super(DetalleVenta.class);
    }
    public List<DetalleVenta> buscarDetalleVenta() {
        Query query = getEntityManager().createQuery("SELECT dv FROM DetalleVenta dv");
        List<DetalleVenta> listaDetalleVenta = query.getResultList();
        return listaDetalleVenta;
    } 
    
    public List<DetalleVenta> buscarDetalleVentaPrecio(String valor) {
        Query query = getEntityManager().createQuery("SELECT pvh FROM Helado pvh WHERE pvh.nombreHelado=?1");
        List<DetalleVenta> listaDetalleVentaPrecio = query.getResultList();
        return listaDetalleVentaPrecio;
    }
}
