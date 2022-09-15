package com.margaritasing.Interface;

public interface GestionInventario {

   void agregarProducto(  int codigo, String nombre, int stock);
   void agregarStock(int codigo, int unidades);
   void eliminarStock(int codigo, int unidades);
   void verProducto(int codigo);
   void eliminarProducto(int codigo);
}
