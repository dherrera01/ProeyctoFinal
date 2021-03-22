



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.itq.programacion2.heladeria.control;

import ec.edu.itq.programacion2.heladeria.modelo.DetalleVenta;
import ec.edu.itq.programacion2.heladeria.modelo.Venta;
import ec.edu.itq.programacion2.heladeria.servicio.DetalleVentaServicio;
import ec.edu.itq.programacion2.heladeria.servicio.VentaServicio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author jdherrera
 */
@ManagedBean
@ViewScoped
public class DetalleVentaControl1 implements Serializable{

    private DetalleVenta detalleVenta;
    private List<DetalleVenta> listaDetalleVenta;
    private List<SelectItem> selectItemVenta;
    private Integer idVenta;
    private Map<Integer, Venta> mapaVenta;
    
    
    
    @EJB
    private VentaServicio ventaServicio;
    @EJB
    private DetalleVentaServicio detalleVentaServicio;
    
    @PostConstruct
    public void init(){
        detalleVenta = new DetalleVenta();
        crearSelectItemHelado(buscarVenta());
        buscarDetalleVenta();
    
    }
    
    private void buscarDetalleVenta(){
        listaDetalleVenta = detalleVentaServicio.buscarDetalleVenta();
    }
   
    
    private List<Venta> buscarVenta(){
        List<Venta> listaVenta = ventaServicio.buscarVenta();
        mapaVenta = new HashMap<>();
        for (Venta venta : listaVenta) {
            mapaVenta.put(Integer.parseInt(venta.getIdVenta()), venta);
        }
        return listaVenta;
    }
    
    private void crearSelectItemHelado(List<Venta> listaVenta){
        selectItemVenta = new ArrayList<>();
        for (Venta venta : listaVenta) {
            SelectItem itemDetalleVenta = new SelectItem(venta.getIdVenta(), venta.getIdVenta());
            selectItemVenta.add(itemDetalleVenta);
        }
    }
    
    public void guardar(){
        Venta venta = mapaVenta.get(idVenta);
        detalleVenta.setIdVenta(venta);
        detalleVentaServicio.guardar(detalleVenta);
        limpiar();
        buscarDetalleVenta();
      
    }
    
    public void limpiar(){
        this.detalleVenta = new DetalleVenta();
        idVenta = null;
    }
    
    public void actualizar(DetalleVenta detalleVenta){
        this.detalleVenta = detalleVenta;
        this.idVenta = Integer.parseInt(detalleVenta.getIdVenta().getIdVenta());
    }
     
    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public void setHelado(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public List<DetalleVenta> getListaDetalleVenta() {
        return listaDetalleVenta;
    }

    public void setListaDetalleVenta(List<DetalleVenta> listaDetalleVenta) {
        this.listaDetalleVenta = listaDetalleVenta;
    }

    public List<SelectItem> getSelectItemVenta() {
        return selectItemVenta;
    }

    public void setSelectItemVenta(List<SelectItem> selectItemVenta) {
        this.selectItemVenta = selectItemVenta;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }
    
    
   
}