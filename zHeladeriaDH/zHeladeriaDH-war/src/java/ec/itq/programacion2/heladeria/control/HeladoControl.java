/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package ec.edu.itq.programacion2.heladeria.control;*/

import ec.edu.itq.programacion2.heladeria.modelo.Helado;
import ec.edu.itq.programacion2.heladeria.modelo.CategoriaHelado;
import ec.edu.itq.programacion2.heladeria.servicio.HeladoServicio;
import ec.edu.itq.programacion2.heladeria.servicio.CategoriaHeladoServicio;
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
 * @author fcatucuamba
 */
@ManagedBean
@ViewScoped
public class HeladoControl {

    private Helado helado;
    private List<Helado> listaHelato;
    private List<SelectItem> selectItemTipoHelado;
    private Integer idTipoHelado;
    private Map<Integer, Helado> mapaTipoHelado;
    
    /*@EJB
    private TipoHeladoServicio tipoHabitacionServicio;*/
    @EJB
    private HeladoServicio heladoServicio;
    
    @PostConstruct
    public void init(){
        helado = new Helado();
        crearSelectItemTipoHelado(buscarTipoHelado());
        buscarHelado();
    }
    
    private void buscarHelado(){
        listaHelado = heladoServicio.buscarHelado();
    }
    
    private List<TipoHelado> buscarTipoHabitacion(){
        List<TipoHelado> listaTipoHelado = tipoHeladoServicio.buscarTipoHabitacion();
        mapaTipoHelado = new HashMap<>();
        for (TipoHelado tipoHelado : listaTipoHelado) {
            mapaTipoHelado.put(tipoHelado.getIdTipoHelado(), tipoHelado);
        }
        return listaTipoHelado;
    }
    
    private void crearSelectItemTipoHelado(List<TipoHelado> listaTipoHelado){
        selectItemTipoHelado = new ArrayList<>();
        for (TipoHelado tipoHelado : listaTipoHelado) {
            SelectItem itemHelado = new SelectItem(tipoHelado.getIdTipoHelado(), tipoHelado.getNombre());
            selectItemTipoHelado.add(itemHelado);
        }
    }
    
    public void guardar(){
        TipoHelado tipoHelado = mapaTipoHelado.get(idTipoHelado);
        helado.setIdTipoHabitacion(tipoHelado);
        heladoServicio.guardar(helado);
        limpiar();
        buscarHelado();
    }
    
    public void limpiar(){
        this.helado = new Helado();
        idTipoHelado = null;
    }
    
    public void actualizar(Helado helado){
        this.helado = helado;
        this.idTipoHelado = helado.getIdTipoHelado().getIdTipoHelado();
    }
    
    public Helado getHelado() {
        return helado;
    }

    public void setHelado(Helado helado) {
        this.helado = helado;
    }

    public List<Helado> getListaHelado() {
        return listaHelado;
    }

    public void setListaHelado(List<Helado> listaHelado) {
        this.listaHelado = listaHelado;
    }

    public List<SelectItem> getSelectItemTipoHelado() {
        return selectItemTipoHelado;
    }

    public void setSelectItemTipoHelado(List<SelectItem> selectItemTipoHelado) {
        this.selectItemTipoHelado = selectItemTipoHelado;
    }

    public Integer getIdTipoHelado() {
        return idTipoHelado;
    }

    public void setIdTipoHelado(Integer idTipoHelado) {
        this.idTipoHelado = idTipoHelado;
    }
    
    
   
}
