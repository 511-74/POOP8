/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Silvia Jamile Rojas Nava
 
public class Poligono {

    
    public Poligono() {
    }
    
    public float area(){
        System.out.println("Calculando el area....");
        return 0f;
    }
    
    public float perimetro(){
        System.out.println("Calculando el perimetro....");
        return 0f;
    }

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
} 
*/

/**
 * Clase abstracta del Poligono.
 * @author Silvia Jamile Rojas Nava
 */
public abstract class Poligono{

/**
 * Método constructor vacío que sirve solo para crear objetos
 * de las clases que hereden de la clase Poligono.
 */
    public Poligono() {
    }
    
/**
 * Método abstracto que es implementado por las clases que hereden 
 * de la clase abstracta Poligono para calcular el área del polígono.
 * @return Se regresa el área del poligono como un float.
 */
    public abstract float area();
    
/**
 * Método abstracto que es implementado por las clases que hereden 
 * de la clase abstracta Poligono para calcular el perimetro del polígono.
 * @return Se regresa el perimetro del poligono como un float.
 */
    public abstract float perimetro();

/**
 * Método de sobreescritura. Devuelve una cadena de un poligono.
 * @return Nos devuelve una cadena con el nombre de la clase entre llaves
 * para representar al objeto Poligono.
 */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
    
}
