package semana_03;

public class Factura {
	private String ruc , empresa;
	private int unidades;
	private double pUnitario;
	
	//variables privadas de clase
	private static int cantFactu;
	private static double impFacturados;
	private static final String constante;
	
	static{
		constante = "Sunat";
		impFacturados = 0;
		cantFactu = 0;
	}

	public Factura(String ruc, String empresa, int unidades, double pUnitario) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.pUnitario = pUnitario;
		cantFactu++;
		impFacturados += impFactu();
	}
	
	public Factura(String ruc, String empresa){
		this(ruc, empresa, 10, 50.0);
	}
	
	public Factura(){
		this("111111111", "MN-Global SRL");
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getpUnitario() {
		return pUnitario;
	}

	public void setpUnitario(double pUnitario) {
		this.pUnitario = pUnitario;
	}

	public static int getCantFactu() {
		return cantFactu;
	}

	public static void setCantFactu(int cantFactu) {
		Factura.cantFactu = cantFactu;
	}

	public static double getImpFacturados() {
		return impFacturados;
	}

	public static void setImpFacturados(double impFacturados) {
		Factura.impFacturados = impFacturados;
	}
	
	double impFactu(){
		return unidades * pUnitario;
	}
	
	
	
}
