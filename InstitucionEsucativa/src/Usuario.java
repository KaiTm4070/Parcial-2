
public class Usuario {
	private String codigoUsuario;
	private String nombreUsuario;
	private double calificacionTutor;
	
	public Usuario(String codigoUsuario, String nombreUsuario, double calificacionTutor) {
		this.codigoUsuario = codigoUsuario;
		this.nombreUsuario = nombreUsuario;
		this.calificacionTutor= 0.0;
	}
	
	public String getCodigoUusario() {
		return codigoUsuario;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void agregarcalificacionTutor(Tutor tutor, double calificacion) {
		calificacionTutor = tutor.getCalificacion();
	}
}
