public class Auto {

    private String modelo;
    private String color;
    private int año;
    private String chasis;
    private int velocidadMaxima;
    private int velocidadActual;
    private int numeroPuertas;
    private boolean tieneTechoSolar;
    private int numeroMarchas;
    private boolean tieneTransmisionAutomatica;

    private Propietario propietario;
    private double nivelCombustible;
    private Marca marca;

    public Auto(String modelo, String color, int año, Marca marca, String chasis, Propietario propietario,
            int velocidadMaxima, int numeroPuertas, boolean tieneTechoSolar,
            int numeroMarchas, boolean tieneTransmisionAutomatica, double capacidadTanque) {
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.velocidadMaxima = velocidadMaxima;
        this.numeroPuertas = numeroPuertas;
        this.tieneTechoSolar = tieneTechoSolar;
        this.numeroMarchas = numeroMarchas;
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
        this.velocidadActual = 0;
        this.nivelCombustible = capacidadTanque;
    }

    // Metodo para acelerar el auto de 1 en 1 km/h
    public void acelerar() {
        if (velocidadActual + 1 <= velocidadMaxima) {
            velocidadActual += 1;
        }
    }

    // Metodo para frenar el auto y detenerlo (Velocidad = 0 km/h)
    public void frenar() {
        velocidadActual = 0;
    }

    // Metodo para cambiar de marcha
    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 1 && nuevaMarcha <= numeroMarchas) {
            if (nuevaMarcha == -1 && velocidadActual > 0) {
                System.out.println("No se puede dar la marcha atras si la velocidad supera los 0 km/h");
            } else {
                numeroMarchas = nuevaMarcha;
                System.out.println("Cambiado a la marcha " + nuevaMarcha);
            }
        } else {
            System.out.println("Marcha no valida.");
        }
    }

    // Metodo para reducir la marcha
    public void reducirMarcha() {
        if (numeroMarchas > 1) {
            numeroMarchas--;
            System.out.println("Marcha reducida a " + numeroMarchas);
        } else {
            System.out.println("No puedes reducir más la marcha.");
        }
    }

    // Metodo para calcular la autonomia de viaje en base al consumo medio
    public double calcularAutonomia(double consumoMedio) {
        double capacidadTanque = 50.0;
        return capacidadTanque / consumoMedio;
    }

    // Metodo para mostrar el volumen de combustible
    public void mostrarVolumenCombustible() {
        System.out.println("Nivel de combustible: " + nivelCombustible + " litros");
    }

    // Metodo para simular el consumo de combustible
    public void consumirCombustible(double distancia, double consumoMedio) {
        double consumo = distancia * consumoMedio;
        if (nivelCombustible >= consumo) {
            nivelCombustible -= consumo;
            System.out.println("Consumido " + consumo + " litros de combustible.");
        } else {
            System.out.println("No hay suficiente combustible para recorrer esa distancia.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneTechoSolar() {
        return tieneTechoSolar;
    }

    public void setTieneTechoSolar(boolean tieneTechoSolar) {
        this.tieneTechoSolar = tieneTechoSolar;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isTieneTransmisionAutomatica() {
        return tieneTransmisionAutomatica;
    }

    public void setTieneTransmisionAutomatica(boolean tieneTransmisionAutomatica) {
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(double nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }

}
