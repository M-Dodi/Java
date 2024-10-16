package Pitagora;

public class Triangolo_Retangolo {
	
	private double cat1;
	private double cat2;
	private double hyp;
	private double area;
	private double perimetro;
	
	public double getCat1() {
		return cat1;
	}
	
	public Triangolo_Retangolo(double cat1, double cat2) {
		super();
		this.cat1 = cat1;
		this.cat2 = cat2;
	}

	public void setCat1(double cat1) {
		this.cat1 = cat1;
		UpdateFunctionalRelations();
	}
	private void UpdateFunctionalRelations() {
		hyp=Math.sqrt(cat2*cat2+cat1*cat1);
		area = cat1*cat2/2.;
		perimetro=cat1+cat2+hyp;
	}
	public double getCat2() {
		return cat2;
		UpdateFunctionalRelations();
	}
	public void setCat2(double cat2) {
		this.cat2 = cat2;
	}
	public double getHyp() {
		return hyp;
	}
	public double getArea() {
		return area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	
	double a = Math.sin(45);
	
	double areac = Math.PI * raggio * raggio;
	areac = Math.PI * Math.pow(raggio, 2);		
	hyp=Math.sqrt(cat1*cat2+cat1*cat2);
	
}
