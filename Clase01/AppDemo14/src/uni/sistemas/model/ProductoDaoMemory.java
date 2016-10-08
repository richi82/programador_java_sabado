package uni.sistemas.model;

import uni.sistemas.entity.Producto;
import uni.sistemas.service.ICrud;
import uni.sistemas.util.Constante;

public class ProductoDaoMemory implements ICrud<Producto> {

    //Declarar variables
    Producto[] lproducto;
    static int n, cont;
    //Constructor

    public ProductoDaoMemory() {
        lproducto = new Producto[Constante.MAXIMO];
        cont = 3;
        n = 3;
        lproducto[0] = new Producto(1, "Producto 1", "Bebidas", 200);
        lproducto[1] = new Producto(1, "Producto 2", "Abarrotes", 100);
        lproducto[2] = new Producto(1, "Producto 3", "Limpieza", 100);
    }
    //Metodos para la persistencia de datos en memoria

    @Override
    public void create(Producto t) {
        cont++;
        t.setId(cont);
        lproducto[n] = t;//guarda producto en el arreglo
        n++;
    }

    @Override
    public void update(Producto t) {
        int index = 0;
        for (Producto p : lproducto) {
            if (p.getId() == t.getId()) {
                lproducto[index] = t; //actualiza
                break;
            }
            index++;
        }
    }

    @Override
    public void delete(Producto t) {
        int index = 0;
        for (Producto p : lproducto) {
            if (p.getId() == t.getId()) {
                //eliminar
                for (int i = index; i < n; i++) {
                    lproducto[i] = lproducto[i + 1];
                }
                n--;
                break;
            }
            index++;
        }

    }

    @Override
    public Producto find(int t) {
        for (int i = 0; i < n; i++) {
            if (lproducto[i].getId() == t) {
                return lproducto[i];
            }
        }
        return null;
    }

    @Override
    public Producto[] readAll() {
        Producto[] aux;
        if (n == Constante.MAXIMO) {
            aux = lproducto;
        } else {
            aux = new Producto[n];
            System.arraycopy(lproducto, 0, aux, 0, n);
        }
        return aux;
    }

}
