/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase Triangulo que cuenta con 8 atributos y hereda los atributos (extends) de la clase Poligono.
 * @author Silvia Jamile Rojas Nava
 */
public class Triangulo extends Poligono {
    private int alfa, beta, gama;
    private float a, b, c, base, alt;
    
/**
 * Constructor vacío.
 */
    public Triangulo() {
    }

/**
 * Constructor lleno. 
 * @param alfa el ángulo alfa del triángulo.
 * @param beta el ángulo beta del triángulo.
 * @param gama el ángulo gama del triángulo.
 * @param a el lado a del triángulo.
 * @param b el lado b del triángulo.
 * @param c el lado c del triángulo.
 * @param base la base del triángulo.
 * @param alt la altura del triángulo.
 */
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.alt = alt;
    }

/**
 * Tercer constructor que contiene solo los atributos base y alt.
 * @param base la base del triángulo.
 * @param alt la altura del triángulo.
 */
    public Triangulo(float base, float alt) {
        this.base = base;
        this.alt = alt;
    }
    
/**
 * Métodos de servicio. Se regresa el ángulo alfa del triángulo.
 * @return regresa una variable alfa.
 */
    public int getAlfa() {
        return alfa;
    }
    
/**
 * Se accede al valor de alfa y se modifica asignando un valor al objeto.
 * @param alfa asigna el nuevo valor al atributo alfa del objeto. 
 */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    
/**
 * Métodos de servicio. Se regresa el ángulo beta del triángulo.
 * @return regresa una variable beta.
 */
    public int getBeta() {
        return beta;
    }
    
/**
 * Se accede al valor de beta y se modifica asignando un valor al objeto
 * @param beta asigna el nuevo valor al atributo beta del objeto. 
 */
    public void setBeta(int beta) {
        this.beta = beta;
    }

/**
 * Métodos de servicio. Se regresa el ángulo gama del triángulo.
 * @return regresa una variable gama.
 */
    public int getGama() {
        return gama;
    }

/**
 * Se accede al valor de gama y se modifica asignando un valor al objeto.
 * @param gama asigna el nuevo valor al atributo gama del objeto.
 */
    public void setGama(int gama) {
        this.gama = gama;
    }

/**
 * Métodos de servicio. Se regresa el valor de a del triángulo.
 * @return regresa una variable a.
 */
    public float getA() {
        return a;
    }

/**
 * Se accede al valor de a y se modifica asignando un valor al objeto.
 * @param a asigna el nuevo valor al atributo a del objeto.
 */
    public void setA(float a) {
        this.a = a;
    }

/**
 * Métodos de servicio. Se regresa el valor de b del triángulo.
 * @return regresa una variable b.
 */
    public float getB() {
        return b;
    }

/**
 * Se accede al valor de b y se modifica asignando un valor al objeto.
 * @param b asigna el nuevo valor al atributo b del objeto.
 */
    public void setB(float b) {
        this.b = b;
    }

/**
 * Métodos de servicio. Se regresa el valor de c del triángulo.
 * @return regresa una variable c.
 */
    public float getC() {
        return c;
    }

/**
 * Se accede al valor de c y se modifica asignando un valor al objeto.
 * @param c asigna el nuevo valor al atributo c del objeto.
 */
    public void setC(float c) {
        this.c = c;
    }

/**
 * Métodos de servicio. Se regresa el valor de la base del triángulo.
 * @return regresa una variable base.
 */
    public float getBase() {
        return base;
    }
    
/**
 * Se accede al valor de la base y se modifica asignando un valor al objeto.
 * @param base asigna el nuevo valor al atributo base del objeto.
 */
    public void setBase(float base) {
        this.base = base;
    }

/**
 * Métodos de servicio. Se regresa el valor de la altura del triángulo.
 * @return regresa una variable alt.
 */
    public float getAlt() {
        return alt;
    }

/**
 * Se accede al valor de la altura y se modifica asignando un valor al objeto.
 * @param alt asigna el nuevo valor al atributo alt del objeto.
 */
    public void setAlt(float alt) {
        this.alt = alt;
    }

/**
* Implementación del método perimetro definido en la clase Poligono.
* Calcula el perímetro del triángulo asumiendo que todos los lados son iguales a la base.
* @return regresa el perímetro del triángulo.
 */
    @Override
    public float perimetro() {
        return base*3; 
    }

/**
* Implementación del método area definido en la clase Poligono.
* Calcula el área del triángulo usando la fórmula área = (base * altura) / 2.
* @return regresa el área del triángulo.
 */
    @Override
    public float area() {
        return (base*alt)/2;
    }

/**
* Método de sobreescritura. Devuelve una cadena del objeto Triangulo.
* @return regresa una cadena que representa el objeto Triangulo con todos sus atributos.
*/
    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", alt=" + alt + '}';
    }
    
    
    
}


