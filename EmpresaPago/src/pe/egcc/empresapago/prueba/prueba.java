/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.empresapago.prueba;
import pe.egcc.empresapago.service.PagoEmpresa;
/**
 *
 * @author RICARDO
 */
public class prueba {
 
  public static void main(String[] args) {
    
    //dato
      // q=cantidad diaria de horas trabajadas
      // p=pago por hora
     //r=cantidad de dias trabajaodos
    double q=15;
    double p=50;
    int r=10;
    
    PagoEmpresa pago =new PagoEmpresa();
    
    double pago1 =pago.montoaPagar(q, r);
    double pago2 =pago.teoricoaPagar(r, p);
    double dcto=pago.descuentoImpuesto(pago2);
    
      //reporte
       System.out.println("pago a realizar: " + pago1);
       System.out.println("pago ideal: " + pago2);
       System.out.println("descuento: " + dcto);
    
  }
}
