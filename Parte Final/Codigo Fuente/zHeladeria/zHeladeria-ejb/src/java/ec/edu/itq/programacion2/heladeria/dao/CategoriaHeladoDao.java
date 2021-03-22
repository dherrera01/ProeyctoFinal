/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.dao;

import ec.edu.itq.programacion2.heladeria.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.CategoriaHelado;
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
public class CategoriaHeladoDao extends GenericoDao<CategoriaHelado> {

    @PersistenceContext(unitName = "zHeladeria-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriaHeladoDao() {
        super(CategoriaHelado.class);
    }
    public List<CategoriaHelado> buscarCategoriaHelado() {
        Query query = getEntityManager().createQuery("SELECT ch FROM CategoriaHelado ch WHERE ch.estado=true");
        List<CategoriaHelado> listaCategoriaHelado = query.getResultList();
        return listaCategoriaHelado;
    }
}
