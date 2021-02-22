public class Recetas {

    String nombre;
    double cantidad;
    String unidad;

    public Recetas(String nombre, double cantidad, String unidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return this.unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

}
