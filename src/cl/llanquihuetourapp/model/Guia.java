package cl.llanquihuetourapp.model;

public class Guia {

    private String nombre;
    private int añosExperiencia;
    private String especialidad;

    public Guia() {
        this.nombre = "Sin nombre";
        this.añosExperiencia = 0;
        this.especialidad = "Sin especialidad";
    }

    public Guia(String nombre, int añosExperiencia, String especialidad) {
        this.nombre = nombre;
        this.añosExperiencia = añosExperiencia;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre (String nombre){
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre del guia no puede estar vacio");
        }
        this.nombre = nombre.trim();
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia (int añosExperiencia){
        if (añosExperiencia < 0) {
            throw new IllegalArgumentException("Los años de experiencia deben ser igual o mayor a 0");
        }
        this.añosExperiencia = añosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad (String especialidad){
        if (especialidad == null || especialidad.isBlank()){
            throw new IllegalArgumentException("La especialidad del guia no puede estar vacia");
        }
        this.especialidad = especialidad.trim();
    }

    @Override
    public String toString() {
        return "Guia{" +
                "nombre='" + nombre + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
