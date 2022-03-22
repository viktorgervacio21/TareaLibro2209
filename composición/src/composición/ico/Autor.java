/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composición.ico;

/**
 *
 * @author walmart
 */
public class Autor {
    private String nombre;
    private int librosVendidos;
    private String nacionalidad;

    public Autor() {
    }

    public Autor(String nombre, int librosVendidos, String nacionalidad) {
        this.nombre = nombre;
        this.librosVendidos = librosVendidos;
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLibrosVendidos() {
        return librosVendidos;
    }

    public void setLibrosVendidos(int librosVendidos) {
        this.librosVendidos = librosVendidos;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", librosVendidos=" + librosVendidos + ", nacionalidad=" + nacionalidad + '}';
    }
        public void Escribiendo(){
        System.out.println("está escribiendo...");
}
    
}
