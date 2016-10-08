/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.empresapago.service;

/**
 *
 * @author RICARDO
 */
public class PagoEmpresa {
  private final int diahora=8;
  
 // q=cantidad diaria de horas trabajadas
 // p=pago por hora
  public double montoaPagar (double q, double p) {
    double pago1;
    pago1=q*p;
    
    return pago1;
} 
 
  //r=cantidad de dias trabajaodos
  //p=pago*hora
  
   public double teoricoaPagar (int r, double p) {
    double pago2;
    pago2=r*(p*diahora);
    return pago2;
} 
   
   public double descuentoImpuesto (double pago2) {
    double dcto;
   
    if (pago2>1500.0){
      dcto=pago2*0.08;
      
       } else {
              dcto=0;
              }
      
      return dcto;
    }
      
      
} 
   
   
   
  
  
  
  

