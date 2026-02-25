/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendajpa;

/**
 *
 * @author daya
 */
public class TiendaJPA {

    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();
        
        Producto p = new Producto(0, "Papa", 20);
        Producto p1 = new Producto(0, "Nito", 20);
        Producto p2 = new Producto(0, "Roles de canela", 50);
        
        
    }
}
