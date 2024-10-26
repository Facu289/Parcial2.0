public class Secretaria extends Persona {

private double salario;

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}

public Secretaria(int dni, String nombre, String apellido, double salario) {
    super(dni, nombre, apellido);
    this.salario = salario;
}

public void inscribirAlumno(){
}

public void cobrarCuota(){
}

    public void verDatos() {
    }
}
