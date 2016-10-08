
package uni.sistemas.model;

import uni.sistemas.service.Figura;


public class Triangulo extends Figura{

    //Declarar variables
    double base;
    double altura;
    double lado;
    //Constructor

    public Triangulo(double base, double altura,double lado) {
        this.base = base;
        this.altura = altura;
        this.lado=lado;
    }

    
    
    @Override
    public double Area() {
        return (base*altura)/2;
       }

    @Override
    public double Perimetro() {
        return lado*3;
       }
    
}
