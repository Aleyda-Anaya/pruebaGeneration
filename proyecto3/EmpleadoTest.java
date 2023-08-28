public class EmpleadoTest {
  public static void main(String[] args) {

    Empleado empleado1 = new Empleado("pepito", "Perez", 2500.0);
    Empleado empleado2 = new Empleado("Maria", "Lopez", 3000.0);

    System.out.println("Salario anual de " + empleado1.getNombre() + empleado1.getApellido() + ": "
        + empleado1.calcularSalarioAnual());
    System.out.println("Salario anual de " + empleado2.getNombre() + empleado2.getApellido() + ": "
        + empleado2.calcularSalarioAnual());

    empleado1.aplicarAumento(10);
    empleado2.aplicarAumento(10);

    System.out.println(
        "Salario anual con aumento de " + empleado1.getNombre() + ": " + empleado1.calcularSalarioAnual());
    System.out.println(
        "Salario anual con aumento de " + empleado2.getNombre() + ": " + empleado2.calcularSalarioAnual());

    System.out.println("Total de empleados: " + Empleado.getContadorEmpleados());
  }
}
