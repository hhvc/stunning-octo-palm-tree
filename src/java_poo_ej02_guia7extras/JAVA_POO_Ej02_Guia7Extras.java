/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package java_poo_ej02_guia7extras;

import Entidad.Puntos;
import vectorService.PuntosService;

/**
 * * Ejercicio curso EGG. Guia 7, ejercicio extra 02
 * @author hecto
 */
public class JAVA_POO_Ej02_Guia7Extras {

    public static void main(String[] args) {

        PuntosService ps = new PuntosService();
        
        Puntos vector1 = ps.crearPuntos();
        
        System.out.println(vector1.toString());
        
        ps.distancia(vector1);
        
    }
    
}
