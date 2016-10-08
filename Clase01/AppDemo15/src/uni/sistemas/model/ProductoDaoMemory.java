
package uni.sistemas.model;

import java.util.ArrayList;
import java.util.List;
import uni.sistemas.entity.Producto;
import uni.sistemas.service.ICrud;


public class ProductoDaoMemory implements ICrud<Producto>{

    //Variable de tipo coleccion
    List<Producto> lproducto;
    static int cont;
    //Constructor

    public ProductoDaoMemory() {
        lproducto=new ArrayList<>();
        cont=102;
        lproducto.add(new Producto(101, "Producto1", "Bebida", 100));
        lproducto.add(new Producto(102, "Producto2", "Limpieza", 200));
    }
    
    
    @Override
    public void create(Producto t) {
        cont ++;
        t.setId(cont);
        lproducto.add(t);//adiciona producto en la coleccion
        }

    @Override
    public void update(Producto t) {
        }

    @Override
    public void delete(Producto t) {
        Producto pro=find(t.getId());
        if (pro!=null) {
            lproducto.remove(pro);
            
        }
       }

    @Override
    public Producto find(int t) {
        for (Producto p : lproducto) {
            if (p.getId()==t) {
                return p;
            }
        }
        return null;
       }

    @Override
    public List<Producto> readAll() {
        return lproducto;
        }
    
}
