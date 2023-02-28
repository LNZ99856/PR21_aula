
public class Alumno {
	
	private int pr1;
	private int bbdd1;
	private String id;
	
	public Alumno(String codigo) {
		this.pr1= (int) (Math.random()*11);
		this.bbdd1=(int) (Math.random()*11);
		this.id=codigo;
	}

	public int getPr1() {
		return pr1;
	}

	public void setPr1(int pr1) {
		this.pr1 = pr1;
	}

	public int getBbdd1() {
		return bbdd1;
	}

	public void setBbdd1(int bbdd1) {
		this.bbdd1 = bbdd1;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + "[pr1=" + pr1 + ", bbdd1=" + bbdd1 + "]";
	}
	

}
