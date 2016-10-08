package uni.sistemas.service;

public interface ICrud<T> {

    //Definir las firmas
    void create(T t);

    void update(T t);

    void delete(T t);

    T find(int t);

    T[] readAll();

}
