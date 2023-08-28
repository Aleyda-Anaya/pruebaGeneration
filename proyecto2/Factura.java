public class Factura {
  private String numero;
  private String descripcion;
  private int cantidadComprada;
  private double precioArticulo;

  public Factura(String numero, String descripcion, int cantidadComprada, double precioArticulo) {
    this.numero = numero;
    this.descripcion = descripcion;
    this.cantidadComprada = cantidadComprada;
    this.precioArticulo = precioArticulo;
  }

  public double getTotalFactura() {
    double total = cantidadComprada * precioArticulo;
    if (total < 0) {
      total = 0;
    }
    return total;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public int getCantidadComprada() {
    return cantidadComprada;
  }

  public void setCantidadComprada(int cantidadComprada) {
    this.cantidadComprada = cantidadComprada;
  }

  public double getPrecioArticulo() {
    return precioArticulo;
  }

  public void setPrecioArticulo(double precioPorArticulo) {
    this.precioArticulo = precioPorArticulo;
  }

  public double calcularTotal() {
    return cantidadComprada * precioArticulo;
  }

}
