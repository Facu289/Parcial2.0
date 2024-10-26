
public class Materia extends Carrera {

    private int codigo;
    private String nombre;
    private String contenido;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public Materia(int dni, String nombre, String apellido, int legalo, int codigo, String titulo, double cuotaMensual,
            int codigo2, String nombre2, String contenido) {
        super(dni, nombre, apellido, legalo, codigo, titulo, cuotaMensual);
        codigo = codigo2;
        nombre = nombre2;
        this.contenido = contenido;
    }

    public String cambiarContenido(){
        return contenido;
    }
}
