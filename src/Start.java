import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		Aula daw1 = new Aula();
		System.out.println(daw1);
		
		ComparadorAlumno ca = new ComparadorAlumno();
		Arrays.sort(daw1.getListaAlumno(), ca);
		System.out.println(daw1);
		
		ca.setComoOrdenar(2);
		Arrays.sort(daw1.getListaAlumno(), ca);
		System.out.println(daw1);
		
		ca.setComoOrdenar(3);
		Arrays.sort(daw1.getListaAlumno(), ca);
		System.out.println(daw1);

	}

}
