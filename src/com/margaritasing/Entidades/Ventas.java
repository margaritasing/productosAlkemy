package com.margaritasing.Entidades;

import com.margaritasing.Interface.GestionInventario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ventas implements GestionInventario{


    private List<Producto> productos = new ArrayList<>();
    private  Producto producto;


    @Override
    public void agregarProducto( int codigo, String nombre, int stock) {
        productos.add(new Producto( codigo,nombre,stock));

    }

    //mostrar un producto, o los productos

    @Override
    public void verProducto(int codigo) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo) {
                System.out.println(productos.get(i));
            }
        }
    }

    public Producto obtenerProducto(int codigo) {
        for (int cont = 0; cont < productos.size(); cont++) {
            Producto p = productos.get(cont);
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    public void mostrarTodosProductosLanda( ) {
        productos.stream()
                 .forEach(System.out::println);
    }

    public void mostrarProductoConLanda( int codigo ) {
       productos.stream()
               .filter( mostr -> mostr.getCodigo() == codigo)
               .forEach(System.out::println);
    }

    //metodos eliminar producto

    @Override
    public void eliminarProducto(int codigo) {
        Producto p = obtenerProducto(codigo);
        if (p != null){
            productos.remove(p);
            System.out.println(productos);
        }
    }

    public void eliminarUsandoLandas( int codigo ) {
        Optional<Producto> producto =
        productos.stream()
                .filter( a -> a.getCodigo() == codigo)
                .findFirst();

        producto.ifPresent( producto1 -> productos.remove(producto1));

    }


    //metodos agregar stock
    @Override
    public void agregarStock(int codigo, int unidades) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo){
                productos.get(i).setStock(productos.get(i).getStock() + unidades);
            }
        }
    }

    public void agregarStockUsandoLanda(int codigo, int unidades) {
        productos.stream()
                .filter( a -> a.getCodigo() == codigo)
                .forEach(a ->  a.setStock(a.getStock() + unidades));
    }


    //eliminar stock

    @Override
    public void eliminarStock(int codigo, int unidades) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo){
                productos.get(i).setStock(productos.get(i).getStock() - unidades);
            }
        }

    }

    public void eliminarStockUsandoLanda(int codigo, int unidades) {
        productos.stream()
                .filter( a -> a.getCodigo() == codigo)
                .forEach(a ->  a.setStock(a.getStock() - unidades));
    }








    @Override
    public String toString() {
        return "Ventas= " +
                "productos=" + productos +
                '.';
    }
}
