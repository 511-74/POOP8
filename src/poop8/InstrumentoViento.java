/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase InstrumentoViento.
 * Implementa la interfaz InstrumentoMusical, por lo que debe proveer implementaciones concretas
 * para los métodos tocar, afinar y obtener el tipo de instrumento.
 * @author Silvia Jamile Rojas Nava
 */
public class InstrumentoViento extends Object implements InstrumentoMusical  {

/**
 * Constructor vacío.
 */
    public InstrumentoViento() {
    }
    
/**
* Es el método tocar de la interfaz InstrumentoMusical.
* Se manda un mensaje que simula la acción de tocar un instrumento de viento.
*/    
    @Override
    public void tocar(){
        System.out.println("Tocando instrumento de viento");
    }
    
/**
 * Es el método afinar de la interfaz InstrumentoMusical.
 * Se manda un mensaje que simula la acción de afinar un instrumento de viento.
 */
    @Override
    public void afinar(){
        System.out.println("Afinando instrumento de viento");
    }
    
/**
 * Es el método tipoInstrumento de la interfaz InstrumentoMusical.
 * Retorna una cadena de texto que identifica el tipo de instrumento, en este caso, "Instrumento de Viento".
 * @return regresa la cadena "Instrumento de Viento" que identifica el tipo de este instrumento.
 */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de Viento";
    }
}

