package com.margaritasing.Entidades;

public  class Producto  {

    protected int codigo;
    protected String nombre;
    protected int stock;

    public Producto( int codigo, String nombre, int stock) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
    }




    public int getCodigo() {
        return codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto = " +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", stock=" + stock +
                '.';
    }
}
