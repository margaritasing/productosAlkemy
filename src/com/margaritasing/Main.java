package com.margaritasing;


import com.margaritasing.Entidades.Ventas;



public class Main {

    public static void main(String[] args) {

        Ventas ventas = new Ventas();

        ventas.agregarProducto(1,"Pera",15);
        ventas.agregarProducto(2,"Manzana",10);
        ventas.agregarProducto(3,"Cambur",20);
        ventas.agregarProducto(4,"Uvas",15);
        ventas.agregarProducto(5,"Naranja",13);
        ventas.agregarProducto(6,"Mandarina",20);
        ventas.agregarProducto(7,"Piña",10);
        ventas.agregarProducto(8,"Fresa",20);
        ventas.agregarProducto(9,"Guayaba",15);
        ventas.agregarProducto(10,"Durazno",13); //
        ventas.agregarProducto(11,"Kiwui",20);
        ventas.agregarProducto(12,"Mamon",10);


      //  System.out.println(ventas);

       // ventas.eliminarProducto("Mamon");

       // System.out.println(ventas);

     //   ventas.agregarStock(002, 50);
     //   System.out.println(ventas);

      //  ventas.eliminarStock(005, 10);

     //   System.out.println(ventas);

     //    ventas.verProducto(012);

       ventas.mostrarProductoConLanda(12);
    //    ventas.agregarStockUsandoLanda(4, 100);

    //  ventas.mostrarTodosProductosLanda();
         System.out.println("*****************************************************************");

      //  ventas.eliminarStockUsandoLanda(4, 110);
     /*   System.out.println("*****************************************************************");
       ventas.mostrarTodosProductosLanda();
       ventas.eliminarUsandoLandas(11);
        System.out.println("*****************************************************************");
        ventas.mostrarTodosProductosLanda();*/

        ventas.buscarProductosLanda("Piña");

        System.out.println(ventas.obtenerProducto(12));

        ventas.eliminarProducto(9);
        ventas.mostrarTodosProductosLanda();
















    }
}
