



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.itq.programacion2.heladeria.control;

import ec.edu.itq.programacion2.heladeria.modelo.DetalleVenta;
import ec.edu.itq.programacion2.heladeria.modelo.Helado;
import ec.edu.itq.programacion2.heladeria.servicio.DetalleVentaServicio;
import ec.edu.itq.programacion2.heladeria.servicio.HeladoServicio;
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
public class DetalleVentaControl implements Serializable{

    private DetalleVenta detalleVenta;
    private List<DetalleVenta> listaDetalleVenta;
    private List<SelectItem> selectItemHelado;
    private Integer idHelado;
    private Map<Integer, Helado> mapaHelado;
    
    private Helado pvHelado;
    private DetalleVenta cant;
    private Integer vto;
    
    @EJB
    private HeladoServicio heladoServicio;
    @EJB
    private DetalleVentaServicio detalleVentaServicio;
    
    @PostConstruct
    public void init(){
        detalleVenta = new DetalleVenta();
        crearSelectItemHelado(buscarHelado());
        buscarDetalleVenta();
     //   calculoValorTotal();
    }
    
    private void buscarDetalleVenta(){
        listaDetalleVenta = detalleVentaServicio.buscarDetalleVenta();
    }
    public void calculoValorTotal() {
        vto=Integer.parseInt(pvHelado.getPrecioVenta()) * Integer.parseInt(cant.getCantidad());
        System.out.println("vto: "+vto);
    }
    
    private List<Helado> buscarHelado(){
        List<Helado> listaHelado = heladoServicio.buscarHelado();
        mapaHelado = new HashMap<>();
        for (Helado helado : listaHelado) {
            mapaHelado.put(Integer.parseInt(helado.getIdHelado()), helado);
        }
        return listaHelado;
    }
    
    private void crearSelectItemHelado(List<Helado> listaHelado){
        selectItemHelado = new ArrayList<>();
        for (Helado helado : listaHelado) {
            SelectItem itemDetalleVenta = new SelectItem(helado.getIdHelado(), helado.getNombreHelado());
            selectItemHelado.add(itemDetalleVenta);
        }
    }
    
    public void guardar(){
        Helado helado = mapaHelado.get(idHelado);
        detalleVenta.setIdHelado(helado);
        detalleVentaServicio.guardar(detalleVenta);
        limpiar();
        buscarDetalleVenta();
        calculoValorTotal();
    }
    
    public void limpiar(){
        this.detalleVenta = new DetalleVenta();
        idHelado = null;
    }
    
    public void actualizar(DetalleVenta detalleVenta){
        this.detalleVenta = detalleVenta;
        this.idHelado = Integer.parseInt(detalleVenta.getIdHelado().getIdHelado());
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

    public List<SelectItem> getSelectItemHelado() {
        return selectItemHelado;
    }

    public void setSelectItemHelado(List<SelectItem> selectItemHelado) {
        this.selectItemHelado = selectItemHelado;
    }

    public Integer getIdHelado() {
        return idHelado;
    }

    public void setIdHelado(Integer idHelado) {
        this.idHelado = idHelado;
    }
    
    
   
}