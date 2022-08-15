
package com.Proyecto.service;

import com.Proyecto.dao.ClienteDao;
import com.Proyecto.dao.CreditoDao;
import com.Proyecto.domain.Cliente;
import com.Proyecto.domain.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Karly
 */
@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteDao clienteDao;
    
    @Autowired
    private CreditoDao creditoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Cliente cliente) {
        Credito credito = cliente.getCredito();
        credito = creditoDao.save(credito);
        cliente.setCredito(credito);
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
    
}
