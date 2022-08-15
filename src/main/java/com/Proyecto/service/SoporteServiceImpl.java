package com.Proyecto.service;

import com.Proyecto.dao.ClienteDao;
import com.Proyecto.dao.SoporteDao;
import com.Proyecto.domain.Cliente;
import com.Proyecto.domain.Soporte;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SoporteServiceImpl implements SoporteService{
    
    @Autowired
    private SoporteDao SoporteDao;
    
    @Autowired
    private ClienteDao clienteDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Soporte> getSoportes() {
        return (List<Soporte>) SoporteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Soporte getSoporte(Soporte soporte) {
        return SoporteDao.findById(soporte.getIdSoporte()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Soporte soporte) {
        SoporteDao.save(soporte);
    }

    @Override
    @Transactional
    public void delete(Soporte soporte) {
        SoporteDao.delete(soporte);
    }
}
