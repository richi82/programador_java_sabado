/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.egcc.ejercicio01.prueba;

import pe.egcc.ejercicio01.service;
/**
 *
 * @author Alumno
 */
public class VentaPrueba {
   
      //dato
        double importe=1000.0; 
        //Proceso
        VentaService service = new PedidoService();
        double impuesto = service.calcularImpuesto(importe);
        double total = service.calcularTotal(importe);
        //Reporte
        System.out.println("Importe: " + importe);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
    
}
