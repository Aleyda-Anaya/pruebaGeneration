public class Direccion {

    private String ciudad;
    private String barrio;
    private String calle;

    public Direccion(String ciudad, String barrio, String calle) {
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

}
