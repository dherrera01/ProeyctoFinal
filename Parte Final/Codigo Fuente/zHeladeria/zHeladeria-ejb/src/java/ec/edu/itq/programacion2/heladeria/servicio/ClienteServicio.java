/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.servicio;

import ec.edu.itq.programacion2.heladeria.modelo.Cliente;
import ec.edu.itq.programacion2.heladeria.dao.ClienteDao;
import ec.edu.itq.programacion2.heladeria.modelo.Cliente;
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
public class ClienteServicio {

    @EJB
    private ClienteDao clienteDao;
    
    public void guardar(Cliente cliente){
        clienteDao.create(cliente);
    }
    
    public List<Cliente> buscarCliente(){
        
        List<Cliente> listaCliente = clienteDao.buscarCliente();
        
        return listaCliente;
    }
}
