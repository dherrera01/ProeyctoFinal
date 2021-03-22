/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.servicio;

import ec.edu.itq.programacion2.heladeria.dao.HeladoDao;
import ec.edu.itq.programacion2.heladeria.modelo.DetalleVenta;
import ec.edu.itq.programacion2.heladeria.modelo.Helado;
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
public class HeladoServicio {

@EJB
private HeladoDao heladoDao;

public void guardar(Helado  helado){
    heladoDao.create(helado);
}

    public List<Helado> buscarHelado() {
        List<Helado> listaHelado = heladoDao.buscarHelado();
        return listaHelado;
    }
   
   
  
}
