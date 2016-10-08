/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pedidoapp.prueba;

import pe.egcc.pedidoapp.service.PedidoService; 
/**
 *
 * @author Alumno
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        //dato
        double importe=1000.0; 
        //Proceso
        PedidoService service = new PedidoService();
        double impuesto = service.calcularImpuesto(importe);
        double total = service.calcularTotal(importe);
        //Reporte
        System.out.println("Importe: " + importe);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
    }
    
}
