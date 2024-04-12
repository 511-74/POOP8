/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase Flauta que representa un tipo específico de instrumento de viento.
 * Extiende la clase InstrumentoViento, heredando sus características y comportamiento.
 * Sobrescribe el método tipoInstrumento para proporcionar una identificación específica de la flauta.
 * @author Silvia Jamile Rojas Nava
 */
public class Flauta extends InstrumentoViento{

/**
 * Constructor vacío.
 */
    public Flauta() {
    }
    
/**
 * Método de sobreescritura. El método tipoInstrumento de la clase InstrumentoViento.
 * Retorna una cadena de texto que identifica el tipo de instrumento como "Flauta".
 * @return regresa la cadena "Flauta" que identifica el tipo de este instrumento específico.
 */
    @Override
    public String tipoInstrumento(){
       return "Flauta";
    }
}
