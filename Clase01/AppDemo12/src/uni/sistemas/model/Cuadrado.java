package uni.sistemas.model;

import uni.sistemas.service.Figura;

public class Cuadrado extends Figura {

    //Declarar variables
    double lado;
    //Constructor

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    //Metodos

    @Override
    public double Area() {
        return Math.pow(lado, 2);
    }

    @Override
    public double Perimetro() {
        return lado * 4;
    }

}
