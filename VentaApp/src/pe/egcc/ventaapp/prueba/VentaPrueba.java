/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ventaapp.prueba;
import pe.egcc.ventaapp.service.VentaService;
/**
 *
 * @author RICARDO
 */
public class VentaPrueba {
  
  public static void main(String[] args) {
        //dato
        double precio = 40.0;
        int cantidad = 8;
        //proceso
        VentaService venta = new VentaService();
        double impuesto = venta.calcularImpuesto(precio, cantidad);
        double subtotal = venta.calcularSubtotal(precio, cantidad);
        double total = venta.calcularTotal(precio, cantidad);
        
       //reporte
       System.out.println("impuesto: " + impuesto);
       System.out.println("subtotal: " + subtotal);
       System.out.println("total: " + total);
    }
    
  
  
}
