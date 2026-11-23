package cl.llanquihuetourapp.model;

public class Tour {

    private String nombre;
    private String tipo;
    private double precio;
    private int horas;
    private int cupos;
    private Guia guia;
    private Transporte transporte;

    public Tour (){
        this.nombre = "Sin Nombre";
        this.tipo = "Sin Tipo";
        this.precio = 0;
        this.horas = 0;
        this.cupos = 0;
        this.guia = new Guia();
        this.transporte = new Transporte();
    }

    public Tour(String nombre, String tipo, double precio, int horas, int cupos, Guia guia, Transporte transporte) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.horas = horas;
        this.cupos = cupos;
        this.guia = guia;
        this.transporte = transporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre (String nombre){
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre del tour no puede estar vacio");
        }
        this.nombre = nombre.trim();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo (String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("El tipo de tour no puede estar vacio");
        }
        this.tipo = tipo.trim();
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras (int horas){
        if (horas <= 0) {
            throw new IllegalArgumentException("Las horas del tour no puede ser negativas");
        }
        this.horas = horas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio (double precio){
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio de tour debe ser mayor a 0");
        }
        this.precio = precio;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos (int cupos){
        if (cupos <= 0) {
            throw new IllegalArgumentException("Los cupos del tour deben ser mayor a 0");
        }
        this.cupos = cupos;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        if (guia == null) {
            throw new IllegalArgumentException("El tour debe tener un guia");
        }
        this.guia = guia;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        if (transporte == null) {
            throw new IllegalArgumentException("El tour debe tener un transporte");
        }
        this.transporte = transporte;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", horas=" + horas +
                ", cupos=" + cupos +
                ", guia= " + guia +
                ", transporte= " + transporte +
                '}';
    }
}
