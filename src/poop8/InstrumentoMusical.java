/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Interfaz para objetos musicales.
 * @author Silvia Jamile Rojas Nava
 */
public interface InstrumentoMusical {
    
/**
 * Método que deberán implementar las clases para simular la acción de tocar el instrumento.
 * No retorna ningún valor.
 */
    void tocar();
    
/**
 * Método que deberán implementar las clases para simular la acción de afinar el instrumento.
 * No retorna ningún valor.
 */
    void afinar();

/**
 * Método que deberán implementar las clases para devolver el tipo de instrumento en forma de String.
 * @return regresa un String que describe el tipo de instrumento musical.
*/
    String tipoInstrumento();
    
   
}
