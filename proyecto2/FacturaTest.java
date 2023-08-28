public class FacturaTest {
  public static void main(String[] args) {
    Factura factura1 = new Factura("F12345", "Teclado ", 2, 259.99);
    Factura factura2 = new Factura("F67890", "Mouse ", 1, 150.0);

    System.out.println("Factura 1:");
    System.out.println("Numero de factura: " + factura1.getNumero());
    System.out.println("Descripcion: " + factura1.getDescripcion());
    System.out.println("Cantidad comprada: " + factura1.getCantidadComprada());
    System.out.println("Precio por articulo: $" + factura1.getPrecioArticulo());
    System.out.println("Total: $" + factura1.getTotalFactura());

    System.out.println("\nFactura 2:");
    System.out.println("Numero de factura: " + factura2.getNumero());
    System.out.println("Descripcion: " + factura2.getDescripcion());
    System.out.println("Cantidad comprada: " + factura2.getCantidadComprada());
    System.out.println("Precio por articulo: $" + factura2.getPrecioArticulo());
    System.out.println("Total: $" + factura2.getTotalFactura());
  }
}
