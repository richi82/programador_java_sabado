
package uni.sistemas.service;


public abstract class Operaciones <T>{
    
     //Metodos generic
    public abstract T Sumar(T x, T y);

    public abstract T Restar(T x, T y);

    public abstract T Multiplicar(T x, T y);

    public abstract T Dividir(T x, T y);
    
}
