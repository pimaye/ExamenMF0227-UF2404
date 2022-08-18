
public class SeguroCoche extends Poliza {
	
	public String matricula;
	public int anyoCarnet;
	
	
		
	
	

	
	public SeguroCoche(String matricula, int anyoCarnet) {
		super();
		this.matricula = matricula;
		this.anyoCarnet = anyoCarnet;
	}




	public String getMatricula() {
		return matricula;
	}





	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}





	public int getAnyoCarnet() {
		return anyoCarnet;
	}




	public void setAnyoCarnet(int anyoCarnet) {
		this.anyoCarnet = anyoCarnet;
	}





	@Override
	public String toString() {
		return String.format("SeguroCoche [matricula=%s, anyoCarnet=%s]", matricula, anyoCarnet);
	}




	
	public SeguroCoche(String idPoliza, String nombre, String apellidos, String dni, int anyo, String formaPago,
			double primaBase, int numSiniestrosHistorico) {
		super(idPoliza, nombre, apellidos, dni, anyo, formaPago, primaBase, numSiniestrosHistorico);
		
	}

	@Override
	public double calcularPrima() {
		
	this.primaBase=0;
	this.anyo=2022;
	
	if(this.anyo <= 2021 ) {
		this.primaBase = this.primaBase - (this.primaBase*0.015);
	}
	
	if(this.anyo == 2020 ) {
		this.primaBase = this.primaBase - (this.primaBase*0.03);
	}
	if(this.anyo == 2019 ) {
		this.primaBase = this.primaBase - (this.primaBase*0.045);
	}
	if(this.anyo == 2018 ) {
		this.primaBase = this.primaBase - (this.primaBase*0.06);
	}
	if(this.anyo == 2017 ) {
		this.primaBase = this.primaBase - (this.primaBase*0.075);
	}
	if(this.anyo <= 2016 ) {
		this.primaBase = this.primaBase - (this.primaBase*0.08);
	}
	if(this.anyo == 2015 ) {
		this.primaBase = this.primaBase - (this.primaBase*0.095);
	}
	if(this.anyo == 2014 ) {
		this.primaBase = this.primaBase - (this.primaBase*0.11);
	}
	if(this.anyo == 2013 ) {
		this.primaBase = this.primaBase - (this.primaBase*0.125);
	}
	if(this.anyo == 2012 ) {
		this.primaBase = this.primaBase - (this.primaBase*0.14);
	}
	
	if(this.anyoCarnet <= 2017) {
		this.primaBase= this.primaBase+75;
	}
	if(this.numSiniestrosHistorico>=1) {
		this.primaBase= this.primaBase+(this.primaBase*0.03);
	}
		
		
		
	}

}
