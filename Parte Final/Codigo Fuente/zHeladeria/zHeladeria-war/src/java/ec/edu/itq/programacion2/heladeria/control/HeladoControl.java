

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.itq.programacion2.heladeria.control;

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
 * @author jdherrera
 */
@ManagedBean
@ViewScoped
public class HeladoControl {

    private Helado helado;
    private List<Helado> listaHelado;
    private List<SelectItem> selectItemCategoriaHelado;
    private Integer idCategoriaHelado;
    private Map<Integer, CategoriaHelado> mapaCategoriaHelado;
    
    @EJB
    private CategoriaHeladoServicio categoriaHeladoServicio;
    @EJB
    private HeladoServicio heladoServicio;
    
    @PostConstruct
    public void init(){
        helado = new Helado();
        crearSelectItemCategoriaHelado(buscarCategoriaHelado());
        buscarHelado();
    }
    
    private void buscarHelado(){
        listaHelado = heladoServicio.buscarHelado();
    }
    
    private List<CategoriaHelado> buscarCategoriaHelado(){
        List<CategoriaHelado> listaCategoriaHelado = categoriaHeladoServicio.buscarCategoriaHelado();
        mapaCategoriaHelado = new HashMap<>();
        for (CategoriaHelado categoriaHelado : listaCategoriaHelado) {
            mapaCategoriaHelado.put(Integer.parseInt(categoriaHelado.getIdCategoria()), categoriaHelado);
        }
        return listaCategoriaHelado;
    }
    
    private void crearSelectItemCategoriaHelado(List<CategoriaHelado> listaCategoriaHelado){
        selectItemCategoriaHelado = new ArrayList<>();
        for (CategoriaHelado categoriaHelado : listaCategoriaHelado) {
            SelectItem itemHelado = new SelectItem(categoriaHelado.getIdCategoria(), categoriaHelado.getNombreCategoria());
            selectItemCategoriaHelado.add(itemHelado);
        }
    }
    
    public void guardar(){
        CategoriaHelado categoriaHelado = mapaCategoriaHelado.get(idCategoriaHelado);
        helado.setIdCategoria(categoriaHelado);
        heladoServicio.guardar(helado);
        limpiar();
        buscarHelado();
    }
    
    public void limpiar(){
        this.helado = new Helado();
        idCategoriaHelado = null;
    }
    
    public void actualizar(Helado helado){
        this.helado = helado;
        this.idCategoriaHelado = Integer.parseInt(helado.getIdCategoria().getIdCategoria());
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

    public List<SelectItem> getSelectItemCategoriaHelado() {
        return selectItemCategoriaHelado;
    }

    public void setSelectItemCategoriaHelado(List<SelectItem> selectItemCategoriaHelado) {
        this.selectItemCategoriaHelado = selectItemCategoriaHelado;
    }

    public Integer getIdCategoriaHelado() {
        return idCategoriaHelado;
    }

    public void setIdCategoriaHelado(Integer idCategoriaHelado) {
        this.idCategoriaHelado = idCategoriaHelado;
    }
    
    
   
}
