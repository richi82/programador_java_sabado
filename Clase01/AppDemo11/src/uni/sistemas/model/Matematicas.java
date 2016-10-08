package uni.sistemas.model;

import uni.sistemas.service.IMatematicas;

public class Matematicas implements IMatematicas {

    @Override
    public double Sumar(double x, double y) {
        return x + y;
    }

    @Override
    public double Restar(double x, double y) {
        return x - y;
    }

    @Override
    public double Multiplicar(double x, double y) {
        return x * y;
    }

    @Override
    public double Dividir(double x, double y) {
        return x / y;
    }

}
