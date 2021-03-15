/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package ec.edu.itq.programacion2.heladeria.control;*/

import ec.edu.itq.programacion2.heladeria.modelo.CategoriaHelado;
import ec.edu.itq.programacion2.heladeria.servicio.TipoHabitacionServicio;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author fcatucuamba
 */
@ManagedBean
@ViewScoped
public class TipoHeladoControl implements Serializable{
    
    @EJB
    private TipoHeladoServicio tipoHeladoServicio;

    private TipoHelado tipoHelado;
    private List<TipoHelado> listTipoHelado;
    
    @PostConstruct
    public void init(){
        buscarTipoHelado();
        tipoHelado = new TipoHelado();
    }
    
    public void buscarTipoHelado(){
       listTipoHelado = tipoHeladoServicio.buscarTipoHelado();
    }
    
    public void seleccionarTipoHelado(TipoHelado tipoHelado){
        this.tipoHelado = tipoHelado;
        System.out.println(this.tipoHelado.toString());
    }
    
    public void guardar(){
        System.out.println("Si llega al boton");
        tipoHeladoServicio.guardar(tipoHelado);
        limpiar();
        buscarTipoHelado();
    }
    
    private void limpiar(){
       tipoHelado = new TipoHelado();
    }

    public List<TipoHelado> getListTipoHelado() {
        return listTipoHelado;
    }   

    public TipoHabitacion getTipoHelado() {
        return tipoHelado;
    }

    public void setTipoHelado(TipoHelado tipoHelado) {
        this.tipoHelado = tipoHelado;
    }

    
    
    
    

}
