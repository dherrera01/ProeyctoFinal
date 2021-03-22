/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.servicio;

import ec.edu.itq.programacion2.heladeria.dao.DetalleVentaDao;
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
public class DetalleVentaServicio {
private Helado pvHelado;
private DetalleVenta cant;
private Integer vto;
@EJB
private DetalleVentaDao detalleventaDao;

public void guardar(DetalleVenta  detalleventa){
    detalleventaDao.create(detalleventa);
}

    public List<DetalleVenta> buscarDetalleVenta() {
        List<DetalleVenta> listaDetalleVenta = detalleventaDao.buscarDetalleVenta();
        return listaDetalleVenta;
    }
 public Integer calculoSbHelado() {
        vto=Integer.parseInt(pvHelado.getPrecioVenta()) * Integer.parseInt(cant.getCantidad());
        return vto;
    }   
 
}
