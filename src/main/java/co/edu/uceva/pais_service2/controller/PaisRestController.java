package co.edu.uceva.pais_service2.controller;

import co.edu.uceva.pais_service2.model.entities.Pais;
import co.edu.uceva.pais_service2.model.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pais-service")
public class PaisRestController {
    @Autowired
    IPaisService paisService;


    /**
    *Endpoint para recibir un saludo
     * @param nombre Es el nombre que envian desde la url
     * @return Un saludi
     */
    @GetMapping("/hola/{nombre}")
    public String holaMundo(@PathVariable("nombre") String nombre) {
        return "Hola " + nombre;
    }
    @GetMapping("/paises")
    public List<Pais> listar() {
        List<Pais> paises = new ArrayList<>();
        Pais pais1 = new Pais(1L, "Colombia");
        Pais pais2 = new Pais(2L, "Ecuador;");
        paises.add(pais1);
        paises.add(pais2);
        return paises;

    }
}
