/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.appinteres.service;


/**
 *
 * @author RICARDO
 */
public class InteresSimple {
  
  public double calculoInteres (double capital, double ti){
  double monto;
  monto=(capital*(1+ti));
  return monto;
  }
   
public double calculoPotencia(double monto, int mes){
double pagototal = 1;
for(int i = 0; i<mes;i++){
pagototal *= monto;
}
return pagototal;

}
 
          
}
