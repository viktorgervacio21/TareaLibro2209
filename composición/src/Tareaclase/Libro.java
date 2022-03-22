/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareaclase;

import composición.ico.Autor;
import composición.ico.Editorial;

/**
 *
 * @author walmart
 */
public class Libro {
     private String nombre;
    private int vendido;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
        autor = new Autor();
        editorial = new Editorial();
    }

    public Libro(String nombre, int vendido, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.vendido = vendido;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVendido() {
        return vendido;
    }

    public void setVendido(int vendido) {
        this.vendido = vendido;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", vendido=" + vendido + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
      public void Vendiendo(){
        System.out.println("Vendiendo...");

    
    

}
}
