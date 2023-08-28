public class IntegerSet {
  private boolean[] conjuntoArray;

  public IntegerSet() {
    conjuntoArray = new boolean[101];
  }

  public void insertarElemento(int elemento) {
    if (esElementoValido(elemento)) {
      conjuntoArray[elemento] = true;
    } else {
      System.out.println("Elemento no valido rango permitido: 0 a 100");
    }
  }

  public void eliminarElemento(int elemento) {
    if (esElementoValido(elemento)) {
      conjuntoArray[elemento] = false;
    } else {
      System.out.println("Elemento no valido rango permitido: 0 a 100");
    }
  }

  public boolean contieneElemento(int elemento) {
    if (esElementoValido(elemento)) {
      return conjuntoArray[elemento];
    }
    return false;
  }

  public void union(IntegerSet otroConjunto) {
    for (int i = 0; i < conjuntoArray.length; i++) {
      conjuntoArray[i] = conjuntoArray[i] || otroConjunto.conjuntoArray[i];
    }
  }

  public void interseccion(IntegerSet otroConjunto) {
    for (int i = 0; i < conjuntoArray.length; i++) {
      conjuntoArray[i] = conjuntoArray[i] && otroConjunto.conjuntoArray[i];
    }
  }

  public boolean equalTo(IntegerSet otroConjunto) {
    for (int i = 0; i < conjuntoArray.length; i++) {
      if (conjuntoArray[i] != otroConjunto.conjuntoArray[i]) {
        return false;
      }
    }
    return true;
  }

  public String toSetString() {
    StringBuilder cadenaConjunto = new StringBuilder();

    boolean hayElementos = false;
    for (int i = 0; i < conjuntoArray.length; i++) {
      if (conjuntoArray[i]) {
        if (hayElementos) {
          cadenaConjunto.append(" ");
        }
        cadenaConjunto.append(i);
        hayElementos = true;
      }
    }

    if (!hayElementos) {
      cadenaConjunto.append("-");
    }

    return cadenaConjunto.toString();
  }

  private boolean esElementoValido(int elemento) {
    return elemento >= 0 && elemento <= 100;
  }

}
