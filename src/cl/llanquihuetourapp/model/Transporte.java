package cl.llanquihuetourapp.model;

public class Transporte {

    private String nombreEmpresa;
    private String tipo;
    private int capacidad;

    public Transporte() {
        this.nombreEmpresa = "Sin empresa";
        this.tipo = "Sin tipo";
        this.capacidad = 0;
    }

    public Transporte(String nombreEmpresa, String tipo, int capacidad) {
        this.nombreEmpresa = nombreEmpresa;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa (String nombreEmpresa){
        if (nombreEmpresa == null || nombreEmpresa.isBlank()){
            throw new IllegalArgumentException("El nombre de la empresa no puede estar vacio");
        }
        this.nombreEmpresa = nombreEmpresa.trim();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo (String tipo){
        if (tipo == null || tipo.isBlank()){
            throw new IllegalArgumentException("El tipo de auto no puede estar vacio");
        }
        this.tipo = tipo.trim();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad (int capacidad){
        if (capacidad < 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayot a 0");
        }
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
