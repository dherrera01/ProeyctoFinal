/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.itq.programacion2.heladeria.control;

import ec.edu.itq.programacion2.heladeria.modelo.Cliente;
import ec.edu.itq.programacion2.heladeria.servicio.ClienteServicio;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jdherrera
 */
@ManagedBean
@ViewScoped
public class ClienteControl implements Serializable{
    
    @EJB
    private ClienteServicio clienteServicio;
    private Cliente cliente;
    private List<Cliente> listCliente;
    
    @PostConstruct
    public void init(){
        buscarCliente();
        cliente = new Cliente();
    }
    
    public void buscarCliente(){
       listCliente = clienteServicio.buscarCliente();
    }
         
    public void seleccionarTipoCliente(Cliente tipoCliente){
        this.cliente = tipoCliente;
        System.out.println(this.cliente.toString());
    }
    
    public void guardar(){
        System.out.println("Si llega al boton");
        clienteServicio.guardar(cliente);
        limpiar();
        buscarCliente();
    }
    
    private void limpiar(){
       cliente = new Cliente();
    }

    public List<Cliente> getListCliente() {
        return listCliente;
    }   

    public Cliente getTipoCliente() {
        return cliente;
    }

    public void setTipoCliente(Cliente tipoCliente) {
        this.cliente = tipoCliente;
    }

    public ClienteServicio getClienteServicio() {
        return clienteServicio;
    }

    public void setCategoriaHeladoServicio(ClienteServicio categoriaHeladoServicio) {
        this.clienteServicio = categoriaHeladoServicio;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
    

}
