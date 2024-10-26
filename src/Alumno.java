import java.util.ArrayList;

public class Alumno extends Persona{

    private int legalo;

    private ArrayList <Carrera> carrera1 = new ArrayList <Carrera>();

    public int getLegalo() {
        return legalo;
    }

    public void setLegalo(int legalo) {
        this.legalo = legalo;
    }

    public ArrayList<Carrera> getCarrera1() {
        return carrera1;
    }

    public void setCarrera1(ArrayList<Carrera> carrera1) {
        this.carrera1 = carrera1;
    }

    public Alumno(int dni, String nombre, String apellido, int legalo, ArrayList<Carrera> carrera1) {
        super(dni, nombre, apellido);
        this.legalo = legalo;
        this.carrera1 = carrera1;
    }

    public void verDatos() {
    }

    public void verCronogramaCarrera(){
    }


}
