package co.edu.uceva.pais_service2.model.service;

import co.edu.uceva.pais_service2.model.dao.IPaisDao;
import co.edu.uceva.pais_service2.model.entities.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase Implementa el servicio de Pais
 * Un servicio es un objeto controlado por el contenedor
 */
@Service
public class PaisServiceImpl implements IPaisService{

    @Autowired
    IPaisDao paisDao;

    @Override
    public Pais save(Pais pais) {
        return null;
    }

    @Override
    public void delete(Pais pais) {

    }

    @Override
    public Pais update(Pais pais) {
        return null;
    }


    /**
     * Este metodo lista los paises guardados
     * @return una lista de paises
     */
    @Override
    public List<Pais> findAll() {
        return (List<Pais>) paisDao.findAll();
    }

    @Override
    public Pais findById(Long id) {
        return null;
    }
}

