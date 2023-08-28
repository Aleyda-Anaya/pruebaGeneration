
public class Main {
  public static void main(String[] args) {

    Direccion direccionPropietario = new Direccion("Bogota", " Alameda", "calle 135a");

    Propietario propietario = new Propietario("Aleyda", "1999-08-19", direccionPropietario);

    Marca marcaAuto = new Marca("Mazda", 10, 2003, "MA");

    Auto auto = new Auto("Mazda3", "Rojo", 2008, marcaAuto, "ABC1234", propietario,
        200, 4, true, 6, true, 50.0);

    // Mostrar informacion del auto y su propietario
    System.out.println("Modelo: " + auto.getModelo());
    System.out.println("Propietario: " + auto.getPropietario().getNombre());
    System.out.println("Direccion: " + auto.getPropietario().getDireccion().getCalle() + ", " +
        auto.getPropietario().getDireccion().getBarrio() + ", " +
        auto.getPropietario().getDireccion().getCiudad());
    System.out.println("Marca del carro: " + auto.getMarca().getNombre());
  }
}
