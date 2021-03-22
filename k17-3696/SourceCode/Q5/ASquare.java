
public class ASquare extends AShape{
	private double area;
	public ASquare() {
		ptX=0;
		ptY=0;
		this.area=1;
	}

	public ASquare(double ptX, double ptY, double area) {
		this.ptX=ptX;
		this.ptY=ptY;
		this.area=area;
	}
	
	@Override
	public double Area() {
        return Math.pow(area, 2);
	}

	@Override
	public double Perimeter() {
        return 4 * area;
	}

	@Override
	public boolean holds(double ptX, double ptY) {
        return Math.sqrt(Math.pow(this.ptY - ptY, 2))<= area / 2 && Math.sqrt(Math.pow(this.ptX - ptX, 2))<= area / 2;
	}

	
    public boolean holds(ASquare s) {
        return Math.sqrt(Math.pow(ptY - s.getPtY(), 2)) + s.Area() / 2 <= area / 2
                && Math.sqrt(Math.pow(ptX - s.Area(), 2)) + s.Area() / 2 <= area / 2 && area / 2 + s.Area() / 2 <= area
                && area / 2 + s.Area() / 2 <= area;
    }

    public boolean covers(ASquare s) {
        return !holds(s) && ((ptX + area / 2 > s.getPtX() - s.Area()) || (ptY + area / 2 > s.getPtY() - s.Area()))
                && (Math.sqrt(Math.pow(ptY - s.getPtY(), 2)) < area / 2 + s.Area() / 2)
                && (Math.sqrt(Math.pow(ptX - s.getPtX(), 2))< area / 2 + s.Area() / 2);
    }
    
    
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
