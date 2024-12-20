package com.zutjmx.curso.springboot.di.factura.springbootdifactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zutjmx.curso.springboot.di.factura.springbootdifactura.models.Factura;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/facturas")
public class FacturaController {
    
    @Autowired
    private Factura factura;

    @GetMapping("/muestra")
    public Factura muestra() {
        return factura;
    }
    
}
