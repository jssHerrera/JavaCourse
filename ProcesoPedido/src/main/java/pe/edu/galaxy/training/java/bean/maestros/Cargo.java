package pe.edu.galaxy.training.java.bean.maestros;

public class Cargo {

	private String nombreLargo;
	private String nombreCorto;
	private String descripcion;
	
	public Cargo() {
		super();
	}

	public String getNombreLargo() {
		return nombreLargo;
	}

	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Cargo [nombreLargo=" + nombreLargo + ", nombreCorto=" + nombreCorto + ", descripcion=" + descripcion
				+ "]";
	}
	
	

}
