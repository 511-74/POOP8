/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase Cuadrilatero que cuenta con 4 atributos y hereda los atributos (extends) de la clase Poligono.
 * @author Silvia Jamile Rojas Nava
 */
public class Cuadrilatero extends Poligono {
    private int alfa, beta;
    private float base, alt;

/**
 * Tercer constructor que contiene solo los atributos base y alt.
 * @param base la base del triángulo.
 * @param alt la altura del triángulo.
 */
    public Cuadrilatero(float base, float alt) {
        this.base = base;
        this.alt = alt;
    }
    
/**
 * Constructor vacío.
 */
    public Cuadrilatero() {
    }

/**
 * Constructor lleno. 
 * @param alfa el ángulo alfa del triángulo.
 * @param beta el ángulo beta del triángulo.
 * @param base la base del triángulo.
 * @param alt la altura del triángulo.
 */
    public Cuadrilatero(int alfa, int beta, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.base = base;
        this.alt = alt;
    }

/**
* Implementación del método perimetro definido en la clase Poligono.
* Calcula el perímetro del triángulo asumiendo que todos los lados son iguales a la base.
* @return regresa el perímetro del triángulo.
 */
    @Override
    public float perimetro() {
        return base*4; 
    }

/**
* Implementación del método area definido en la clase Poligono.
* Calcula el área del triángulo usando la fórmula área = (base * altura) / 2.
* @return regresa el área del triángulo.
 */
    @Override
    public float area() {
        return base*alt;
    }
    
/**
* Método de sobreescritura. Devuelve una cadena del objeto Triangulo.
* @return regresa una cadena que representa el objeto Triangulo con todos sus atributos.
*/
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", base=" + base + ", alt=" + alt + '}';
    }
    
    
    
}
