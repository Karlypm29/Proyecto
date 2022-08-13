
package com.Proyecto.service;

import com.Proyecto.dao.ClienteDao;
import com.Proyecto.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteDao ClienteDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) ClienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente producto) {
        return ClienteDao.findById(producto.getIdCliente()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Cliente producto) {
        ClienteDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Cliente producto) {
        ClienteDao.delete(producto);
    }
}
