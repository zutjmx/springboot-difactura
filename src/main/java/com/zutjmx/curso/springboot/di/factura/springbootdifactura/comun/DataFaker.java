package com.zutjmx.curso.springboot.di.factura.springbootdifactura.comun;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;
import com.zutjmx.curso.springboot.di.factura.springbootdifactura.models.Cliente;
import com.zutjmx.curso.springboot.di.factura.springbootdifactura.models.Producto;

public class DataFaker {
    private Faker faker = new Faker(Locale.getDefault());

    public Cliente generaCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre(this.faker.name().firstName());
        cliente.setPaterno(this.faker.name().lastName());
        cliente.setMaterno(this.faker.name().lastName());
        cliente.setRfc(this.faker.lorem().characters(18).toUpperCase());
        cliente.setNss(this.faker.idNumber().ssnValid());
        return cliente;
    }

    public List<Cliente> generaClientes() {
        int indice = this.faker.number().numberBetween(10, 30);
        List<Cliente> clientes = new ArrayList<>();
        for (int i = 0; i < indice; i++) {
            Cliente cliente = this.generaCliente();
            clientes.add(cliente);
        }
        return clientes;
    }

    public Producto generaProducto() {
        Producto producto = new Producto(
            this.faker.commerce().productName(),
            this.faker.number().numberBetween(200, 2000)
        );
        return producto;
    }

    public List<Producto> generaListaProductos() {
        int indice = this.faker.number().numberBetween(10, 30);
        List<Producto> productos = new ArrayList<>();
        for (int i = 0; i < indice; i++) {
            Producto producto = this.generaProducto();
            productos.add(producto);
        }
        return productos;
    }

    public int generaEntero() {
        int entero = this.faker.number().numberBetween(5, 10);
        return entero;
    }
}
