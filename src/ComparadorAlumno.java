import java.util.Comparator;

public class ComparadorAlumno implements Comparator<Alumno> {
	private int comoOrdenar;
	public static final int ID_DESCENDENTE = 1;
	public static final int PR1_DESCENDENTE = 2;
	public static final int BBDD1_DESCENDENTE = 3;
	
	public ComparadorAlumno () {
		this.comoOrdenar=1;
	}
	
	public void setComoOrdenar(int orden) {
		switch (orden) {
		case 1: comoOrdenar = ID_DESCENDENTE; break;
		case 2: comoOrdenar = PR1_DESCENDENTE; break;
		case 3: comoOrdenar = BBDD1_DESCENDENTE; break;
		default : comoOrdenar = ID_DESCENDENTE;
		}
	}

	@Override
	public int compare(Alumno a1, Alumno a2) {
		int devolver = 0;
		switch (comoOrdenar) {
		case 1: devolver = a2.getId().compareTo(a1.getId()); break;
		case 2: devolver = a2.getPr1() - a1.getPr1(); break;
		case 3: devolver = a2.getBbdd1() - a1.getBbdd1(); break;
		}
			
		return devolver;
	}

}
