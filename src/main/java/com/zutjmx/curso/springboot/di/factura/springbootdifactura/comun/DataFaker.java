package com.zutjmx.curso.springboot.di.factura.springbootdifactura.comun;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.zutjmx.curso.springboot.di.factura.springbootdifactura.models.Cliente;

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
}
