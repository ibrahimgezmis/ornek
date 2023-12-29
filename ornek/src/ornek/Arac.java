package ornek;

public class Arac {
	
	private double hiz;
	private double yol;
	private double mesafe;
	
	public Arac () {
		
		hiz=0;
		yol=0;
	}
	public void hizlan(double hiz) {
		this.hiz = hiz;
		
	}
	public void sur(int saat) {
		yol = hiz*saat;
		
	}
	public double getYol() {
		return yol;
	}

}
