public class Marca {
    private String nombre;
    private int nrDeModelos;
    private int añoLanzamiento;
    private String codigoIdentificador;

    public Marca(String nombre, int nrDeModelos, int añoLanzamiento, String codigoIdentificador) {
        this.nombre = nombre;
        this.nrDeModelos = nrDeModelos;
        this.añoLanzamiento = añoLanzamiento;
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }
}
