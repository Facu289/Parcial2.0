public abstract class Persona {

    private int dni;
    private String Nombre;
    private String Apellido;
    
    
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    
    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        Nombre = nombre;
        Apellido = apellido;
    }

    public abstract void verDatos();


}
