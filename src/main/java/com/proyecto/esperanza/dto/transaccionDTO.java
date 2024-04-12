package com.proyecto.esperanza.dto;

public class transaccionDTO {
    private Long id;
    private Long num_trans;
    private String producto;
    private double precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNum_trans() {
        return num_trans;
    }

    public void setNum_trans(Long num_trans) {
        this.num_trans = num_trans;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
