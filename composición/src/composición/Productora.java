/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composición;

/**
 *
 * @author walmart
 */
public class Productora {
    private String nombre;
    private int premiosGanados;

    public Productora() {
    }

    public Productora(String nombre, int premiosGanados) {
        this.nombre = nombre;
        this.premiosGanados = premiosGanados;
    }

    public int getPremiosGanados() {
        return premiosGanados;
    }

    public void setPremiosGanados(int premiosGanados) {
        this.premiosGanados = premiosGanados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", premiosGanados=" + premiosGanados + '}';
    }
      public void produciendo(int cantidad){
        System.out.println(this.getNombre()+" está produciendo ");
    }
    
}
