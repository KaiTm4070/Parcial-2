import java.util.ArrayList;
import java.util.List;

public class Curso  {
	private String codigo;
	private String nombreCurso;
	private List<Usuario> usuariosMatriculados;
	
	public Curso(String codigo, String nombreCurso) {
		this.codigo= codigo;
		this.nombreCurso = nombreCurso;
		this.usuariosMatriculados = new ArrayList<>();
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getnombreCurso() {
		return nombreCurso;
	}
	
	public void matricularUsuario(Usuario usuario) {
	    usuariosMatriculados.add(usuario);
	}
}
