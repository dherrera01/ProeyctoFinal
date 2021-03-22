/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.itq.programacion2.heladeria.control;

import ec.edu.itq.programacion2.heladeria.modelo.CategoriaHelado;
import ec.edu.itq.programacion2.heladeria.servicio.CategoriaHeladoServicio;
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
public class CategoriaHeladoControl implements Serializable{
    
    @EJB
    private CategoriaHeladoServicio categoriaHeladoServicio;
    private CategoriaHelado categoriaHelado;
    private List<CategoriaHelado> listTipoHelado;
    
    @PostConstruct
    public void init(){
        buscarTipoHelado();
        categoriaHelado = new CategoriaHelado();
    }
    
    public void buscarTipoHelado(){
       listTipoHelado = categoriaHeladoServicio.buscarCategoriaHelado();
    }
    
    public void seleccionarTipoHelado(CategoriaHelado tipoHelado){
        this.categoriaHelado = tipoHelado;
        System.out.println(this.categoriaHelado.toString());
    }
    
    public void guardar(){
        System.out.println("Si llega al boton");
        categoriaHeladoServicio.guardar(categoriaHelado);
        limpiar();
        buscarTipoHelado();
    }
    
    private void limpiar(){
       categoriaHelado = new CategoriaHelado();
    }

    public List<CategoriaHelado> getListTipoHelado() {
        return listTipoHelado;
    }   

    public CategoriaHelado getTipoHelado() {
        return categoriaHelado;
    }

    public void setTipoHelado(CategoriaHelado tipoHelado) {
        this.categoriaHelado = tipoHelado;
    }

    public CategoriaHeladoServicio getCategoriaHeladoServicio() {
        return categoriaHeladoServicio;
    }

    public void setCategoriaHeladoServicio(CategoriaHeladoServicio categoriaHeladoServicio) {
        this.categoriaHeladoServicio = categoriaHeladoServicio;
    }

    public CategoriaHelado getCategoriaHelado() {
        return categoriaHelado;
    }

    public void setCategoriaHelado(CategoriaHelado categoriaHelado) {
        this.categoriaHelado = categoriaHelado;
    }

    
    
    
    

}
