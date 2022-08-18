

import java.util.Objects;

public abstract class Poliza {

	protected String idPoliza;
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected int anyo;
	protected String formaPago;
	protected double primaBase;
	protected int numSiniestrosHistorico;
	
	
			
	public Poliza() {
		this.idPoliza="";
		this.nombre="";
		this.apellidos="";
		this.dni="";
		this.anyo=2022;
		this.formaPago="Anual";
		this.primaBase=0;
		this.numSiniestrosHistorico=0;
	}




	public Poliza(String idPoliza, String nombre, String apellidos, String dni, int anyo, String formaPago,
			double primaBase, int numSiniestrosHistorico) {
		super();
		this.idPoliza = idPoliza;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.anyo = anyo;
		this.formaPago = formaPago;
		this.primaBase = primaBase;
		this.numSiniestrosHistorico = numSiniestrosHistorico;
	}




	public String getIdPoliza() {
		return idPoliza;
	}




	public void setIdPoliza(String idPoliza) {
		this.idPoliza = idPoliza;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellidos() {
		return apellidos;
	}




	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public int getAnyo() {
		return anyo;
	}




	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}




	public String getFormaPago() {
		return formaPago;
	}




	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}




	public double getPrimaBase() {
		return primaBase;
	}




	public void setPrimaBase(double primaBase) {
		this.primaBase = primaBase;
	}




	public int getNumSiniestrosHistorico() {
		return numSiniestrosHistorico;
	}




	public void setNumSiniestrosHistorico(int numSiniestrosHistorico) {
		this.numSiniestrosHistorico = numSiniestrosHistorico;
	}
	
	
	public abstract double calcularPrima() {
		
		return 0;
		
		
	}




	@Override
	public String toString() {
		return String.format(
				"Poliza [idPoliza=%s, nombre=%s, apellidos=%s, dni=%s, anyo=%s, formaPago=%s, primaBase=%s, numSiniestrosHistorico=%s]",
				idPoliza, nombre, apellidos, dni, anyo, formaPago, primaBase, numSiniestrosHistorico);
	}




	@Override
	public int hashCode() {
		return Objects.hash(idPoliza);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poliza other = (Poliza) obj;
		return Objects.equals(idPoliza, other.idPoliza);
	}
	
	
	
	












	

}
