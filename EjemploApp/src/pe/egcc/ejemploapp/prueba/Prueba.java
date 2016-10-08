package pe.egcc.ejemploapp.prueba;
import pe.egcc.ejemploapp.service.PedidoEjemplo;


/**
 *
 * @author RICARDO
 */
public class Prueba {

  public static void main(String[] args) {
    //dato
    double importe= 850.0;
    
  //proceso
  PedidoEjemplo ejemplo =new PedidoEjemplo();
  double impuesto = ejemplo.calcularImpuesto(importe);
  double total = ejemplo.calcularTotal(importe);
  
  //reporte
    System.out.println("Importe: " + importe);
    System.out.println("Impuesto: " + impuesto);
    System.out.println("Total: " + total);
    
  }
  

}
