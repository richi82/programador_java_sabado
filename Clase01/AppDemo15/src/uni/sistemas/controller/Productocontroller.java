
package uni.sistemas.controller;

import java.util.List;
import uni.sistemas.entity.Producto;
import uni.sistemas.model.ProductoDaoMemory;


public class Productocontroller {
    //Variables
    ProductoDaoMemory dao;
    //Constructor

    public Productocontroller() {
        dao=new ProductoDaoMemory();
    }
    //Logica de negocio
    
    public void ProductoAdicionar(Producto p){
        dao.create(p);
    }
    public void ProductoActualizar(Producto p){
        
    }
    public void ProductoEliminar(Producto p){
        
    }
    public void ProductoBuscar(int id){
        
    }
    public List<Producto> ProductoListas(){
        return dao.readAll();
        
    }
}
