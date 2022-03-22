/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composición;

/**
 *
 * @author walmart
 */
public class Director {
    private String nombre;
    private int premios;

    public Director() {
    }

    public Director(String nombre, int premios) {
        this.nombre = nombre;
        this.premios = premios;
    }

    public int getPremios() {
        return premios;
    }

    public void setPremios(int premios) {
        this.premios = premios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", premios=" + premios + '}';
    }
     public void dirigir(){
        System.out.println(this.nombre+" está dirigiendo...");
    }
    
}
