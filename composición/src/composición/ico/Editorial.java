/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composición.ico;

/**
 *
 * @author walmart
 */
public class Editorial {
    private String nombre;
    private int ventas;

    public Editorial() {
    }

    public Editorial(String nombre, int ventas) {
        this.nombre = nombre;
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", ventas=" + ventas + '}';
    }
    public void Editar(){
        System.out.println(this.nombre+" está editando...");
}
    
}
