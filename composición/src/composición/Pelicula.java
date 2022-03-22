/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composición;

/**
 *
 * @author walmart
 */
public class Pelicula {
    
    private String nombrePeli;
    private int duracion;
    
    private Director director;
    private Productora productora;
    private Actor actor;

    public Pelicula() {
         director = new Director();
         productora = new Productora();
         actor = new Actor();
    }

    public Pelicula(String nombrePeli, int duracion, Director director, Productora productora, Actor actor) {
        this.nombrePeli = nombrePeli;
        this.duracion = duracion;
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getNombrePeli() {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "pelicula{" + "nombrePeli=" + nombrePeli + ", duracion=" + duracion + ", director=" + director + ", productora=" + productora + ", actor=" + actor + '}';
    }
     public void mirando(){
        System.out.println("Miirando la pelicula...");
    }
}
