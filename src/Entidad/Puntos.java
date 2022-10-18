
package Entidad;

public class Puntos {
    
    private int puntoAX;
    private int puntoAY;
    private int puntoBX;
    private int puntoBY;

    public Puntos() {
    }

    public Puntos(int puntoAX, int puntoAY, int puntoBX, int puntoBY) {
        this.puntoAX = puntoAX;
        this.puntoAY = puntoAY;
        this.puntoBX = puntoBX;
        this.puntoBY = puntoBY;
    }

    public int getPuntoAX() {
        return puntoAX;
    }

    public void setPuntoAX(int puntoAX) {
        this.puntoAX = puntoAX;
    }

    public int getPuntoAY() {
        return puntoAY;
    }

    public void setPuntoAY(int puntoAY) {
        this.puntoAY = puntoAY;
    }

    public int getPuntoBX() {
        return puntoBX;
    }

    public void setPuntoBX(int puntoBX) {
        this.puntoBX = puntoBX;
    }

    public int getPuntoBY() {
        return puntoBY;
    }

    public void setPuntoBY(int puntoBY) {
        this.puntoBY = puntoBY;
    }

    @Override
    public String toString() {
        return "El primer punto es [" + puntoAX + "][" + puntoAY + "]\nEl segundo punto es: [" + puntoBX + "][" + puntoBY + "]";
    }
       
    
}
