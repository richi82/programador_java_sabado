package uni.sistemas.service;

import java.util.List;

public interface ICrud<T> {

    //Definir las firmas
    void create(T t);

    void update(T t);

    void delete(T t);

    T find(int t);

    List<T> readAll();

}
