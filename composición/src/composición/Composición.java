/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composición;

import Tareaclase.Libro;
import composición.ico.Autor;
import composición.ico.Editorial;

/**
 *
 * @author walmart
 */
public class Composición {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula miPeli = new Pelicula ("Joker", 180,
        new Director("Todd Phillips", 20),
        new Productora ("Warner", 6),
        new Actor("Joaquin Phoenix", "Estadounidense"));
      System.out.println(miPeli);
     
    //PARTE DE LIBRO
    
    Libro Libro1 = new Libro("Memoria de mis putas tristes", 46,
    new Autor("Gabriel Garcia Marquez", 10000, "Colombiana"),
    new Editorial("Diana", 10000));
        System.out.println(Libro1);

}
    
}
