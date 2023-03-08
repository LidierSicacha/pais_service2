package co.edu.uceva.pais_service2.model.service;

import co.edu.uceva.pais_service2.model.entities.Pais;

import java.util.List;

public interface IPaisService {
    public Pais save(Pais pais);
    public void delete(Pais pais);
    public Pais update(Pais pais);
    public List<Pais> findAll();
    public Pais findById(Long id);
}
