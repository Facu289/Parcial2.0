import java.util.ArrayList;

public class Carrera extends Alumno {

    private int codigo;
    private String titulo;
    private double cuotaMensual;

    private ArrayList <Materia> materia1 = new ArrayList <Materia>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
    
    public ArrayList<Materia> getMateria1() {
        return materia1;
    }

    public void setMateria1(ArrayList<Materia> materia1) {
        this.materia1 = materia1;
    }

    public Carrera(int dni, String nombre, String apellido, int legalo, int codigo, String titulo, double cuotaMensual,
            ArrayList<Materia> materia1) {
        super(dni, nombre, apellido, legalo);
        this.codigo = codigo;
        this.titulo = titulo;
        this.cuotaMensual = cuotaMensual;
        this.materia1 = materia1;
    }

    public double cambiarValorCuota(){
        return cuotaMensual;
    }

    public void verAlumnosInscriptos(){
    }

}
