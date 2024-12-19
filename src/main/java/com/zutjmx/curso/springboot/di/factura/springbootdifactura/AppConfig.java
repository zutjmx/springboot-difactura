package com.zutjmx.curso.springboot.di.factura.springbootdifactura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zutjmx.curso.springboot.di.factura.springbootdifactura.comun.DataFaker;
import com.zutjmx.curso.springboot.di.factura.springbootdifactura.models.Item;
import com.zutjmx.curso.springboot.di.factura.springbootdifactura.models.Producto;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    List<Item> itemsFactura() {
        DataFaker dataFaker = new DataFaker();
        List<Producto> productos = dataFaker.generaListaProductos();
        List<Item> items = new ArrayList<>();
        for (Producto producto : productos) {
            Item item = new Item(producto, dataFaker.generaEntero());
            items.add(item);
        }
        return items;
    }

}
