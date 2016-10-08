/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.appinteres.prueba;
import pe.egcc.appinteres.service.InteresSimple;
/**
 *
 * @author RICARDO
 */
public class Prueba {
  public static void main(String[] args) {
    
    //dato 
    double capital=1000.0;
    double ti =0.18;
    int mes =5;
    //proceso
    
  InteresSimple interes = new InteresSimple();
  
  double monto=interes.calculoInteres(capital, ti);
  double pagototal=interes.calculoPotencia(monto, mes);
  
  //reporte
       System.out.println("pagototal: " + pagototal);

  }
  
}
