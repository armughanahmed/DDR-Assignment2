
public abstract class AShape {
	public double ptX;
	public double ptY;
	
	
	public abstract double Area();
	
	
	public abstract double Perimeter();

	public abstract boolean holds(double ptX, double ptY);
	
	public double getPtX() {
		return ptX;
	}

	public void setPtX(double ptX) {
		this.ptX = ptX;
	}

	public double getPtY() {
		return ptY;
	}

	public void setPtY(double ptY) {
		this.ptY = ptY;
	}


}
