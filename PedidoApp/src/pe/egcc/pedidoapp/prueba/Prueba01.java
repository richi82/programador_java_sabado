package pe.egcc.pedidoapp.prueba;
import pe.egcc.pedidoapp.service.PedidoService;

/**
 *
 * @author RICARDO
 */
public class Prueba01 {
    public static void main(String[] args) {
        //dato
        double precio = 80.0;
        int cantidad=10;
        //proceso
        
        VentaService service = new VentaService();
        double impuesto = service.calcularImpuesto(importe);
        double total = service.calcularTotal(importe);
        
       //reporte
       System.out.println("importe: " + importe);
       System.out.println("impuesto: " + impuesto);
       System.out.println("Total: " + total);
    }
    


}
