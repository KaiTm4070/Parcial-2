import java.util.ArrayList;
import java.util.List;

public class Tutor {
	private String nombre;
	private double calificacion;
	private List<Curso> cursos;
	    
	public Tutor(String nombre, double calificacion) {
		this.nombre = nombre;
	    this.calificacion = 0.0;
	    this.cursos = new ArrayList<>();
	}
		
	public String getNombre() {
		return nombre;
	}
	
	public double getCalificacion() {
		return calificacion;
	}
	    
	public void agregarCurso(Curso curso) {
		cursos.add(curso);
    }
}