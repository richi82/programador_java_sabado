package uni.sistemas.service;

//Interface generic
public interface IAritmetica<T> {

    //Metodos generic
    T Sumar(T x, T y);

    T Restar(T x, T y);

    T Multiplicar(T x, T y);

    T Dividir(T x, T y);

}
