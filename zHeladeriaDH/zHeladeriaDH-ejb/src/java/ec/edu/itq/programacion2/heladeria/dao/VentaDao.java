/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.dao;

import ec.edu.itq.programacion2.heladeria.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.Venta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jdherrera
 */
@Stateless
public class VentaDao extends GenericoDao<Venta> {

    @PersistenceContext(unitName = "zHeladeriaDH-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentaDao() {
        super(Venta.class);
    }
    
}
