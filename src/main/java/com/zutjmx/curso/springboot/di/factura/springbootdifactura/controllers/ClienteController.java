package com.zutjmx.curso.springboot.di.factura.springbootdifactura.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zutjmx.curso.springboot.di.factura.springbootdifactura.models.Cliente;
import com.zutjmx.curso.springboot.di.factura.springbootdifactura.services.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listar")
    public List<Cliente> listar() {
        return clienteService.getClientes();
    }
    
}
