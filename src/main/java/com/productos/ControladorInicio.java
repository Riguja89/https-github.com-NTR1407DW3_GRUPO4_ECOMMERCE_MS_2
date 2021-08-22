/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.productos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nesto
 */
@RestController
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(){
        return "Hola Mundo con Spring"; 
    }
    
}
