public class IntegerSetTest {
  public static void main(String[] args) {
    IntegerSet conjunto1 = new IntegerSet();
    conjunto1.insertarElemento(5);
    conjunto1.insertarElemento(10);

    IntegerSet conjunto2 = new IntegerSet();
    conjunto2.insertarElemento(10);
    conjunto2.insertarElemento(15);

    System.out.println("Conjunto 1: " + conjunto1.toSetString());
    System.out.println("Conjunto 2: " + conjunto2.toSetString());

    conjunto1.union(conjunto2);
    System.out.println("Union: " + conjunto1.toSetString());

    IntegerSet conjuntoInterseccion = new IntegerSet();
    conjuntoInterseccion.insertarElemento(10);
    conjuntoInterseccion.insertarElemento(15);
    conjuntoInterseccion.interseccion(conjunto2);
    System.out.println("Interseccion: " + conjuntoInterseccion.toSetString());

    System.out.println("Es conjunto 1 igual a Conjunto 2 " + conjunto1.equalTo(conjunto2));
  }
}
