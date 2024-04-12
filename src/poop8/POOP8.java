/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 * La clase main para aplicar el polimorfismo
 * @author Silvia Jamile Rojas Nava
 */
public class POOP8 {

    /**
     * Método main.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Nota: Click derecho es control + i
        
        // Creación de un triángulo
        
        /**
        Triangulo triangulo1 = new Triangulo(45,45,90,6f,6f,8.5f,8.5f,6f);
        System.out.println(triangulo1);
        **/
        
        // Creación de un poligono
        
        // Poligono poligono = new Poligono();
        
        //Declaramos una variable de tipo Poligono.
        Poligono poligono;
        // System.out.println(poligono.area());
        // System.out.println(poligono.perimetro());
        
        // Los triángulos son poligonos
        
        //Inicializamos el poligono como un objeto Triangulo.
        //Sacamos el calculo del área y el perímetro.
        poligono = new Triangulo(10, 10);
        System.out.println(poligono.area());
        System.out.println(poligono.perimetro());
        
        // Los cuadrilateros son poligonos
        
        //Inicializamos un poligono como un objeto Cuadrilatero.
        //Sacamos el calculo del área y el perímetro.
        poligono = new Cuadrilatero(10f, 10f);
        System.out.println(poligono.area());
        System.out.println(poligono.perimetro());
        
        
        // Creación de un cuadrilatero
        
        /**
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(124, 56, 13.2f, 6f);
        System.out.println(cuadrilatero1);
        **/
        
        //Identificador para determinar el tipo de polígono.
        identificadorDePoligonos(poligono);
        
        Object obj = poligono;
        System.out.println(obj.toString());
        // System.out.println(poligono2.area());
        // Poligono pol1 = new Poligono();
        
        //Convertimos obj a Poligono para acceder a los métodos del poligono.
        Poligono pol1;
        pol1 = (Poligono)obj;
        System.out.println(pol1.area());
        
        
        int a = 10;
        int b = 2;
        int c; 
        c = a/b;
        System.out.println(c);
        
/**
 * Se crea una variable flauta de tipo interfaz y posteriormente un objeto Flauta.
 */        
        InstrumentoMusical flauta = new Flauta();
       
        flauta.afinar(); // Llamada al método afinar() de Flauta
        flauta.tocar();  // Llamada al método tocar() de Flauta
    }

/**
 * Método de utilidad instanceof para identificar el tipo de poligono.
 * @param poligono se regresa la referencia al objeto Poligono específico.
 */
    private static void identificadorDePoligonos(Poligono poligono) {
        if (poligono instanceof Triangulo){
            System.out.println("El poligono es un triángulo");
        }
        else if (poligono instanceof Cuadrilatero){
            System.out.println("El poligono es un cuadrilatero");
        }
        
        else{
            System.out.println("Es un poligono");
        }
    }
    
}