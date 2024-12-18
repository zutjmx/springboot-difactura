package com.zutjmx.curso.springboot.di.factura.springbootdifactura.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {
    @Value("${cliente.nombre}")
    private String nombre;

    @Value("${cliente.paterno}")
    private String paterno;

    @Value("${cliente.materno}")
    private String materno;

    @Value("${cliente.rfc}")
    private String rfc;

    @Value("${cliente.nss}")
    private String nss;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPaterno() {
        return paterno;
    }
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public String getMaterno() {
        return materno;
    }
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getNss() {
        return nss;
    }
    public void setNss(String nss) {
        this.nss = nss;
    }    
}
