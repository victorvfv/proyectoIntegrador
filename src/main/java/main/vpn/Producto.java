/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.vpn;

/**
 *
 * @author victo
 */
public class Producto {
    
    public int ID_Prod;
    public String nombre;
    public float precio;
    public int stock;
    public int iva;
    
    public Producto( int ID_Prod,String nombre,float precio,int stock,int iva){
        this.ID_Prod=ID_Prod;
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
        this.iva=iva;
    }

    public int getID_Prod() {
        return ID_Prod;
    }

    public void setID_Prod(int ID_Prod) {
        this.ID_Prod = ID_Prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
    
    
}
