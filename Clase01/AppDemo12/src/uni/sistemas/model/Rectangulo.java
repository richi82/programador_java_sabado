package uni.sistemas.model;

import uni.sistemas.service.Figura;

public class Rectangulo extends Figura {

    //Definir variables
    double largo;
    double ancho;
//Definir constructor

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
    public double Area() {
        return largo*ancho;
        }

    @Override
    public double Perimetro() {
        return largo*2+ancho*2;
      }

}
