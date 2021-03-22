/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.servicio;

import ec.edu.itq.programacion2.heladeria.modelo.CategoriaHelado;
import ec.edu.itq.programacion2.heladeria.dao.CategoriaHeladoDao;
import ec.edu.itq.programacion2.heladeria.modelo.CategoriaHelado;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author jdherrera
 */
@Stateless
@LocalBean
public class CategoriaHeladoServicio {

    @EJB
    private CategoriaHeladoDao categoriaHeladoDao;
    
    public void guardar(CategoriaHelado categoriaHelado){
        categoriaHeladoDao.create(categoriaHelado);
    }
    
    public List<CategoriaHelado> buscarCategoriaHelado(){
        
        List<CategoriaHelado> listaCategoriaHelado = categoriaHeladoDao.buscarCategoriaHelado();
        
        return listaCategoriaHelado;
    }
}
