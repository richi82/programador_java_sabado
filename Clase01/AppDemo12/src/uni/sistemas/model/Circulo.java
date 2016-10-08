
package uni.sistemas.model;

import uni.sistemas.service.Figura;


public class Circulo extends Figura{
//Variables
    double radio;
    double diametro;
    //Constructor

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro=diametro;
    }

    public Circulo(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double Area() {
        return Math.PI*Math.pow(radio, 2);
        }

    @Override
    public double Perimetro() {
        return Math.PI*diametro;
        }
    
}
