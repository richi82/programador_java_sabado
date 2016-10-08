/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.ventaapp.service;

/**
 *
 * @author RICARDO
 */
public class VentaService {
  
  private final double IGV=0.18;
  
  public double calcularImpuesto(double precio, int cantidad) {
  double impuesto;
  impuesto=precio*cantidad*IGV;
  return impuesto; 
  }
  
  public double calcularSubtotal(double precio, int cantidad) {
  double subtotal; 
  subtotal=(precio*cantidad)- (precio*cantidad*IGV);
  return subtotal;
   }
  
   public double calcularTotal(double precio, int cantidad) {
  double total; 
  total=(precio*cantidad);
  return total;
   }
}
