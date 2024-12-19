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
        cliente.setRfc(this.faker.idNumber().ssnValid());
        cliente.setNss(this.faker.idNumber().ssnValid());
        return cliente;
    }

    public Producto generaProducto() {
        Producto producto = new Producto(
            this.faker.commerce().productName(),
            this.faker.number().numberBetween(200, 200)
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
