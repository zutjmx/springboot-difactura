package com.zutjmx.curso.springboot.di.factura.springbootdifactura.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.zutjmx.curso.springboot.di.factura.springbootdifactura.comun.DataFaker;
import com.zutjmx.curso.springboot.di.factura.springbootdifactura.models.Cliente;

@Service
public class ClienteService {
    public List<Cliente> getClientes() {
        DataFaker dataFaker = new DataFaker();
        List<Cliente> clientes = dataFaker.generaClientes();        
        return clientes;
    }
}
