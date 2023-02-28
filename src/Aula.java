import java.util.Arrays;

public class Aula {
	private Alumno[] listaAlumno;

	public Aula() {
		this.listaAlumno = new Alumno[30];
		for (int i = 0; i < 30; i++) {
			listaAlumno[i] = new Alumno("DAW" + i);
		}
	}

	public Alumno[] getListaAlumno() {
		return listaAlumno;
	}

	public void setListaAlumno(Alumno[] listaAlumno) {
		this.listaAlumno = listaAlumno;
	}

	@Override
	public String toString() {
		return "Aula [" + Arrays.toString(listaAlumno) + "]";
	}

}
