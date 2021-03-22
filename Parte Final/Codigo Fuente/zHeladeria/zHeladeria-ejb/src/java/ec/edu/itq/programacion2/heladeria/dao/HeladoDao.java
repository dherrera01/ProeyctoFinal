/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.dao;

import ec.edu.itq.programacion2.heladeria.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.Helado;
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
public class HeladoDao extends GenericoDao<Helado> {

    @PersistenceContext(unitName = "zHeladeria-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HeladoDao() {
        super(Helado.class);
    }
    public List<Helado> buscarHelado() {
        Query query = getEntityManager().createQuery("SELECT h FROM Helado h WHERE h.estado=true");
        List<Helado> listaHelado = query.getResultList();
        return listaHelado;
    }
}
