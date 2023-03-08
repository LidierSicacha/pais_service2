package co.edu.uceva.pais_service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais-service")
public class PaisRestController {

    @GetMapping("/hola/{nombre}")
    public String holaMundo(@PathVariable("nombre") String nombre) {
        return "Hola " + nombre;
    }
}
