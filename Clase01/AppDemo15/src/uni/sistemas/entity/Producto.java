
package uni.sistemas.entity;


public class Producto {
    //Atributos
    private int Id;
    private String nombre;
    private String categoria;
    private int stock;
    //Constructor

    public Producto() {
    }

    public Producto(int Id, String nombre, String categoria, int stock) {
        this.Id = Id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }
    //Metodos getters and setters

    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
