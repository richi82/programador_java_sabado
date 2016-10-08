package pe.egcc.ejemploapp.service;

public class PedidoEjemplo {
  
private final double IGV =0.18;

public double calcularImpuesto(double importe){
  double impuesto;
  impuesto = importe * IGV;
  return impuesto;
}

public double calcularTotal(double importe){
  double total;
  total=importe + calcularImpuesto(importe);
  return total;
}
}
