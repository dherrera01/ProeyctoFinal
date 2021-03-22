/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.dao;

import ec.edu.itq.programacion2.heladeria.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.Helado;
import ec.edu.itq.programacion2.heladeria.modelo.Venta;
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
public class VentaDao extends GenericoDao<Venta> {

    @PersistenceContext(unitName = "zHeladeria-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentaDao() {
        super(Venta.class);
    }
     public List<Venta> buscarVenta() {
        Query query = getEntityManager().createQuery("SELECT v FROM Venta v WHERE v.estado=true");
        List<Venta> listaVenta = query.getResultList();
        return listaVenta;
    }
      public List<Venta> buscarNumVenta() {
        Query query = getEntityManager().createQuery("SELECT nv FROM Venta nv");
        List<Venta> listanumVenta = query.getResultList();
        return listanumVenta;
    }
}
