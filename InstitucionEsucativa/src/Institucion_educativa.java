import java.util.ArrayList;
import java.util.List;

public class Institucion_educativa {
	private List<Tutor> tutores;
	
	public Institucion_educativa() {
		this.tutores = new ArrayList<>();
	}
	
	public void AgregarTutor(Tutor tutor) {
		tutores.add(tutor);
	}
	
	
	public int contarcalificacionMayor(double calificacion) {
		int cont = 0;
		for(Tutor tutor : tutores) {
			if(tutor.getCalificacion() > calificacion) {
				cont++;
			}
		}
		return cont;
	}
}
