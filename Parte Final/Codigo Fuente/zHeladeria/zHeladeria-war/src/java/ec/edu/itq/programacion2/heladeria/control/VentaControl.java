

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.itq.programacion2.heladeria.control;

import ec.edu.itq.programacion2.heladeria.modelo.Venta;
import ec.edu.itq.programacion2.heladeria.modelo.Cliente;
import ec.edu.itq.programacion2.heladeria.servicio.VentaDetalleServicio;
import ec.edu.itq.programacion2.heladeria.servicio.ClienteServicio;

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
public class VentaControl implements Serializable{

    private Venta venta;
    private List<Venta> listaVenta;
    private List<SelectItem> selectItemCliente;
    private Integer idCliente;
    private Map<Integer, Cliente> mapaCliente;
    
    @EJB
    private ClienteServicio clienteServicio;
    @EJB
    private VentaDetalleServicio ventaServicio;
   
    @PostConstruct
    public void init(){
        venta = new Venta();
        crearSelectItemCliente(buscarCliente());
        buscarVenta();
     
    }
    
    
    private void buscarVenta(){
        listaVenta = ventaServicio.buscarVenta();
    }
    
    private List<Cliente> buscarCliente(){
        List<Cliente> listaCliente = clienteServicio.buscarCliente();
        mapaCliente = new HashMap<>();
        for (Cliente cliente : listaCliente) {
            mapaCliente.put(Integer.parseInt(cliente.getIdCliente()), cliente);
        }
        return listaCliente;
    }
    
    private void crearSelectItemCliente(List<Cliente> listaCliente){
        selectItemCliente = new ArrayList<>();
        for (Cliente cliente : listaCliente) {
            SelectItem itemVenta = new SelectItem(cliente.getIdCliente(), cliente.getNombreCliente());
            selectItemCliente.add(itemVenta);
        }
    }
    
    public void guardar(){
        Cliente cliente = mapaCliente.get(idCliente);
        venta.setIdCliente(cliente);
        ventaServicio.guardar(venta);
        limpiar();
        buscarVenta();
    }
    
    public void limpiar(){
        this.venta = new Venta();
        idCliente = null;
    }
    
    public void actualizar(Venta venta){
        this.venta = venta;
        this.idCliente = Integer.parseInt(venta.getIdCliente().getIdCliente());
    }
     
    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<Venta> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(List<Venta> listaVenta) {
        this.listaVenta = listaVenta;
    }

    public List<SelectItem> getSelectItemCliente() {
        return selectItemCliente;
    }

    public void setSelectItemCliente(List<SelectItem> selectItemCliente) {
        this.selectItemCliente = selectItemCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    
   
}
