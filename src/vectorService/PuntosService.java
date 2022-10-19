package vectorService;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosService {

    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        
        Puntos puntos4 = new Puntos();
        
        System.out.println("Ingresaremos el primer punto (A):");
        
        System.out.println("ingrese coordenada X del punto A");
        puntos4.setPuntoAX(leer.nextInt());
        
        System.out.println("ingrese coordenada Y del punto A");
        puntos4.setPuntoAY(leer.nextInt());
        
        System.out.println("\nIngresaremos el segundo punto (B):");
        
        System.out.println("ingrese coordenada X del punto B");
        puntos4.setPuntoBX(leer.nextInt());
        
        System.out.println("ingrese coordenada Y del punto B");
        puntos4.setPuntoBY(leer.nextInt());
        
        return puntos4;
    }
    
    public void distancia(Puntos Z){
        
        double laDistancia = Math.sqrt(Math.pow(Z.getPuntoBX()-Z.getPuntoAX(), 2) + Math.pow(Z.getPuntoBY()-Z.getPuntoAY(), 2)) ; 
        
        System.out.println("\nLa distancia entre el punto A y el punto B es de: "+laDistancia + " en vaya a saber qué medida....");
        
        System.out.println("\nLa distancia entre el punto A y el punto B es de: "+ Math.sqrt(Math.pow(Z.getPuntoBX()-Z.getPuntoAX(), 2) + Math.pow(Z.getPuntoBY()-Z.getPuntoAY(), 2)) + " en vaya a saber qué medida....");
    }
}
