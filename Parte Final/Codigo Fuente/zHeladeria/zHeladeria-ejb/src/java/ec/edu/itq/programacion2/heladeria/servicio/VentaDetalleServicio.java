/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.servicio;

import ec.edu.itq.programacion2.heladeria.dao.VentaDao;
import ec.edu.itq.programacion2.heladeria.modelo.Venta;
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
public class VentaDetalleServicio {

@EJB
private VentaDao ventaDao;

public void guardar(Venta  venta){
    ventaDao.create(venta);
}

    public List<Venta> buscarVenta() {
        List<Venta> listaVenta = ventaDao.buscarVenta();
        return listaVenta;
    }
   
 
}
