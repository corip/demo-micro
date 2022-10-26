package com.example.demo2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/beneficios")
public class RestControllerBeneficios {

    @GetMapping("/bienvenida")
    public String message(){
        return "Hola, bienvenido al proyecto.";
    }


    @GetMapping("/despedida")
    public String messageDespedida(){
        return "Hola, gracias por tu apoyo al proyecto.";
    }

    @GetMapping("/persona")
    public Persona getPersona(){

        Persona persona= new Persona();

        return persona;
    }


}
